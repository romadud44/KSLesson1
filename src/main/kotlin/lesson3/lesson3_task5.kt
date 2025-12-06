package org.example.lesson3

fun main() {
    val move = "D2-D4;0"
    val partsOfMove = move.split("-", ";")
    println("Номер хода: ${partsOfMove[2]}")
    println("Откуда: ${partsOfMove[0]}")
    println("куда: ${partsOfMove[1]}")
}