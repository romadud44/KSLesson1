package org.example.lesson2

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39
    val timeDeparture = 457
    val minutesToHour = 60

    val timeFromZero = (hourDeparture * minutesToHour) + minuteDeparture
    val sumTime = timeFromZero + timeDeparture

    val hourArrival = sumTime / minutesToHour
    val minuteArrival = sumTime % minutesToHour
    println("Время прибытия: $hourArrival:$minuteArrival")
}