package dev.onyx.server.engine.model.entity

import dev.onyx.server.engine.event.PlayerLoginEvent
import dev.onyx.server.engine.event.api.EventBus
import dev.onyx.server.engine.manager.SceneManager
import dev.onyx.server.engine.manager.GpiManager
import dev.onyx.server.engine.model.Appearance
import dev.onyx.server.engine.model.PrivilegeLevel
import org.tinylog.kotlin.Logger

class Player : LivingEntity() {

    lateinit var client: Client internal set

    /**
     * Player managers
     */

    val gpi = GpiManager(this)
    val chunkManager = SceneManager(this)

    /**
     * Data Fields.
     */

    var displayName: String = ""

    var privilegeLevel: PrivilegeLevel = PrivilegeLevel.PLAYER

    var pid: Int = -1

    var appearance: Appearance = Appearance.DEFAULT

    fun isOnline(): Boolean = world.players.contains(this)

    /**
     * Register the player to the game engine's world.
     */
    internal fun initialize() {
        world.players.add(this)

        gpi.initialize()
        chunkManager.initialize()

        EventBus.fire(PlayerLoginEvent(this))

        Logger.info("${client.username} has connected to server.")
    }

}