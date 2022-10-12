package com.nikeight.compose_playground.ui.gallery_app.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.nikeight.compose_playground.R

@Composable
fun AsyncImageView(
    imageUrl: String? = null,
    imageSize: Dp
) {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageUrl)
            .crossfade(true)
            .build(),
        placeholder = painterResource(R.drawable.temp_place_holder),
        contentDescription = "fetched_image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(imageSize)
    )
}