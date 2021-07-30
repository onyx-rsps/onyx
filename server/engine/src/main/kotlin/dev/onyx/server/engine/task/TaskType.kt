package dev.onyx.server.engine.task

sealed class TaskType {

    object StrongTask : TaskType()

    object NormalTask : TaskType()

    object WeakTask : TaskType()

}