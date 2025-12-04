package org.example.lesson2

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39
    val timeDeparture = 457

    val timeFromZero = (hourDeparture * 60) + minuteDeparture
    val sumTime = timeFromZero + timeDeparture

    val hourArrival = sumTime / 60
    val minuteArrival = sumTime % 60
    println("Время прибытия: $hourArrival:$minuteArrival")
}