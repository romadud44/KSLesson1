package org.example.lesson4

fun main(){
    val allTables = 13
    val tablesOnToday = 13
    val tablesOnTomorrow = 9
    println("[Доступность столиков на сегодня: ${tablesOnToday < allTables}]\n[Доступность столиков на завтра: ${tablesOnTomorrow < allTables}]")
}