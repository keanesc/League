package dev.keanesc.league

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform