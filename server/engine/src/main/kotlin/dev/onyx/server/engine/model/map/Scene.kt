package dev.onyx.server.engine.model.map

class Scene(val packed: Int) {

    val x: Int get() = packed and 0xFFFF

    val y: Int get() = (packed shr 16) and 0xFFFF

    constructor(x: Int, y: Int) : this(
        (x and 0xFFF) or ((y and 0xFFF) shl 16)
    )

    val region: Region get() = Region(
        x * (SIZE / Region.SIZE),
        y * (SIZE / Region.SIZE)
    )

    fun tile(level: Int) = Tile(
        x * SIZE,
        y * SIZE,
        level
    )

    fun chunk(level: Int) = Tile(
        x * (SIZE / Chunk.SIZE),
        y * (SIZE / Chunk.SIZE),
        level
    )

    companion object {

        /**
         * The width and height in tiles of a [Scene]
         */
        const val SIZE = 104

        /**
         * The distance in tile to the edge of a [Scene] border to rebuild neighboring regions
         */
        const val REBUILD_DISTANCE = 16

        /**
         * The distance in tiles that entities are rendered in the scene.
         */
        const val RENDER_DISTANCE = 14

    }
}