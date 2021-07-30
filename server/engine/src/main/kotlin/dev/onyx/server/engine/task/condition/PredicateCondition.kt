package dev.onyx.server.engine.task.condition

class PredicateCondition(private val predicate: () -> Boolean) : TaskCondition {

    override fun canResume(): Boolean {
        return predicate()
    }

}