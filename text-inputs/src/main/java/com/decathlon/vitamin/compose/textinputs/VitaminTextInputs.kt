package com.decathlon.vitamin.compose.textinputs

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
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
    /**
     * Outlined text input to get an input value from the user.
     * @param value The value of your text input
     * @param label The label to be displayed inside the text input container and pushed at the top
     * of text input when the component takes the focus
     * @param modifier The `Modifier` to be applied to the component
     * @param icon The optional trailing icon to be displayed at the end of the text input container
     * @param helperText The optional helper text to be displayed at the start bottom outside the text input container
     * @param counter The optional counter to be displayed the the end bottom outside the text input container
     * @param colors The color to notify your user if they are in normal, error or success state
     * @param textStyle The typography of the text inside the text input
     * @param transformation Transforms the visual representation of the input value
     * @param interactionSource Representing the stream of interaction for the text input
     * @param keyboardActions Software keyboard options that contains such as KeyboardType and ImeAction
     * @param keyboardOptions When the text input emit an IME action, the corresponding callback is called
     * @param singleLine True if the text input doesn't extend their height, otherwise, false
     * @param maxLines The number of maximum lines the text input can have if the `singleLine` is set to `true`
     * @param isEnabled True if you can type in the text input, otherwise false
     * @param readOnly True if you don't want open the keyboard when the user click on the text field
     * @param onValueChange The callback to be called when the user type a new character
     */
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
        readOnly: Boolean = false,
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
                        disabledBorderColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
                            ContentAlpha.disabled
                        ),
                        errorBorderColor = colors.borderColor,
                        leadingIconColor = colors.iconColor,
                        disabledLeadingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
                            ContentAlpha.disabled
                        ),
                        errorLeadingIconColor = colors.iconColor,
                        trailingIconColor = colors.iconColor,
                        disabledTrailingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
                            ContentAlpha.disabled
                        ),
                        errorTrailingIconColor = colors.iconColor,
                        focusedLabelColor = colors.focusTextColor,
                        unfocusedLabelColor = colors.textColor,
                        disabledLabelColor = VitaminTheme.colors.vtmnBorderInactive.copy(
                            ContentAlpha.disabled
                        ),
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
                    readOnly = readOnly,
                    isError = colors.state == State.ERROR,
                    trailingIcon = {
                        if (icon != null && colors.state != State.SUCCESS) {
                            icon()
                        } else if (
                            colors.icon != null &&
                            (colors.state == State.SUCCESS || colors.state == State.ERROR)
                        ) {
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

    /**
     * Filled text input to get an input value from the user.
     * @param value The value of your text input
     * @param label The label to be displayed inside the text input container and pushed at the top
     * of text input when the component takes the focus
     * @param modifier The `Modifier` to be applied to the component
     * @param icon The optional trailing icon to be displayed at the end of the text input container
     * @param helperText The optional helper text to be displayed at the start bottom outside the text input container
     * @param counter The optional counter to be displayed the the end bottom outside the text input container
     * @param colors The color to notify your user if they are in normal, error or success state
     * @param textStyle The typography of the text inside the text input
     * @param transformation Transforms the visual representation of the input value
     * @param interactionSource Representing the stream of interaction for the text input
     * @param keyboardActions Software keyboard options that contains such as KeyboardType and ImeAction
     * @param keyboardOptions When the text input emit an IME action, the corresponding callback is called
     * @param singleLine True if the text input doesn't extend their height, otherwise, false
     * @param maxLines The number of maximum lines the text input can have if the `singleLine` is set to `true`
     * @param isEnabled True if you can type in the text input, otherwise false
     * @param readOnly True if you don't want open the keyboard when the user click on the text field
     * @param onValueChange The callback to be called when the user type a new character
     */
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
        readOnly: Boolean = false,
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
                        disabledIndicatorColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
                            ContentAlpha.disabled
                        ),
                        errorIndicatorColor = colors.borderColor,
                        leadingIconColor = colors.iconColor,
                        disabledLeadingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
                            ContentAlpha.disabled
                        ),
                        errorLeadingIconColor = colors.iconColor,
                        trailingIconColor = colors.iconColor,
                        disabledTrailingIconColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
                            ContentAlpha.disabled
                        ),
                        errorTrailingIconColor = colors.iconColor,
                        focusedLabelColor = colors.focusTextColor,
                        unfocusedLabelColor = colors.textColor,
                        disabledLabelColor = VitaminTheme.colors.vtmnActiveTertiary.copy(
                            ContentAlpha.disabled
                        ),
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
                    readOnly = readOnly,
                    trailingIcon = {
                        if (icon != null && colors.state != State.SUCCESS) {
                            icon()
                        } else if (
                            colors.icon != null &&
                            (colors.state == State.SUCCESS || colors.state == State.ERROR)
                        ) {
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
