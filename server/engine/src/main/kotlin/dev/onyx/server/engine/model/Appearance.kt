package dev.onyx.server.engine.model

data class Appearance(var looks: IntArray, var colors: IntArray, var gender: Gender) {

    companion object {
        private val DEFAULT_LOOKS = intArrayOf(-1, -1, -1, -1, 18, -1, 26, 36, 0, 33, 42, 10)
        private val DEFAULT_COLORS = intArrayOf(0, 0, 0, 0, 0)

        /**
         * The default starter player appearance.
         */
        val DEFAULT = Appearance(DEFAULT_LOOKS, DEFAULT_COLORS, Gender.MALE)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Appearance

        if (!looks.contentEquals(other.looks)) return false
        if (!colors.contentEquals(other.colors)) return false
        if (gender != other.gender) return false

        return true
    }

    override fun hashCode(): Int {
        var result = looks.contentHashCode()
        result = 31 * result + colors.contentHashCode()
        result = 31 * result + gender.hashCode()
        return result
    }

}