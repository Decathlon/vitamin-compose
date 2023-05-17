package com.decathlon.vitamin.compose.radiobuttons

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics
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
        val radioColors = RadioButtonDefaults.colors(
            selectedColor = colors.selectedColor,
            unselectedColor = colors.unselectedColor,
            disabledColor = if (selected) colors.disabledSelectedColor
            else colors.disabledUnselectedColor
        )

        Row(
            modifier = modifier
                .selectable(
                    selected = selected,
                    interactionSource = interactionSource,
                    indication = LocalIndication.current,
                    enabled = enabled,
                    role = Role.RadioButton,
                    onClick = {
                        onClick?.invoke()
                    }
                )
                .semantics(mergeDescendants = true) {}
                .sizeIn(
                    minWidth = sizes.minimumSize,
                    minHeight = sizes.minimumSize
                )
                .padding(all = sizes.padding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            RadioButton(
                selected = selected,
                onClick = null,
                enabled = enabled,
                colors = radioColors
            )

            endContent?.let {
                val alpha = if (enabled) 1f else VtmnStatesDisabled
                Spacer(modifier = Modifier.width(sizes.labelStartPadding))
                CompositionLocalProvider(LocalContentAlpha provides alpha) {
                    ProvideTextStyle(
                        value = sizes.textStyle.copy(color = colors.labelColor)
                    ) {
                        endContent()
                    }
                }
            }
        }
    }
}
