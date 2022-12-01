package com.decathlon.vitamin.compose.quantity.pickers.internals

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled
import com.decathlon.vitamin.compose.quantity.pickers.QuantityColors
import com.decathlon.vitamin.compose.quantity.pickers.State
import com.decathlon.vitamin.compose.quantity.pickers.VtmnStatesEnabled

@Composable
internal fun MiddleTextField(
    modifier: Modifier,
    value: String,
    addEnabled: Boolean,
    subtractEnabled: Boolean,
    editTextEnabled: Boolean,
    colors: QuantityColors,
    textStyle: TextStyle,
    keyboardOptions: KeyboardOptions,
    keyboardActions: KeyboardActions,
    onValueChange: (String) -> Unit
) {
    val focus = remember { mutableStateOf(false) }
    val dividerEnable = if (addEnabled || subtractEnabled) VtmnStatesEnabled else VtmnStatesDisabled
    Column(modifier = modifier) {
        Divider(color = colors.buttonsBorderColor.copy(alpha = dividerEnable))
        val boxModifier = when {
            colors.state == State.ERROR -> {
                Modifier
                    .weight(1.0f)
                    .border(border = BorderStroke(1.dp, colors.editTextBorderColor))
            }
            focus.value -> {
                Modifier
                    .weight(1.0f)
                    .border(border = BorderStroke(1.dp, colors.focusBorderColor))
            }
            else -> {
                Modifier.weight(1.0f)
            }
        }
        val enabled = editTextEnabled && (addEnabled || subtractEnabled)
        Box(
            modifier = boxModifier,
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = value,
                modifier = Modifier
                    .onFocusChanged { focusState ->
                        focus.value = focusState.isFocused
                    },
                onValueChange = onValueChange,
                enabled = enabled,
                textStyle = textStyle.copy(
                    textAlign = TextAlign.Center,
                    color = if (enabled.not()) colors.disabledTextColor
                    else if (focus.value) colors.focusTextColor
                    else colors.textColor
                ),
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                singleLine = true
            )
        }
        Divider(color = colors.buttonsBorderColor.copy(alpha = dividerEnable))
    }
}
