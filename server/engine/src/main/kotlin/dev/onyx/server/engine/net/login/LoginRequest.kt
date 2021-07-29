package dev.onyx.server.engine.net.login

import dev.onyx.server.engine.net.Message
import dev.onyx.server.engine.net.Session

data class LoginRequest(
    val session: Session,
    val loginType: LoginType,
    val revision: Int,
    val clientType: Int,
    val encodeSeed: IntArray,
    val decodeSeed: IntArray,
    val seed: Long,
    val authType: Int,
    val password: String,
    val username: String,
    val isResizableMode: Boolean,
    val clientWidth: Int,
    val clientHeight: Int,
    val randomBytes: ByteArray,
    val crcs: IntArray
) : Message {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LoginRequest

        if (session != other.session) return false
        if (loginType != other.loginType) return false
        if (revision != other.revision) return false
        if (clientType != other.clientType) return false
        if (!encodeSeed.contentEquals(other.encodeSeed)) return false
        if (!decodeSeed.contentEquals(other.decodeSeed)) return false
        if (seed != other.seed) return false
        if (authType != other.authType) return false
        if (password != other.password) return false
        if (username != other.username) return false
        if (isResizableMode != other.isResizableMode) return false
        if (clientWidth != other.clientWidth) return false
        if (clientHeight != other.clientHeight) return false
        if (!randomBytes.contentEquals(other.randomBytes)) return false
        if (!crcs.contentEquals(other.crcs)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = session.hashCode()
        result = 31 * result + loginType.hashCode()
        result = 31 * result + revision
        result = 31 * result + clientType
        result = 31 * result + encodeSeed.contentHashCode()
        result = 31 * result + decodeSeed.contentHashCode()
        result = 31 * result + seed.hashCode()
        result = 31 * result + authType
        result = 31 * result + password.hashCode()
        result = 31 * result + username.hashCode()
        result = 31 * result + isResizableMode.hashCode()
        result = 31 * result + clientWidth
        result = 31 * result + clientHeight
        result = 31 * result + randomBytes.contentHashCode()
        result = 31 * result + crcs.contentHashCode()
        return result
    }
}