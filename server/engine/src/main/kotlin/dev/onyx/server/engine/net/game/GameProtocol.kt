package dev.onyx.server.engine.net.game

import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Protocol
import dev.onyx.server.engine.net.Session
import io.netty.buffer.ByteBuf

class GameProtocol(session: Session) : Protocol(session) {

    private val encoder = GamePacketEncoder(session)
    private val decoder = GamePacketDecoder(session)

    override fun encode(msg: Message, out: ByteBuf) {
        if(msg !is Packet) return
        encoder.encode(msg, out)
    }

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        decoder.decode(buf, out)
    }

    override fun handle(msg: Message) {
        if(msg !is Packet) return
        session.protocol.get().handle(msg)
    }


}