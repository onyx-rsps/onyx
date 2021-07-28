package dev.onyx.server.config

import dev.onyx.server.config.impl.ServerConfig
import dev.onyx.server.config.impl.xtea.XteaConfig
import org.koin.dsl.module

val ConfigModule = module {
    single { ServerConfig() }
    single { XteaConfig() }
}