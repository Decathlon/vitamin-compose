package com.decathlon.vitamin.compose.skeletons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminSkeletonColors {
    @Composable
    fun primary(
        backgroundColor: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
        highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary
    ): SkeletonColors = remember(
        backgroundColor,
        highlightColor
    ) {
        SkeletonColors(
            backgroundColor = backgroundColor,
            highlightColor = highlightColor
        )
    }
}
