package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class CalculatorViewModel : ViewModel() {

    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorAction){
            when(action){
                is CalculatorAction.Number -> enterNumber(action.number)
                is CalculatorAction.Delete -> performDelete()
                is CalculatorAction.Clear -> state = CalculatorState()
                is CalculatorAction.Decimal -> enterDecimal()
                is CalculatorAction.Operations -> enterOperation(action.operations)
                is CalculatorAction.Calculate -> performCalculation()

            }
    }

    private fun performCalculation() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if(number1 != null && number2 != null) {
            val result = when(state.operations) {
                is CalculatorOperations.Add -> number1 + number2
                is CalculatorOperations.Substract -> number1 - number2
                is CalculatorOperations.Multiply -> number1 * number2
                is CalculatorOperations.Divide -> number1 / number2
                null -> return
            }
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operations = null
            )
        }
    }

    private fun enterOperation(operations: CalculatorOperations) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operations = operations)
        }
    }

    private fun enterDecimal() {
        if(state.operations == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        } else if(!state.number2.contains(".") && state.number2.isNotBlank()) {
            state = state.copy(
                number2 = state.number2 + "."
            )
        }
    }

    private fun performDelete() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operations != null -> state = state.copy(
                operations = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operations == null) {
            if(state.number1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }


    companion object {
        private const val MAX_NUM_LENGTH = 8
    }

}