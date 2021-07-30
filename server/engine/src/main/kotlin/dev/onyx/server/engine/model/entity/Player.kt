package dev.onyx.server.engine.model.entity

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
    fun register() {
        Logger.info("[username: ${client.username}] has connected to the server.")
        world.players.add(this)
    }

    /**
     * Deregister the player to the game engine's world.
     */
    fun deregister() {
        Logger.info("[username: ${client.username}] has disconnected from the server.")
        world.players.remove(this)
    }
}