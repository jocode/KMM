package com.example.kmm_demo

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello jocode in, ${platform.name}!"
    }
}