package dev.onyx.server.engine.net.ext

import dev.onyx.server.engine.net.NetworkServer
import dev.onyx.server.engine.net.Session
import io.netty.channel.Channel
import io.netty.channel.ChannelHandlerContext

val Channel.session: Session get() = this.attr(NetworkServer.SESSION_KEY).get()

val ChannelHandlerContext.session: Session get() = this.channel().session