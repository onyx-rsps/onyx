package dev.onyx.server.engine.net.js5

import dev.onyx.server.engine.net.Message

data class JS5Request(val archive: Int, val group: Int) : Message