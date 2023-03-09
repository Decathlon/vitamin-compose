package com.decathlon.vitamin.compose.chips.impl

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FilterChip
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import com.decathlon.vitamin.compose.chips.ChipSizes
import com.decathlon.vitamin.compose.chips.VitaminChipColors
import com.decathlon.vitamin.compose.chips.VitaminChipSizes
import com.decathlon.vitamin.compose.chips.VtmnSelectableChipColorsContract
import com.decathlon.vitamin.compose.chips.horizontalSpacing
import com.decathlon.vitamin.compose.chips.leadingIconStartSpacing
import com.decathlon.vitamin.compose.chips.trailingIconSpacing
import com.decathlon.vitamin.compose.foundation.NoRippleInteractionSource
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

@Suppress("LongMethod")
@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun VitaminFilterChipImpl(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    selected: Boolean = false,
    colors: VtmnSelectableChipColorsContract = VitaminChipColors.selectable(),
    sizes: ChipSizes = VitaminChipSizes.medium(),
    leadingIcon: (@Composable () -> Unit)? = null,
    leadingContent: (@Composable () -> Unit)? = null,
    selectedIcon: (@Composable () -> Unit)? = null,
    trailingIcon: (@Composable () -> Unit)? = null
) {
    CompositionLocalProvider(
        LocalContentAlpha provides colors.contentColor(
            enabled = enabled, selected = selected
        ).value.alpha
    ) {
        FilterChip(
            modifier = modifier,
            content = {
                if (leadingIcon == null && leadingContent == null) {
                    Spacer(modifier = Modifier.width(sizes.horizontalSpacing()))
                }
                Text(
                    modifier = Modifier.padding(
                        top = sizes.verticalPadding, bottom = sizes.verticalPadding
                    ),
                    text = label,
                    color = colors.contentColor(enabled = enabled, selected = selected).value,
                    fontSize = sizes.fontSize,
                    fontWeight = sizes.fontWeight,
                    maxLines = 1
                )
                if (trailingIcon == null) {
                    Spacer(modifier = Modifier.width(sizes.horizontalSpacing()))
                }
            },
            shape = CircleShape,
            border = BorderStroke(
                sizes.borderWidth,
                colors.borderColor(enabled = enabled, selected = selected).value
            ),
            colors = colors,
            enabled = enabled,
            selected = selected,
            interactionSource = if (enabled) {
                MutableInteractionSource()
            } else {
                NoRippleInteractionSource()
            },
            leadingIcon = leading(enabled, sizes, leadingIcon, leadingContent),
            selectedIcon = selectedIcon,
            trailingIcon = trailing(enabled, sizes, trailingIcon),
            onClick = {
                if (enabled) {
                    onClick()
                }
            }
        )
    }
}

@Composable
private fun leading(
    enabled: Boolean,
    sizes: ChipSizes,
    leadingIcon: @Composable (() -> Unit)?,
    leadingContent: @Composable (() -> Unit)?
): (@Composable () -> Unit)? = if (leadingIcon != null) {
    {
        Box(
            modifier = Modifier
                .padding(start = sizes.leadingIconStartSpacing())
                .size(sizes.iconSize)
                .alpha(if (enabled) 1F else VtmnStatesDisabled)
        ) {
            leadingIcon()
        }
    }
} else if (leadingContent != null) {
    {
        Box(
            modifier = Modifier
                .padding(start = sizes.leadingIconStartSpacing())
                .size(sizes.iconSize)
                .alpha(if (enabled) 1F else VtmnStatesDisabled)
                .clip(shape = CircleShape)
        ) {
            leadingContent()
        }
    }
} else {
    null
}

@Composable
private fun trailing(
    enabled: Boolean,
    sizes: ChipSizes,
    trailingIcon: @Composable (() -> Unit)?
): (@Composable () -> Unit)? = if (trailingIcon != null) {
    {
        Box(
            modifier = Modifier
                .padding(end = sizes.trailingIconSpacing())
                .size(sizes.iconSize)
                .alpha(if (enabled) 1F else VtmnStatesDisabled)
        ) {
            trailingIcon()
        }
    }
} else {
    null
}
