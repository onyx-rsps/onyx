package dev.onyx.server.engine.net.pipeline

import dev.onyx.server.engine.net.Session
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.ByteToMessageDecoder

class GameChannelDecoder(private val session: Session) : ByteToMessageDecoder() {

    override fun decode(ctx: ChannelHandlerContext, buf: ByteBuf, out: MutableList<Any>) {
        session.protocol.get().decode(buf, out)
    }

}