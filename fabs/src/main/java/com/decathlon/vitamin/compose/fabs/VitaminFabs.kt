package com.decathlon.vitamin.compose.fabs

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.size
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminFabs {

    /**
     * The FAB must be used for primary, positive actions
     * @param icon The icon to be displayed inside the FAB
     * @param contentDescription The icon content description for accessibility
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the FAB, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon and the component itself
     * @param onClick The callback to be called when the user click on the FAB
     */
    @Composable
    fun Primary(
        icon: Painter,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: FabsColors = VitaminFabsColors.primary(),
        sizes: FabSizes = VitaminFabSizes.default(),
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
                    defaultElevation = 0.dp,
                    pressedElevation = 0.dp,
                    focusedElevation = 0.dp,
                    hoveredElevation = 0.dp
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
            modifier = modifier
                .size(sizes.size),
            onClick = {
                if (enabled) {
                    onClick()
                }
            }
        ) {
            Icon(
                painter = icon,
                contentDescription = contentDescription,
                modifier = Modifier.size(sizes.iconSize)
            )
        }
    }
}

@Preview
@Composable
private fun VitaminEnabledFabPreview() {
    VitaminTheme {
        VitaminFabs.Primary(
            icon = rememberVectorPainter(image = Icons.Filled.Add),
            contentDescription = "Add"
        ) {}
    }
}

@Preview
@Composable
private fun VitaminDisabledFabPreview() {
    VitaminTheme {
        VitaminFabs.Primary(
            icon = rememberVectorPainter(image = Icons.Filled.Add),
            contentDescription = "Add",
            enabled = false
        ) {}
    }
}

@Preview
@Composable
private fun VitaminEnabledMiniFabPreview() {
    VitaminTheme {
        VitaminFabs.Primary(
            sizes = VitaminFabSizes.mini(),
            icon = rememberVectorPainter(image = Icons.Filled.Add),
            contentDescription = "Add"
        ) {}
    }
}

@Preview
@Composable
private fun VitaminDisabledMiniFabPreview() {
    VitaminTheme {
        VitaminFabs.Primary(
            sizes = VitaminFabSizes.mini(),
            icon = rememberVectorPainter(image = Icons.Filled.Add),
            contentDescription = "Add",
            enabled = false
        ) {}
    }
}
