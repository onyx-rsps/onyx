package dev.onyx.server.engine.event.api

import dev.onyx.server.engine.event.type.Event
import kotlin.reflect.KClass

class EventTask<T : Event>(
    private val type: KClass<T>
) {

    private var condition: T.() -> Boolean = { true }

    constructor(type: KClass<T>, action: T.() -> Unit) : this(type) {
        EventListener(type, condition, action)
    }

    fun where(condition: T.() -> Boolean): EventTask<T> {
        this.condition = condition
        return this
    }

    fun then(action: T.() -> Unit): EventListener<T> {
        return EventListener(type, condition, action)
    }

}