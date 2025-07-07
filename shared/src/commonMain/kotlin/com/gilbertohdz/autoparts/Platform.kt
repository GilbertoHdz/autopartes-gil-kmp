package com.gilbertohdz.autoparts

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform