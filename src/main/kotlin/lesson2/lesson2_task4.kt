package org.example.lesson2

fun main() {
    val buff = 1.2f
    val countCrystals = 7
    val countIrons = 11

    val countCrystalsBuff = (countCrystals * buff) - countCrystals
    val countIronsBuff = (countIrons * buff) - countIrons

    println("Бонусная кристалическая руда: " + countCrystalsBuff.toInt())
    println("Бонусная железная руда: " + countIronsBuff.toInt())
}