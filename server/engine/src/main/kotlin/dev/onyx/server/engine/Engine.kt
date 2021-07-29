package dev.onyx.server.engine

import dev.onyx.server.common.inject
import dev.onyx.server.config.impl.ServerConfig
import dev.onyx.server.engine.model.World
import dev.onyx.server.engine.net.NetworkServer
import org.tinylog.kotlin.Logger
import java.util.*

class Engine {

    private val networkServer: NetworkServer by inject()
    private val world: World by inject()

    private var running = false

    fun start() {
        if(running) return

        Logger.info("Preparing game engine.")

        /*
         * Start the game tick scheduler
         */
        Timer().scheduleAtFixedRate(world, 0L, ServerConfig.tickRate)

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