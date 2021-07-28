package dev.onyx.server.engine.net.pipeline

import dev.onyx.server.engine.net.StatusResponse
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import io.netty.handler.codec.MessageToByteEncoder

class StatusResponseEncoder : MessageToByteEncoder<StatusResponse>() {

    override fun encode(ctx: ChannelHandlerContext, msg: StatusResponse, out: ByteBuf) {
        out.writeByte(msg.code)
    }

}