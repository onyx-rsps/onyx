package dev.onyx.server.engine.serializer

import dev.onyx.server.engine.model.entity.Player

interface PlayerSerializer {

    fun load(username: String, password: String): Player

    fun save(player: Player)

}