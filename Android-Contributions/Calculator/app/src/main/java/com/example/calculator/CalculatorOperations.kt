package com.example.calculator

import java.util.SimpleTimeZone

sealed class CalculatorOperations(val symbol : String){
    object Add : CalculatorOperations("+")
    object Substract : CalculatorOperations("-")
    object Multiply : CalculatorOperations("*")
    object Divide : CalculatorOperations("/")

}
