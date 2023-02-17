package com.decathlon.vitamin.compose.quantity.pickers.internals

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
internal fun HelperText(
    text: String,
    textStyle: TextStyle,
    textColor: Color,
    icon: ImageVector,
    iconColor: Color,
    iconSize: Dp
) {
    Row(
        modifier = Modifier
            .padding(top = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier
                .size(iconSize),
            painter = rememberVectorPainter(icon),
            contentDescription = null,
            tint = iconColor
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = text,
            style = textStyle,
            color = textColor
        )
    }
}
