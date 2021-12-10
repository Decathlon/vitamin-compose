package com.decathlon.vitamin.compose.progressbar

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import kotlin.math.roundToInt

object VitaminProgressBars {
    @Composable
    fun Linear(
        progress: Float,
        modifier: Modifier = Modifier,
        size: LinearSizes = VitaminLinearProgressBarSizes.smallSize(),
        label: String? = null
    ) {
        Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(8.dp)) {
            if (label != null) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    LabelText(
                        label = label,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = progress.getProgressInPercent(),
                        style = VitaminTheme.typography.body2
                    )
                }
            }
            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier.vitaminLinearProgressModifier(size),
                color = VitaminTheme.colors.vtmnContentActive,
                backgroundColor = VitaminTheme.colors.vtmnBackgroundTertiary
            )
        }

    }

    @Composable
    fun Linear(
        modifier: Modifier = Modifier,
        size: LinearSizes = VitaminLinearProgressBarSizes.smallSize(),
        label: String? = null
    ) {
        Column(modifier = modifier, verticalArrangement = Arrangement.spacedBy(8.dp)) {
            if (label != null) {
                LabelText(label = label)
            }
            LinearProgressIndicator(
                modifier = Modifier.vitaminLinearProgressModifier(size),
                color = VitaminTheme.colors.vtmnContentActive,
                backgroundColor = VitaminTheme.colors.vtmnBackgroundTertiary
            )
        }
    }

    @Composable
    fun Circular(
        progress: Float,
        modifier: Modifier = Modifier,
        size: CircularSizes = VitaminCircularProgressBarSizes.smallSize(),
        content: (@Composable VitaminCircularContent.() -> Unit)? = null
    ) {
        Box(modifier = modifier.size(size.boxSize)) {
            if (content != null) {
                CompositionLocalProvider(
                    LocalTextStyle provides size.textStyle,
                    LocalCircularProgress provides progress
                ) {
                    Box(modifier = Modifier.padding(size.strokeSize + size.contentPadding)) {
                        VitaminCircularContent.content()
                    }
                }
            }
            CircularProgressIndicator(
                progress = progress,
                modifier = Modifier
                    .align(Alignment.Center)
                    .vitaminCircularProgressModifier(size),
                color = VitaminTheme.colors.vtmnContentActive,
                strokeWidth = size.strokeSize
            )
        }
    }

    @Composable
    fun Circular(
        modifier: Modifier = Modifier,
        size: CircularSizes = VitaminCircularProgressBarSizes.smallSize(),
        content: (@Composable VitaminCircularContent.() -> Unit)? = null
    ) {
        Box(modifier = modifier.size(size.boxSize)) {
            if (content != null) {
                CompositionLocalProvider(
                    LocalTextStyle provides size.textStyle,
                    LocalCircularProgress provides null
                ) {
                    Box(modifier = Modifier.padding(size.strokeSize + size.contentPadding)) {
                        VitaminCircularContent.content()
                    }
                }
            }
            CircularProgressIndicator(
                modifier = Modifier
                    .align(Alignment.Center)
                    .vitaminCircularProgressModifier(size),
                color = VitaminTheme.colors.vtmnContentActive,
                strokeWidth = size.strokeSize
            )
        }
    }
}

@Composable
private fun LabelText(label: String, modifier: Modifier = Modifier) = Text(
    label,
    modifier = modifier.padding(end = 5.dp),
    maxLines = 1,
    overflow = TextOverflow.Ellipsis,
    style = VitaminTheme.typography.body2
)

private fun Modifier.vitaminLinearProgressModifier(linearSize: LinearSizes) = this
    .fillMaxWidth()
    .clip(CircleShape)
    .height(linearSize.size)

private fun Modifier.vitaminCircularProgressModifier(circularSize: CircularSizes) =
    this.size(circularSize.boxSize)

internal fun Float.getProgressInPercent(): String = "${(this * 100).roundToInt()}%"

internal val LocalCircularProgress = compositionLocalOf<Float?> {
    error("No progress provided")
}
