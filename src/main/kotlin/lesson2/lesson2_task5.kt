package org.example.lesson2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val years = 20
    val depositRate = 16.7
    val capitalization = (1 + ((depositRate / 100) / 1))

    val finishDeposit1 = deposit * capitalization.pow(years)
    println("%.3f".format(finishDeposit1))
}