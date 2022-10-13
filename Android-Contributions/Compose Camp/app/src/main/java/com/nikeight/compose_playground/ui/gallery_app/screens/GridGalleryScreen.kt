package com.nikeight.compose_playground.ui.gallery_app.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nikeight.compose_playground.ui.gallery_app.components.SinglePhotoItem
import com.nikeight.compose_playground.ui.gallery_app.data.GalleryList

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridGalleryScreen() {
    LazyVerticalGrid(
        modifier = Modifier
            .padding(top = 4.dp, bottom = 8.dp)
            .height(240.dp),
        cells = GridCells.Adaptive(minSize = 100.dp),
        contentPadding = PaddingValues(4.dp),
    ) {
        items(GalleryList.galleryList.shuffled()) { photoItem ->
            SinglePhotoItem(imageUrl = photoItem.imageUrl.toString())
        }
    }
}