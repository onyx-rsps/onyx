package dev.onyx.server.engine.model.entity

import dev.onyx.server.engine.model.PrivilegeLevel

class Player : LivingEntity() {

    lateinit var client: Client internal set

    /**
     * Data Fields.
     */

    var displayName: String = ""

    var privilegeLevel: PrivilegeLevel = PrivilegeLevel.PLAYER

}