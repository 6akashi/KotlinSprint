package org.example.lesson_2

fun main(){
    val valueOfEmployees = 50
    val salaryOfEmployees = 30000
    val valueOfInterns = 30
    val salaryOfInterns = 20000

    val expensesForEmployeesSalary = valueOfEmployees * salaryOfEmployees
    val expensesForInternsSalary = valueOfInterns * salaryOfInterns
    val generalExpenses = expensesForEmployeesSalary + expensesForInternsSalary
    val avarageSalary = (50 * 30000 + 30 * 20000)/80

    println("Затраты на зарплату сотрудников: $expensesForEmployeesSalary")
    println("Общие расходы на зарплату сотрудников и стажеров: $generalExpenses")
    println("Средняя заработная плата всех сотрудников, включая стажеров: $avarageSalary")
}