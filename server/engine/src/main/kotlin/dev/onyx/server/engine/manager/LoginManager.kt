package dev.onyx.server.engine.manager

import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.net.login.LoginRequest
import dev.onyx.server.engine.serializer.JsonPlayerSerializer
import java.util.concurrent.ConcurrentLinkedDeque
import java.util.concurrent.ConcurrentLinkedQueue

class LoginManager {

    internal val loginQueue = ConcurrentLinkedDeque<LoginRequest>()
    internal val logoutQueue = ConcurrentLinkedQueue<Player>()

    /**
     * Processes the login requests from the login queue.
     */
    internal fun processLogins() {

    }

    /**
     * Processes the logout requests from the logout queue.
     */
    internal fun processLogouts() {

    }

    companion object {
        /**
         * The current player save serializer for loading and saving player data.
         */
        private var serializer = JsonPlayerSerializer
    }
}