package dev.onyx.server.engine.event.api

import dev.onyx.server.engine.event.type.Event

interface EventContext {

    val events: MutableCollection<EventHandler<Event>>

}