package dev.onyx.server.engine.task.condition

class WaitCondition(var ticks: Int) : TaskCondition {

    private var ticked = false

    override fun canResume(): Boolean = when(ticked) {
        false -> {
            ticked = true
            ticks-- <= 0
        }

        else -> false
    }

    override fun postProcess() {
        ticked = false
    }

}