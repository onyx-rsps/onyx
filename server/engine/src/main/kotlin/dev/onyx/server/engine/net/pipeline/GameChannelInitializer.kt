package dev.onyx.server.engine.net.pipeline

import io.netty.channel.ChannelInitializer
import io.netty.channel.socket.SocketChannel

class GameChannelInitializer : ChannelInitializer<SocketChannel>() {

    override fun initChannel(ch: SocketChannel) {
        val p = ch.pipeline()

        p.addLast("handler", GameChannelHandler())
    }
}