package dev.onyx.server.engine.event.api

import dev.onyx.server.engine.event.type.Event
import dev.onyx.server.engine.event.type.PlayerEvent
import dev.onyx.server.engine.event.type.WorldEvent
import kotlin.reflect.KClass

object EventBus {

    private val eventListeners = mutableMapOf<KClass<out Event>, MutableList<EventListener<Event>>>()

    @Suppress("UNCHECKED_CAST")
    fun <T : Event> register(type: KClass<T>, listener: EventListener<T>) {
        val listeners = eventListeners.getOrPut(type) { mutableListOf() }
        listeners.add(listener as EventListener<Event>)
    }

    /**
     * =============================================
     * = EVENT BUS TRIGGER METHODS
     * =============================================
     */

    fun <T : Event> fire(event: T) {
        eventListeners[event::class]?.forEach { it.execute(event) }
    }

    fun <T : WorldEvent> fire(event: T) {
        eventListeners[event::class]?.forEach { it.schedule(event, event.world) }
    }

    fun <T : PlayerEvent> fire(event: T) {
        eventListeners[event::class]?.forEach { it.schedule(event, event.player) }
    }

}