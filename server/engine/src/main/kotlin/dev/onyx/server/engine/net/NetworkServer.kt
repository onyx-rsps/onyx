package dev.onyx.server.engine.net

import dev.onyx.server.config.impl.ServerConfig
import dev.onyx.server.engine.net.pipeline.GameChannelInitializer
import io.netty.bootstrap.ServerBootstrap
import io.netty.channel.ChannelOption
import io.netty.channel.nio.NioEventLoopGroup
import io.netty.channel.socket.nio.NioServerSocketChannel
import io.netty.util.AttributeKey
import org.tinylog.kotlin.Logger
import java.net.InetSocketAddress
import kotlin.system.exitProcess

class NetworkServer {

    private var running = false

    private val bossGroup = NioEventLoopGroup(2)
    private val workerGroup = NioEventLoopGroup(1)
    internal val bootstrap = ServerBootstrap()

    private val channelInitializer = GameChannelInitializer()

    /**
     * Initialize
     */
    private fun init() {
        bootstrap.group(bossGroup, workerGroup)
            .channel(NioServerSocketChannel::class.java)
            .childOption(ChannelOption.TCP_NODELAY, true)
            .childOption(ChannelOption.SO_KEEPALIVE, true)
            .childHandler(channelInitializer)
    }

    fun start() {
        if(running) return

        Logger.info("Starting Onyx network server.")

        /*
         * Initialize the bootstrap
         */
        this.init()

        /*
         * Bind the network server's socket to the configured listen-address defined
         * in the server's config.
         */
        val address = InetSocketAddress(ServerConfig.network.address, ServerConfig.network.port)
        this.bind(address)
    }

    fun stop() {
        if(!running) return

        Logger.info("Shutting down Onyx network server.")

        bossGroup.shutdownGracefully()
        workerGroup.shutdownGracefully()

        running = false
    }

    private fun bind(address: InetSocketAddress) {
        bootstrap.bind(address).addListener { result ->
            if(result.isSuccess) {
                this.onBindSuccess(address)
            } else {
                this.onBindFailure(address, result.cause())
            }
        }
    }

    private fun onBindSuccess(address: InetSocketAddress) {
        Logger.info("Listening for incoming connections on ${address.hostString}:${address.port}...")
        running = true
    }

    private fun onBindFailure(address: InetSocketAddress, cause: Throwable) {
        Logger.error(cause) { "Failed to bind networking socket to ${address.hostString}:${address.port}." }
        exitProcess(0)
    }

    companion object {

        /**
         * The channel attribute key used to associate a given channel to a [Session] instance.
         */
        val SESSION_KEY: AttributeKey<Session> = AttributeKey.valueOf("session")

    }
}