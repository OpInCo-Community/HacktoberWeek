package com.nikeight.compose_playground.ui.phone_app.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nikeight.compose_playground.ui.phone_app.data.RecentCallModel
import com.nikeight.compose_playground.ui.phone_app.data.RecentStatus

@Composable
fun RecentCallHeading(
    recentCallModel: RecentCallModel,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp),
            text = recentCallModel.contactName ?: recentCallModel.phoneNumber,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            textAlign = TextAlign.Start
        )

        CallLogTimeAndStatus(recentCallModel)
    }
}

@Preview
@Composable
fun RecentCallHeadingPreview() {
    RecentCallHeading(
        recentCallModel = RecentCallModel(
            phoneNumber = "987654321",
            contactName = null,
            recentDate = "Sept 24",
            recentStatus = RecentStatus.MISSED_CALL
        )
    )
}