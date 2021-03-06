package dev.onyx.server.engine.model.entity

import dev.onyx.server.common.inject
import dev.onyx.server.engine.Engine
import dev.onyx.server.engine.model.World
import dev.onyx.server.engine.model.map.Tile

abstract class Entity {

    val engine: Engine by inject()
    val world: World by inject()

    var index: Int = -1

    var tile: Tile = Tile.ZERO

}