package dev.onyx.server.engine.net.login

import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.net.Message

data class LoginResponse(val player: Player) : Message