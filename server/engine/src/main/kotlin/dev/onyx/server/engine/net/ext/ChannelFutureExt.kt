package dev.onyx.server.engine.net.ext

import io.netty.channel.ChannelFuture

fun ChannelFuture.then(action: (ChannelFuture) -> Unit) {
    this.addListener { result ->
        if(result.isSuccess) {
            action(this)
        }
    }
}