package org.example.lesson2

fun main() {
    val countEmployee = 50
    val countStudent = 30
    val moneyEmployee = 30000
    val moneyStudent = 20000
    val sumMoneyEmployee = moneyEmployee * countEmployee
    val sumMoneyStudent = moneyStudent * countStudent
    val allMoney = sumMoneyEmployee + sumMoneyStudent
    val averageMoney = allMoney / (countEmployee + countStudent)

    println("ЗП постоянных сотрудников: $sumMoneyEmployee")
    println("ЗП всех сотрудников: $allMoney")
    println("Средняя ЗП всех сотрудников: $averageMoney")
}