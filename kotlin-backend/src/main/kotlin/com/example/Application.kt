package com.example

import com.example.plugins.*
import com.example.util.Constants
import io.ktor.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = Constants.port, host = "192.168.43.90") {
        modules()
    }.start(wait = true)
}

fun Application.modules() {

    configureRouting()
    configureSerialization()
    configureMonitoring()
}