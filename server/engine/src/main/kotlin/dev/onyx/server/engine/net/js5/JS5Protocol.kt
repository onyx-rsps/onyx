package dev.onyx.server.engine.net.js5

import dev.onyx.server.cache.GameCache
import dev.onyx.server.common.inject
import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Protocol
import dev.onyx.server.engine.net.Session
import io.guthix.js5.container.Js5Store
import io.netty.buffer.ByteBuf

class JS5Protocol(session: Session) : Protocol(session) {

    /**
     * DECODER METHODS
     */

    override fun decode(buf: ByteBuf, out: MutableList<Any>) {
        if(!buf.isReadable) return
        buf.markReaderIndex()

        when(buf.readByte().toInt()) {
            GAME_INIT, GAME_LOADED, GAME_READY -> {
                buf.skipBytes(3)
            }

            REQUEST_NORMAL, REQUEST_PRIORITY -> {
                if(buf.readableBytes() >= 3) {
                    val archive = buf.readUnsignedByte().toInt()
                    val group = buf.readUnsignedShort()
                    val request = JS5Request(archive, group)
                    out.add(request)
                    println("decode: [archive: $archive group: $group]")
                } else {
                    buf.resetReaderIndex()
                }
            }
        }
    }

    /**
     * ENCODER METHODS
     */

    override fun encode(msg: Message, out: ByteBuf) {
        if(msg !is JS5Response) return

        out.writeByte(msg.archive)
        out.writeShort(msg.group)
        out.writeByte(msg.compressionType)
        out.writeInt(msg.compressedLength)

        msg.data.forEach { byte ->
            if(out.writerIndex() % 512 == 0) {
                out.writeByte(-1)
            }
            out.writeByte(byte.toInt())
        }
    }

    /**
     * HANDLER METHODS
     */

    override fun handle(msg: Message) {
        if(msg !is JS5Request) return

        /*
         * If the JS5 responses have not yet been cache, do so now.
         */
        if(!cached) {
            generateCachedResponses()
        }

        println("archive: ${msg.archive} group: ${msg.group}")

        session.writeAndFlush(msg.createResponse())
    }

    companion object {

        private val gameCache: GameCache by inject()

        /**
         * The amount of bytes that JS5 group data is split into as
         * single frames.
         */
        private const val BLOCK_SIZE = 512

        /**
         * The various JS5 Request Mode Types.
         */
        private const val REQUEST_PRIORITY = 0
        private const val REQUEST_NORMAL = 1
        private const val GAME_INIT = 2
        private const val GAME_LOADED = 3
        private const val GAME_READY = 6

        /**
         * JS5 Response Memory Caching.
         */

        private var cached = false
        private val cachedResponses = hashMapOf<JS5Request, JS5Response>()

        private fun generateCachedResponses() {
            cached = false
            cachedResponses.clear()

            /*
             * Create a response for the master index.
             */
            createResponse(Js5Store.MASTER_INDEX, Js5Store.MASTER_INDEX)

            /*
             * Create a response for each index archive.
             */
            for(archive in 0 until gameCache.archiveCount) {
                createResponse(Js5Store.MASTER_INDEX, archive)
            }

            /*
             * Create a response for each group in each index entry.
             */
            for(archive in 0 until gameCache.archiveCount) {
                gameCache.getGroupIds(archive).forEach { group ->
                    createResponse(archive, group)
                }
            }

            cached = true
        }

        private fun createResponse(archive: Int, group: Int): JS5Response {
            val data = gameCache.getContainerData(archive, group)
            val compressionType = data.readUnsignedByte().toInt()
            val compressedLength = data.readInt()

            val bytes = ByteArray(data.readerIndex() - Byte.SIZE_BYTES - Int.SIZE_BYTES)
            data.readBytes(bytes)

            return JS5Response(archive, group, compressionType, compressedLength, bytes)
        }

        private fun JS5Request.createResponse(): JS5Response {
            if(!cachedResponses.containsKey(this)) {
                cachedResponses[this] = createResponse(archive, group)
            }

            return cachedResponses[this]!!
        }

    }
}