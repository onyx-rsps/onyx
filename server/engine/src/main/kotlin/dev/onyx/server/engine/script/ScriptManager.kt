package dev.onyx.server.engine.script

import io.github.classgraph.ClassGraph
import kotlin.reflect.KClass

object ScriptManager {

    val scripts = mutableMapOf<KClass<out OnyxScript>, OnyxScript>()

    fun loadScripts() {
        ClassGraph().enableClassInfo().scan().use { result ->
            val scriptList = result
                .getSubclasses("dev.onyx.server.engine.script.OnyxScript")
                .directOnly()

            scriptList.forEach {
                val scriptClass = it.loadClass(OnyxScript::class.java)
                val script = scriptClass.getDeclaredConstructor().newInstance()

                /*
                 * Store the script instance.
                 */
                scripts[scriptClass.kotlin] = script
            }
        }
    }

    fun unloadScripts() {
        scripts.clear()
    }

    operator fun get(klass: KClass<out OnyxScript>): OnyxScript = scripts[klass]
        ?: throw IllegalArgumentException("Script class: '${klass.simpleName}' was not found")

    fun enableScript(klass: KClass<out OnyxScript>) {
        val script = this[klass]
        script.enableAction?.invoke(script)
    }

    fun disableScript(klass: KClass<out OnyxScript>) {
        val script = this[klass]
        script.disableAction?.invoke(script)
    }

    fun reloadScript(klass: KClass<out OnyxScript>) {
        disableScript(klass)
        enableScript(klass)
    }

}