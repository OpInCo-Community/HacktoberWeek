package com.nikeight.compose_playground.ui.phone_app.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Sealed Classes to restrict the inheritance
 * and provide more further control
 */
sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Favorite : BottomBarScreen(
        route = "favorite",
        title = "Favorite",
        icon = Icons.Default.Favorite
    )

    object Recent : BottomBarScreen(
        route = "recent",
        title = "Recent",
        icon = Icons.Default.CheckCircle
    )

    object Contacts : BottomBarScreen(
        route = "contact",
        title = "Contact",
        icon = Icons.Default.Person
    )
}
