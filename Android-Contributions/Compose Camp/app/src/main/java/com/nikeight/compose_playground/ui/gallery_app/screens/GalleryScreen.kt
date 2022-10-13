package com.nikeight.compose_playground.ui.gallery_app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nikeight.compose_playground.ui.gallery_app.components.GalleryImageView
import com.nikeight.compose_playground.ui.gallery_app.data.GalleryList

@Composable
fun GalleryScreen() {
    LazyColumn() {
        items(GalleryList.galleryList.shuffled()) {
            GalleryImageView(galleryItem = it)
        }
    }
}

@Preview
@Composable
fun GalleryScreenPreview() {
    GalleryScreen()
}