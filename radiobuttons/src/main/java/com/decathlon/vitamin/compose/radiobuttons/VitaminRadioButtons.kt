package com.decathlon.vitamin.compose.radiobuttons

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

object VitaminRadioButtons {
    /**
     * The primary radio button allow users to select one option from a set.
     * @param selected Whether radio button is selected or unselected
     * @param onClick The callback to be called when the state of the radio button changed
     * @param modifier The [Modifier] to be applied to the component
     * @param enabled True if you can check the radio button, otherwise false
     * @param interactionSource Representing the stream of interaction for the radio button
     * @param colors The colors of the radio button and the optional label
     * @param sizes The sizes for the radio button, paddings and optional label
     * @param endContent The optional end content displayed after the radio button
     */
    @Composable
    fun Primary(
        selected: Boolean,
        onClick: (() -> Unit)?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: RadioButtonColors = VitaminRadioButtonColors.primary(),
        sizes: RadioButtonSizes = VitaminRadioButtonSizes.medium(),
        endContent: (@Composable () -> Unit)? = null
    ) {
        // Add click on row if endContent is set
        val rowModifier = endContent?.let {
            modifier
                .clip(RoundedCornerShape(4.dp))
                .clickable(
                    enabled = true,
                    onClick = { onClick?.invoke() },
                    interactionSource = interactionSource,
                    indication = LocalIndication.current
                )
                .padding(sizes.contentPadding)
        } ?: run { modifier }
        val radioColors = RadioButtonDefaults.colors(
            selectedColor = colors.selectedColor,
            unselectedColor = colors.unselectedColor,
            disabledColor = if (selected) colors.disabledSelectedColor
            else colors.disabledUnselectedColor
        )
        Row(modifier = rowModifier, verticalAlignment = Alignment.CenterVertically) {
            endContent?.let {
                RadioButton(
                    selected = selected,
                    onClick = null,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    colors = radioColors
                )
                val alpha = if (enabled) 1f else VtmnStatesDisabled
                Spacer(modifier = Modifier.width(sizes.labelStartPadding))
                CompositionLocalProvider(LocalContentAlpha provides alpha) {
                    ProvideTextStyle(
                        value = sizes.textStyle.copy(color = colors.labelColor)
                    ) {
                        endContent()
                    }
                }
            } ?: run {
                RadioButton(
                    selected = selected,
                    onClick = onClick,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    colors = radioColors
                )
            }
        }
    }
}
