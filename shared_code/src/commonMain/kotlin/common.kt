package com.maxwellscore.ktrol

expect fun platformName(): String

fun createPlatfromMessage(): String = "Kotlin on ${platformName()}"