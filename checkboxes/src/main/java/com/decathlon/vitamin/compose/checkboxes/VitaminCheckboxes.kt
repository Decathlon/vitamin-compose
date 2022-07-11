package com.decathlon.vitamin.compose.checkboxes

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

object VitaminCheckboxes {
    /**
     * The checkbox allow users to select one or more items from a set. Checkboxes can turn an
     * option on or off.
     * @param checked Whether Checkbox is checked or unchecked
     * @param onCheckedChange The callback to be called when the state of the checkbox changed
     * @param modifier The [Modifier] to be applied to this Checkbox
     * @param enabled True if you can check the checkbox, otherwise false
     * @param interactionSource Representing the stream of interaction for the checkbox
     * @param colors The colors of checkbox states and the text at the end in enable and disable mode
     * @param textStyle The typography of the text at the end of the checkbox
     * @param endContent The optional end content displayed after the checkbox
     */
    @Composable
    fun Primary(
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: CheckboxColors = VitaminCheckboxColors.primary(),
        textStyle: TextStyle = VitaminTheme.typography.body2,
        endContent: (@Composable () -> Unit)? = null
    ) {
        Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
                enabled = enabled,
                interactionSource = interactionSource,
                colors = CheckboxDefaults.colors(
                    checkedColor = colors.checkedColor,
                    uncheckedColor = colors.uncheckedColor,
                    checkmarkColor = if (enabled) colors.checkmarkColor else colors.disabledCheckmarkColor,
                    disabledColor = colors.disabledColor,
                    disabledIndeterminateColor = colors.disabledIndeterminateColor
                )
            )
            endContent?.let {
                val alpha = if (enabled) 1f else VtmnStatesDisabled
                Spacer(modifier = Modifier.width(7.dp))
                CompositionLocalProvider(LocalContentAlpha provides alpha) {
                    ProvideTextStyle(value = textStyle.copy(color = colors.contentColor)) {
                        endContent()
                    }
                }
            }
        }
    }
}
