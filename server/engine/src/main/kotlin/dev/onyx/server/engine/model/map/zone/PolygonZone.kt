package dev.onyx.server.engine.model.map.zone

import dev.onyx.server.engine.model.entity.Entity
import dev.onyx.server.engine.model.map.Tile
import java.awt.Polygon

/**
 * Represents a area of tiles in the game world. The same function as Zone but has a non-regular polygon
 * shape.
 *
 * @property vertices Array<out Tile>
 * @constructor
 */
open class PolygonZone(vararg val vertices: Tile) {

    @Suppress("RemoveRedundantSpreadOperator")
    constructor() : this(*emptyArray())

    /**
     * We use the Java AWT library and piggyback off their polygon code :)
     */
    private val polygon = Polygon()

    init {
        vertices.forEach { vertex ->
            polygon.addPoint(vertex.x, vertex.y)
        }
    }

    open fun addVertex(tile: Tile) {
        polygon.addPoint(tile.x, tile.y)
    }

    open fun contains(tile: Tile): Boolean = polygon.contains(tile.x, tile.y)

    open fun contains(entity: Entity): Boolean = contains(entity.tile)

}