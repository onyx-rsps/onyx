package dev.onyx.server.engine.model.entity

import dev.onyx.server.engine.model.Appearance
import dev.onyx.server.engine.model.PrivilegeLevel

class Player : LivingEntity() {

    lateinit var client: Client internal set

    /**
     * Data Fields.
     */

    var displayName: String = ""

    var privilegeLevel: PrivilegeLevel = PrivilegeLevel.PLAYER

    var pid: Int = -1

    var appearance: Appearance = Appearance.DEFAULT

    /**
     * Register the player to the game engine's world.
     */
    fun register() {
        println("registered")
    }

    /**
     * Deregister the player to the game engine's world.
     */
    fun deregister() {
        println("deregistered")
    }
}