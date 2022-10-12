package com.nikeight.compose_playground.ui.phone_app.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nikeight.compose_playground.ui.phone_app.data.RecentCallModel
import com.nikeight.compose_playground.ui.phone_app.data.RecentStatus

@Composable
fun CallLogTimeAndStatus(
    recentCallModel: RecentCallModel
) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        recentCallModel.recentStatus.let {
            when (it) {
                RecentStatus.DIALLED -> {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = recentCallModel.recentStatus.toString()
                    )
                }
                RecentStatus.RECEIVED -> {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = recentCallModel.recentStatus.toString()
                    )
                }
                RecentStatus.MISSED_CALL -> {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = recentCallModel.recentStatus.toString()
                    )
                }
            }
        }

        Spacer(modifier = Modifier.width(4.dp))

        recentCallModel.recentDate?.let { safeDate ->
            Text(
                text = safeDate,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp
            )
        }
    }
}

@Preview(showBackground = true, name = "preview_row_heading")
@Composable
fun CallLogTimeAndStatusPreview() {
    CallLogTimeAndStatus(
        recentCallModel = RecentCallModel(
            phoneNumber = "987654321",
            contactName = null,
            recentDate = "Sept 24",
            recentStatus = RecentStatus.MISSED_CALL
        )
    )
}