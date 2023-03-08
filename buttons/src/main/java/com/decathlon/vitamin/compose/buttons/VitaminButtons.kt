package com.decathlon.vitamin.compose.buttons

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminButtons {
    /**
     * The primary button should only be used once per view (not including a modal dialog),
     * these buttons have the most emphasis.
     * @param text The text inside the button
     * @param modifier The [Modifier] to be applied to the component
     * @param icon The optional icon to be displayed at the start or the end of the button container
     * @param iconSide If an icon is added, you can configure the side at the start or end of the button
     * @param enabled True if you can click on the button, otherwise false
     * @param loading True if the button display a loader and disable the onClick callback, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the text, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = VitaminButtonsColors.primary(),
        sizes: ButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = LocalRippleTheme.current,
        onClick: () -> Unit
    ) = VitaminButtonImpl(
        text = text,
        modifier = modifier,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        loading = loading,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        onClick = onClick
    )

    /**
     * The primary reversed should be used for primary actions on pictures or dark backgrounds
     * @param text The text inside the button
     * @param modifier The [Modifier] to be applied to the component
     * @param icon The optional icon to be displayed at the start or the end of the button container
     * @param iconSide If an icon is added, you can configure the side at the start or end of the button
     * @param enabled True if you can click on the button, otherwise false
     * @param loading True if the button display a loader and disable the onClick callback, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the text, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun PrimaryReversed(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = VitaminButtonsColors.primaryReversed(),
        sizes: ButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = LocalRippleTheme.current,
        onClick: () -> Unit
    ) = VitaminButtonImpl(
        text = text,
        modifier = modifier,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        loading = loading,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        onClick = onClick
    )

    /**
     * The secondary button is the standard button for most use cases. The outlined styling
     * places less emphasis on these buttons
     * @param text The text inside the button
     * @param modifier The [Modifier] to be applied to the component
     * @param icon The optional icon to be displayed at the start or the end of the button container
     * @param iconSide If an icon is added, you can configure the side at the start or end of the button
     * @param enabled True if you can click on the button, otherwise false
     * @param loading True if the button display a loader and disable the onClick callback, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the text, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Secondary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = VitaminButtonsColors.secondary(),
        sizes: ButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.primary(),
        ripple: RippleTheme = LocalRippleTheme.current,
        onClick: () -> Unit
    ) = VitaminButtonImpl(
        text = text,
        modifier = modifier,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        loading = loading,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        onClick = onClick
    )

    /**
     * The tertiary button is usually used for miscellaneous actions: the action is important,
     * but may not be what the user is looking to do right then
     * @param text The text inside the button
     * @param modifier The [Modifier] to be applied to the component
     * @param icon The optional icon to be displayed at the start or the end of the button container
     * @param iconSide If an icon is added, you can configure the side at the start or end of the button
     * @param enabled True if you can click on the button, otherwise false
     * @param loading True if the button display a loader and disable the onClick callback, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the text, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Tertiary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = VitaminButtonsColors.tertiary(),
        sizes: ButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = LocalRippleTheme.current,
        onClick: () -> Unit
    ) = VitaminButtonImpl(
        text = text,
        modifier = modifier,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        loading = loading,
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
     * @param text The text inside the button
     * @param modifier The [Modifier] to be applied to the component
     * @param icon The optional icon to be displayed at the start or the end of the button container
     * @param iconSide If an icon is added, you can configure the side at the start or end of the button
     * @param enabled True if you can click on the button, otherwise false
     * @param loading True if the button display a loader and disable the onClick callback, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the text, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Ghost(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = VitaminButtonsColors.ghost(),
        sizes: ButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = LocalRippleTheme.current,
        onClick: () -> Unit
    ) = VitaminButtonImpl(
        text = text,
        modifier = modifier,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        loading = loading,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        elevation = null,
        onClick = onClick
    )

    /**
     * The ghost reversed should be used on pictures or dark backgrounds
     * @param text The text inside the button
     * @param modifier The [Modifier] to be applied to the component
     * @param icon The optional icon to be displayed at the start or the end of the button container
     * @param iconSide If an icon is added, you can configure the side at the start or end of the button
     * @param enabled True if you can click on the button, otherwise false
     * @param loading True if the button display a loader and disable the onClick callback, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the text, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun GhostReversed(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = VitaminButtonsColors.ghostReversed(),
        sizes: ButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = LocalRippleTheme.current,
        onClick: () -> Unit
    ) = VitaminButtonImpl(
        text = text,
        modifier = modifier,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        loading = loading,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        elevation = null,
        onClick = onClick
    )

    /**
     * The conversion button must be used for transactional actions
     * @param text The text inside the button
     * @param modifier The [Modifier] to be applied to the component
     * @param icon The optional icon to be displayed at the start or the end of the button container
     * @param iconSide If an icon is added, you can configure the side at the start or end of the button
     * @param enabled True if you can click on the button, otherwise false
     * @param loading True if the button display a loader and disable the onClick callback, otherwise false
     * @param colors The colors of the background and the content in enabled and disabled
     * @param sizes The sizes for the text, paddings and width/height
     * @param borders The width and color of the border in enabled and disabled
     * @param ripple The ripple effect applied on the component
     * @param onClick The callback to be called when the user click on the button
     */
    @Composable
    fun Conversion(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean = false,
        colors: ButtonColors = VitaminButtonsColors.conversion(),
        sizes: ButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonBorders.none(),
        ripple: RippleTheme = LocalRippleTheme.current,
        onClick: () -> Unit
    ) = VitaminButtonImpl(
        text = text,
        modifier = modifier,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        loading = loading,
        colors = colors,
        sizes = sizes,
        borders = borders,
        ripple = ripple,
        onClick = onClick
    )
}

enum class IconSide { LEFT, RIGHT }

private val ButtonIconPadding = 8.dp

@Composable
internal fun VitaminButtonImpl(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean,
    loading: Boolean,
    colors: ButtonColors,
    sizes: ButtonSizes,
    ripple: RippleTheme,
    onClick: () -> Unit,
    icon: Painter? = null,
    iconSide: IconSide? = null,
    borders: ButtonBorders = VitaminButtonBorders.none(),
    elevation: ButtonElevation? = ButtonDefaults.elevation(
        defaultElevation = 0.dp,
        pressedElevation = 0.dp,
        disabledElevation = 0.dp
    )
) {
    val iconButton = @Composable {
        icon?.let {
            val spacerModifier = Modifier.width(ButtonIconPadding)
            if (iconSide == IconSide.RIGHT) Spacer(spacerModifier)
            Icon(
                painter = icon,
                contentDescription = null,
                modifier = Modifier.size(sizes.iconSize),
                tint = colors.contentColor(enabled = enabled).value
            )
            if (iconSide == IconSide.LEFT) Spacer(spacerModifier)
        }
    }
    CompositionLocalProvider(LocalRippleTheme provides ripple) {
        Button(
            enabled = enabled,
            modifier = modifier
                .widthIn(min = sizes.minWidth)
                .height(sizes.height),
            colors = colors,
            border = if (enabled) borders.stroke else borders.disabled,
            contentPadding = sizes.contentPadding,
            elevation = elevation,
            onClick = { if (!loading) onClick.invoke() }
        ) {
            ButtonContent(
                text = text,
                loading = loading,
                sizes = sizes,
                contentColor = colors.contentColor(enabled = enabled).value,
                iconSide= iconSide,
                iconButton = iconButton)
        }
    }
}

@Composable
private fun RowScope.ButtonContent(
    text: String,
    loading: Boolean = false,
    sizes: ButtonSizes,
    contentColor: Color,
    iconSide: IconSide? = null,
    iconButton: @Composable () -> Unit?
) {
    Crossfade(targetState = loading, label = "cross fade") { loadingState ->
        when {
            loadingState -> VitaminButtonLoader(contentColor)
            else -> Row(
                Modifier.weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally)
            ) {
                if (iconSide == IconSide.LEFT) iconButton()
                Text(
                    modifier = Modifier.weight(1f, fill = false),
                    text = text,
                    style = sizes.textStyle,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
                if (iconSide == IconSide.RIGHT) iconButton()
            }
        }
    }
}

@Preview
@Composable
private fun VitaminButtonPreview() {
    VitaminTheme {
        VitaminButtons.Primary(text = "Gift selection") {}
    }
}

@Preview
@Composable
private fun VitaminButtonLoadingPreview() {
    VitaminTheme {
        VitaminButtons.Primary(text = "Gift selection", loading = true) {}
    }
}

@Preview
@Composable
private fun VitaminPrimaryReversedButtonPreview() {
    VitaminTheme {
        VitaminButtons.PrimaryReversed(text = "Gift selection") {}
    }
}

@Preview
@Composable
private fun VitaminPrimaryReversedButtonLoadingPreview() {
    VitaminTheme {
        VitaminButtons.PrimaryReversed(text = "Gift selection", loading = true) {}
    }
}

@Preview
@Composable
private fun VitaminSecondaryButtonPreview() {
    VitaminTheme {
        VitaminButtons.Secondary(text = "Gift selection") {}
    }
}

@Preview
@Composable
private fun VitaminSecondaryButtonLoadingPreview() {
    VitaminTheme {
        VitaminButtons.Secondary(text = "Gift selection", loading = true) {}
    }
}

@Preview
@Composable
private fun VitaminTertiaryButtonPreview() {
    VitaminTheme {
        VitaminButtons.Tertiary(text = "Gift selection") {}
    }
}

@Preview
@Composable
private fun VitaminTertiaryButtonLoadingPreview() {
    VitaminTheme {
        VitaminButtons.Tertiary(text = "Gift selection", loading = true) {}
    }
}

@Preview
@Composable
private fun VitaminGhostButtonPreview() {
    VitaminTheme {
        VitaminButtons.Ghost(text = "Gift selection") {}
    }
}

@Preview
@Composable
private fun VitaminGhostButtonLoadingPreview() {
    VitaminTheme {
        VitaminButtons.Ghost(text = "Gift selection", loading = true) {}
    }
}

@Preview
@Composable
private fun VitaminGhostReversedButtonPreview() {
    VitaminTheme {
        VitaminButtons.GhostReversed(text = "Gift selection") {}
    }
}

@Preview
@Composable
private fun VitaminGhostReversedButtonLoadingPreview() {
    VitaminTheme {
        VitaminButtons.GhostReversed(text = "Gift selection", loading = true) {}
    }
}

@Preview
@Composable
private fun VitaminConversionButtonPreview() {
    VitaminTheme {
        VitaminButtons.Conversion(text = "Gift selection") {}
    }
}

@Preview
@Composable
private fun VitaminConversionButtonLoadingPreview() {
    VitaminTheme {
        VitaminButtons.Conversion(text = "Gift selection", loading = true) {}
    }
}
