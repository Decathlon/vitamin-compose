package com.decathlon.vitamin.compose.progressbar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle

object VitaminCircularContent {
    @Composable
    fun ProgressIndicatorText(
        modifier: Modifier = Modifier,
        textStyle: TextStyle = LocalTextStyle.current
    ) = Box(modifier = modifier.fillMaxSize()) {
        Text(
            text = LocalCircularProgress.current?.getProgressInPercent() ?: "∞",
            style = textStyle,
            modifier = Modifier.align(Alignment.Center)
        )
    }

    @Composable
    fun ImageCircular(
        painter: Painter,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        alignment: Alignment = Alignment.Center,
        contentScale: ContentScale = ContentScale.Crop,
        alpha: Float = DefaultAlpha,
        colorFilter: ColorFilter? = null,
    ) =
        Image(
            painter = painter,
            contentDescription = contentDescription,
            modifier = modifier.fillMaxSize().clip(CircleShape),
            alignment = alignment,
            contentScale = contentScale,
            alpha = alpha,
            colorFilter = colorFilter
        )
}
