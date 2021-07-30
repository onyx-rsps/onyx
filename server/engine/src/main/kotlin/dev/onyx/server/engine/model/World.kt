package dev.onyx.server.engine.model

import dev.onyx.server.common.inject
import dev.onyx.server.engine.event.api.EventContext
import dev.onyx.server.engine.event.api.EventHandler
import dev.onyx.server.engine.event.type.Event
import dev.onyx.server.engine.manager.LoginManager
import dev.onyx.server.engine.model.list.PlayerList
import java.util.concurrent.LinkedBlockingDeque

class World : EventContext {

    private val loginManager: LoginManager by inject()

    override val events = LinkedBlockingDeque<EventHandler<Event>>()

    val players: PlayerList = PlayerList(MAX_PLAYERS)

    fun cycle() {

    }

    fun isFull(): Boolean = players.size + loginManager.loginQueue.size >= MAX_PLAYERS

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