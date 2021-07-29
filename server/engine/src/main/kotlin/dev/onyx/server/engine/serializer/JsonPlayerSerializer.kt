package dev.onyx.server.engine.serializer

import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.net.login.LoginRequest

object JsonPlayerSerializer : PlayerSerializer {

    override fun create(request: LoginRequest): Player {
        return Player()
    }

    override fun load(username: String, password: String): Player? {
        return null
    }

    override fun save(player: Player) {

    }

}