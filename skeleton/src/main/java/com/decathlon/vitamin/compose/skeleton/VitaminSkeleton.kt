package com.decathlon.vitamin.compose.skeleton

import androidx.annotation.FloatRange
import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.accompanist.placeholder.PlaceholderDefaults
import com.google.accompanist.placeholder.PlaceholderHighlight
import com.google.accompanist.placeholder.placeholder

object VitaminSkeleton {

    /**
     * Rectangular skeleton shape
     * @param modifier The [Modifier] to be applied to this skeleton shape
     * @param color color of this skeleton shape
     * @param highlightColor color of the shimmer effect
     * @param cornerRadius size of the rectangle shape corner radius, no radius by default
     * @param contentDescription the [String] for the content description
     */
    @Composable
    fun Rectangular(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
        highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        cornerRadius: Dp = 0.dp,
        contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)
    ) {
        VitaminSkeletonShape(
            color,
            highlightColor,
            RoundedCornerShape(cornerRadius),
            modifier,
            contentDescription
        )
    }


    /**
     * Rounded skeleton shape
     * @param modifier The [Modifier] to be applied to this skeleton shape
     * @param color color of this skeleton shape
     * @param highlightColor color of the shimmer effect
     * @param contentDescription the [String] for the content description
     */
    @Composable
    fun Rounded(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
        highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)
    ) {
        VitaminSkeletonShape( color, highlightColor, CircleShape, modifier, contentDescription)
    }

}

@Composable
private fun VitaminSkeletonShape(
    color: Color,
    highlightColor: Color,
    shape: Shape,
    modifier: Modifier,
    contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)
) {
    Box(
        modifier = modifier
            .placeholder(
                visible = true,
                color = color,
                shape = shape,
                highlight = PlaceholderHighlight.verticalShimmer(
                    highlightColor = highlightColor,
                )
            )
            .semantics {
                this.contentDescription = contentDescription
            }
    )
}

private fun PlaceholderHighlight.Companion.verticalShimmer(
    highlightColor: Color,
    animationSpec: InfiniteRepeatableSpec<Float> = PlaceholderDefaults.shimmerAnimationSpec,
    @FloatRange(from = 0.0, to = 1.0) progressForMaxAlpha: Float = 0.6f,
): PlaceholderHighlight = VerticalShimmer(
    highlightColor = highlightColor,
    animationSpec = animationSpec,
    progressForMaxAlpha = progressForMaxAlpha,
)

private data class VerticalShimmer(
    private val highlightColor: Color,
    override val animationSpec: InfiniteRepeatableSpec<Float>,
    private val progressForMaxAlpha: Float = 0.6f,
) : PlaceholderHighlight {
    override fun brush(
        progress: Float,
        size: Size,
    ): Brush = Brush.linearGradient(
        colors = listOf(
            highlightColor.copy(alpha = 0f),
            highlightColor,
            highlightColor.copy(alpha = 0f),
        ),
        end = Offset(size.width * progress * 4, size.height * progress * 4)
    )

    override fun alpha(progress: Float): Float = when {
        progress <= progressForMaxAlpha -> {
            lerp(
                start = 0f,
                stop = 1f,
                fraction = progress / progressForMaxAlpha
            )
        }
        else -> {
            lerp(
                start = 1f,
                stop = 0f,
                fraction = (progress - progressForMaxAlpha) / (1f - progressForMaxAlpha)
            )
        }
    }
}