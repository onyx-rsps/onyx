package dev.onyx.server.engine.serializer

import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.net.login.LoginRequest

interface PlayerSerializer {

    fun create(request: LoginRequest): Player {
        throw UnsupportedOperationException()
    }

    fun load(username: String, password: String): Player?

    fun save(player: Player)

}