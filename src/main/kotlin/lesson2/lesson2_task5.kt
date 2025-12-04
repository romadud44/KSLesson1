package org.example.lesson2

fun main() {
    val deposit = 70000
    val depositRate = 0.167
    val сapitalization = (1 + (depositRate / 1))
    val finishDeposit =
        deposit * (сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization * сapitalization)

    println("%.3f".format(finishDeposit))
}