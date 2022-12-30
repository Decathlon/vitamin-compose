package com.decathlon.vitamin.compose.buttons.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import com.decathlon.vitamin.compose.buttons.ButtonSizes
import com.decathlon.vitamin.compose.buttons.IconButtonSizes
import com.decathlon.vitamin.compose.buttons.IconSide
import com.decathlon.vitamin.compose.buttons.VitaminButtons
import com.decathlon.vitamin.compose.buttons.VitaminButtonsPrimaryTest
import com.decathlon.vitamin.compose.buttons.VitaminIconButtons
import com.decathlon.vitamin.compose.buttons.VitaminIconButtonsPrimaryTest

object ButtonVariantsFactory {

    @Suppress("LongMethod")
    @Composable
    fun Button(
        variant: Variant,
        size: ButtonSizes,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        text: String = "My Button"
    ) {
        when (variant) {
            Variant.Primary -> VitaminButtons.Primary(
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
            Variant.PrimaryReversed -> VitaminButtons.PrimaryReversed(
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
            Variant.Secondary -> VitaminButtons.Secondary(
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
            Variant.Tertiary -> VitaminButtons.Tertiary(
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
            Variant.Ghost -> VitaminButtons.Ghost(
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
            Variant.GhostReversed -> VitaminButtons.GhostReversed(
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
            Variant.Conversion -> VitaminButtons.Conversion(
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

    @Suppress("LongMethod")
    @Composable
    fun IconButton(
        variant: Variant,
        size: IconButtonSizes,
        modifier: Modifier = Modifier,
        icon: Painter,
        contentDescription: String?,
        enabled: Boolean = true
    ) {
        when (variant) {
            Variant.Primary -> VitaminIconButtons.Primary(
                sizes = size,
                icon = icon,
                contentDescription = contentDescription,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            Variant.PrimaryReversed -> VitaminIconButtons.PrimaryReversed(
                sizes = size,
                icon = icon,
                contentDescription = contentDescription,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            Variant.Secondary -> VitaminIconButtons.Secondary(
                sizes = size,
                icon = icon,
                contentDescription = contentDescription,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            Variant.Tertiary -> VitaminIconButtons.Tertiary(
                sizes = size,
                icon = icon,
                contentDescription = contentDescription,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            Variant.Ghost -> VitaminIconButtons.Ghost(
                sizes = size,
                icon = icon,
                contentDescription = contentDescription,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            Variant.GhostReversed -> VitaminIconButtons.GhostReversed(
                sizes = size,
                icon = icon,
                contentDescription = contentDescription,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
            Variant.Conversion -> VitaminIconButtons.Conversion(
                sizes = size,
                icon = icon,
                contentDescription = contentDescription,
                enabled = enabled,
                onClick = {
                    // Nothing to do here
                },
                modifier = modifier
            )
        }
    }
}
