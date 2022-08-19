package com.decathlon.vitamin.compose.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

object ButtonVariantsFactory {

    @Suppress("LongMethod")
    @Composable
    fun Button(
        variant: VitaminButtonsPrimaryTest.Variant,
        size: ButtonSizes,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        text: String = "My Button"
    ) {
        when(variant) {
            VitaminButtonsPrimaryTest.Variant.Primary -> VitaminButtons.Primary(
                text = text,
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            VitaminButtonsPrimaryTest.Variant.PrimaryReversed -> VitaminButtons.PrimaryReversed(
                text = text,
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            VitaminButtonsPrimaryTest.Variant.Secondary -> VitaminButtons.Secondary(
                text = text,
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            VitaminButtonsPrimaryTest.Variant.Tertiary -> VitaminButtons.Tertiary(
                text = text,
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            VitaminButtonsPrimaryTest.Variant.Ghost -> VitaminButtons.Ghost(
                text = text,
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            VitaminButtonsPrimaryTest.Variant.GhostReversed -> VitaminButtons.GhostReversed(
                text = text,
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            VitaminButtonsPrimaryTest.Variant.Conversion -> VitaminButtons.Conversion(
                text = text,
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
        }
    }
}
