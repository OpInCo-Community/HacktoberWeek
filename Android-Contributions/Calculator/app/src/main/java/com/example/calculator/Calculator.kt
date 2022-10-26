package com.example.calculator


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculator.ui.theme.NavyBlue
import com.example.calculator.ui.theme.Orange
import com.example.calculator.ui.theme.WhiteBlue
import com.example.calculator.ui.theme.blackish

@Composable
fun Calculator(
    modifier: Modifier = Modifier,
    state: CalculatorState,
    buttonSpacing : Dp = 5.dp,
    onAction : (CalculatorAction) -> Unit

) {
    Box(modifier = Modifier) {
        Column(
             modifier = Modifier
                 .fillMaxWidth()
                 .align(Alignment.BottomCenter),
                    verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
                Text(
                    text = state.number1 + (state.operations?.symbol ?: "" ) + state.number2,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(32.dp),
                    fontWeight = FontWeight.Light,
                    fontSize = 80.sp,
                    color = Color.White,
                    maxLines = 2
                )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )

                CalculatorButton(
                    symbol = "Del" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )

                CalculatorButton(
                    symbol = "/" ,
                    modifier = Modifier
                        .background(WhiteBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operations(CalculatorOperations.Divide))
                    }

                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )

                CalculatorButton(
                    symbol = "8" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )

                CalculatorButton(
                    symbol = "9" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }

                )

                CalculatorButton(
                    symbol = "*" ,
                    modifier = Modifier
                        .background(WhiteBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operations(CalculatorOperations.Multiply))
                    }

                )

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )

                CalculatorButton(
                    symbol = "5" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )

                CalculatorButton(
                    symbol = "6" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }

                )

                CalculatorButton(
                    symbol = "-" ,
                    modifier = Modifier
                        .background(WhiteBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operations(CalculatorOperations.Substract))
                    }

                )

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )

                CalculatorButton(
                    symbol = "2" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )

                CalculatorButton(
                    symbol = "3" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }

                )

                CalculatorButton(
                    symbol = "+" ,
                    modifier = Modifier
                        .background(WhiteBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Operations(CalculatorOperations.Add))
                    }

                )

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0" ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    }
                )

                CalculatorButton(
                    symbol = "." ,
                    modifier = Modifier
                        .background(NavyBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )


                CalculatorButton(
                    symbol = "=" ,
                    modifier = Modifier
                        .background(WhiteBlue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }

                )

            }



        }

    }
}