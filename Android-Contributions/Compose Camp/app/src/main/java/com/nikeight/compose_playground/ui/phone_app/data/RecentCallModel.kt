package com.nikeight.compose_playground.ui.phone_app.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.ui.graphics.vector.ImageVector

data class RecentCallModel(
    val phoneNumber: String,
    val contactName: String? = null,
    val recentStatus: RecentStatus = RecentStatus.DIALLED,
    val recentDate: String? = null
)


enum class RecentStatus(val icon: ImageVector) {
    DIALLED(Icons.Default.ArrowForward),
    RECEIVED(Icons.Default.ArrowDropDown),
    MISSED_CALL(Icons.Default.Close)
}
