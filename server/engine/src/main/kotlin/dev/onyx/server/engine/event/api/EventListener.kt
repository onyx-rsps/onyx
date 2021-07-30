package dev.onyx.server.engine.event.api

import dev.onyx.server.engine.event.type.Event
import kotlin.reflect.KClass

class EventListener<in T : Event>(
    type: KClass<T>,
    private val condition: T.() -> Boolean,
    private val action: T.() -> Unit
) {

    init {
        /*
         * Register the event to the event bus.
         */
        EventBus.register(type, this)
    }

    internal fun schedule(event: T, context: EventContext) {
        if(event.condition()) {
            context.events.add(EventHandler(event, action))
        }
    }

    internal fun execute(event: T) {
        if(event.condition()) {
            EventHandler(event, action).handle()
        }
    }
}