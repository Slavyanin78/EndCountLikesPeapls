package ru.netology


fun main() {
    val likes = 331
    val endCount = " людям"
    val endCount1 = " человеку"
    val endCountPrint = if(likes %100 === 11 || likes %10 > 1) endCount else endCount1
    println(endCountPrint)





}