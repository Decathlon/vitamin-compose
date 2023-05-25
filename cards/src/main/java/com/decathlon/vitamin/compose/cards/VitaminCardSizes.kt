package com.decathlon.vitamin.compose.cards

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class CardSizes(
    val elevation: Dp,
    val radius: RoundedCornerShape
)

object VitaminCardSizes {
    @Composable
    fun medium(
        elevation: Dp = 1.dp,
        radius: RoundedCornerShape = VitaminTheme.shapes.radius200
    ): CardSizes = remember(
        elevation,
        radius
    ) {
        CardSizes(
            elevation,
            radius
        )
    }
}
