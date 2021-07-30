package dev.onyx.server.engine.task.condition

interface TaskCondition {

    fun canResume(): Boolean

    fun postProcess() {
        /*
         * Nothing to do.
         */
    }

}