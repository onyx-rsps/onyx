package dev.onyx.server.engine.net.game

import dev.onyx.server.engine.net.Session
import io.netty.buffer.ByteBuf

/**
 * Responsible for encoding game engine packets to be sent to a connected client's session.
 *
 * @property session Session
 * @constructor
 */
class GamePacketEncoder(private val session: Session) {

    fun encode(packet: Packet, out: ByteBuf) {
        val opcode = PacketRegistry.serverPackets.getOpcode(packet::class)
        val type = PacketRegistry.serverPackets.getPacketType(opcode)
        val codec = PacketRegistry.serverPackets.getCodec(opcode)

        val payload = session.buffer()
        codec.encode(session, packet, out)

        val length = payload.writerIndex()

        /*
         * Write the packet opcode.
         *
         * Obfuscate the opcode with Isaac random. This is in order to make doing a MITM attack
         * much more difficult.
         */
        out.writeByte((opcode + session.encodeIsaac.opcodeModifier()) and 0xFF)

        /*
         * Write the packet's payload length if the packet type is VARIABLE_BYTE or VARIABLE_SHORT.
         */
        when(type) {
            PacketType.VARIABLE_BYTE -> out.writeByte(length)
            PacketType.VARIABLE_SHORT -> out.writeShort(length)
            else -> { /* Do Nothing */ }
        }

        out.writeBytes(payload)
    }

}