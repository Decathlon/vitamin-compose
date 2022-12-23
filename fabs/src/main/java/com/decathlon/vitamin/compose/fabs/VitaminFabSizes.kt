package com.decathlon.vitamin.compose.fabs

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class FabSizes(
    val size: Dp,
    val iconSize: Dp
)

object VitaminFabSizes {
    @Composable
    fun mini(
        size: Dp = 40.dp,
        iconSize: Dp = 24.dp
    ): FabSizes = remember(
        size,
        iconSize
    ) {
        FabSizes(
            size = size,
            iconSize = iconSize
        )
    }

    @Composable
    fun default(
        size: Dp = 56.dp,
        iconSize: Dp = 24.dp
    ): FabSizes = remember(
        size,
        iconSize
    ) {
        FabSizes(
            size = size,
            iconSize = iconSize
        )
    }
}
