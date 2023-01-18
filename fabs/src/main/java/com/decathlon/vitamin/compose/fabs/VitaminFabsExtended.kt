package com.decathlon.vitamin.compose.fabs

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminFabsExtended {

    /**
     * The FAB extended must be used for primary, positive actions
     * @param text The text inside the FAB extended
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the FAB extended, otherwise false
     * @param icon The optional icon to be displayed inside the FAB extended on the right left side of the text
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon, the text and the component itself
     * @param onClick The callback to be called when the user click on the FAB extended
     */
    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        icon: Painter? = null,
        colors: FabsColors = VitaminFabsColors.primary(),
        sizes: FabExtendedSizes = VitaminFabExtendedSizes.default(),
        onClick: () -> Unit,
    ) {
        FloatingActionButton(
            interactionSource = if (enabled) {
                MutableInteractionSource()
            } else {
                NoRippleInteractionSource()
            },
            elevation = if (enabled) {
                FloatingActionButtonDefaults.elevation()
            } else {
                FloatingActionButtonDefaults.elevation(
                    defaultElevation = 0.dp, pressedElevation = 0.dp
                )
            },
            contentColor = if (enabled) {
                colors.contentColor
            } else {
                colors.disabledContentColor
            },
            backgroundColor = if (enabled) {
                colors.backgroundColor
            } else {
                colors.disabledBackgroundColor
            },
            modifier = modifier.sizeIn(
                minWidth = sizes.height,
                minHeight = sizes.height
            ),
            onClick = {
                if (enabled) {
                    onClick()
                }
            }
        ) {
            val startPadding =
                if (icon == null) {
                    sizes.horizontalPadding
                } else {
                    sizes.iconStartPadding
                }
            Row(
                modifier = Modifier.padding(
                    start = startPadding,
                    end = sizes.horizontalPadding,
                ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (icon != null) {
                    Icon(
                        painter = icon,
                        contentDescription = null,
                        modifier = Modifier.size(sizes.iconSize)
                    )
                    Spacer(Modifier.width(sizes.iconEndPadding))
                }
                Text(text = text, style = sizes.textStyle)
            }
        }
    }
}

@Preview
@Composable
private fun VitaminEnabledFabExtendedPreview() {
    VitaminTheme {
        VitaminFabsExtended.Primary(
            icon = rememberVectorPainter(image = Icons.Filled.Add),
            text = "Label"
        ) {}
    }
}

@Preview
@Composable
private fun VitaminDisabledFabExtendedPreview() {
    VitaminTheme {
        VitaminFabsExtended.Primary(
            icon = rememberVectorPainter(image = Icons.Filled.Add),
            text = "Label",
            enabled = false
        ) {}
    }
}
