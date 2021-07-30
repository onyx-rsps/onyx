package dev.onyx.server.engine.serializer

import dev.onyx.server.common.hash.SHA256
import dev.onyx.server.config.impl.PlayerSaveConfig
import dev.onyx.server.config.impl.ServerConfig
import dev.onyx.server.config.impl.item.AppearanceItem
import dev.onyx.server.config.impl.item.GenderItem
import dev.onyx.server.config.impl.item.TileItem
import dev.onyx.server.engine.model.Appearance
import dev.onyx.server.engine.model.Gender
import dev.onyx.server.engine.model.PrivilegeLevel
import dev.onyx.server.engine.model.entity.Client
import dev.onyx.server.engine.model.entity.Player
import dev.onyx.server.engine.model.map.Tile
import dev.onyx.server.engine.net.login.LoginRequest
import org.tinylog.kotlin.Logger
import java.io.File
import java.util.stream.Collectors

object JsonPlayerSerializer : PlayerSerializer {

    override fun create(request: LoginRequest) {
        val username = request.username.sanitize()
        val password = SHA256.hash(request.password)

        /*
         * Create a new player save with the player defaults.
         */

        val playerSave = PlayerSaveConfig(username).init()

        playerSave["player.username"] = username
        playerSave["player.password"] = password
        playerSave["player.display-name"] = username
        playerSave["player.privilege-level"] = PrivilegeLevel.PLAYER.id
        playerSave["player.tile"] = ServerConfig.playerDefaults.homeTile
        playerSave["player.appearance"] = ServerConfig.playerDefaults.appearance

        playerSave.save()
    }

    override fun load(request: LoginRequest): Player? {
        val username = request.username.sanitize()
        val password = SHA256.hash(request.password)
        val session = request.session

        val file = File("data/saves/$username.json")
        if(!file.exists()) {
            if(ServerConfig.autoCreateNewPlayerSaves) {
                Logger.info("Creating new player save for [username: $username].")
                this.create(request)
            } else {
                return null
            }
        }

        val playerSave = PlayerSaveConfig(username)
        playerSave.load()

        if(playerSave.username == username && playerSave.password == password) {
            val player = Player()
            Client(session, player)

            player.client.username = playerSave.username
            player.client.width = request.clientWidth
            player.client.height = request.clientHeight
            player.client.isResizableMode = request.isResizableMode
            player.displayName = playerSave.displayName
            player.privilegeLevel = PrivilegeLevel.fromId(playerSave.privilegeLevel)
            player.tile = Tile(playerSave.tile.x, playerSave.tile.y, playerSave.tile.level)
            player.appearance = Appearance(
                looks = playerSave.appearance.looks,
                colors = playerSave.appearance.colors,
                gender = Gender.fromId(playerSave.appearance.gender.id)
            )
            player.member = playerSave.member

            return player
        }

        return null
    }

    override fun save(player: Player) {
        val playerSave = PlayerSaveConfig(player.client.username.sanitize()).init()
        playerSave.load()

        playerSave["player.username"] = player.client.username.sanitize()
        playerSave["player.display-name"] = player.displayName
        playerSave["player.privilege-level"] = player.privilegeLevel.id
        playerSave["player.tile"] = TileItem(player.tile.x, player.tile.y, player.tile.level)
        playerSave["player.appearance"] = AppearanceItem(
            looks = player.appearance.looks,
            colors = player.appearance.colors,
            gender = GenderItem.fromId(player.appearance.gender.id)
        )
        playerSave["player.member"] = player.member
    }

    private fun String.sanitize(): String {
        return this
            .chars()
            .mapToObj { it.toChar() }
            .map { if(Character.isWhitespace(it)) '_' else it }
            .filter { Character.isLetterOrDigit(it) || it == '-' || it == '_' }
            .map { it.toString() }
            .collect(Collectors.joining())
    }

}