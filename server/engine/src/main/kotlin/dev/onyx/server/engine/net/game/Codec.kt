package dev.onyx.server.engine.net.game

import dev.onyx.server.engine.net.Session
import io.netty.buffer.ByteBuf

interface Codec<P : Packet> {

    fun encode(session: Session, packet: P, out: ByteBuf) {
        throw UnsupportedOperationException()
    }

    fun decode(session: Session, buf: ByteBuf): P {
        throw UnsupportedOperationException()
    }

}