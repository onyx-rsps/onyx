package dev.onyx.server.engine.net.login

import dev.onyx.server.cache.GameCache
import dev.onyx.server.common.encrypt.RSA
import dev.onyx.server.common.inject
import dev.onyx.server.engine.manager.LoginManager
import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Protocol
import dev.onyx.server.engine.net.Session
import dev.onyx.server.engine.net.StatusResponse
import io.guthix.buffer.readString0CP1252
import io.guthix.buffer.readStringCP1252
import io.guthix.js5.util.XTEA_KEY_SIZE
import io.guthix.js5.util.xteaDecrypt
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import java.math.BigInteger

class LoginProtocol(session: Session) : Protocol(session) {

    private val gameCache: GameCache by inject()
    private val loginManager: LoginManager by inject()

    /**
     * DECODER METHODS
     */

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        try {
            if(!buf.isReadable(3)) return

            buf.markReaderIndex()

            val loginType = LoginType.fromOpcode(buf.readUnsignedByte().toInt())
            val length = buf.readUnsignedShort()

            if(!buf.isReadable(length)) {
                buf.resetReaderIndex()
                return
            }

            val revision = buf.readInt()

            buf.skipBytes(Int.SIZE_BYTES)
            val clientType = buf.readUnsignedByte().toInt()
            buf.skipBytes(Byte.SIZE_BYTES)

            /**
             * RSA BUFFER
             */

            val encryptedLength = buf.readUnsignedShort()
            val rsaBuf = buf.decryptRSA(RSA.exponent, RSA.modulus, encryptedLength)

            val rsaCheck = rsaBuf.readUnsignedByte().toInt()
            if(rsaCheck != 1) {
                throw LoginError(StatusResponse.COULD_NOT_COMPLETE_LOGIN)
            }

            val encodeSeed = IntArray(XTEA_KEY_SIZE) { rsaBuf.readInt() }
            val seed = rsaBuf.readLong()

            val authType = rsaBuf.readUnsignedByte().toInt()
            rsaBuf.skipBytes(Int.SIZE_BYTES)

            rsaBuf.skipBytes(Byte.SIZE_BYTES)
            val password = rsaBuf.readStringCP1252()

            /**
             * XTEA BUFFER
             */

            val xteaBuf = buf.decryptXTEA(encodeSeed)

            val username = xteaBuf.readStringCP1252()

            val flags = xteaBuf.readByte().toInt()
            val isResizableMode = (flags shr 1) == 1
            val clientWidth = xteaBuf.readUnsignedShort()
            val clientHeight = xteaBuf.readUnsignedShort()

            val randomBytes = ByteArray(24) { xteaBuf.readByte() }

            xteaBuf.readStringCP1252()
            xteaBuf.skipBytes(Int.SIZE_BYTES)

            /*
             * Skip Platform information bytes
             */
            xteaBuf.skipBytes(Byte.SIZE_BYTES * 13)

            xteaBuf.skipBytes(Byte.SIZE_BYTES * 5)
            xteaBuf.readString0CP1252()
            xteaBuf.readString0CP1252()
            xteaBuf.readString0CP1252()
            xteaBuf.readString0CP1252()
            xteaBuf.skipBytes(Byte.SIZE_BYTES * 3)
            xteaBuf.readString0CP1252()
            xteaBuf.readString0CP1252()
            xteaBuf.skipBytes(Byte.SIZE_BYTES * 18)
            xteaBuf.readString0CP1252()
            xteaBuf.skipBytes(Byte.SIZE_BYTES * 5)

            val crcs = IntArray(gameCache.archiveCount) { xteaBuf.readInt() }

            val decodeSeed = IntArray(XTEA_KEY_SIZE) { encodeSeed[it] + 50 }

            /*
             * Send login request message.
             */
            val request = LoginRequest(
                session,
                loginType,
                revision,
                clientType,
                encodeSeed,
                decodeSeed,
                seed,
                authType,
                password,
                username,
                isResizableMode,
                clientWidth,
                clientHeight,
                randomBytes,
                crcs
            )
            out.add(request)
        } catch (e : LoginError) {
            buf.skipBytes(buf.readableBytes())
            buf.resetReaderIndex()
            session.writeAndClose(e.status)
        }
    }

    /**
     * ENCODER METHODS
     */

    override fun encode(msg: Message, out: ByteBuf) {

    }

    /**
     * HANDLER METHODS
     */

    override fun handle(msg: Message) {
        if(msg !is LoginRequest) return
        loginManager.loginQueue.add(msg)
    }

    private fun ByteBuf.decryptXTEA(keys: IntArray): ByteBuf {
        return this.xteaDecrypt(keys)
    }

    private fun ByteBuf.decryptRSA(exponent: BigInteger, modulus: BigInteger, length: Int): ByteBuf {
        val bytes = ByteArray(length)
        readBytes(bytes)
        return Unpooled.wrappedBuffer(BigInteger(bytes).modPow(exponent, modulus).toByteArray())
    }
}