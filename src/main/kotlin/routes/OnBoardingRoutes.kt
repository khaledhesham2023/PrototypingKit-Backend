package com.khaledamin.routes

import com.khaledamin.services.OnboardingService
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

private val service = OnboardingService()

fun Route.onBoardingRoutes() {
    route(path = "/onboarding") {
        get {
            val response = service.getAll()
            if (response.)
            call.respond(service.getAll())
        }
    }
}