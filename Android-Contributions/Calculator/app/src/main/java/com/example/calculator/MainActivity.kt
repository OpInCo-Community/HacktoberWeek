package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculator.ui.theme.*
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {



            CalculatorTheme {

                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setStatusBarColor(
                        color = Color.Black,
                        darkIcons = false
                    )
                }


                        Box(modifier = Modifier
                            .fillMaxSize()
                            .background(Black)
                        ) {

                            val viewModel = viewModel<CalculatorViewModel>()
                            val state = viewModel.state
                            val buttonSpacing = 4.dp

                            Calculator(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color.Black)
                                    .padding(12.dp),
                                state = state,
                                onAction = viewModel::onAction,
                                buttonSpacing = buttonSpacing,

                                )
                        }









            }
        }
    }


}


