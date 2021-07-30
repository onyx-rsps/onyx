@file:Suppress("ClassName")

package dev.onyx.server.engine.event.api

import dev.onyx.server.engine.event.type.Event

@DslMarker
annotation class _EventDsl_

@_EventDsl_
inline fun <reified T : Event> onEvent(noinline action: T.() -> Unit): EventTask<T> = EventTask(T::class, action)

@_EventDsl_
inline fun <reified T : Event> onEvent(): EventTask<T> = EventTask(T::class)