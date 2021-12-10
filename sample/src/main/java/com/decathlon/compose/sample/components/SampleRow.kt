package com.decathlon.compose.sample.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Composable
fun SampleRow(
    firstItem: Boolean = false,
    lastItem: Boolean = false,
    color: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth()
            .background(color = color)
            .padding(
                top = if (firstItem) 10.dp else 5.dp,
                bottom = if (lastItem) 10.dp else 5.dp
            ),
        content = content
    )
}