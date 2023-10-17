package me.tunaxor.samples

import io.ktor.server.application.*
import io.ktor.util.logging.*
import org.kodein.di.*
import org.kodein.di.ktor.CallScope
import org.kodein.di.ktor.di


fun Application.useDIContainer() {
    di {
        bindInstance { log }
    }
}
