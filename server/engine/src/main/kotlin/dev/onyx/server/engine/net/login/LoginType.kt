package dev.onyx.server.engine.net.login

enum class LoginType(val opcode: Int) {
    NORMAL(16),
    RECONNECT(18);

    companion object {
        val values = enumValues<LoginType>()

        fun fromOpcode(opcode: Int): LoginType {
            return values.first { it.opcode == opcode }
        }
    }
}