package dev.onyx.server.engine.task.condition

import kotlin.coroutines.Continuation

class TaskConditionContinuation(
    val condition: TaskCondition,
    val continuation: Continuation<Unit>
) : TaskCondition by condition