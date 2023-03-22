package com.decathlon.vitamin.compose.modals.impl

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Composable
internal fun Title(
    modifier: Modifier,
    painter: Painter?,
    iconColor: Color,
    iconSize: Dp,
    title: String?,
    titleColor: Color,
    bottomPadding: Dp
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        val hasIconAndText = painter != null && title != null
        val hasIconOrText = painter != null || title != null
        if (hasIconOrText) {
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = bottomPadding
                    )
            ) {
                painter?.let {
                    Icon(
                        modifier = modifier.size(size = iconSize),
                        painter = painter,
                        contentDescription = null,
                        tint = iconColor
                    )
                }
                if (hasIconAndText) {
                    Spacer(
                        modifier = modifier.width(8.dp)
                    )
                }
                title?.let {
                    Text(
                        text = it,
                        color = titleColor,
                        style = VitaminTheme.typography.subtitle1
                    )
                }
            }
        }
    }
}
