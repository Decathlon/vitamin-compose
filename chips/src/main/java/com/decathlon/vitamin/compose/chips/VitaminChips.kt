package com.decathlon.vitamin.compose.chips

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

object VitaminChips {

    /**
     * Action chip offers actions related to the content related to.
     * It appears dynamically and contextually in the interface.
     *
     * @param label Text to be displayed into the Chip
     * @param onClick Callback to be called when the action Chip is clicked
     * @param `Modifier` to be applied to the component
     * @param startIcon Optional Content to be displayed before label into the Chip
     * @param enabled True if you can click on the Chip, otherwise false
     * @param colors Colors to be applied to the Chip
     * @param sizes Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
     * @param ripple The ripple effect to be applied to the Chip
     */
    @ExperimentalMaterialApi
    @Composable
    fun Action(
        label: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        startIcon: (@Composable () -> Unit)? = null,
        enabled: Boolean = true,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        ripple: RippleTheme = VitaminChipRipples.default() // todo VitaminTheme.ripples.brand
    ) {
        VitaminChipImpl(
            label = label,
            onClick = onClick,
            selected = false,
            modifier = modifier,
            startContent = startIcon,
            enabled = enabled,
            colors = colors,
            sizes = sizes,
            ripple = ripple
        )
    }

    /**
     * Filter chips are used as filters for list or content.
     * Multiple chips can be selected or unselected.
     * A selected Filter Chip displays a tick as start content.
     *
     * @param label Text to be displayed into the Chip
     * @param onClick Callback to be called when the action Chip is clicked
     * @param selected True if the Chip is selected, otherwise false
     * @param `Modifier` to be applied to the component
     * @param enabled True if you can click on the Chip, otherwise false
     * @param colors Colors to be applied to the Chip
     * @param sizes Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
     * @param ripple The ripple effect to be applied to the Chip
     */
    @ExperimentalMaterialApi
    @Composable
    fun Filter(
        label: String,
        onClick: (Boolean) -> Unit,
        selected: Boolean,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        ripple: RippleTheme = VitaminChipRipples.default() // todo VitaminTheme.ripples.brand
    ) {
        VitaminChipImpl(
            label = label,
            onClick = { onClick(selected) },
            selected = selected,
            modifier = modifier,
            enabled = enabled,
            startContent = if (selected) {
                {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_vtmn_check_line),
                        contentDescription = null,
                        modifier = Modifier.size(sizes.iconSize)
                    )
                }
            } else {
                null
            },
            colors = colors,
            sizes = sizes,
            ripple = ripple
        )
    }

    /**
     * Input chips represent complex information used in fields or filters, like person, place, thing, attributes, or text.
     * An icon or an image can be used to give information about the kind of information.
     *
     * @param label Text to be displayed into the Chip
     * @param onClick Callback to be called when the action Chip is clicked
     * @param selected True if the Chip is selected, otherwise false
     * @param `Modifier` to be applied to the component
     * @param enabled True if you can click on the Chip, otherwise false
     * @param startContent Optional Content to be displayed before label into the Chip
     * @param removeContent Optional Content to be displayed after label into the Chip
     * @param colors Colors to be applied to the Chip
     * @param sizes Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
     * @param ripple The ripple effect to be applied to the Chip
     */
    @ExperimentalMaterialApi
    @Composable
    fun Input(
        label: String,
        onClick: (Boolean) -> Unit,
        selected: Boolean,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        startContent: (@Composable () -> Unit)? = null,
        removeContent: (@Composable VitaminChipButtons.() -> Unit)? = null,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        ripple: RippleTheme = VitaminChipRipples.default() // todo VitaminTheme.ripples.brand
    ) {
        VitaminChipImpl(
            label = label,
            onClick = { onClick(selected) },
            selected = selected,
            modifier = modifier,
            enabled = enabled,
            startContent = startContent,
            endContent = removeContent,
            colors = colors,
            sizes = sizes,
            ripple = ripple
        )
    }

    /**
     * Chips appear dynamically as a group of multiple interactive elements.
     * With chips, users can filter content, enter information, make selections or trigger actions.
     *
     * @param label Text to be displayed into the Chip
     * @param onClick Callback to be called when the action Chip is clicked
     * @param selected True if the Chip is selected, otherwise false
     * @param `Modifier` to be applied to the component
     * @param enabled True if you can click on the Chip, otherwise false
     * @param startContent Optional Content to be displayed before label into the Chip
     * @param endContent Optional Content to be displayed after label into the Chip
     * @param colors Colors to be applied to the Chip
     * @param sizes Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
     * @param ripple The ripple effect to be applied to the Chip
     */
    @ExperimentalMaterialApi
    @Composable
    private fun VitaminChipImpl(
        label: String,
        onClick: () -> Unit,
        selected: Boolean,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        startContent: (@Composable () -> Unit)? = null,
        endContent: (@Composable VitaminChipButtons.() -> Unit)? = null,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        ripple: RippleTheme = VitaminChipRipples.default() // todo VitaminTheme.ripples.brand
    ) {
        val backgroundColor by colors.backgroundColor(
            selected = selected,
            enabled = enabled
        )
        val borderColor by colors.borderColor(
            selected = selected,
            enabled = enabled
        )
        val border = BorderStroke(sizes.borderWidth, borderColor)

        val contentColor = colors.contentColor(
            selected = selected,
            enabled = enabled
        ).value

        CompositionLocalProvider(
            LocalRippleTheme provides ripple,
            LocalContentAlpha provides contentColor.alpha
        ) {
            Surface(
                modifier = modifier,
                border = border,
                color = backgroundColor,
                contentColor = contentColor,
                shape = CircleShape,
                enabled = enabled,
                onClick = onClick,
                indication = rememberRipple()
            ) {
                Row(
                    modifier = Modifier
                        .height(IntrinsicSize.Min)
                        .wrapContentSize()
                        .padding(
                            top = sizes.verticalPadding,
                            bottom = sizes.verticalPadding,
                            start = sizes.horizontalPadding,
                            end = sizes.horizontalPadding
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    startContent?.let {
                        Box(
                            modifier = Modifier
                                .size(sizes.iconSize)
                                .alpha(if (enabled) 1F else VtmnStatesDisabled)
                                .clip(shape = CircleShape)
                        ) {
                            startContent()
                        }
                    }
                    Text(
                        modifier = Modifier.padding(
                            start = sizes.innerSpacing,
                            end = sizes.innerSpacing
                        ),
                        text = label,
                        color = contentColor,
                        fontSize = sizes.fontSize,
                        fontWeight = sizes.fontWeight,
                        maxLines = 1
                    )
                    endContent?.let {
                        Box(
                            modifier = Modifier
                                .size(sizes.iconSize)
                        ) {
                            VitaminChipButtons.endContent()
                        }
                    }
                }
            }
        }
    }
}

