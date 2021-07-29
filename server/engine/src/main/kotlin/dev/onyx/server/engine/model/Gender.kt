package dev.onyx.server.engine.model

enum class Gender(val id: Int) {
    MALE(0),
    FEMALE(1);

    companion object {
        val values = enumValues<Gender>()

        fun fromId(id: Int): Gender {
            return values.first { it.id == id }
        }
    }
}