package com.decathlon.vitamin.compose.buttons.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.decathlon.vitamin.compose.progressbars.CircularProgressBarSizes
import com.decathlon.vitamin.compose.progressbars.LinearProgressBarSizes
import com.decathlon.vitamin.compose.progressbars.ProgressBarColors
import com.decathlon.vitamin.compose.progressbars.VitaminCircularContent
import com.decathlon.vitamin.compose.progressbars.VitaminProgressBarColors
import com.decathlon.vitamin.compose.progressbars.VitaminProgressBars

object ProgressVariantsFactory {

    @Suppress("LongMethod")
    @Composable
    fun CircularProgress(
        size: CircularProgressBarSizes,
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        progress: Float? = null,
        content: (@Composable VitaminCircularContent.() -> Unit)? = null
    ) {

        if (progress == null) {
            VitaminProgressBars.Circular(
                sizes = size,
                colors = colors,
                content = content,
                modifier = modifier
            )
        } else {
            VitaminProgressBars.Circular(
                sizes = size,
                colors = colors,
                content = content,
                progress = progress,
                modifier = modifier
            )
        }
    }

    @Suppress("LongMethod")
    @Composable
    fun LinearProgress(
        size: LinearProgressBarSizes,
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        progress: Float? = null,
        label: String? = null
    ) {

        if (progress == null) {
            VitaminProgressBars.Linear(
                sizes = size,
                colors = colors,
                label = label,
                modifier = modifier
            )
        } else {
            VitaminProgressBars.Linear(
                sizes = size,
                colors = colors,
                progress = progress,
                label = label,
                modifier = modifier
            )
        }

    }
}
