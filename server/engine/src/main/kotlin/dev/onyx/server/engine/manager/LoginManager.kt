package dev.onyx.server.engine.manager

import dev.onyx.server.common.hash.SHA256
import dev.onyx.server.config.impl.ServerConfig
import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.net.StatusResponse
import dev.onyx.server.engine.net.login.LoginRequest
import dev.onyx.server.engine.serializer.JsonPlayerSerializer
import java.util.concurrent.ConcurrentLinkedDeque
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.stream.Collectors

class LoginManager {

    internal val loginQueue = ConcurrentLinkedDeque<LoginRequest>()
    internal val logoutQueue = ConcurrentLinkedQueue<Player>()

    /**
     * Processes the login requests from the login queue.
     */
    internal fun processLogins() {
        var loginCount = 0
        while(loginQueue.isNotEmpty() && loginCount < ServerConfig.maxLoginsPerTick) {
            val request = loginQueue.poll()
            val session = request.session

            /*
             * Load the player from the serializer.
             */

            val username = request.username.sanitize()
            val password = SHA256.hash(request.password)
            val player = serializer.load(username, password)

            /*
             * If loading the player with the provided credentials is null, return
             * the status code 'INVALID_CREDENTIALS' and close the session.
             */
            if(player == null) {
                session.writeAndClose(StatusResponse.INVALID_CREDENTIALS)
                return
            }

            /*
             * Register the player to the game world.
             */
            player.register()

            /*
             * Increment the login counter.
             */
            loginCount++
        }
    }

    /**
     * Processes the logout requests from the logout queue.
     */
    internal fun processLogouts() {

    }

    private fun String.sanitize(): String {
        return this
            .chars()
            .mapToObj { it.toChar() }
            .map { if(Character.isWhitespace(it)) '_' else it }
            .filter { Character.isLetterOrDigit(it) || it == '-' || it == '_' }
            .map { it.toString() }
            .collect(Collectors.joining())
    }

    companion object {
        /**
         * The current player save serializer for loading and saving player data.
         */
        private var serializer = JsonPlayerSerializer
    }
}