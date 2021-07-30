package dev.onyx.server.engine.event.type

import dev.onyx.server.common.get
import dev.onyx.server.engine.model.World

abstract class WorldEvent : Event {
    val world: World = get()
}