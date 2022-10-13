package com.nikeight.compose_playground.ui.gallery_app.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SinglePhotoItem(
    modifier: Modifier = Modifier,
    imageUrl: String,
    imageSize: Dp = 160.dp,
    imageType: String? = null
) {
    Card(
        modifier = modifier
            .size(imageSize)
            .padding(8.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(
            modifier = modifier
        ) {
            AsyncImageView(
                imageSize = imageSize,
                imageUrl = imageUrl
            )

            imageType?.let { imageType ->
                Surface(
                    modifier = modifier
                        .fillMaxWidth()
                        .height(imageSize.div(4))
                        .align(Alignment.BottomCenter),
                    color = MaterialTheme.colors.background.copy(alpha = 0.4f)
                ) {
                    Text(
                        modifier = modifier
                            .fillMaxWidth(0.8f)
                            .padding(8.dp)
                            .align(Alignment.Center),
                        text = imageType,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "single_photo_item_preview")
@Composable
fun SinglePhotoItemPreview() {
    SinglePhotoItem(
        imageUrl = "https://images.unsplash.com/photo-1663857061296-b12bf002a6be?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80"
    )
}