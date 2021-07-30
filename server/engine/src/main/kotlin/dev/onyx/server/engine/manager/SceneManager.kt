package dev.onyx.server.engine.manager

import dev.onyx.server.engine.model.entity.Player

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

}