package com.gibson.kadwise.soft

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform