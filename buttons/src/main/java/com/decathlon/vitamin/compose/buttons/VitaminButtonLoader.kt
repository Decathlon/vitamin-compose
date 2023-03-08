package com.decathlon.vitamin.compose.buttons

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.VitaminButtonLoader(color: Color) {
    Row(
        modifier = Modifier
            .weight(1f)
            .height(21.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val infiniteTransition = rememberInfiniteTransition()
        val duration = 1000
        val durationRatio = duration / 4
        val animations = (0..2).map { index ->
            val alpha by infiniteTransition.animateFloat(
                initialValue = when (index) {
                    0 -> 1.0f
                    1 -> 0.5f
                    else -> 0.2f
                },
                targetValue = when (index) {
                    0 -> 1.0f
                    1 -> 0.5f
                    else -> 0.2f
                },
                animationSpec = infiniteRepeatable(
                    animation = keyframes {
                        durationMillis = duration
                        when (index) {
                            0 -> {
                                1.0f at 0
                                0.5f at 1 * durationRatio
                                0.2f at 2 * durationRatio
                                0.5f at 3 * durationRatio
                                1.0f at 4 * durationRatio
                            }
                            1 -> {
                                0.5f at 0
                                0.2f at 1 * durationRatio
                                0.5f at 2 * durationRatio
                                1.0f at 3 * durationRatio
                                0.5f at 4 * durationRatio
                            }
                            else -> {
                                0.2f at 0
                                0.5f at 1 * durationRatio
                                1.0f at 2 * durationRatio
                                0.5f at 3 * durationRatio
                                0.2f at 4 * durationRatio
                            }
                        }
                    },
                    repeatMode = RepeatMode.Reverse
                )
            )
            alpha
        }

        Box(
            Modifier
                .size(8.dp)
                .graphicsLayer(alpha = animations[0])
                .background(color, CircleShape)
        )
        Box(
            Modifier
                .size(8.dp)
                .graphicsLayer(alpha = animations[1])
                .background(color, CircleShape)
        )
        Box(
            Modifier
                .size(8.dp)
                .graphicsLayer(alpha = animations[2])
                .background(color, CircleShape)
        )
    }
}