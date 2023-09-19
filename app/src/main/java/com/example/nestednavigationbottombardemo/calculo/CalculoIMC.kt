package com.example.nestednavigationbottombardemo.calculo

import androidx.compose.ui.graphics.Color
import kotlin.math.pow

fun calcularImc(pesoUsuario: Double, alturaUsuario: Double): Double{
    var imc = pesoUsuario / (alturaUsuario/100).pow(2)
    return imc
}

fun determinarClassificacaoIMC(imc: Double): String {
    return if(imc < 18.5) {
        "Abaixo do peso"
    } else if (imc >= 18.5 && imc < 25.0) {
        "Peso Ideal"
    } else if (imc >= 25.0 && imc < 30.0) {
        "Acima do peso"
    } else if (imc >= 30.0 && imc < 35.0) {
        "Obesidade Grau I"
    } else if (imc >= 35.0 && imc < 40.0) {
        "Obesidade Grau II"
    } else {"Obesidade Grau III"}
}

fun corDoCard(imc: Double): Color{
    var classificacao = determinarClassificacaoIMC(imc)
    if(classificacao == "Peso Ideal"){
        return Color(0xff329F6B)
    }else if (classificacao == "Acima do peso"){
        return Color(0xFFFF9800)

    }else {
        return Color(0xFF750606)
    }
}