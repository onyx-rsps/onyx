package dev.onyx.server.engine.model.entity

import dev.onyx.server.engine.event.PlayerLoginEvent
import dev.onyx.server.engine.event.api.EventBus
import dev.onyx.server.engine.manager.SceneManager
import dev.onyx.server.engine.manager.GpiManager
import dev.onyx.server.engine.model.Appearance
import dev.onyx.server.engine.model.PrivilegeLevel
import dev.onyx.server.engine.net.ext.then
import dev.onyx.server.engine.net.game.GameProtocol
import dev.onyx.server.engine.net.login.LoginResponse
import dev.onyx.server.engine.net.packet.server.RebuildRegionNormal
import org.tinylog.kotlin.Logger

class Player : LivingEntity() {

    lateinit var client: Client internal set

    /**
     * Player managers
     */

    val gpi = GpiManager(this)

    val scene = SceneManager(this)

    /**
     * Data Fields.
     */

    var displayName: String = ""

    var privilegeLevel: PrivilegeLevel = PrivilegeLevel.PLAYER

    var pid: Int = -1

    var appearance: Appearance = Appearance.DEFAULT

    var member: Boolean = true

    fun isOnline(): Boolean = world.players.contains(this)

    /**
     * Register the player to the game engine's world.
     */
    internal fun initialize() {
        world.players.add(this)

        gpi.initialize()
        scene.initialize()

        /*
         * Send the login response and switch the player's session protocol
         * over to the game protocol.
         */
        client.writeAndFlush(LoginResponse(this)).then {
            client.session.protocol.set(GameProtocol(client.session))
            client.write(RebuildRegionNormal(this, includeGpi = true))
        }

        EventBus.fire(PlayerLoginEvent(this))

        Logger.info("${client.username} has connected to server.")
    }

    internal fun cycle() {
        processTasks()

        /*
         * Cycle the session at start of player's tick.
         */
        client.session.cycle()


        postProcessTasks()
    }

    internal fun postCycle() {
        client.flush()
    }
}