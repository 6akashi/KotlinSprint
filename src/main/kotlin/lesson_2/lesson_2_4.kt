package org.example.lesson_2

fun main(){

    val buff: Float = 20F
    val valueOfCrystals: Float = 7F
    val valueOfIron: Float = 11F
    println("Количество добытой кристалльной руды: $valueOfCrystals ")
    println("Количество добытой железной руды: $valueOfIron ")

    val valueCrystalBuff: Int = (valueOfCrystals/100*buff).toInt()
    val valueIronBuff: Int = (valueOfIron/100*buff).toInt()

    println("Количество добавленной кристалльной руды: $valueCrystalBuff")
    println("Количество добавленной железной руды: $valueIronBuff")
}