package org.example.lesson1

import kotlin.time.Duration

fun main() {
    val seconds: Short = 6480
    val hoursOfSpace: Int = seconds / 3600
    val minutesOfSpace: Int = (seconds % 3600) / 60
    val secondsOfSpace: Int = ((seconds % 3600) % 60) / 60
    val secondsOfSpaceFinish: String
    if (secondsOfSpace < 10) {
        secondsOfSpaceFinish = "0$secondsOfSpace"
    } else {
        secondsOfSpaceFinish = secondsOfSpace.toString()
    }
    println("$hoursOfSpace:$minutesOfSpace:$secondsOfSpaceFinish")
}
