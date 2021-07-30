package dev.onyx.server.engine.task

import dev.onyx.server.engine.task.condition.NoCondition
import dev.onyx.server.engine.task.condition.TaskConditionContinuation
import kotlin.coroutines.intrinsics.*

interface TaskContext {

    val tasks: MutableMap<TaskType, MutableSet<Task>>

    fun task(type: TaskType = TaskType.NormalTask, action: suspend Task.() -> Unit): Task {
        val task = Task(type, this)
        task.next = TaskConditionContinuation(NoCondition, action.createCoroutineUnintercepted(task, task))
        tasks.getOrPut(type) { mutableSetOf() }.add(task)
        return task
    }

    fun cancelTasks(type: TaskType) {
        tasks[type]?.forEach { task ->
            task.cancel()
        }
    }

    fun postProcessTasks() {
        tasks.values.forEach {
            it.forEach { task ->
                task.postProcess()
            }
        }
    }
}