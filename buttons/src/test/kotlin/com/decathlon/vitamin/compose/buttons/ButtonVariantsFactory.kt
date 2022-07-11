package com.decathlon.vitamin.compose.buttons

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

object ButtonVariantsFactory {
    @Composable
    fun Button(
        variant: VitaminButtonsPrimaryTest.Variant,
        size: ButtonSizes,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
    ) {
        when(variant) {
            VitaminButtonsPrimaryTest.Variant.Primary -> VitaminButtons.Primary(
                text = "My Button",
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                }
            )
            VitaminButtonsPrimaryTest.Variant.PrimaryReversed -> VitaminButtons.PrimaryReversed(
                text = "My Button",
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                }
            )
            VitaminButtonsPrimaryTest.Variant.Secondary -> VitaminButtons.Secondary(
                text = "My Button",
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                }
            )
            VitaminButtonsPrimaryTest.Variant.Tertiary -> VitaminButtons.Tertiary(
                text = "My Button",
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                }
            )
            VitaminButtonsPrimaryTest.Variant.Ghost -> VitaminButtons.Ghost(
                text = "My Button",
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                }
            )
            VitaminButtonsPrimaryTest.Variant.GhostReversed -> VitaminButtons.GhostReversed(
                text = "My Button",
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                }
            )
            VitaminButtonsPrimaryTest.Variant.Conversion -> VitaminButtons.Conversion(
                text = "My Button",
                sizes = size,
                icon = icon,
                iconSide = iconSide,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                }
            )
        }
    }
}
