package com.nikeight.compose_playground.ui.phone_app.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PhoneAppBar() {
    TopAppBar(
        title = {
            Text(
                modifier = Modifier,
                text = "Search Contact & people",
                fontWeight = FontWeight.Light,
                fontSize = 16.sp
            )
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search_navigation_toolbar_icon",
                    tint = MaterialTheme.colors.onSurface
                )
            }
        },
        actions = {

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "more_vertical_toolbar_icon",
                    tint = MaterialTheme.colors.onSurface
                )
            }

            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "more_vertical_toolbar_icon",
                    tint = MaterialTheme.colors.onSurface
                )
            }

        },
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}