package dev.onyx.server.engine

import dev.onyx.server.engine.manager.LoginManager
import dev.onyx.server.engine.model.World
import dev.onyx.server.engine.net.NetworkServer
import org.koin.dsl.module

val EngineModule = module {
    single { Engine() }
    single { NetworkServer() }
    single { World() }
    single { LoginManager() }
}