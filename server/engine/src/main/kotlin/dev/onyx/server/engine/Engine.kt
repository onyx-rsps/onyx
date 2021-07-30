package dev.onyx.server.engine

import dev.onyx.server.common.inject
import dev.onyx.server.config.impl.ServerConfig
import dev.onyx.server.engine.event.EngineShutdownEvent
import dev.onyx.server.engine.event.EngineStartupEvent
import dev.onyx.server.engine.event.api.EventBus
import dev.onyx.server.engine.manager.LoginManager
import dev.onyx.server.engine.model.World
import dev.onyx.server.engine.net.NetworkServer
import org.tinylog.kotlin.Logger
import java.util.*
import kotlin.math.absoluteValue

class Engine : TimerTask() {

    private val networkServer: NetworkServer by inject()
    private val world: World by inject()
    private val loginManager: LoginManager by inject()

    private var running = false

    /**
     * Whether the game engine is currently pause.
     */
    var paused = false

    /**
     * The current tick counter of the game engine.
     */
    var tick = 0L

    private var cycleTime = 0

    private var debugTickCounter = 0

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

        /*
         * Start login queue processor.
         */
        loginManager.start()

        running = true

        EventBus.fire(EngineStartupEvent())
    }

    fun stop() {
        if(!running) return

        Logger.info("Stopping game engine...")

        /*
         * Shutdown game engine components.
         */

        running = false

        EventBus.fire(EngineShutdownEvent())
    }

    fun isRunning(): Boolean = running

    /**
     * Executes every server game-tick and is responsible for dispatching processing to all other
     * game engine components.
     */
    override fun run() {
        if(paused) {
            return
        }

        val start = System.currentTimeMillis()

        /*
         * Cycle the game world.
         */
        world.cycle()

        /*
         * Increment the tick counter.
         */
        tick++

        /*
         * Calculate the time the cycle took to complete.
         */
        cycleTime += (System.currentTimeMillis() - start).toInt()

        val cycleTimeCopy = this.cycleTime

        if(debugTickCounter++ >= TICKS_PER_DEBUG_LOG) {
            val freeMemory = Runtime.getRuntime().freeMemory()
            val totalMemory = Runtime.getRuntime().totalMemory()
            val maxMemory = Runtime.getRuntime().maxMemory()

            val cycleTimeMs = cycleTime / TICKS_PER_DEBUG_LOG
            val playerCount = world.players.size
            val usedMem = (totalMemory - freeMemory) / (1024 * 1024)
            val allocMem = totalMemory / (1024 * 1024)
            val totalMem = maxMemory / (1024 * 1024)

            val debugMessage =  "[Cycle Time: ${cycleTimeCopy}ms] " +
                                "[Players Online: $playerCount] " +
                                "[Memory Usage: used=${usedMem}MB / alloc=${allocMem}MB / total=${totalMem}MB]"

            Logger.debug(debugMessage)

            debugTickCounter = 0
            cycleTime = 0
        }

        val freeTime = ServerConfig.tickRate - (System.currentTimeMillis() - start)
        if(freeTime < 0) {
            val timeBehind = freeTime.absoluteValue
            val ticksBehind = (ServerConfig.tickRate / freeTime).toInt()
            Logger.warn("Can't keep up! Is the server overloaded? Running ${timeBehind}ms or $ticksBehind ticks behind.")
        }
    }

    companion object {

        /**
         * The number of engine game ticks before a debug log entry is written to
         * the console and log files.
         */
        private const val TICKS_PER_DEBUG_LOG = 5
    }
}