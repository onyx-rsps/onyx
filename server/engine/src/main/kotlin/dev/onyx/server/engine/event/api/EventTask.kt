package dev.onyx.server.engine.event.api

import dev.onyx.server.engine.event.type.Event
import kotlin.reflect.KClass

class EventTask<T : Event>(
    private val type: KClass<T>,
    private var action: T.() -> Unit = { }
) {

    private var condition: T.() -> Boolean = { true }

    internal fun createListener(): EventListener<T> = EventListener(type, condition, action)

    fun where(condition: T.() -> Boolean): EventTask<T> {
        this.condition = condition
        return this
    }

    fun then(action: T.() -> Unit): EventTask<T> {
        this.action = action
        return this
    }

}