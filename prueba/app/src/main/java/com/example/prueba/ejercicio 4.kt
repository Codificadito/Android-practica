package com.example.prueba

import java.util.ArrayList

fun main(){
    val arrayList = intArrayOf(10, 2, 5, 8, 9, 6, 4, 7, 9, 3)
    var pares : Int
    var impares : Int
    pares = 0
    impares = 0
    for (x in arrayList){
        if ((x % 2)==0){
            pares++
        }
        else{
            impares++
        }

    }
    println("Cantidad de numeros pares son $pares")
    println("Cantidad de numeros impares son $impares")
}