package dev.onyx.server.engine.model.map

class Chunk(val packed: Int) {

    val x: Int get() = packed and 0x7FFF

    val y: Int get() = (packed shr 15) and 0x7FFF

    val level: Int get() = (packed shr 30) and 0x3

    constructor(x: Int, y: Int, level: Int = 0) : this(
        (x and 0x7FFF) or ((y and 0x7FFF) shl 15) or (level shl 30)
    )

    fun translate(offsetX: Int, offsetY: Int, offsetLevel: Int = 0) = Tile(
        x + offsetX,
        y + offsetY,
        level + offsetLevel
    )

    fun translateX(offset: Int) = translate(offset, 0, 0)

    fun translateY(offset: Int) = translate(0, offset, 0)

    fun translateLevel(offset: Int) = translate(0, 0, offset)

    val tile: Tile get() = Tile(
        x * SIZE,
        y * SIZE,
        level
    )

    companion object {

        /**
         * The width and height in tiles of a [Chunk]
         */
        const val SIZE = 8

    }
}