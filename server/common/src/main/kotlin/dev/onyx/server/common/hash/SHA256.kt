package dev.onyx.server.common.hash

import java.security.MessageDigest

object SHA256 {

    private val digest = MessageDigest.getInstance("SHA-256")

    fun hash(value: String): String {
        val bytes = digest.digest(value.toByteArray(Charsets.UTF_8))
        return bytes.toHexString()
    }

    private fun ByteArray.toHexString(): String {
        return this.joinToString("") { String.format("%02X", it) }
    }
}