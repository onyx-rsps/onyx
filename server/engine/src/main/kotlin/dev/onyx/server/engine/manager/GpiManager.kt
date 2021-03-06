package dev.onyx.server.engine.manager

import dev.onyx.server.common.inject
import dev.onyx.server.engine.model.World
import dev.onyx.server.engine.model.entity.Player

class GpiManager(val player: Player) {

    private val world: World by inject()

    /**
     * The player GPI backing fields.
     */

    var localPlayerCount = 0
    val localPlayers = arrayOfNulls<Player>(World.MAX_PLAYERS)
    val localPlayerIndexes = IntArray(World.MAX_PLAYERS)
    var externalPlayerCount = 0
    val externalPlayerIndexes = IntArray(World.MAX_PLAYERS)
    val tileMultipliers = IntArray(World.MAX_PLAYERS)
    val skipFlags = IntArray(World.MAX_PLAYERS)

    /**
     * Initializes the player's GPI when they first connect to the
     * server after login.
     */
    internal fun initialize() {
        localPlayers[player.index] = player
        localPlayerIndexes[localPlayerCount++] = player.index

        for(index in 1 until World.MAX_PLAYERS) {
            if(index != player.index) {
                externalPlayerIndexes[externalPlayerCount++] = index
                tileMultipliers[index] = player.world.players[index]?.tile?.as18BitInteger ?: 0
            }
        }
    }
}