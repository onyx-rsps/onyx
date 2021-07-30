@file:Suppress("UNCHECKED_CAST")

package dev.onyx.server.engine.net.game

import io.github.classgraph.ClassGraph
import org.tinylog.kotlin.Logger
import kotlin.reflect.KClass
import kotlin.reflect.full.companionObjectInstance

object PacketRegistry {

    val serverPackets = CodecRegistry()
    val clientPackets = CodecRegistry()

    internal fun loadPackets() {
        Logger.info("Registering game packets...")

        loadServerPackets()
        loadClientPackets()

        Logger.info("Registered ${serverPackets.size} SERVER game packets.")
        Logger.info("Registered ${clientPackets.size} CLIENT game packets.")
    }

    private fun loadServerPackets() {
        ClassGraph()
            .enableClassInfo()
            .enableAnnotationInfo()
            .acceptPackages("dev.onyx.server.engine.net.packet.server")
            .scan()
            .use { result ->
                result.getClassesWithAnnotation(ServerPacket::class.qualifiedName).forEach { classInfo ->
                    val annotation = classInfo.getAnnotationInfo(ServerPacket::class.qualifiedName).loadClassAndInstantiate() as ServerPacket
                    val opcode = annotation.opcode
                    val packetType = annotation.type
                    val packetClass = classInfo.loadClass().kotlin as KClass<Packet>
                    val codec = packetClass.companionObjectInstance as Codec<Packet>
                    val length = packetType.length

                    /*
                     * Register the server packet.
                     */
                    serverPackets[packetClass, opcode, length] = codec
                }
            }
    }

    private fun loadClientPackets() {
        ClassGraph()
            .enableClassInfo()
            .enableAnnotationInfo()
            .acceptPackages("dev.onyx.server.engine.net.packet.client")
            .scan()
            .use { result ->
                result.getClassesWithAnnotation(ClientPacket::class.qualifiedName).forEach { classInfo ->
                    val annotation = classInfo.getAnnotationInfo(ClientPacket::class.qualifiedName).loadClassAndInstantiate() as ClientPacket
                    val opcode = annotation.opcode
                    val length = annotation.length
                    val packetClass = classInfo.loadClass().kotlin as KClass<Packet>
                    val codec = packetClass.companionObjectInstance as Codec<Packet>

                    /*
                     * Register the client packet.
                     */
                    clientPackets[packetClass, opcode, length] = codec
                }
            }
    }
}