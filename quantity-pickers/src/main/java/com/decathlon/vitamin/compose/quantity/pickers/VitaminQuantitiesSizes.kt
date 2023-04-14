package com.decathlon.vitamin.compose.quantity.pickers

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Immutable
data class QuantitySizes(
    val height: Dp,
    val width: Dp,
    val textStyle: TextStyle,
    val shape: RoundedCornerShape,
    val helperTextStyle: TextStyle,
    val helperIconSize: Dp
)

object VitaminQuantitiesSizes {

    @Composable
    fun primary(
        height: Dp = 48.dp,
        width: Dp = 156.dp,
        textStyle: TextStyle = VitaminTheme.typography.text2,
        shape: RoundedCornerShape = VitaminTheme.shapes.radius100,
        helperTextStyle: TextStyle = VitaminTheme.typography.text3,
        helperIconSize: Dp = 16.dp
    ): QuantitySizes =
        remember(
            height,
            width,
            textStyle,
            shape,
            helperTextStyle,
            helperIconSize
        ) {
            QuantitySizes(
                height = height,
                width = width,
                textStyle = textStyle,
                shape = shape,
                helperTextStyle = helperTextStyle,
                helperIconSize = helperIconSize
            )
        }
}
