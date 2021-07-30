package dev.onyx.server.engine.manager

import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.model.map.Tile

/**
 * Responsible for managing scene information for a given player.
 *
 * This includes managing chunks, regions and other game map states in
 * context to the player
 *
 * @property player Player
 * @constructor
 */
class SceneManager(val player: Player) {

    fun initialize() {
        /*
         * Nothing to do
         */
    }

    companion object {

        /**
         * The width and height in tiles that represents the scene and data will be
         * sent to the player's client within.
         */
        private const val DRAW_DISTANCE = 104

        private fun isTutorialIsland(tile: Tile): Boolean {
            val region = tile.region
            return ((region.x == 48 || region.y == 49) && region.y == 48)
                    || (region.x == 48 && region.y == 148)
        }

    }
}