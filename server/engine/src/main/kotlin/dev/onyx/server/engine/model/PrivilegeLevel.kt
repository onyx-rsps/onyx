package dev.onyx.server.engine.model

enum class PrivilegeLevel(val id: Int) {
    PLAYER(0),
    MOD(1),
    ADMIN(2);

    companion object {
        val values = enumValues<PrivilegeLevel>()

        fun fromId(id: Int): PrivilegeLevel {
            return values.first { it.id == id }
        }
    }
}