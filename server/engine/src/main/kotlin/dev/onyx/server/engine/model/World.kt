package dev.onyx.server.engine.model

import dev.onyx.server.common.inject
import dev.onyx.server.engine.manager.LoginManager
import dev.onyx.server.engine.model.list.PlayerList
import java.util.*

class World : TimerTask() {

    private val loginManager: LoginManager by inject()

    var tick = 0L

    val players: PlayerList = PlayerList(MAX_PLAYERS)

    override fun run() {
        /*
         * Process logins / logouts
         */
        this.loginManager.processLogins()
        this.loginManager.processLogouts()

        /*
         * Increment the tick counter.
         */
        tick++
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