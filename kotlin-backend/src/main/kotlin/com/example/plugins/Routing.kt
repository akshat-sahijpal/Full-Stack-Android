package com.example.plugins

import com.example.routes.imageRoutes
import com.example.util.Constants
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    routing {
        get("/profile") {
            call.respond(Constants.data.random())
        }
        get("/all") {
                call.respond(Constants.data)
        }
        get("/") {
            call.respond("switch to /profile route")
        }
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
