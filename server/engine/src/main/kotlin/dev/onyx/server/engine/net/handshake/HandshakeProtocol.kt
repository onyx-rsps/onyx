package dev.onyx.server.engine.net.handshake

import dev.onyx.server.config.impl.ServerConfig
import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Protocol
import dev.onyx.server.engine.net.Session
import dev.onyx.server.engine.net.StatusResponse
import dev.onyx.server.engine.net.ext.then
import dev.onyx.server.engine.net.js5.JS5Protocol
import dev.onyx.server.engine.net.login.LoginProtocol
import io.netty.buffer.ByteBuf

class HandshakeProtocol(session: Session) : Protocol(session) {

    /**
     * DECODER METHODS
     */

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        if(!buf.isReadable) return

        /*
         * Decode either the JS5 or LOGIN handshakes.
         */
        when(HandshakeType.fromOpcode(buf.readUnsignedByte().toInt())) {
            HandshakeType.JS5 -> this.decodeJS5Handshake(buf, out)
            HandshakeType.LOGIN -> this.decodeLoginHandshake(buf, out)
        }
    }

    private fun decodeJS5Handshake(buf: ByteBuf, out: MutableList<Any>) {
        /*
         * Verify the client revision matches the servers.
         */
        val serverRevision = ServerConfig.revision
        val revision = buf.readInt()

        if(revision != serverRevision) {
            session.writeAndClose(StatusResponse.OUT_OF_DATE)
            return
        }

        val request = HandshakeRequest(HandshakeType.JS5)
        out.add(request)
    }

    private fun decodeLoginHandshake(buf: ByteBuf, out: MutableList<Any>) {
        val request = HandshakeRequest(HandshakeType.LOGIN)
        out.add(request)
    }

    /**
     * ENCODER METHODS
     */

    override fun encode(msg: Message, out: ByteBuf) {
        if(msg !is HandshakeResponse) return

        out.writeByte(StatusResponse.SUCCESSFUL.code)
        out.writeLong(session.seed)
    }

    /**
     * HANDLER METHODS
     */

    override fun handle(msg: Message) {
        if(msg !is HandshakeRequest) return

        when(msg.type) {
            /*
             * Handle JS5 Handshake
             */
            HandshakeType.JS5 -> {
                session.writeAndFlush(StatusResponse.SUCCESSFUL).then {
                    session.protocol.set(JS5Protocol(session))
                }
            }

            /*
             * Handle LOGIN Handshake
             */
            HandshakeType.LOGIN -> {
                val response = HandshakeResponse(session.seed)
                session.writeAndFlush(response).then {
                    session.protocol.set(LoginProtocol(session))
                }
            }
        }
    }

}