package dev.onyx.server.engine.script

import dev.onyx.server.engine.event.api.EventTask
import dev.onyx.server.engine.event.type.Event

/**
 * Listens for a given [Event] and then executes an [EventTask] action by registering
 * a listener for the event in the event bus.
 *
 * @receiver OnyxScript
 * @return EventTask<T>
 */
inline fun <reified T : Event> OnyxScript.onEvent(): EventTask<T> = EventTask(T::class)