package com.example.routes

import com.example.util.Constants
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.imageRoutes() {
    get("/profile") {
        call.respond {
            HttpStatusCode.OK
            Constants.data.random()
        }
    }
}