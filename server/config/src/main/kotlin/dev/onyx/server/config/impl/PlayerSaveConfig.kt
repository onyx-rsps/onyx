package dev.onyx.server.config.impl

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.ConfigSpec
import dev.onyx.server.config.BaseConfig
import dev.onyx.server.config.FileFormat
import java.io.File

class PlayerSaveConfig(username: String) : BaseConfig("", Spec) {

    override val createIfFileNotFound: Boolean = false
    override val fileFormat: FileFormat = FileFormat.JSON

    override var file: File = File("data/saves/$username.json")

    fun init(): PlayerSaveConfig {
        config = Config { addSpec(Spec) }
        return this
    }

    override fun load() {
        if(file.path == "") {
            throw IllegalStateException("No player username set.")
        }
        super.load()
    }

    override fun save() {
        if(file.path == "") {
            throw IllegalStateException("No player username set.")
        }
        super.save()
    }

    val username get() = config[Spec.username]
    val password get() = config[Spec.password]
    val displayName get() = config[Spec.displayName]
    val privilegeLevel get() = config[Spec.privilegeLevel]
    val tile get() = config[Spec.tile]
    val appearance get() = config[Spec.appearance]
    val member get() = config[Spec.member]

    object Spec : ConfigSpec("player") {
        val username by required<String>("username")
        val password by required<String>("password")
        val displayName by required<String>("display-name")
        val privilegeLevel by optional(0, "privilege-level")
        val tile by optional(ServerConfig.playerDefaults.homeTile, "tile")
        val appearance by optional(ServerConfig.playerDefaults.appearance, "appearance")
        val member by optional(true, "member")
    }
}