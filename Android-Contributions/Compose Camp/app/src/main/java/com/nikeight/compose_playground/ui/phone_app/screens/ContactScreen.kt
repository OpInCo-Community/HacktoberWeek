package com.nikeight.compose_playground.ui.phone_app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nikeight.compose_playground.R

@Composable
fun ContactScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(8.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(R.drawable.empty_contact_screen),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(4.dp)
                .size(180.dp)
        )

        Text(
            modifier = Modifier
                .padding(4.dp),
            text = "Your contact are just a\ntap away here",
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )


        Text(
            modifier = Modifier
                .padding(4.dp),
            text = "Create a new contact",
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            color = Color.DarkGray.copy(alpha = 0.5f)
        )
    }
}