package dev.onyx.server.engine.model

import java.util.*

class World : TimerTask() {

    var tick = 0L

    override fun run() {

        /*
         * Increment the tick counter.
         */
        if(tick == Long.MAX_VALUE) {
            tick = 0L
        }
        tick++
    }

}