package dev.onyx.server.engine.model.entity

import dev.onyx.server.engine.event.api.EventContext
import dev.onyx.server.engine.event.api.EventHandler
import dev.onyx.server.engine.event.type.Event
import dev.onyx.server.engine.task.Task
import dev.onyx.server.engine.task.TaskContext
import dev.onyx.server.engine.task.TaskType
import java.util.concurrent.LinkedBlockingDeque

abstract class LivingEntity : Entity(), EventContext, TaskContext {

    override val events = LinkedBlockingDeque<EventHandler<Event>>()

    override val tasks = mutableMapOf<TaskType, MutableSet<Task>>()

    fun processTasks() {
        while(true) {
            /*
             * Process events
             */
            while(events.isNotEmpty()) {
                events.poll().handle()
            }

            /*
             * Process Tasks
             */
            val resumed = tasks.values.flatMap {
                it.toList().map(Task::run)
            }

            if(resumed.all { !it } && events.isEmpty()) {
                break
            }
        }
    }
}