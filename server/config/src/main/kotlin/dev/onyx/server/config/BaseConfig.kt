package dev.onyx.server.config

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.ConfigSpec
import com.uchuhimo.konf.Item
import com.uchuhimo.konf.source.json.toJson
import com.uchuhimo.konf.source.yaml
import com.uchuhimo.konf.source.yaml.toYaml
import org.tinylog.kotlin.Logger
import java.io.File
import java.io.FileNotFoundException

abstract class BaseConfig(filePath: String, private val spec: ConfigSpec = ConfigSpec()) {

    internal lateinit var config: Config

    internal val file = File(filePath)

    abstract val createIfFileNotFound: Boolean

    open val fileFormat: FileFormat = FileFormat.YAML

    open fun load() {
        if(!file.exists()) {
            if(!createIfFileNotFound) {
                Logger.error("Unable to find config ${this::class.java.simpleName} file at path: ${file.path}.")
                throw FileNotFoundException()
            }

            Logger.info("Config ${this::class.java.simpleName} file not found. Creating default config.")

            config = Config { addSpec(spec) }
            this.save()
        }

        config = when(fileFormat) {
            FileFormat.YAML -> Config { addSpec(spec) }.from.yaml.file(file)
            FileFormat.JSON -> Config { addSpec(spec) }.from.json.file(file)
        }
        this.save()
    }

    open fun save() {
        when(fileFormat) {
            FileFormat.YAML -> config.toYaml.toFile(file)
            FileFormat.JSON -> config.toJson.toFile(file)
        }
    }

    fun isLoaded(): Boolean = this::config.isInitialized

    operator fun <T> get(item: Item<T>): T = config[item]

    operator fun <T> get(key: String): T = config[key]

    operator fun <T> set(item: Item<T>, value: T) {
        config[item] = value
    }

    operator fun <T> set(key: String, value: T) {
        config[key] = value
    }

}