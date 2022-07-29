package com.decathlon.vitamin.compose.skeletons

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

object VitaminSkeletons {

    /**
     * Rectangular skeleton shape
     * @param modifier The [Modifier] to be applied to this skeleton shape
     * @param colors The colors of the background and the highlight effect
     * @param cornerRadius size of the rectangle shape corner radius, no radius by default
     */
    @Composable
    fun Rectangular(
        modifier: Modifier = Modifier,
        colors: SkeletonColors = VitaminSkeletonColors.primary(),
        cornerRadius: Dp = 0.dp
    ) {
        VitaminSkeletonShapeImpl(
            colors,
            RoundedCornerShape(cornerRadius),
            modifier
        )
    }

    /**
     * Rounded skeleton shape
     * @param modifier The [Modifier] to be applied to this skeleton shape
     * @param colors The colors of the background and the highlight effect
     */
    @Composable
    fun Rounded(
        modifier: Modifier = Modifier,
        colors: SkeletonColors = VitaminSkeletonColors.primary()
    ) {
        VitaminSkeletonShapeImpl(colors, CircleShape, modifier)
    }
}

@Composable
private fun VitaminSkeletonShapeImpl(
    colors: SkeletonColors,
    shape: Shape,
    modifier: Modifier
) {
    Box(
        modifier = modifier
            .vtmnSkeleton(
                visible = true,
                colors = colors,
                shape = shape
            )
    )
}
