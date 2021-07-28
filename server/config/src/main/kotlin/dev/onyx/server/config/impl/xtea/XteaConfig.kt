package dev.onyx.server.config.impl.xtea

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.source.json.toJson
import com.uchuhimo.konf.toValue
import dev.onyx.server.config.BaseConfig
import dev.onyx.server.config.FileFormat
import org.tinylog.kotlin.Logger
import java.io.FileNotFoundException

class XteaConfig : BaseConfig("data/xteas/xteas.json") {

    override val createIfFileNotFound: Boolean = false

    override val fileFormat: FileFormat = FileFormat.JSON

    private val xteas = mutableMapOf<Int, IntArray>()

    override fun load() {
        Logger.info("Loading region XTEA key file.")

        if(!file.exists()) {
            throw FileNotFoundException("Unable to open 'data/xteas/xteas.json'. Make sure the file exists.")
        }

        config = Config().from.json.file(file)

        config.toValue<Array<Xtea>>().forEach { xtea ->
            xteas[xtea.mapsquare] = xtea.key
        }

        Logger.info("Successfully loaded ${xteas.size} region XTEA keys.")
    }

    override fun save() {
        if(this.isLoaded()) {
            config.toJson.toFile(file)
        }
    }

    operator fun get(regionId: Int): IntArray {
        return xteas[regionId] ?: EMPTY_KEYS
    }

    companion object {
        val EMPTY_KEYS = IntArray(4) { 0 }
    }
}