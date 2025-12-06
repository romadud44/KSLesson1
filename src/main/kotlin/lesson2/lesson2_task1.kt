package org.example.lesson2

fun main() {
    val firstStudent: Double = 3.00
    val secondStudent: Double = 4.00
    val thirdStudent: Double = 3.00
    val fourthStudent: Double = 5.00
    val countNumbers: Int = 4

    val gpa = (firstStudent + secondStudent + thirdStudent + fourthStudent) / countNumbers
    println("Средний балл: $gpa")
}