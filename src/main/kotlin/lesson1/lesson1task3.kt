package org.example.lesson1

fun main() {
    val year: Short
    year = 1961
    var hour: Int
    var minute: Int
    hour = 9
    minute = 7
    println(year)
    println("0$hour")
    println("0$minute")

    hour = 10
    minute = 55
    print(hour)
    print(':')
    println(minute)
    println("$hour:$minute")
}