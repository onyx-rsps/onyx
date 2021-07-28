package dev.onyx.server.engine.net

import io.netty.buffer.ByteBuf

abstract class Protocol(val session: Session) {

    fun encode(msg: Message, out: ByteBuf) {
        /*
         * No Implementation
         */
    }

    fun decode(buf: ByteBuf, out: MutableList<Any>) {
        /*
         * No Implementation
         */
    }

    fun handle(msg: Message) {
        /*
         * No implementation
         */
    }

}