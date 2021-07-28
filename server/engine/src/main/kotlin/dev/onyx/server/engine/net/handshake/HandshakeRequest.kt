package dev.onyx.server.engine.net.handshake

import dev.onyx.server.engine.net.Message

data class HandshakeRequest(val type: HandshakeType) : Message