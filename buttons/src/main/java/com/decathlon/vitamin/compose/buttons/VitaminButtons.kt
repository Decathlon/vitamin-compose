package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminButtons {
    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        size: ButtonSizes = VitaminButtonSizes.mediumSize(),
        onClick: () -> Unit
    ) = VitaminButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        size = size,
        modifier = modifier,
        onClick = onClick
    )

    @Composable
    fun PrimaryReversed(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        size: ButtonSizes = VitaminButtonSizes.mediumSize(),
        onClick: () -> Unit
    ) = VitaminButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        colors = VitaminButtonsColors.primaryReversed,
        ripples = VitaminButtonsRipples.primaryReversed,
        border = VitaminButtonsBorders.primaryReversed,
        size = size,
        modifier = modifier,
        onClick = onClick
    )

    @Composable
    fun Secondary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        size: ButtonSizes = VitaminButtonSizes.mediumSize(),
        onClick: () -> Unit
    ) = VitaminButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        colors = VitaminButtonsColors.secondary,
        ripples = VitaminButtonsRipples.secondary,
        border = VitaminButtonsBorders.secondary,
        size = size,
        modifier = modifier,
        onClick = onClick
    )

    @Composable
    fun Tertiary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        size: ButtonSizes = VitaminButtonSizes.mediumSize(),
        onClick: () -> Unit
    ) = VitaminButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        colors = VitaminButtonsColors.tertiary,
        ripples = VitaminButtonsRipples.tertiary,
        elevation = null,
        size = size,
        modifier = modifier,
        onClick = onClick
    )

    @Composable
    fun Ghost(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        size: ButtonSizes = VitaminButtonSizes.mediumSize(),
        onClick: () -> Unit
    ) = VitaminButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        colors = VitaminButtonsColors.ghost,
        ripples = VitaminButtonsRipples.ghost,
        elevation = null,
        size = size,
        modifier = modifier,
        onClick = onClick
    )

    @Composable
    fun GhostReversed(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        size: ButtonSizes = VitaminButtonSizes.mediumSize(),
        onClick: () -> Unit
    ) = VitaminButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        colors = VitaminButtonsColors.ghostReversed,
        ripples = VitaminButtonsRipples.ghostReversed,
        elevation = null,
        size = size,
        modifier = modifier,
        onClick = onClick
    )

    @Composable
    fun Conversion(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        size: ButtonSizes = VitaminButtonSizes.mediumSize(),
        onClick: () -> Unit
    ) = VitaminButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        colors = VitaminButtonsColors.conversion,
        ripples = VitaminButtonsRipples.conversion,
        size = size,
        modifier = modifier,
        onClick = onClick
    )
}

@Composable
internal fun VitaminButton(
    text: String,
    modifier: Modifier = Modifier,
    icon: Painter? = null,
    iconSide: IconSide = IconSide.LEFT,
    enabled: Boolean = true,
    colors: ButtonColors = VitaminButtonsColors.primary,
    ripples: RippleTheme = VitaminButtonsRipples.primary,
    border: DefaultBorderStroke = VitaminButtonsBorders.none,
    size: ButtonSizes = VitaminButtonSizes.mediumSize(),
    elevation: ButtonElevation? = ButtonDefaults.elevation(
        defaultElevation = 0.dp,
        pressedElevation = 0.dp,
        disabledElevation = 0.dp
    ),
    style: TextStyle = VitaminTheme.typography.button,
    onClick: () -> Unit
) {
    val iconButton = @Composable {
        icon?.let {
            if (iconSide == IconSide.RIGHT) Spacer(Modifier.width(ButtonIconPadding))
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(size.iconSize),
                tint = colors.contentColor(enabled = enabled).value
            )
            if (iconSide == IconSide.LEFT) Spacer(Modifier.width(ButtonIconPadding))
        }
    }
    CompositionLocalProvider(LocalRippleTheme provides ripples) {
        Button(
            enabled = enabled,
            modifier = modifier
                .widthIn(min = size.minWidth)
                .height(size.height),
            colors = colors,
            border = if (enabled) border.stroke else border.disabled,
            contentPadding = size.contentPadding,
            elevation = elevation,
            onClick = onClick
        ) {
            if (iconSide == IconSide.LEFT) iconButton()
            Text(
                text = text,
                style = style,
                fontSize = size.fontSize,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1
            )
            if (iconSide == IconSide.RIGHT) iconButton()
        }
    }
}

enum class IconSide { LEFT, RIGHT }

private val ButtonIconPadding = 8.dp

@Preview
@Composable
fun VitaminButtonPreview() {
    VitaminTheme {
        VitaminButtons.Primary(text = "Gift selection") {}
    }
}

@Preview
@Composable
fun VitaminPrimaryReversedButtonPreview() {
    VitaminTheme {
        VitaminButtons.PrimaryReversed(text = "Gift selection") {}
    }
}

@Preview
@Composable
fun VitaminSecondaryButtonPreview() {
    VitaminTheme {
        VitaminButtons.Secondary(text = "Gift selection") {}
    }
}

@Preview
@Composable
fun VitaminTertiaryButtonPreview() {
    VitaminTheme {
        VitaminButtons.Tertiary(text = "Gift selection") {}
    }
}

@Preview
@Composable
fun VitaminGhostButtonPreview() {
    VitaminTheme {
        VitaminButtons.Ghost(text = "Gift selection") {}
    }
}

@Preview
@Composable
fun VitaminGhostReversedButtonPreview() {
    VitaminTheme {
        VitaminButtons.Ghost(text = "Gift selection") {}
    }
}

@Preview
@Composable
fun VitaminConversionButtonPreview() {
    VitaminTheme {
        VitaminButtons.Conversion(text = "Gift selection") {}
    }
}
