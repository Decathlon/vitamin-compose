package com.decathlon.vitamin.compose.progressbars

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.LocalContentColor
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import kotlin.math.roundToInt

object VitaminProgressBars {
    /**
     * Linear progress indicators displays the length of a process.
     * @param progress The progress of this progress indicator, where 0.0 represents no progress
     * and 1.0 represents full progress
     * @param modifier The [Modifier] to be applied to the component
     * @param label The optional label above the progress bar with the progression at the end
     * @param colors The colors of the background, the progress and the label
     * @param sizes Different sizes for the progress bar
     */
    @Composable
    fun Linear(
        progress: Float,
        modifier: Modifier = Modifier,
        label: String? = null,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        sizes: LinearProgressBarSizes = VitaminLinearProgressBarSizes.medium(),
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.spacedBy(sizes.labelBottomPadding)
        ) {
            if (label != null) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    LabelText(
                        label = label,
                        color = colors.labelColor,
                        style = sizes.textStyle,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = progress.getProgressInPercent(),
                        color = colors.labelColor,
                        style = sizes.textStyle
                    )
                }
            }
            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier.vitaminLinearProgressModifier(sizes.strokeSize),
                color = colors.progressColor,
                backgroundColor = colors.backgroundColor,
                strokeCap = StrokeCap.Round
            )
        }
    }

    /**
     * Linear progress indicators express an unspecified wait time.
     * @param modifier The [Modifier] to be applied to the component
     * @param label The optional label above the progress bar with the progression at the end
     * @param colors The colors of the background, the progress and the label
     * @param sizes Different sizes for the progress bar
     */
    @Composable
    fun Linear(
        modifier: Modifier = Modifier,
        label: String? = null,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        sizes: LinearProgressBarSizes = VitaminLinearProgressBarSizes.medium(),
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.spacedBy(sizes.labelBottomPadding)
        ) {
            if (label != null) {
                LabelText(
                    label = label,
                    color = colors.labelColor,
                    style = sizes.textStyle
                )
            }
            LinearProgressIndicator(
                modifier = Modifier.vitaminLinearProgressModifier(sizes.strokeSize),
                color = colors.progressColor,
                backgroundColor = colors.backgroundColor,
                strokeCap = StrokeCap.Round
            )
        }
    }

    /**
     * Circular progress indicators displays the length of a process.
     * @param progress The progress of this progress indicator, where 0.0 represents no progress
     * and 1.0 represents full progress
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors of the background, the progress and the optional label
     * @param sizes Different sizes for the progress bar
     * @param content The optional content inside the circular progress bar
     */
    @Composable
    fun Circular(
        progress: Float,
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        sizes: CircularProgressBarSizes = VitaminCircularProgressBarSizes.small(),
        content: (@Composable VitaminCircularContent.() -> Unit)? = null
    ) {
        Box(modifier = modifier.size(sizes.boxSize)) {
            if (content != null) {
                CompositionLocalProvider(
                    LocalTextStyle provides sizes.textStyle,
                    LocalCircularProgress provides progress,
                    LocalContentColor provides colors.labelColor
                ) {
                    Box(modifier = Modifier.padding(sizes.strokeSize + sizes.contentPadding)) {
                        VitaminCircularContent.content()
                    }
                }
            }
            CircularProgressIndicator(
                progress = progress,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(sizes.boxSize),
                color = colors.progressColor,
                strokeWidth = sizes.strokeSize,
                strokeCap = StrokeCap.Round
            )
        }
    }

    /**
     * Circular progress indicators express an unspecified wait time.
     * @param modifier The [Modifier] to be applied to the component
     * @param colors The colors of the background, the progress and the optional label
     * @param sizes Different sizes for the progress bar
     * @param content The optional content inside the circular progress bar
     */
    @Composable
    fun Circular(
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        sizes: CircularProgressBarSizes = VitaminCircularProgressBarSizes.small(),
        content: (@Composable VitaminCircularContent.() -> Unit)? = null
    ) {
        Box(modifier = modifier.size(sizes.boxSize)) {
            if (content != null) {
                CompositionLocalProvider(
                    LocalTextStyle provides sizes.textStyle,
                    LocalCircularProgress provides null,
                    LocalContentColor provides colors.labelColor
                ) {
                    Box(modifier = Modifier.padding(sizes.strokeSize + sizes.contentPadding)) {
                        VitaminCircularContent.content()
                    }
                }
            }
            CircularProgressIndicator(
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(sizes.boxSize),
                color = colors.progressColor,
                strokeWidth = sizes.strokeSize,
                strokeCap = StrokeCap.Round
            )
        }
    }
}

@Composable
private fun LabelText(
    label: String,
    color: Color,
    style: TextStyle,
    modifier: Modifier = Modifier
) = Text(
    text = label,
    style = style,
    color = color,
    modifier = modifier,
    maxLines = 1,
    overflow = TextOverflow.Ellipsis,
)

private fun Modifier.vitaminLinearProgressModifier(height: Dp) = this
    .fillMaxWidth()
    .clip(CircleShape)
    .height(height)

@SuppressWarnings("MagicNumber")
internal fun Float.getProgressInPercent(): String = "${(this * 100).roundToInt()}%"

internal val LocalCircularProgress = compositionLocalOf<Float?> {
    error("No progress provided")
}
