package dev.onyx.server.engine.model.entity

import dev.onyx.server.engine.net.Session

class Client(val session: Session, val player: Player) {

    init {
        player.client = this
        session.client = this
    }

    var username: String = ""
    var isResizableMode: Boolean = false
    var width: Int = -1
    var height: Int = -1

}