package com.decathlon.vitamin.compose.chips

import androidx.compose.animation.animateColorAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.ui.graphics.Color
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled


@Stable
interface ChipColors {
    /**
     * Represents the background color for this chip, depending on [selected] & [enabled].
     *
     * @param selected whether the chip is selected
     * @param enabled whether the chip is enabled
     */
    @Composable
    fun backgroundColor(selected: Boolean, enabled: Boolean): State<Color>

    /**
     * Represents the content color for this chip, depending on [selected] & [enabled].
     *
     * @param selected whether the chip is selected
     * @param enabled whether the chip is enabled
     */
    @Composable
    fun contentColor(selected: Boolean, enabled: Boolean): State<Color>

    /**
     * Represents the border color for this chip, depending on [selected] & [enabled].
     *
     * @param selected whether the chip is selected
     * @param enabled whether the chip is enabled
     */
    @Composable
    fun borderColor(selected: Boolean, enabled: Boolean): State<Color>

}

@Immutable
private data class DefaultChipColors(
    private val selectedContentColor: Color,
    private val unSelectedContentColor: Color,
    private val selectedDisabledContentColor: Color,
    private val unSelectedDisabledContentColor: Color,

    private val selectedBackgroundColor: Color,
    private val unSelectedBackgroundColor: Color,
    private val selectedDisabledBackgroundColor: Color,
    private val unSelectedDisabledBackgroundColor: Color,

    private val selectedBorderColor: Color,
    private val unSelectedBorderColor: Color,
    private val selectedDisabledBorderColor: Color,
    private val unSelectedDisabledBorderColor: Color
) : ChipColors {

    @Composable
    override fun backgroundColor(selected: Boolean, enabled: Boolean): State<Color> {
        return animateColorAsState(
            when {
                selected && enabled -> selectedBackgroundColor
                selected && !enabled -> selectedDisabledBackgroundColor
                !selected && enabled -> unSelectedBackgroundColor
                else -> unSelectedDisabledBackgroundColor
            }
        )
    }

    @Composable
    override fun contentColor(selected: Boolean, enabled: Boolean): State<Color> {
        return animateColorAsState(
            when {
                selected && enabled -> selectedContentColor
                selected && !enabled -> selectedDisabledContentColor
                !selected && enabled -> unSelectedContentColor
                else -> unSelectedDisabledContentColor
            }
        )
    }

    @Composable
    override fun borderColor(selected: Boolean, enabled: Boolean): State<Color> {
        return animateColorAsState(
            when {
                selected && enabled -> selectedBorderColor
                selected && !enabled -> selectedDisabledBorderColor
                !selected && enabled -> unSelectedBorderColor
                else -> unSelectedDisabledBorderColor
            }
        )
    }
}

object VitaminChipColors {
    /**
     * Creates a [ChipColors] that represents the default background and content colors used in
     * a [VitaminChips].
     *
     * @param selectedContentColor the content color of this [VitaminChips] when selected & enabled
     * @param selectedBackgroundColor the background color of this [VitaminChips] when selected & enabled
     * @param unSelectedContentColor the content color of this [VitaminChips] when not selected & enabled
     * @param unSelectedBackgroundColor the background color of this [VitaminChips] when not selected & enabled
     * @param unSelectedBorderColor the border color of this [VitaminChips] when not selected & enabled
     * @param selectedDisabledContentColor the content color of this [VitaminChips] when selected & disabled
     * @param selectedDisabledBackgroundColor the background color of this [VitaminChips] when selected & disabled
     * @param unSelectedDisabledContentColor the content color of this [VitaminChips] when not selected & disabled
     * @param unSelectedDisabledBackgroundColor the background color of this [VitaminChips] when not selected & disabled
     * @param unSelectedDisabledBorderColor the border color of this [VitaminChips] when not selected & disabled
     */
    @Composable
    fun default(
        selectedContentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
        unSelectedContentColor: Color = VitaminTheme.colors.vtmnContentAction,
        selectedDisabledContentColor: Color = VitaminTheme.colors.vtmnContentPrimaryReversed,
        unSelectedDisabledContentColor: Color = unSelectedContentColor.copy(alpha = VtmnStatesDisabled),

        selectedBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundBrandPrimary,
        unSelectedBackgroundColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        selectedDisabledBackgroundColor: Color = selectedBackgroundColor.copy(alpha = VtmnStatesDisabled),
        unSelectedDisabledBackgroundColor: Color = unSelectedBackgroundColor.copy(alpha = VtmnStatesDisabled),

        selectedBorderColor: Color = Color.Transparent,
        unSelectedBorderColor: Color = VitaminTheme.colors.vtmnBorderInactive,
        selectedDisabledBorderColor: Color = Color.Transparent,
        unSelectedDisabledBorderColor: Color = unSelectedBorderColor.copy(alpha = VtmnStatesDisabled)
    ): ChipColors = DefaultChipColors(
        selectedContentColor = selectedContentColor,
        unSelectedContentColor = unSelectedContentColor,
        selectedDisabledContentColor = selectedDisabledContentColor,
        unSelectedDisabledContentColor = unSelectedDisabledContentColor,

        selectedBackgroundColor = selectedBackgroundColor,
        unSelectedBackgroundColor = unSelectedBackgroundColor,
        selectedDisabledBackgroundColor = selectedDisabledBackgroundColor,
        unSelectedDisabledBackgroundColor = unSelectedDisabledBackgroundColor,

        selectedBorderColor = selectedBorderColor,
        unSelectedBorderColor = unSelectedBorderColor,
        selectedDisabledBorderColor = selectedDisabledBorderColor,
        unSelectedDisabledBorderColor = unSelectedDisabledBorderColor
    )
}

