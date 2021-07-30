package dev.onyx.server.engine.model.map.zone

import dev.onyx.server.engine.model.entity.Entity
import dev.onyx.server.engine.model.map.Tile

/**
 * A zone represents a regular square polygon set of tiles defined in the game
 * world. A zone offers the ability of easy handling of actions or events that occur
 * within a range of tiles.
 *
 * NOTE:
 * The tiles that define the zone are inclusive meaning
 * that the [topLeftTile] will be included in the zone.
 *
 * Also keep in mind that Zone are independent of tile level and basically extend
 * up vertically forever.
 *
 * @property topLeftTile The top left most tile of the zone.
 * @property bottomRightTile The bottom right most tile of the zone.
 * @constructor
 */
open class Zone(val topLeftTile: Tile, val bottomRightTile: Tile) {

    /**
     * Gets whether a given tile is within the zone.
     *
     * @param tile Tile
     * @return Boolean
     */
    open fun contains(tile: Tile): Boolean {
        return (tile.x >= topLeftTile.x && tile.y >= topLeftTile.y)
                && (tile.x <= bottomRightTile.x && tile.y <= bottomRightTile.y)
    }

    /**
     * Gets whether a given entity's position is within the zone.
     *
     * @param entity Entity
     * @return Boolean
     */
    open fun contains(entity: Entity): Boolean {
        return contains(entity.tile)
    }

}