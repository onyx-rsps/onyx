package dev.onyx.server.engine

import dev.onyx.server.common.inject
import dev.onyx.server.config.impl.ServerConfig
import dev.onyx.server.engine.event.api.EventContext
import dev.onyx.server.engine.event.api.EventHandler
import dev.onyx.server.engine.event.type.Event
import dev.onyx.server.engine.manager.LoginManager
import dev.onyx.server.engine.model.World
import dev.onyx.server.engine.net.NetworkServer
import org.tinylog.kotlin.Logger
import java.util.*
import java.util.concurrent.LinkedBlockingDeque

class Engine : TimerTask(), EventContext {

    private val networkServer: NetworkServer by inject()
    private val world: World by inject()
    private val loginManager: LoginManager by inject()

    private var running = false

    /**
     * The current tick counter of the game engine.
     */
    var tick = 0L

    override val events = LinkedBlockingDeque<EventHandler<Event>>()

    fun start() {
        if(running) return

        Logger.info("Preparing game engine.")

        /*
         * Start the game tick scheduler
         */
        Timer().scheduleAtFixedRate(this, 0L, ServerConfig.tickRate)

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

    /**
     * Executes every server game-tick and is responsible for dispatching processing to all other
     * game engine components.
     */
    override fun run() {
        /*
         * Process engine events.
         */
        processEvents()

        /*
         * Process login / logout queue.
         */
        loginManager.processLogins()
        loginManager.processLogouts()

        /*
         * Cycle the game world.
         */
        world.cycle()

        /*
         * Increment the tick counter.
         */
        tick++
    }

    private fun processEvents() {
        while(events.isNotEmpty()) {
            events.poll().handle()
        }
    }
}