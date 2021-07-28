package dev.onyx.server.engine

import dev.onyx.server.common.inject
import dev.onyx.server.engine.net.NetworkServer
import org.tinylog.kotlin.Logger

class Engine {

    private val networkServer: NetworkServer by inject()

    private var running = false

    fun start() {
        if(running) return

        Logger.info("Preparing game engine.")

        /*
         * Start the network server
         */
        networkServer.start()

        running = true
    }

    fun stop() {
        if(!running) return

        Logger.info("Stopping game engine...")

        /*
         * Shutdown game engine components.
         */

        running = false
    }

    fun isRunning(): Boolean = running

}