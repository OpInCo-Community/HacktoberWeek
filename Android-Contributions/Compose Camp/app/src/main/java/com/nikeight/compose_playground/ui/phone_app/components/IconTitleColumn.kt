package com.nikeight.compose_playground.ui.phone_app.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun IconTitleColumn(
    title: String,
    icon: ImageVector,
    onClickEvent: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(4.dp)
            .clickable {
                onClickEvent()
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = "${title}_icon"
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = title,
            fontWeight = FontWeight.Light,
            fontSize = 16.sp
        )
    }
}