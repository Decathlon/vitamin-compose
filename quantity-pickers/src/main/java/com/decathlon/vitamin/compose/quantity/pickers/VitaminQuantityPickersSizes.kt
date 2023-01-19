package com.decathlon.vitamin.compose.quantity.pickers

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class QuantityPickerSizes(
    val height: Dp,
    val minWidth: Dp,
    val maxWidth: Dp
)

object VitaminQuantityPickersSizes {
    @Composable
    fun fixed(
        height: Dp = 48.dp,
        minWidth: Dp = 156.dp,
        maxWidth: Dp = 156.dp
    ): QuantityPickerSizes = remember(
        height,
        minWidth,
        maxWidth
    ) {
        QuantityPickerSizes(
            height = height,
            minWidth = minWidth,
            maxWidth = maxWidth
        )
    }

    @Composable
    fun fillMaxWidth(
        height: Dp = 48.dp,
        minWidth: Dp = 156.dp,
        maxWidth: Dp = Dp.Unspecified
    ): QuantityPickerSizes = remember(
        height,
        minWidth,
        maxWidth
    ) {
        QuantityPickerSizes(
            height = height,
            minWidth = minWidth,
            maxWidth = maxWidth
        )
    }
}