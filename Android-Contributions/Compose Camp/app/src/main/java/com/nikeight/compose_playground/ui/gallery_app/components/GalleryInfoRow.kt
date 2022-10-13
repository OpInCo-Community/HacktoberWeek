package com.nikeight.compose_playground.ui.gallery_app.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nikeight.compose_playground.ui.gallery_app.data.GalleryList
import com.nikeight.compose_playground.ui.gallery_app.model.GalleryItem

@Composable
fun GalleryInfoColumn(
    modifier: Modifier = Modifier,
    galleryItem: GalleryItem
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        InfoRow(
            modifier = modifier,
            icon = Icons.Default.LocationOn,
            value = galleryItem.location,
        )

        InfoRow(
            modifier = modifier,
            icon = Icons.Default.Favorite,
            value = galleryItem.likes,
            tint = Color.Red
        )

        InfoRow(
            modifier = modifier,
            icon = Icons.Filled.Star,
            value = galleryItem.downloads,
            tint = Color.DarkGray
        )
    }
}

@Preview(showBackground = true, name = "gallery_info_row")
@Composable
fun GalleryInfoRowPreview() {
    val galleryItem = GalleryList.galleryList.firstOrNull()
    val modifier: Modifier = Modifier

    GalleryInfoColumn(
        modifier = modifier,
        galleryItem = galleryItem!!
    )
}