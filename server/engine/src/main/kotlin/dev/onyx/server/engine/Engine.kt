package dev.onyx.server.engine

import org.tinylog.kotlin.Logger

class Engine {

    private var running = false

    fun start() {
        if(running) return

        Logger.info("Starting Onyx game engine...")

        /*
         * Start the game engine components.
         */


        running = true
    }

    fun stop() {
        if(!running) return

        Logger.info("Stopping Onyx game engine...")

        /*
         * Shutdown game engine components.
         */

        running = false
    }

    fun isRunning(): Boolean = running

}