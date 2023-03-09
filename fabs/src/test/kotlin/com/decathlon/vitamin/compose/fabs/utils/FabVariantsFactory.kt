package com.decathlon.vitamin.compose.fabs.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import com.decathlon.vitamin.compose.fabs.FabExtendedSizes
import com.decathlon.vitamin.compose.fabs.FabSizes
import com.decathlon.vitamin.compose.fabs.VitaminFabs
import com.decathlon.vitamin.compose.fabs.VitaminFabsExtended

object FabVariantsFactory {

    @Suppress("LongMethod")
    @Composable
    fun Fab(
        icon: Painter,
        contentDescription: String,
        variant: Variant,
        size: FabSizes,
        modifier: Modifier = Modifier,
        enabled: Boolean = true
    ) {
        when (variant) {
            Variant.Primary -> VitaminFabs.Primary(
                icon = icon,
                contentDescription = contentDescription,
                sizes = size,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
        }
    }

    @Suppress("LongMethod")
    @Composable
    fun FabExtended(
        variant: Variant,
        size: FabExtendedSizes,
        modifier: Modifier = Modifier,
        text: String = "Label",
        icon: Painter? = null,
        enabled: Boolean = true
    ) {
        when (variant) {
            Variant.Primary -> VitaminFabsExtended.Primary(
                text = text,
                icon = icon,
                sizes = size,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
        }
    }
}
