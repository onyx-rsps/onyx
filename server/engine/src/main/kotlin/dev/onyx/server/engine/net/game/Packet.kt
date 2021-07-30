package dev.onyx.server.engine.net.game

import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Session

interface Packet : Message {

    fun handle(session: Session) {
        /*
         * Nothing to do
         */
    }

}