package com.decathlon.vitamin.compose.chips

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import com.decathlon.vitamin.compose.chips.impl.VitaminChipImpl
import com.decathlon.vitamin.compose.chips.impl.VitaminFilterChipImpl

object VitaminChips {

    /**
     * Action chip offers actions related to the content related to.
     * It appears dynamically and contextually in the interface.
     *
     * @param label Text to be displayed into the Chip
     * @param [Modifier] to be applied to the component
     * @param enabled True if you can click on the Chip, otherwise false
     * @param colors Colors to be applied to the Chip
     * @param sizes Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
     * @param onClick Callback to be called when the action Chip is clicked
     * @param leadingIcon Optional Icon Content to be displayed before label into the Chip
     */
    @Composable
    fun Action(
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        onClick: () -> Unit,
        leadingIcon: (@Composable () -> Unit)? = null
    ) {
        VitaminChipImpl(
            label = label,
            modifier = modifier.semantics { role = Role.Button },
            enabled = enabled,
            colors = colors,
            sizes = sizes,
            onClick = onClick,
            leadingIcon = leadingIcon
        )
    }

    /**
     * Input chips represent complex information used in fields
     * or filters, like person, place, thing, attributes, or text.
     *
     * @param label Text to be displayed into the Chip
     * @param [Modifier] to be applied to the component
     * @param enabled True if you can click on the Chip, otherwise false
     * @param colors Colors to be applied to the Chip
     * @param sizes Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
     * @param onClick Callback to be called when the Chip is clicked
     * @param leadingIcon Icon Content to be displayed before label into the Chip
     * @param leadingContent Image Content to be displayed before label into the Chip
     */
    @Composable
    fun Input(
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: SelectableChipColors = VitaminChipColors.selectable(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        onClick: () -> Unit,
        leadingIcon: (@Composable () -> Unit)? = null,
        leadingContent: (@Composable () -> Unit)? = null
    ) {
        val onClickLabel = stringResource(id = R.string.vtmn_chip_input_click_description)
        VitaminFilterChipImpl(
            label = label,
            modifier = modifier.clearAndSetSemantics {
                role = Role.Button
                contentDescription = label
                onClick(
                    label = onClickLabel,
                    action = null
                )
            },
            enabled = enabled,
            colors = colors,
            sizes = sizes,
            onClick = onClick,
            leadingIcon = leadingIcon,
            leadingContent = leadingContent,
            trailingIcon = { VitaminChipButtons.Close(contentDescription = null) }
        )
    }

    /**
     * Filter chips are used as filters for list or content.
     * Multiple chips can be selected or unselected.
     * A selected Filter Chip displays a tick as start content.
     *
     * @param label Text to be displayed into the Chip
     * @param [Modifier] to be applied to the component
     * @param enabled True if you can click on the Chip, otherwise false
     * @param selected If True, leading tick Icon will be displayed.
     * @param colors Colors to be applied to the Chip
     * @param sizes Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
     * @param onClick Callback to be called when the Chip is clicked
     */
    @Composable
    fun Filter(
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        selected: Boolean = false,
        colors: SelectableChipColors = VitaminChipColors.selectable(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        onClick: () -> Unit
    ) {
        VitaminFilterChipImpl(
            label = label,
            modifier = modifier,
            enabled = enabled,
            selected = selected,
            colors = colors,
            sizes = sizes,
            onClick = onClick,
            leadingIcon = if (selected) {
                {
                    VitaminChipButtons.Check(contentDescription = null)
                }
            } else {
                null
            }
        )
    }

    /**
     * Single choice chips allow the selection of a single chip from a set of options.
     *
     * @param label Text to be displayed into the Chip
     * @param [Modifier] to be applied to the component
     * @param enabled True if you can click on the Chip, otherwise false
     * @param selected If True, leading tick Icon will be displayed.
     * @param colors Colors to be applied to the Chip
     * @param sizes Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
     * @param onClick Callback to be called when the Chip is clicked
     */
    @Composable
    fun SingleChoice(
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        selected: Boolean = false,
        colors: SelectableChipColors = VitaminChipColors.selectable(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        onClick: () -> Unit
    ) {
        VitaminFilterChipImpl(
            label = label,
            modifier = modifier,
            enabled = enabled,
            selected = selected,
            colors = colors,
            sizes = sizes,
            onClick = onClick
        )
    }
}
