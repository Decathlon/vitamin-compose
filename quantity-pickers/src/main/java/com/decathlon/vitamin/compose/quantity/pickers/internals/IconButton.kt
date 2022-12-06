package com.decathlon.vitamin.compose.quantity.pickers.internals

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled
import com.decathlon.vitamin.compose.quantity.pickers.QuantityColors
import com.decathlon.vitamin.compose.quantity.pickers.VtmnStatesEnabled

@Composable
internal fun IconButton(
    painter: Painter,
    contentDescription: String,
    enabled: Boolean,
    colors: QuantityColors,
    shape: CornerBasedShape,
    onClick: () -> Unit
) {
    val alpha = if (enabled) VtmnStatesEnabled else VtmnStatesDisabled
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxHeight()
            .width(48.dp),
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colors.backgroundColor,
            disabledBackgroundColor = colors.backgroundColor.copy(alpha = VtmnStatesDisabled)
        ),
        shape = shape,
        border = BorderStroke(
            width = 1.dp,
            color = colors.buttonsBorderColor.copy(alpha = alpha)
        ),
        elevation = ButtonDefaults.elevation(0.dp)
    ) {
        Icon(
            painter = painter,
            contentDescription = contentDescription,
            tint = VitaminTheme.colors.vtmnContentAction.copy(alpha = alpha)
        )
    }
}
