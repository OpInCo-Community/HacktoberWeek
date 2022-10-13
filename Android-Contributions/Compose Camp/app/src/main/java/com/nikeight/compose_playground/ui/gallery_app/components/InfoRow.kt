package com.nikeight.compose_playground.ui.gallery_app.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoRow(
    modifier: Modifier,
    icon: ImageVector,
    value: String? = null,
    tint: Color? = Color.Black
) {
    Row(
        modifier = modifier
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        tint?.let {
            Icon(
                imageVector = icon,
                contentDescription = "Info row icon",
                tint = it
            )
        }
        value?.let { safeCount ->
            Text(
                modifier = modifier.padding(
                    start = 12.dp
                ),
                text = safeCount,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            )
        }
    }
}

@Preview(name = "info_row_preview", showBackground = true)
@Composable
fun InfoRowPreview() {
    val icon: ImageVector = Icons.Default.Favorite
    val count: String = "1883"
    val modifier: Modifier = Modifier

    InfoRow(
        modifier = modifier,
        icon = icon,
        value = count,
    )
}