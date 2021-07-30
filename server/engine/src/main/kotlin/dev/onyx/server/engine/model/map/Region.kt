package dev.onyx.server.engine.model.map

import dev.onyx.server.common.inject
import dev.onyx.server.config.impl.xtea.XteaConfig

class Region(val id: Int) {

    private val xteaConfig: XteaConfig by inject()

    val x: Int get() = id shr 8

    val y: Int get() = id and 0xFF

    constructor(x: Int, y: Int) : this((x shl 8) or y)

    val xteas: IntArray get() = xteaConfig[id]

    fun translate(offsetX: Int, offsetY: Int) = Region(
        x + offsetX,
        y + offsetY
    )

    fun translateX(offset: Int) = translate(offset, 0)

    fun translateY(offset: Int) = translate(0, offset)

    fun tile(level: Int) = Tile(
        x * SIZE,
        y * SIZE,
        level
    )

    fun chunk(level: Int) = Chunk(
        x * (SIZE / Chunk.SIZE),
        y * (SIZE / Chunk.SIZE),
        level
    )

    val scene: Scene get() = Scene(
        x / (Scene.SIZE / SIZE),
        y / (Scene.SIZE / SIZE)
    )

    companion object {

        /**
         * The width and height in tiles of a [Region]
         */
        const val SIZE = 64

        /**
         * The placeholder zero region.
         */
        val ZERO = Region(0)
    }
}