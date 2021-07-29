package dev.onyx.server.engine.serializer

import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.net.login.LoginRequest

interface PlayerSerializer {

    fun create(request: LoginRequest) {
        /*
         * No Implementation
         */
    }

    fun load(request: LoginRequest): Player?

    fun save(player: Player)

}