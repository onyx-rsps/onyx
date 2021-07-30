package dev.onyx.server.engine.manager

import com.google.common.util.concurrent.ThreadFactoryBuilder
import dev.onyx.server.engine.net.StatusResponse
import dev.onyx.server.engine.net.login.LoginRequest
import dev.onyx.server.engine.serializer.JsonPlayerSerializer
import org.tinylog.kotlin.Logger
import java.util.concurrent.Executors
import java.util.concurrent.LinkedBlockingDeque

class LoginManager {

    private val executor = Executors.newFixedThreadPool(LOGIN_THREADS, ThreadFactoryBuilder()
        .setNameFormat("login-thread")
        .setUncaughtExceptionHandler { t, e -> Logger.error(e) { "An error occurred in [thread: $t]." } }
        .build()
    )

    internal val loginQueue = LinkedBlockingDeque<LoginRequest>()

    /**
     * Starts processing login and logout queued requests async.
     */
    fun start() {
        Logger.info("Starting login queue processor on $LOGIN_THREADS thread.")

        executor.execute {
            while(true) {
                this.processLogins()
            }
        }
    }

    /**
     * Processes the login requests from the login queue.
     */
    private fun processLogins() {
        val request = loginQueue.take()
        val session = request.session

        /*
         * Load the player from the serializer.
         */
        val player = serializer.load(request)

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
        player.initialize()
    }

    companion object {

        /**
         * The number of threads that are dedicated to processing Login and logout requests.
         */
        private const val LOGIN_THREADS = 4

        /**
         * The current player save serializer for loading and saving player data.
         */
        private var serializer = JsonPlayerSerializer
    }
}