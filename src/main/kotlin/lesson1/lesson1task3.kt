package org.example.lesson1

fun main() {
    val year: Short
    year = 1961
    var hour: String
    var minute: String
    hour = "09"
    minute = "07"
    println(year)
    println(hour)
    println(minute)


    hour = "10"
    minute = "55"
    print(hour)
    print(':')
    println(minute)
    println("$hour:$minute")
}