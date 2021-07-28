package dev.onyx.server.config.impl

import com.uchuhimo.konf.ConfigSpec
import dev.onyx.server.common.inject
import dev.onyx.server.config.BaseConfig

class ServerConfig : BaseConfig("data/configs/server.yml", Spec) {

    override val createIfFileNotFound: Boolean = true

    object Spec : ConfigSpec("server") {
        val name by optional("Onyx", "name")
        val revision by optional(198, "revision")
        val devMode by optional(true, "dev-mode")
        val tickRate by optional(600L, "tick-rate")

        object Network : ConfigSpec("network") {
            val address by optional("0.0.0.0", "address")
            val port by optional(43594, "port")
        }
    }

    companion object {
        private val config: ServerConfig by inject()

        val name get() = config[Spec.name]
        val revision get() = config[Spec.revision]
        val devMode get() = config[Spec.devMode]
        val tickRate get() = config[Spec.tickRate]

        object Network {
            val address get() = config[Spec.Network.address]
            val port get() = config[Spec.Network.port]
        }
    }
}