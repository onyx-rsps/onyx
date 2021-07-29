package dev.onyx.server.config.impl

import com.uchuhimo.konf.ConfigSpec
import dev.onyx.server.common.inject
import dev.onyx.server.config.BaseConfig
import dev.onyx.server.config.impl.item.AppearanceItem
import dev.onyx.server.config.impl.item.GenderItem
import dev.onyx.server.config.impl.item.TileItem

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

        object PlayerDefaults : ConfigSpec("player-defaults") {
            val homeTile by optional(TileItem(3221, 3218, 0), "home-tile")
            val appearance by optional(AppearanceItem(
                looks = intArrayOf(-1, -1, -1, -1, 18, -1, 26, 36, 0, 33, 42, 10),
                colors = intArrayOf(0, 0, 0, 0, 0),
                gender = GenderItem.MALE
            ), "appearance")
        }
    }

    companion object {
        private val config: ServerConfig by inject()

        val name get() = config[Spec.name]
        val revision get() = config[Spec.revision]
        val devMode get() = config[Spec.devMode]
        val tickRate get() = config[Spec.tickRate]


        val network = Network
        object Network {
            val address get() = config[Spec.Network.address]
            val port get() = config[Spec.Network.port]
        }

        val playerDefaults = PlayerDefaults
        object PlayerDefaults {
            val homeTile get() = config[Spec.PlayerDefaults.homeTile]
            val appearance get() = config[Spec.PlayerDefaults.appearance]
        }
    }
}