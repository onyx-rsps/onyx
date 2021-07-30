import dev.onyx.server.engine.event.PlayerLoginEvent
import dev.onyx.server.engine.event.api.onEvent
import org.tinylog.kotlin.Logger

onEvent<PlayerLoginEvent> {
    Logger.info("[player: ${this.player.client.username}] has logged into the server.")
}
