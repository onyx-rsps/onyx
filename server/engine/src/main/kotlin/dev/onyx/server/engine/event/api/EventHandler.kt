package dev.onyx.server.engine.event.api

import dev.onyx.server.engine.event.type.Event
import org.tinylog.kotlin.Logger

class EventHandler<out T : Event>(
    val event: T,
    private val action: T.() -> Unit
) {

    fun handle(): Unit = try {
        event.action()
    } catch (e : Exception) {
        Logger.error(e) { "An error occurred while handling event: $event." }
    }

}