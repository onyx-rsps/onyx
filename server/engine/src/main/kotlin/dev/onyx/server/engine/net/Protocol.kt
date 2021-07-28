package dev.onyx.server.engine.net

import io.netty.buffer.ByteBuf

abstract class Protocol(val session: Session) {

    open fun encode(msg: Message, out: ByteBuf) {
        /*
         * No Implementation
         */
    }

    open fun decode(buf: ByteBuf, out: MutableList<Any>) {
        /*
         * No Implementation
         */
    }

    open fun handle(msg: Message) {
        /*
         * No implementation
         */
    }

}