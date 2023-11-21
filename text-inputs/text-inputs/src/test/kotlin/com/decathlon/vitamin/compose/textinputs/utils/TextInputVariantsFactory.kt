package com.decathlon.vitamin.compose.textinputs.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue
import com.decathlon.vitamin.compose.textinputs.TextInputStateColors
import com.decathlon.vitamin.compose.textinputs.VitaminTextInputs

object TextInputVariantsFactory {

    @Suppress("LongMethod")
    @Composable
    fun TextInput(
        variant: Variant,
        colors: TextInputStateColors,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        icon: @Composable (() -> Unit)? = null,
        label: String = "Input",
        value: String = "",
        valueTextFieldValue: TextFieldValue = TextFieldValue("", TextRange.Zero),
        counter: Pair<Int, Int>? = Pair(9999, 9999),
        helperText: String? = "Helper text",
    ) {
        when (variant) {
            Variant.Outlined -> VitaminTextInputs.Outlined(
                modifier = modifier,
                label = label,
                enabled = enabled,
                onValueChange = {
                    // Nothing to do here
                },
                colors = colors,
                icon = icon,
                counter = counter,
                value = value,
                helperText = helperText
            )

            Variant.OutlinedTextFieldValue -> VitaminTextInputs.Outlined(
                modifier = modifier,
                label = label,
                enabled = enabled,
                onValueChange = {
                    // Nothing to do here
                },
                colors = colors,
                icon = icon,
                counter = counter,
                value = valueTextFieldValue,
                helperText = helperText
            )

            Variant.OutlinedDropdown -> VitaminTextInputs.OutlinedDropdown(
                label = label,
                enabled = enabled,
                colors = colors,
                modifier = modifier,
                value = value,
                children = {}
            )
            Variant.Filled -> VitaminTextInputs.Filled(
                modifier = modifier,
                label = label,
                enabled = enabled,
                onValueChange = {
                    // Nothing to do here
                },
                colors = colors,
                icon = icon,
                counter = counter,
                value = value,
                helperText = helperText
            )

            Variant.FilledTextFieldValue -> VitaminTextInputs.Filled(
                modifier = modifier,
                label = label,
                enabled = enabled,
                onValueChange = {
                    // Nothing to do here
                },
                colors = colors,
                icon = icon,
                counter = counter,
                value = valueTextFieldValue,
                helperText = helperText
            )

            Variant.FilledDropdown -> VitaminTextInputs.FilledDropdown(
                label = label,
                enabled = enabled,
                colors = colors,
                modifier = modifier,
                value = value,
                children = {}
            )
        }
    }
}
