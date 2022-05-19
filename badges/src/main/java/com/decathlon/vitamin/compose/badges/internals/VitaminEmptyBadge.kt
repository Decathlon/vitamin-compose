package com.decathlon.vitamin.compose.badges.internals

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp

@Composable
internal fun VitaminEmptyBadge(
    backgroundColor: Color,
    anchor: @Composable BoxScope.() -> Unit,
    modifier: Modifier = Modifier,
) {
    Layout(
        {
            Box(
                modifier = Modifier.layoutId(LayoutId.ANCHOR),
                contentAlignment = Alignment.Center,
                content = anchor
            )
            Box(
                modifier = Modifier
                    .layoutId(LayoutId.BADGE)
                    .size(8.dp)
                    .clip(CircleShape)
                    .background(backgroundColor)
            )
        },
        modifier = modifier, measurePolicy = { measurables, constraints ->
            badgeMeasurePolicy(
                scope = this,
                measurables = measurables,
                constraints = constraints,
                badgeHorizontalOffset = badgeHorizontalOffset.roundToPx(),
                badgeWithContentVerticalOffset = badgeWithContentVerticalOffset.roundToPx()
            )
        }
    )
}

private val badgeHorizontalOffset = (-5).dp
private val badgeWithContentVerticalOffset = 6.dp
