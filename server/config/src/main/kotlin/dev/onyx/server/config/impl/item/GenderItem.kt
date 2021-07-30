package dev.onyx.server.config.impl.item

enum class GenderItem(val id: Int) {
    MALE(0),
    FEMALE(1);

    companion object {
        val values = enumValues<GenderItem>()

        fun fromId(id: Int): GenderItem {
            return values.first { it.id == id }
        }

    }
}