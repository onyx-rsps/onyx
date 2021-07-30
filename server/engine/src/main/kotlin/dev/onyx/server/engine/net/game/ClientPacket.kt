package dev.onyx.server.engine.net.game

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class ClientPacket(val opcode: Int, val length: Int)