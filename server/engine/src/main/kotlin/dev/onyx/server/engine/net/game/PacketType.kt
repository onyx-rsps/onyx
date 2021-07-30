package dev.onyx.server.engine.net.game

enum class PacketType(val length: Int) {
    FIXED(-3),
    VARIABLE_BYTE(-1),
    VARIABLE_SHORT(-2);

    companion object {
        val values = enumValues<PacketType>()

        fun fromLength(length: Int): PacketType {
            return values.first { it.length == length }
        }
    }
}