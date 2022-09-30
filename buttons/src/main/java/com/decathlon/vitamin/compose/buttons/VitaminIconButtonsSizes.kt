package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class IconButtonSizes(
    val width: Dp,
    val height: Dp,
    val iconSize: Dp,
    val contentPadding: PaddingValues
)

object VitaminIconButtonsSizes {
    @Composable
    fun large(
        width: Dp = 64.dp,
        height: Dp = 64.dp,
        iconSize: Dp = 24.dp,
        contentPadding: PaddingValues = PaddingValues(start = 40.dp, end = 40.dp)
    ): IconButtonSizes = remember(
        height,
        iconSize,
        contentPadding
    ) {
        IconButtonSizes(
            width = width,
            height = height,
            iconSize = iconSize,
            contentPadding = contentPadding
        )
    }

    @Composable
    fun medium(
        width: Dp = 48.dp,
        height: Dp = 48.dp,
        iconSize: Dp = 20.dp,
        contentPadding: PaddingValues = PaddingValues(start = 24.dp, end = 24.dp)
    ): IconButtonSizes = remember(
        height,
        iconSize,
        contentPadding
    ) {
        IconButtonSizes(
            width = width,
            height = height,
            iconSize = iconSize,
            contentPadding = contentPadding
        )
    }
}
