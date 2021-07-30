package dev.onyx.server.engine.net.game

import dev.onyx.server.engine.net.Session
import io.netty.buffer.ByteBuf

/**
 * Responsible for decoding incoming game packets from a connected client's session.
 *
 * @property session Session
 * @constructor
 */
class GamePacketDecoder(private val session: Session) {

    fun decode(buf: ByteBuf, out: MutableList<Any>) {

    }
}