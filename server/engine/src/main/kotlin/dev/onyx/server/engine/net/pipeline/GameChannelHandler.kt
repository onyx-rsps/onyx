package dev.onyx.server.engine.net.pipeline

import dev.onyx.server.engine.net.NetworkServer
import dev.onyx.server.engine.net.Session
import io.netty.channel.ChannelHandler
import io.netty.channel.ChannelHandlerContext
import io.netty.channel.ChannelInboundHandlerAdapter
import java.util.concurrent.atomic.AtomicReference

@ChannelHandler.Sharable
class GameChannelHandler : ChannelInboundHandlerAdapter() {

    private val session = AtomicReference<Session>(null)

    override fun channelActive(ctx: ChannelHandlerContext) {
        val newSession = Session(ctx)
        if(!session.compareAndSet(null, newSession)) {
            return
        }

        val attr = ctx.channel().attr(NetworkServer.SESSION_KEY)
        attr.set(session.get())

        session.get().connect()
    }

    override fun channelInactive(ctx: ChannelHandlerContext) = session.get().disconnect()

    override fun channelRead(ctx: ChannelHandlerContext, msg: Any) = session.get().onMessage(msg)

    override fun exceptionCaught(ctx: ChannelHandlerContext, cause: Throwable) = session.get().onError(cause)

}