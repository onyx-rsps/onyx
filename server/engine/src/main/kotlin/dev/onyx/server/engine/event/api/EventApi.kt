package dev.onyx.server.engine.event.api

import dev.onyx.server.engine.event.type.Event

inline fun <reified T : Event> onEvent(): EventTask<T> = EventTask(T::class)