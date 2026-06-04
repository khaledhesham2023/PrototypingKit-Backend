package com.khaledamin.plugins

import com.khaledamin.routes.onBoardingRoutes
import io.ktor.server.application.*
import io.ktor.server.routing.*


fun Application.configureRouting() {
    routing {
       onBoardingRoutes()
    }
}