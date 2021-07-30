package dev.onyx.server.engine.event.type

import dev.onyx.server.common.get
import dev.onyx.server.engine.Engine

abstract class EngineEvent : Event {
    val engine: Engine = get()
}