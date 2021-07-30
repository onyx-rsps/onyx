package dev.onyx.server.engine.net.packet.server

import dev.onyx.server.engine.model.World
import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.model.map.Chunk
import dev.onyx.server.engine.model.map.Region
import dev.onyx.server.engine.net.Session
import dev.onyx.server.engine.net.game.Codec
import dev.onyx.server.engine.net.game.Packet
import dev.onyx.server.engine.net.game.PacketType
import dev.onyx.server.engine.net.game.ServerPacket
import io.guthix.buffer.toBitMode
import io.guthix.buffer.writeShortAdd
import io.netty.buffer.ByteBuf

@ServerPacket(opcode = 2, type = PacketType.VARIABLE_SHORT)
class RebuildRegionNormal(val player: Player, val includeGpi: Boolean = false) : Packet {
    companion object : Codec<RebuildRegionNormal> {

        override fun encode(session: Session, packet: RebuildRegionNormal, out: ByteBuf) {
            /*
             * Encode the GPI data for the player.
             */
            if(packet.includeGpi) {
                val bitBuf = session.buffer().toBitMode()

                bitBuf.writeBits(packet.player.tile.as30BitInteger, 30)

                val tileMultipliers = IntArray(World.MAX_PLAYERS) {
                    packet.player.gpi.localPlayers[it]?.tile?.as18BitInteger ?: 0
                }

                for(index in 1 until World.MAX_PLAYERS) {
                    if(index != packet.player.index) {
                        bitBuf.writeBits(tileMultipliers[index], 18)
                    }
                }

                val gpiBuf = bitBuf.toByteMode()
                val gpiBytes = ByteArray(gpiBuf.readableBytes())
                gpiBuf.readBytes(gpiBytes)

                /*
                 * Write the GPI bytes to the outbound buffer.
                 */
                out.writeBytes(gpiBytes)
            }

            /*
             * Encode the region area XTEA keys.
             */

            val tile = packet.player.tile
            val chunkX = tile.x shr 3
            val chunkY = tile.y shr 3

            out.writeShortAdd(chunkY)
            out.writeShortLE(chunkX)

            val lx = (chunkX - 6) / Chunk.SIZE
            val rx = (chunkX + 6) / Chunk.SIZE
            val ly = (chunkY - 6) / Chunk.SIZE
            val ry = (chunkY + 6) / Chunk.SIZE

            val regions = mutableListOf<Region>()

            for(x in lx..rx) {
                for(y in ly..ry) {
                    regions.add(Region(x, y))
                }
            }

            out.writeShort(regions.size)

            regions.forEach { region ->
                region.xteas.forEach { out.writeInt(it) }
            }
        }
    }
}