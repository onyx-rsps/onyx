package dev.onyx.server.engine.net.game

import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Protocol
import dev.onyx.server.engine.net.Session
import io.netty.buffer.ByteBuf

class GameProtocol(session: Session) : Protocol(session) {

    override fun encode(msg: Message, out: ByteBuf) {

    }

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {

    }

    override fun handle(msg: Message) {

    }


}