package org.example.lesson1

import kotlin.time.Duration

const val SECONDS_TO_HOUR = 3600
const val SECONDS_TO_MINUTE = 60

fun main() {
    val seconds: Short = 6480
    val hoursOfSpace: Int = seconds / SECONDS_TO_HOUR

    var minutesOfSpace: Int = (seconds % SECONDS_TO_HOUR) / SECONDS_TO_MINUTE
    var secondsOfSpace: Int = ((seconds % SECONDS_TO_HOUR) % 60) / 60
    val secondsOfSpaceFinish: String
//    if (secondsOfSpace < 10) {
//        secondsOfSpaceFinish = "0$secondsOfSpace"
//    } else {
//        secondsOfSpaceFinish = secondsOfSpace.toString()
//    }
//    val minutesOfSpaceString = String.format("%02d", minutesOfSpace)
//    val secondsOfSpaceString = String.format("%02d", secondsOfSpace)
//    val hoursOfSpaceString = String.format("%02d", hoursOfSpace)
    println(
        "${String.format("%02d", hoursOfSpace)}:${String.format("%02d", minutesOfSpace)}:${
            String.format(
                "%02d",
                secondsOfSpace
            )
        }"
    )
}
