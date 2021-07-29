package dev.onyx.server.engine.net.login

import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Protocol
import dev.onyx.server.engine.net.Session
import io.netty.buffer.ByteBuf

class LoginProtocol(session: Session) : Protocol(session) {

    /**
     * DECODER METHODS
     */

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        println("login")
    }

    /**
     * ENCODER METHODS
     */

    override fun encode(msg: Message, out: ByteBuf) {

    }

    /**
     * HANDLER METHODS
     */

    override fun handle(msg: Message) {

    }

}