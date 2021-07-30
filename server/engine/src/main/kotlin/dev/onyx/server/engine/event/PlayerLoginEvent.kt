package dev.onyx.server.engine.event

import dev.onyx.server.engine.event.type.PlayerEvent
import dev.onyx.server.engine.model.entity.Player

class PlayerLoginEvent(player: Player) : PlayerEvent(player)