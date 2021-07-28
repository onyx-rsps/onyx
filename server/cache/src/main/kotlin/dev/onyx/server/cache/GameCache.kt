package dev.onyx.server.cache

import io.guthix.js5.Js5Archive
import io.guthix.js5.Js5Cache
import io.guthix.js5.Js5Group
import io.guthix.js5.container.Js5Container
import io.guthix.js5.container.Js5Store
import io.guthix.js5.container.disk.Js5DiskStore
import io.guthix.js5.util.XTEA_ZERO_KEY
import io.netty.buffer.ByteBuf
import io.netty.buffer.Unpooled
import org.tinylog.kotlin.Logger
import java.nio.file.Paths

class GameCache {

    private val directory = Paths.get(CACHE_DIR)

    lateinit var store: Js5DiskStore private set
    lateinit var cache: Js5Cache private set
    lateinit var crcs: IntArray private set

    val archiveCount: Int get() = cache.archiveCount

    fun load() {
        Logger.info("Loading game cache files from dir: '$CACHE_DIR'.")

        store = Js5DiskStore.open(directory)
        cache = Js5Cache(store)

        val validator = cache.generateValidator(
            includeWhirlpool = false,
            includeSizes = false
        )

        val container = Js5Container(validator.encode())
        store.write(
            indexId = Js5Store.MASTER_INDEX,
            containerId = Js5Store.MASTER_INDEX,
            data = container.encode()
        )

        crcs = validator.archiveValidators.map { it.crc }.toIntArray()

        if(archiveCount != 21) {
            throw IllegalStateException("Missing game cache files from directory: '$CACHE_DIR'.")
        }

        Logger.info("Successfully loaded $archiveCount game cache archives.")
    }

    fun close() {
        store.close()
        cache.close()
    }

    fun readArchive(archive: Int): Js5Archive = cache.readArchive(archive)

    fun readGroup(archive: Int, group: Int, xteas: IntArray = XTEA_ZERO_KEY): Js5Group {
        return readArchive(archive).readGroup(group, xteas)
    }

    fun readFile(archive: Int, group: Int, file: Int): ByteBuf {
        return readArchive(archive).readGroup(group).files[file]?.data ?: Unpooled.EMPTY_BUFFER
    }

    fun getGroupFiles(archive: Int, group: Int): Map<Int, ByteBuf> {
        return readArchive(archive).readGroup(group).files.mapValues { it.value.data.retain() }
    }

    fun getContainerData(archive: Int, group: Int): ByteBuf = store.read(archive, group).retain()

    fun getGroupIds(archive: Int): List<Int> = readArchive(archive).groupSettings.map { it.key }

    companion object {
        private const val CACHE_DIR = "data/cache/"
    }
}