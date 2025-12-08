package org.example.lesson4

fun main() {
    val day = 5
    val todayExercisesHand = day % 2 != 0
    val todayExercisesAbs = day % 2 != 0
    val todayExercisesNails = day % 2 == 0
    val todayExercisesBack = day % 2 == 0

    println("Упражнения для рук: $todayExercisesHand\nУпражнения для ног: $todayExercisesNails\nУпражнения для спины: $todayExercisesBack\nУпражнения для пресса: $todayExercisesAbs")
}