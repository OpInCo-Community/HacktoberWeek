package com.nikeight.compose_playground.ui.gallery_app.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GalleryLandingScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        var changeView by remember { mutableStateOf(false) }

        Button(onClick = {
            changeView = !changeView
        }) {
            Text(text = "Change View")
        }

        Spacer(modifier = Modifier.height(8.dp))

        if (changeView) {
            GalleryScreen()
        } else {
            GridGalleryScreen()
        }
    }
}
