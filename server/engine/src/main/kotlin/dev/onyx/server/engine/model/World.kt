package dev.onyx.server.engine.model

import dev.onyx.server.common.inject
import dev.onyx.server.engine.event.api.EventContext
import dev.onyx.server.engine.event.api.EventHandler
import dev.onyx.server.engine.event.type.Event
import dev.onyx.server.engine.manager.LoginManager
import dev.onyx.server.engine.model.list.PlayerList
import dev.onyx.server.engine.task.Task
import dev.onyx.server.engine.task.TaskContext
import dev.onyx.server.engine.task.TaskType
import java.util.concurrent.LinkedBlockingDeque

class World : EventContext, TaskContext {

    private val loginManager: LoginManager by inject()

    override val events = LinkedBlockingDeque<EventHandler<Event>>()

    override val tasks = mutableMapOf<TaskType, MutableSet<Task>>()

    val players: PlayerList = PlayerList(MAX_PLAYERS)

    fun cycle() {
        /*
         * World
         */
        processTasks()

        /*
         * NPC
         */

        /*
         * Player
         */
        players.forEach { it.processTasks() }

        /*
         * Post Tasks
         */
        postProcessTasks()
    }

    fun isFull(): Boolean = players.size + loginManager.loginQueue.size >= MAX_PLAYERS

    private fun processTasks() {
        while(true) {
            /*
             * Handle queued events
             */
            while(events.isNotEmpty()) {
                events.poll().handle()
            }

            /*
             * Run queued tasks
             */
            val resumed = tasks.values.flatMap {
                it.toList().map(Task::run)
            }

            if(resumed.all { !it } && events.isEmpty()) {
                break
            }
        }
    }

    companion object {

        /**
         * The maximum number of players registered in the world.
         */
        const val MAX_PLAYERS = 2048

        /**
         * The maximum number of npcs registered in the world.
         */
        const val MAX_NPCS = 32768

    }
}