package com.decathlon.vitamin.compose.progressbars

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class LinearSizes(val size: Dp)

object VitaminLinearProgressBarSizes {
    fun smallSize(size: Dp = 4.dp): LinearSizes = LinearSizes(size = size)
    fun mediumSize(size: Dp = 8.dp): LinearSizes = LinearSizes(size = size)
    fun largeSize(size: Dp = 16.dp): LinearSizes = LinearSizes(size = size)
}
