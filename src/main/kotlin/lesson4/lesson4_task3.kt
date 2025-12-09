package org.example.lesson4

fun main() {
    val sunnyWeather = true
    val openTent = true
    val humidity = 20
    val season = "зима"

    val todaySunnyWeather = true
    val todayOpenTent = true
    val todayHumidity = 20
    val todaySeason = "зима"

    val optimalConditions = todaySunnyWeather == sunnyWeather && todayOpenTent == openTent && todayHumidity == humidity && todaySeason != season
    println("Благоприятные ли условия сейчас для роста бобовых? \n$optimalConditions")
}
