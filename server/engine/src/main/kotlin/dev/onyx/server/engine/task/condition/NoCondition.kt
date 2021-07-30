package dev.onyx.server.engine.task.condition

object NoCondition : TaskCondition {

    override fun canResume(): Boolean = true

}