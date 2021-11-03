package com.decathlon.vitamin.compose.textinputs

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminTextInputs {
    @Composable
    fun Outlined(
        value: String,
        label: String,
        modifier: Modifier = Modifier,
        icon: @Composable (() -> Unit)? = null,
        helperText: String? = null,
        counter: Pair<Int, Int>? = null,
        colors: TextInputStateColors = TextInputsState.normal(),
        textStyle: TextStyle = VitaminTheme.typography.body2,
        transformation: VisualTransformation = TextInputsTransformations.none,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        singleLine: Boolean = false,
        maxLines: Int = Int.MAX_VALUE,
        isEnabled: Boolean = true,
        onValueChange: (String) -> Unit
    ) {
        VitaminTextInputLayout(
            helperText = helperText,
            counter = counter,
            colors = colors,
            isEnabled = isEnabled,
            textInput = {
                OutlinedTextField(
                    value = value,
                    onValueChange = onValueChange,
                    label = { Text(text = label) },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
                        cursorColor = VitaminTheme.colors.vtmnContentAction,
                        errorCursorColor = VitaminTheme.colors.vtmnContentNegative,
                        textColor = VitaminTheme.colors.vtmnContentPrimary,
                        disabledTextColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        focusedBorderColor = colors.focusBorderColor,
                        unfocusedBorderColor = colors.borderColor,
                        disabledBorderColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        errorBorderColor = colors.borderColor,
                        leadingIconColor = colors.iconColor,
                        disabledLeadingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        errorLeadingIconColor = colors.iconColor,
                        trailingIconColor = colors.iconColor,
                        disabledTrailingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        errorTrailingIconColor = colors.iconColor,
                        focusedLabelColor = colors.focusTextColor,
                        unfocusedLabelColor = colors.textColor,
                        disabledLabelColor = VitaminTheme.colors.vtmnBorderInactive.copy(ContentAlpha.disabled),
                        errorLabelColor = colors.textColor
                    ),
                    textStyle = textStyle,
                    visualTransformation = transformation,
                    interactionSource = interactionSource,
                    keyboardOptions = keyboardOptions,
                    keyboardActions = keyboardActions,
                    singleLine = singleLine,
                    maxLines = maxLines,
                    modifier = Modifier.fillMaxWidth(),
                    enabled = isEnabled,
                    isError = colors.state == State.ERROR,
                    trailingIcon = {
                        if (icon != null && colors.state != State.SUCCESS) {
                            icon()
                        } else if (colors.icon != null && (colors.state == State.SUCCESS || colors.state == State.ERROR)) {
                            Icon(
                                painter = painterResource(id = colors.icon),
                                contentDescription = null
                            )
                        }
                    }
                )
            },
            modifier = modifier
        )
    }

    @Composable
    fun Filled(
        value: String,
        label: String,
        modifier: Modifier = Modifier,
        icon: @Composable (() -> Unit)? = null,
        helperText: String? = null,
        counter: Pair<Int, Int>? = null,
        colors: TextInputStateColors = TextInputsState.normal(),
        textStyle: TextStyle = VitaminTheme.typography.body2,
        transformation: VisualTransformation = TextInputsTransformations.none,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        singleLine: Boolean = false,
        maxLines: Int = Int.MAX_VALUE,
        isEnabled: Boolean = true,
        onValueChange: (String) -> Unit
    ) {
        VitaminTextInputLayout(
            helperText = helperText,
            counter = counter,
            colors = colors,
            isEnabled = isEnabled,
            textInput = {
                TextField(
                    value = value,
                    onValueChange = onValueChange,
                    label = { Text(text = label) },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
                        cursorColor = VitaminTheme.colors.vtmnContentAction,
                        errorCursorColor = VitaminTheme.colors.vtmnContentNegative,
                        textColor = VitaminTheme.colors.vtmnContentPrimary,
                        disabledTextColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        focusedIndicatorColor = colors.focusBorderColor,
                        unfocusedIndicatorColor = colors.borderColor,
                        disabledIndicatorColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        errorIndicatorColor = colors.borderColor,
                        leadingIconColor = colors.iconColor,
                        disabledLeadingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        errorLeadingIconColor = colors.iconColor,
                        trailingIconColor = colors.iconColor,
                        disabledTrailingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        errorTrailingIconColor = colors.iconColor,
                        focusedLabelColor = colors.focusTextColor,
                        unfocusedLabelColor = colors.textColor,
                        disabledLabelColor = VitaminTheme.colors.vtmnActiveTertiary.copy(ContentAlpha.disabled),
                        errorLabelColor = colors.textColor
                    ),
                    textStyle = textStyle,
                    visualTransformation = transformation,
                    interactionSource = interactionSource,
                    keyboardOptions = keyboardOptions,
                    keyboardActions = keyboardActions,
                    singleLine = singleLine,
                    maxLines = maxLines,
                    modifier = Modifier.fillMaxWidth(),
                    enabled = isEnabled,
                    isError = colors.state == State.ERROR,
                    trailingIcon = {
                        if (icon != null && colors.state != State.SUCCESS) {
                            icon()
                        } else if (colors.icon != null && (colors.state == State.SUCCESS || colors.state == State.ERROR)) {
                            Icon(
                                painter = painterResource(id = colors.icon),
                                contentDescription = null
                            )
                        }
                    }
                )
            },
            modifier = modifier
        )
    }
}

@Composable
internal fun VitaminTextInputLayout(
    helperText: String?,
    counter: Pair<Int, Int>?,
    colors: TextInputStateColors,
    isEnabled: Boolean,
    textInput: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        // This is a hack because [Outlined]TextField doesn't expose
        // the label text style configuration. To avoid this restriction,
        // we initialize a MaterialTheme component with the typography of
        // Vitamin.
        MaterialTheme(
            typography = MaterialTheme.typography.copy(
                subtitle1 = VitaminTheme.typography.body2,
                caption = VitaminTheme.typography.caption
            )
        ) {
            textInput()
        }
        Row(modifier = Modifier.padding(vertical = 1.dp, horizontal = 4.dp)) {
            helperText?.let {
                val color = if (colors.state == State.ERROR) colors.textColor
                else if (!isEnabled) colors.helperColor.copy(ContentAlpha.disabled)
                else colors.helperColor
                Text(
                    text = it,
                    style = VitaminTheme.typography.caption,
                    color = color,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 4.dp),
                )
            }
            counter?.let {
                val color = if (!isEnabled) colors.helperColor.copy(ContentAlpha.disabled)
                else colors.helperColor
                Text(
                    text = "${it.first}/${it.second}",
                    style = VitaminTheme.typography.caption,
                    color = color,
                )
            }
        }
    }
}
