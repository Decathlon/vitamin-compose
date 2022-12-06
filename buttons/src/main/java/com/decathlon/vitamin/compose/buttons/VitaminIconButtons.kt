package com.decathlon.vitamin.compose.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.Icon
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminIconButtons {
    /**
     * The primary button should only be used once per view (not including a modal dialog),
     * these buttons have the most emphasis.
     * @param icon The icon to be displayed inside the button container
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the button, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Primary(
        icon: Painter,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.primary(),
        sizes: IconButtonSizes = VitaminIconButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = VitaminTheme.ripples.brand,
        onClick: () -> Unit
    ) = VitaminIconButtonImpl(
        modifier = modifier,
        icon = icon,
        enabled = enabled,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        onClick = onClick
    )

    /**
     * The primary reversed should be used for primary actions on pictures or dark backgrounds
     * @param icon The icon to be displayed inside the button container
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the button, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun PrimaryReversed(
        icon: Painter,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.primaryReversed(),
        sizes: IconButtonSizes = VitaminIconButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = VitaminTheme.ripples.brandReversed,
        onClick: () -> Unit
    ) = VitaminIconButtonImpl(
        modifier = modifier,
        icon = icon,
        enabled = enabled,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        onClick = onClick
    )

    /**
     * The secondary button is the standard button for most use cases. The outlined styling
     * places less emphasis on these buttons
     * @param icon The icon to be displayed inside the button container
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the button, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Secondary(
        icon: Painter,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.secondary(),
        sizes: IconButtonSizes = VitaminIconButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.primary(),
        ripple: RippleTheme = VitaminTheme.ripples.primary,
        onClick: () -> Unit
    ) = VitaminIconButtonImpl(
        modifier = modifier,
        icon = icon,
        enabled = enabled,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        onClick = onClick
    )

    /**
     * The tertiary button is usually used for miscellaneous actions: the action is important,
     * but may not be what the user is looking to do right then
     * @param icon The icon to be displayed inside the button container
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the button, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Tertiary(
        icon: Painter,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.tertiary(),
        sizes: IconButtonSizes = VitaminIconButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = VitaminTheme.ripples.tertiary,
        onClick: () -> Unit
    ) = VitaminIconButtonImpl(
        modifier = modifier,
        icon = icon,
        enabled = enabled,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        elevation = null,
        onClick = onClick
    )

    /**
     * The ghost button should be used for secondary actions when combined with a primary button
     * or when you need to list multiple actions in one single view as a preference page
     * @param icon The icon to be displayed inside the button container
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the button, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Ghost(
        icon: Painter,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.ghost(),
        sizes: IconButtonSizes = VitaminIconButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = VitaminTheme.ripples.primaryReversed,
        onClick: () -> Unit
    ) = VitaminIconButtonImpl(
        modifier = modifier,
        icon = icon,
        enabled = enabled,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        elevation = null,
        onClick = onClick
    )

    /**
     * The ghost reversed should be used on pictures or dark backgrounds
     * @param icon The icon to be displayed inside the button container
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the button, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun GhostReversed(
        icon: Painter,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.ghostReversed(),
        sizes: IconButtonSizes = VitaminIconButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = VitaminTheme.ripples.primaryReversed,
        onClick: () -> Unit
    ) = VitaminIconButtonImpl(
        modifier = modifier,
        icon = icon,
        enabled = enabled,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        elevation = null,
        onClick = onClick
    )

    /**
     * The conversion button must be used for transactional actions
     * @param icon The icon to be displayed inside the button container
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can click on the button, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the icon, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Conversion(
        icon: Painter,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.conversion(),
        sizes: IconButtonSizes = VitaminIconButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = VitaminTheme.ripples.accent,
        onClick: () -> Unit
    ) = VitaminIconButtonImpl(
        modifier = modifier,
        icon = icon,
        enabled = enabled,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        onClick = onClick
    )
}

@Composable
private fun VitaminIconButtonImpl(
    icon: Painter?,
    enabled: Boolean,
    colors: ButtonColors,
    sizes: IconButtonSizes,
    ripple: RippleTheme,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    borders: ButtonBorders = VitaminButtonBorders.none(),
    elevation: ButtonElevation? = ButtonDefaults.elevation(
        defaultElevation = 0.dp,
        pressedElevation = 0.dp,
        disabledElevation = 0.dp
    )
) {
    val iconButton = @Composable {
        icon?.let {
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(sizes.iconSize),
                tint = colors.contentColor(enabled = enabled).value
            )
        }
    }
    CompositionLocalProvider(LocalRippleTheme provides ripple) {
        Button(
            enabled = enabled,
            modifier = modifier
                .width(sizes.height)
                .height(sizes.height),
            colors = colors,
            border = if (enabled) borders.stroke else borders.disabled,
            contentPadding = PaddingValues(),
            elevation = elevation,
            onClick = onClick
        ) {
            iconButton()
        }
    }
}

@Preview
@Composable
private fun VitaminButtonPreview() {
    VitaminTheme {
        VitaminIconButtons.Primary(icon = painterResource(id = R.drawable.ic_vtmn_android_line)) {}
    }
}

@Preview
@Composable
private fun VitaminPrimaryReversedIconButtonPreview() {
    VitaminTheme {
        VitaminIconButtons.PrimaryReversed(icon = painterResource(id = R.drawable.ic_vtmn_android_line)) {}
    }
}

@Preview
@Composable
private fun VitaminSecondaryIconButtonPreview() {
    VitaminTheme {
        VitaminIconButtons.Secondary(icon = painterResource(id = R.drawable.ic_vtmn_android_line)) {}
    }
}

@Preview
@Composable
private fun VitaminTertiaryIconButtonPreview() {
    VitaminTheme {
        VitaminIconButtons.Tertiary(icon = painterResource(id = R.drawable.ic_vtmn_android_line)) {}
    }
}

@Preview
@Composable
private fun VitaminGhostIconButtonPreview() {
    VitaminTheme {
        VitaminIconButtons.Ghost(icon = painterResource(id = R.drawable.ic_vtmn_android_line)) {}
    }
}

@Preview
@Composable
private fun VitaminGhostReversedButtonPreview() {
    VitaminTheme {
        VitaminIconButtons.GhostReversed(icon = painterResource(id = R.drawable.ic_vtmn_android_line)) {}
    }
}

@Preview
@Composable
private fun VitaminConversionButtonPreview() {
    VitaminTheme {
        VitaminIconButtons.Conversion(icon = painterResource(id = R.drawable.ic_vtmn_android_line)) {}
    }
}
