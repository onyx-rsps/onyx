package dev.onyx.server.engine.model.entity

import dev.onyx.server.engine.event.PlayerLoginEvent
import dev.onyx.server.engine.event.api.EventBus
import dev.onyx.server.engine.model.Appearance
import dev.onyx.server.engine.model.PrivilegeLevel
import org.tinylog.kotlin.Logger

class Player : LivingEntity() {

    lateinit var client: Client internal set

    /**
     * Data Fields.
     */

    var displayName: String = ""

    var privilegeLevel: PrivilegeLevel = PrivilegeLevel.PLAYER

    var pid: Int = -1

    var appearance: Appearance = Appearance.DEFAULT

    fun isRegistered(): Boolean = world.players.contains(this)

    /**
     * Register the player to the game engine's world.
     */
    internal fun register() {
        world.players.add(this)
        EventBus.fire(PlayerLoginEvent(this))
    }

    /**
     * Deregister the player to the game engine's world.
     */
    internal fun deregister() {
        world.players.remove(this)
    }
}