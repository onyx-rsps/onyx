package dev.onyx.server.engine.net.login

import dev.onyx.server.engine.net.StatusResponse

class LoginError(val status: StatusResponse) : Exception()