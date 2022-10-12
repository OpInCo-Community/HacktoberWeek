package com.nikeight.compose_playground.ui.gallery_app.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nikeight.compose_playground.ui.gallery_app.data.GalleryList
import com.nikeight.compose_playground.ui.gallery_app.model.GalleryItem

@Composable
fun GalleryImageView(
    modifier: Modifier = Modifier,
    galleryItem: GalleryItem,
) {
    Card(
        modifier = modifier
            .padding(4.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = modifier
                .background(MaterialTheme.colors.primary.copy(alpha = 0.25f))
                .padding(4.dp)
        ) {
            galleryItem.imageUrl?.let { safeUrl ->
                SinglePhotoItem(
                    imageUrl = safeUrl,
                    imageType = galleryItem.type
                )
            }

            RightRowColumnInfo(
                modifier = modifier,
                galleryItem = galleryItem
            )
        }
    }
}

@Composable
fun RightRowColumnInfo(
    modifier: Modifier,
    galleryItem: GalleryItem,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        Spacer(modifier = modifier.height(4.dp))

        galleryItem.title?.let {
            Text(
                modifier = modifier.padding(4.dp),
                text = it,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Spacer(modifier = modifier.height(4.dp))

        GalleryInfoColumn(
            galleryItem = galleryItem
        )
    }
}

@Preview(showBackground = true, name = "gallery_image_view_preview")
@Composable
fun GalleryImageViewPreview() {
    val galleryItem = GalleryList.galleryList.firstOrNull()
    GalleryImageView(galleryItem = galleryItem!!)
}