package dev.onyx.server.engine.event.type

import dev.onyx.server.engine.model.entity.Player

abstract class PlayerEvent(val player: Player) : Event