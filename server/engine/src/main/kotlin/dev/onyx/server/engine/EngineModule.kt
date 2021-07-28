package dev.onyx.server.engine

import dev.onyx.server.engine.net.NetworkServer
import org.koin.dsl.module

val EngineModule = module {
    single { Engine() }
    single { NetworkServer() }
}