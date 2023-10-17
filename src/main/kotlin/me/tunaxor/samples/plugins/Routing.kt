package me.tunaxor.samples.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.util.logging.*
import org.kodein.di.instance
import org.kodein.di.ktor.closestDI

fun Application.configureRouting() {
    install(AutoHeadResponse)
    routing {
        get("/") {
            val logger: Logger by closestDI().instance<Logger>()
            logger.info("I Logged Something!")
            call.respondText("Hello Worldo!")
        }
    }
}
