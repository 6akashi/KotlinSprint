package org.example.lesson_2

fun main(){
    val hourOfStart = 9
    val minuteOfStart = 39
    val timeInTravel = 457
    val timeBeforeTravel = hourOfStart*60 + minuteOfStart
    val hoursInTravel = timeInTravel/60
    val minutesInTravel = timeInTravel - hoursInTravel*60
    val hourOfArrival = (timeInTravel+timeBeforeTravel)/60
    val minuteOfArrival = (timeInTravel+timeBeforeTravel) - hourOfArrival*60

    println("Время отправления: $hourOfStart:$minuteOfStart")
    println("Время в пути: $hoursInTravel:$minutesInTravel")
    println("Время прибытия: $hourOfArrival:$minuteOfArrival")
}