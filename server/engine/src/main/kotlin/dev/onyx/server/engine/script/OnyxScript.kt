package dev.onyx.server.engine.script

import dev.onyx.server.common.inject
import dev.onyx.server.engine.Engine
import dev.onyx.server.engine.model.World
import kotlin.script.experimental.annotations.KotlinScript

@KotlinScript(fileExtension = "kts")
abstract class OnyxScript {

    val engine: Engine by inject()
    val world: World by inject()

    internal var enableAction: (OnyxScript.() -> Unit)? = null
    internal var disableAction: (OnyxScript.() -> Unit)? = null

    fun onEnable(action: OnyxScript.() -> Unit) {
        this.enableAction = action
    }

    fun onDisable(action: OnyxScript.() -> Unit) {
        this.disableAction = action
    }

}