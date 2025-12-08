package org.example.lesson3

fun main(){
    var moveStart: String = "E2"
    var moveFinish: String = "E4"
    var numberOfMove: Int = 1
    var move: String = "[$moveStart - $moveFinish; $numberOfMove]"
    println(move)
    moveStart = "D2"
    moveFinish = "D1"
    numberOfMove = 2
    move = "[$moveStart - $moveFinish; $numberOfMove]"
    println(move)
}