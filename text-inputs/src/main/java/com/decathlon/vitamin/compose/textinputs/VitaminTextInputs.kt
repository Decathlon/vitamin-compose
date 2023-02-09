package com.decathlon.vitamin.compose.textinputs

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.dropdown.VitaminMenuItems
import com.decathlon.vitamin.compose.dropdown.VitaminMenus.Dropdown
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.ChevronDown

object VitaminTextInputs {
    /**
     * Outlined text input to get an input value from the user.
     * @param value The value of your text input
     * @param label The label to be displayed inside the text input container and pushed at the top
     * of text input when the component takes the focus
     * @param onValueChange The callback to be called when the user type a new character
     * @param modifier The `Modifier` to be applied to the component
     * @param helperText The optional helper text to be displayed at the start bottom outside the text input container
     * @param counter The optional counter to be displayed the the end bottom outside the text input container
     * @param singleLine True if the text input doesn't extend their height, otherwise, false
     * @param maxLines The number of maximum lines the text input can have if the `singleLine` is set to `true`
     * @param readOnly True if you don't want open the keyboard when the user click on the text field
     * @param enabled True if you can type in the text input, otherwise false
     * @param transformation Transforms the visual representation of the input value
     * @param keyboardOptions When the text input emit an IME action, the corresponding callback is called
     * @param keyboardActions Software keyboard options that contains such as KeyboardType and ImeAction
     * @param interactionSource Representing the stream of interaction for the text input
     * @param colors The color to notify your user if they are in normal, error or success state
     * @param textStyle The typography of the text inside the text input
     * @param icon The optional trailing icon to be displayed at the end of the text input container
     */
    @Composable
    fun Outlined(
        value: String,
        label: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        helperText: String? = null,
        counter: Pair<Int, Int>? = null,
        singleLine: Boolean = false,
        maxLines: Int = Int.MAX_VALUE,
        readOnly: Boolean = false,
        enabled: Boolean = true,
        transformation: VisualTransformation = TextInputsTransformations.none,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: TextInputStateColors = TextInputsState.normal(),
        textStyle: TextStyle = VitaminTheme.typography.text2,
        icon: @Composable (() -> Unit)? = null
    ) {
        VitaminTextInputLayoutImpl(
            helperText = helperText,
            counter = counter,
            colors = colors,
            enabled = enabled,
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
                    enabled = enabled,
                    readOnly = readOnly,
                    isError = colors.state == State.ERROR,
                    trailingIcon = {
                        if (icon != null && colors.state != State.SUCCESS) {
                            icon()
                        } else if (
                            colors.imageVector != null &&
                            (colors.state == State.SUCCESS || colors.state == State.ERROR)
                        ) {
                            Icon(
                                imageVector = colors.imageVector,
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
     * Outlined dropdown to get the input from a dropdown menu.
     * @param value The value of your text input
     * @param label The label to be displayed inside the text input container and pushed at the top
     * of text input when the component takes the focus
     * @param modifier The `Modifier` to be applied to the component
     * @param enabled True if you can type in the text input, otherwise false
     * @param expanded State to open or close the dropdown menu
     * @param interactionSource Representing the stream of interaction for the text input
     * @param colors The color to notify your user if they are in normal, error or success state
     * @param textStyle The typography of the text inside the text input
     * @param children Declare your dropdown menu item components inside your dropdown
     */
    @Composable
    fun OutlinedDropdown(
        value: String,
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: TextInputStateColors = TextInputsState.normal(),
        textStyle: TextStyle = VitaminTheme.typography.text2,
        children: @Composable VitaminMenuItems.() -> Unit
    ) {
        var mTextFieldSize by remember { mutableStateOf(Size.Zero) }
        Dropdown(
            expanded = expanded,
            anchor = {
                Outlined(
                    value = value,
                    label = label,
                    modifier = Modifier.onGloballyPositioned {
                        mTextFieldSize = it.size.toSize()
                    },
                    colors = colors,
                    textStyle = textStyle,
                    readOnly = true,
                    singleLine = true,
                    maxLines = 1,
                    enabled = enabled,
                    interactionSource = interactionSource,
                    onValueChange = {},
                    icon = {
                        IconButton(onClick = { expanded.value = true }) {
                            Icon(
                                imageVector = VitaminIcons.Line.ChevronDown,
                                contentDescription = stringResource(id = R.string.vtmn_text_inputs_open_menu)
                            )
                        }
                    }
                )
            },
            modifier = modifier.width(with(LocalDensity.current) { mTextFieldSize.width.toDp() }),
            children = children,
            interactionSource = interactionSource
        )
    }

    /**
     * Filled text input to get an input value from the user.
     * @param value The value of your text input
     * @param label The label to be displayed inside the text input container and pushed at the top
     * of text input when the component takes the focus
     * @param onValueChange The callback to be called when the user type a new character
     * @param modifier The `Modifier` to be applied to the component
     * @param helperText The optional helper text to be displayed at the start bottom outside the text input container
     * @param counter The optional counter to be displayed the the end bottom outside the text input container
     * @param maxLines The number of maximum lines the text input can have if the `singleLine` is set to `true`
     * @param singleLine True if the text input doesn't extend their height, otherwise, false
     * @param readOnly True if you don't want open the keyboard when the user click on the text field
     * @param enabled True if you can type in the text input, otherwise false
     * @param transformation Transforms the visual representation of the input value
     * @param keyboardOptions When the text input emit an IME action, the corresponding callback is called
     * @param keyboardActions Software keyboard options that contains such as KeyboardType and ImeAction
     * @param interactionSource Representing the stream of interaction for the text input
     * @param colors The color to notify your user if they are in normal, error or success state
     * @param textStyle The typography of the text inside the text input
     * @param icon The optional trailing icon to be displayed at the end of the text input container
     */
    @Composable
    fun Filled(
        value: String,
        label: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        helperText: String? = null,
        counter: Pair<Int, Int>? = null,
        maxLines: Int = Int.MAX_VALUE,
        singleLine: Boolean = false,
        readOnly: Boolean = false,
        enabled: Boolean = true,
        transformation: VisualTransformation = TextInputsTransformations.none,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: TextInputStateColors = TextInputsState.normal(),
        textStyle: TextStyle = VitaminTheme.typography.text2,
        icon: @Composable (() -> Unit)? = null,
    ) {
        VitaminTextInputLayoutImpl(
            helperText = helperText,
            counter = counter,
            colors = colors,
            enabled = enabled,
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
                    enabled = enabled,
                    isError = colors.state == State.ERROR,
                    readOnly = readOnly,
                    trailingIcon = {
                        if (icon != null && colors.state != State.SUCCESS) {
                            icon()
                        } else if (
                            colors.imageVector != null &&
                            (colors.state == State.SUCCESS || colors.state == State.ERROR)
                        ) {
                            Icon(
                                imageVector = colors.imageVector,
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
     * Filled dropdown to get the input from a dropdown menu.
     * @param value The value of your text input
     * @param label The label to be displayed inside the text input container and pushed at the top
     * of text input when the component takes the focus
     * @param modifier The `Modifier` to be applied to the component
     * @param enabled True if you can type in the text input, otherwise false
     * @param expanded State to open or close the dropdown menu
     * @param interactionSource Representing the stream of interaction for the text input
     * @param colors The color to notify your user if they are in normal, error or success state
     * @param textStyle The typography of the text inside the text input
     * @param children Declare your dropdown menu item components inside your dropdown
     */
    @Composable
    fun FilledDropdown(
        value: String,
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: TextInputStateColors = TextInputsState.normal(),
        textStyle: TextStyle = VitaminTheme.typography.text2,
        children: @Composable VitaminMenuItems.() -> Unit
    ) {
        var mTextFieldSize by remember { mutableStateOf(Size.Zero) }
        Dropdown(
            expanded = expanded,
            anchor = {
                Filled(
                    value = value,
                    label = label,
                    modifier = Modifier.onGloballyPositioned {
                        mTextFieldSize = it.size.toSize()
                    },
                    colors = colors,
                    textStyle = textStyle,
                    readOnly = true,
                    singleLine = true,
                    maxLines = 1,
                    enabled = enabled,
                    onValueChange = {},
                    interactionSource = interactionSource,
                    icon = {
                        IconButton(onClick = { expanded.value = true }) {
                            Icon(
                                imageVector = VitaminIcons.Line.ChevronDown,
                                contentDescription = stringResource(id = R.string.vtmn_text_inputs_open_menu)
                            )
                        }
                    },
                )
            },
            modifier = modifier.width(with(LocalDensity.current) { mTextFieldSize.width.toDp() }),
            children = children,
            interactionSource = interactionSource
        )
    }
}

@Composable
internal fun VitaminTextInputLayoutImpl(
    helperText: String?,
    counter: Pair<Int, Int>?,
    colors: TextInputStateColors,
    enabled: Boolean,
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
                subtitle1 = VitaminTheme.typography.text2,
                caption = VitaminTheme.typography.caption
            )
        ) {
            textInput()
        }
        Row(modifier = Modifier.padding(vertical = 1.dp, horizontal = 4.dp)) {
            helperText?.let {
                val color = if (colors.state == State.ERROR) colors.textColor
                else if (!enabled) colors.helperColor.copy(ContentAlpha.disabled)
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
                val color = if (!enabled) colors.helperColor.copy(ContentAlpha.disabled)
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
