package dev.onyx.server.config

import dev.onyx.server.config.impl.ServerConfig
import org.koin.dsl.module

val ConfigModule = module {
    single { ServerConfig() }
}