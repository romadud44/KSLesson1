package org.example.lesson2

fun main() {
    val buff = 20
    val buffFinish: Float = 1+(buff/100f)
    val countCrystals = 7
    val countIrons = 11

    val countCrystalsBuff = (countCrystals * buffFinish) - countCrystals
    val countIronsBuff = (countIrons * buffFinish) - countIrons

    println("Бонусная кристалическая руда: " + countCrystalsBuff.toInt())
    println("Бонусная железная руда: " + countIronsBuff.toInt())
}