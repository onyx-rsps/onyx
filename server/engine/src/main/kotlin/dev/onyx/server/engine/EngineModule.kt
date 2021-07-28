package dev.onyx.server.engine

import org.koin.dsl.module

val EngineModule = module {
    single { Engine() }
}