package dev.onyx.server.engine.net

import dev.onyx.server.common.random.IsaacRandom
import dev.onyx.server.engine.model.entity.Client
import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.net.handshake.HandshakeProtocol
import dev.onyx.server.engine.net.pipeline.GameChannelDecoder
import dev.onyx.server.engine.net.pipeline.GameChannelEncoder
import dev.onyx.server.engine.net.pipeline.StatusResponseEncoder
import io.netty.buffer.ByteBuf
import io.netty.channel.ChannelHandlerContext
import org.tinylog.kotlin.Logger
import java.util.*
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.atomic.AtomicReference

class Session(val ctx: ChannelHandlerContext) {

    lateinit var client: Client internal set
    val player: Player get() = client.player

    val channel get() = ctx.channel()
    val remoteAddress = channel.remoteAddress()
    val uuid = UUID.randomUUID()
    val seed = (Math.random() * Long.MAX_VALUE).toLong()

    val protocol = AtomicReference<Protocol>(null)

    var xteas = IntArray(4) { 0 }

    val encodeIsaac = IsaacRandom()
    val decodeIsaac = IsaacRandom()

    private val messageQueue = LinkedBlockingQueue<Message>()

    /**
     * Invoked when the session is established to the server.
     */
    fun connect() {
        /*
         * Add the encoder and decoder to the channel pipeline.
         */
        val encoder = GameChannelEncoder(this)
        val decoder = GameChannelDecoder(this)
        val statusResponseEncoder = StatusResponseEncoder()

        val p = channel.pipeline()
        p.addBefore("handler", "decoder", decoder)
        p.addBefore("decoder", "encoder", encoder)
        p.addAfter("encoder", "response_encoder", statusResponseEncoder)

        /*
         * Set the initial protocol to the Handshake protocol.
         */
        protocol.set(HandshakeProtocol(this))
    }

    /**
     * Invoked when a channel connection is lost. Also handles the session disconnection from
     * the server.
     */
    fun disconnect() {
        if(channel.isActive) {
            channel.close()
        }

        if(this::client.isInitialized && client.player.isRegistered()) {
            client.player.deregister()
        }
    }

    /**
     * Invoked when a packet/message is received from the connected channel of this session.
     *
     * @param msg Any
     */
    fun onMessage(msg: Any) {
        if(msg !is Message) return

        /*
         * Handle the message.
         */
        protocol.get().handle(msg)
    }

    /**
     * Invoked if an exception is thrown inside of the channel's network thread.
     *
     * @param cause Throwable
     */
    fun onError(cause: Throwable) {
        if(cause.stackTrace.isEmpty() || cause.stackTrace[0].methodName != "read0") {
            Logger.error(cause) { "An error occurred in network thread of [session: $uuid]." }
        }

        this.disconnect()
    }

    fun write(msg: Message) = ctx.write(msg)

    fun writeAndFlush(msg: Message) = ctx.writeAndFlush(msg)

    fun flush() = ctx.flush()

    fun writeAndClose(msg: Message) {
        writeAndFlush(msg).addListener {
            if(it.isSuccess) {
                this.disconnect()
            }
        }
    }

    fun buffer(capacity: Int): ByteBuf = ctx.alloc().buffer(capacity)

    fun buffer(): ByteBuf = ctx.alloc().buffer()

}