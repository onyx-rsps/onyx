package dev.onyx.server.launcher

import dev.onyx.server.common.get
import dev.onyx.server.config.impl.ServerConfig
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.tinylog.kotlin.Logger
import java.io.File

object Launcher {

    private val DI_MODULES = listOf<Module>()

    private fun init() {
        Logger.info("Initializing...")

        /*
         * Start koin
         */
        startKoin { modules(DI_MODULES) }

        /*
         * Check required directories.
         */
        this.checkDirs()

        /*
         * Check configs.
         */
        this.checkConfigs()
    }

    private fun launch() {
        this.init()

        Logger.info("Preparing Onyx server...")
    }

    private fun checkDirs() {
        Logger.info("Checking required directories exist.")

        val dirs = listOf(
            "data/",
            "data/cache/",
            "data/logs/",
            "data/configs/",
            "data/saves/",
            "data/rsa/",
            "data/xteas/"
        ).map { File(it) }

        dirs.forEach { dir ->
            if(!dir.exists()) {
                Logger.info("Creating new empty directory: ${dir.path}.")
                dir.mkdirs()
            }
        }
    }

    private fun checkConfigs() {
        Logger.info("Checking configuration files.")

        /*
         * Check server.yml config.
         */
        val serverConfig = get<ServerConfig>()
        serverConfig.load()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        this.launch()
    }

}