package com.nikeight.compose_playground.ui.phone_app.screens

import androidx.compose.runtime.Composable
import com.nikeight.compose_playground.ui.phone_app.components.RecentCallLogItem
import com.nikeight.compose_playground.ui.phone_app.data.RecentCallModel
import com.nikeight.compose_playground.ui.phone_app.data.RecentStatus

@Composable
fun RecentLogScreen() {
    RecentCallLogItem(
        recentCallModel = RecentCallModel(
            phoneNumber = "987654321",
            contactName = null,
            recentDate = "Sept 24",
            recentStatus = RecentStatus.MISSED_CALL
        )
    )
}