package com.decathlon.vitamin.compose.skeletons

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.placeholder

/**
 * Extension function to apply shimmer effect on every composable
 * @param visible visibility state of the shimmer effect
 * @param colors The colors of the background and the highlight effect
 * @param shape shape of the skeleton
 */
@Composable
fun Modifier.vtmnSkeleton(
    visible: Boolean = true,
    colors: SkeletonColors = VitaminSkeletonColors.primary(),
    shape: Shape = RectangleShape
): Modifier {
    return this
        .placeholder(
            visible = visible,
            color = colors.backgroundColor,
            shape = shape,
            highlight = PlaceholderHighlight.verticalShimmer(
                highlightColor = colors.highlightColor,
            ),
        )
}
