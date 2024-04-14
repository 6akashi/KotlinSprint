package org.example.lesson_2

import kotlin.math.pow

fun main(){
    val deposit = 70_000
    val procents: Double = 16.7
    val period: Double = 20.0
    val hardProcent: Double = deposit * ((1.0 + (procents/100)).pow(period))
    println("Размер вклада через ${period.toInt()} лет: ${String.format("%.3f", hardProcent)}")
}