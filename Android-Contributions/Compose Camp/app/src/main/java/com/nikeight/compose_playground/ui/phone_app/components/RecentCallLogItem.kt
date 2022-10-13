package com.nikeight.compose_playground.ui.phone_app.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nikeight.compose_playground.ui.phone_app.data.RecentCallModel
import com.nikeight.compose_playground.ui.phone_app.data.RecentStatus
import com.nikeight.compose_playground.ui.theme.Shapes

@Composable
fun RecentCallLogItem(
    modifier: Modifier = Modifier,
    recentCallModel: RecentCallModel,
) {
    var isExpanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                start = 16.dp,
                end = 16.dp,
                bottom = 8.dp,
                top = 8.dp
            )
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            )
            .background(
                if (isExpanded)
                    MaterialTheme.colors.onSecondary
                else
                    MaterialTheme.colors.onPrimary
            )
            .clickable {
                isExpanded = !isExpanded
            },
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            // Upper Layout always visible
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .size(48.dp)
                        .clip(CircleShape)
                ) {
                    Icon(
                        modifier = Modifier.padding(4.dp),
                        imageVector = Icons.Default.AccountBox,
                        contentDescription = "account_dp",
                    )
                }

                RecentCallHeading(
                    modifier = Modifier.weight(4f),
                    recentCallModel = recentCallModel
                )

                Icon(
                    modifier = Modifier
                        .weight(1f)
                        .padding(4.dp),
                    imageVector = Icons.Default.Call,
                    contentDescription = "call_icon",
                )
            }

            // Lower layout
            if (isExpanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Divider()
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconTitleColumn(title = "Add Contact", icon = Icons.Default.Add) {}
                    IconTitleColumn(title = "Message", icon = Icons.Default.Send) {}
                    IconTitleColumn(title = "History", icon = Icons.Default.Info) {}
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "")
@Composable
fun RecentCallLogItemPreview() {
    RecentCallLogItem(
        recentCallModel = RecentCallModel(
            phoneNumber = "987654321",
            contactName = null,
            recentDate = "Sept 24",
            recentStatus = RecentStatus.MISSED_CALL
        )
    )
}