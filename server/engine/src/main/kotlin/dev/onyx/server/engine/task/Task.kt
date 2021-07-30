package dev.onyx.server.engine.task

import dev.onyx.server.engine.task.condition.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*

class Task(val type: TaskType, private val taskContext: TaskContext) : Continuation<Unit> {

    override val context: CoroutineContext = EmptyCoroutineContext

    internal var next: TaskConditionContinuation? = null

    private var finalization: TaskConditionContinuation? = null

    fun run(): Boolean {
        return next?.let {
            if(it.canResume()) {
                taskContext.tasks[type]?.remove(this)
                it.continuation.resume(Unit)
                true
            } else false
        } ?: run {
            finalization?.continuation?.resume(Unit)
            taskContext.tasks[type]?.remove(this)
            false
        }
    }

    fun cancelTasks(type: TaskType) {
        taskContext.tasks[type]?.forEach { task ->
            task.cancel()
        }
    }

    fun cancel() {
        taskContext.tasks.getOrPut(type) { mutableSetOf() }.add(this)
        next = null
    }

    fun finalize(action: suspend Task.() -> Unit) {
        finalization = TaskConditionContinuation(NoCondition, action.createCoroutineUnintercepted(this, this))
    }

    fun postProcess() {
        next?.postProcess()
    }

    override fun resumeWith(result: Result<Unit>) {
        result.exceptionOrNull()?.let {
            it.printStackTrace()
            cancel()
        }
    }

    suspend fun wait(ticks: Int) {
        pause(WaitCondition(ticks))
    }

    suspend fun wait(condition: () -> Boolean) {
        pause(PredicateCondition(condition))
    }

    private suspend fun pause(condition: TaskCondition) {
        taskContext.tasks.getOrPut(type) { mutableSetOf() }.add(this)
        return suspendCoroutineUninterceptedOrReturn {
            next = TaskConditionContinuation(condition, it)
            COROUTINE_SUSPENDED
        }
    }
}