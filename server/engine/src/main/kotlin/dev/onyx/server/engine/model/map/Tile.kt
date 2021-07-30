package dev.onyx.server.engine.model.map

import kotlin.math.abs

class Tile(val packed: Int) {

    constructor(x: Int, y: Int, level: Int = 0) : this(
        (x and 0x7FFF) or ((y and 0x7FFF) shl 15) or (level shl 30)
    )

    val x: Int get() = packed and 0x7FFF

    val y: Int get() = (packed shr 15) and 0x7FFF

    val level: Int get() = (packed shr 30) and 0x3

    val as30BitInteger: Int get() =
        (y and 0x3FFF) or ((x and 0x3FFF) shl 14) or ((level and 0x3) shl 28)

    val as18BitInteger: Int get() =
        (y shr 13) or ((x shr 13) shl 8) or ((level and 0x3) shl 16)

    val chunk: Chunk get() = Chunk(
        x / Chunk.SIZE,
        y / Chunk.SIZE
    )

    val region: Region get() = Region(
        x / Region.SIZE,
        y / Region.SIZE
    )

    fun translate(offsetX: Int, offsetY: Int, offsetLevel: Int = 0) = Tile(
        x + offsetX,
        y + offsetY,
        level + offsetLevel
    )

    fun translateX(offset: Int) = translate(offset, 0, 0)

    fun translateY(offset: Int) = translate(0, offset, 0)

    fun translateLevel(offset: Int) = translate(0, 0, offset)

    operator fun minus(other: Tile): Tile {
        return translate(-other.x, -other.y)
    }

    operator fun plus(other: Tile): Tile {
        return translate(other.x, other.y)
    }

    fun isWithinRadius(otherX: Int, otherY: Int, otherLevel: Int, radius: Int): Boolean {
        if(otherLevel != level) {
            return false
        }

        val dx = abs(x - otherX)
        val dy = abs(y - otherY)

        return dx <= radius && dy <= radius
    }

    fun isWithinRadius(other: Tile, radius: Int): Boolean = isWithinRadius(other.x, other.y, other.level, radius)

    override fun toString(): String {
        return "TILE(x=$x, y=$y, level=$level)"
    }

    companion object {

        const val SIZE = 1

        /**
         * The placeholder zero tile.
         */
        val ZERO = Tile(0)
    }
}