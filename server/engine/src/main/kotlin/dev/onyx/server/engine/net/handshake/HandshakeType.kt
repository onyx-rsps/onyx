package dev.onyx.server.engine.net.handshake

enum class HandshakeType(val opcode: Int) {
    LOGIN(14),
    JS5(15);

    companion object {
        val values = enumValues<HandshakeType>()

        fun fromOpcode(opcode: Int): HandshakeType {
            return values.first { it.opcode == opcode }
        }

    }
}