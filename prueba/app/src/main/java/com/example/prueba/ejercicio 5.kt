package com.example.prueba

import java.util.ArrayList

fun contarTexto(texto:String) {
    var contador : Int = texto.count{it.isLetter()}
    return println("El nombre tiene $contador letras")
}

fun main(){
    var i : Int = 0
    while (i <2 ){
        println("ingrese un nombre")
        var textoIngresado : String? = readLine()
        contarTexto(textoIngresado.toString())
        i++
    }

}