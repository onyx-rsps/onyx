package dev.onyx.server.engine.serializer

import dev.onyx.server.engine.model.entity.Player

object JsonPlayerSerializer : PlayerSerializer {

    override fun load(username: String, password: String): Player {
        return Player()
    }

    override fun save(player: Player) {

    }

}