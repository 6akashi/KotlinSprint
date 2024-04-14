package org.example.lesson_2

fun main(){
    print("Оценика первого ученика: ")
    val firstStudentScore = readln().toFloat()
    print("Оценика второго ученика: ")
    val secondStudentScore = readln().toFloat()
    print("Оценика третьего ученика: ")
    val thirdStudentScore = readln().toFloat()
    print("Оценика четвертого ученика: ")
    val fourthStudentScore = readln().toFloat()

    val sumOfScores: Float= firstStudentScore + secondStudentScore + thirdStudentScore + fourthStudentScore
    val averageStudentsScores = sumOfScores/4
    println(averageStudentsScores)

}
