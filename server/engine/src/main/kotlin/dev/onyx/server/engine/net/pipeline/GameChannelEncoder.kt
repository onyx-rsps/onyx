package dev.onyx.server.engine.net.pipeline

import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Session
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder

class GameChannelEncoder(private val session: Session) : MessageToByteEncoder<Message>() {

    override fun encode(ctx: ChannelHandlerContext, msg: Message, out: ByteBuf) {
        session.protocol.get().encode(msg, out)
    }

}