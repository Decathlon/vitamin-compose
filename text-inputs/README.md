# TextInput components

## TextInput design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should 
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:text-inputs:<versions>")
```

### Outlined

```kotlin
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
        readOnly: Boolean = false,
        onValueChange: (String) -> Unit
    )
}
```

Outlined text input to get an input value from the user.

The minimal usage of the component is the value of your text input, a label associated to it and
the callback to be called when the user type a new character but you can configure yout text
input much more.

```kotlin
VitaminTextInputs.Outlined(
    value = "Input",
    label = "Label",
    helperText = "Helper Text",
    counter = 999 to 999,
    icon = {
        Icon(
            painter = painterResource(id = R.drawable.ic_vtmn_heart_3_line),
            contentDescription = null
        )
    },
    onValueChange = {}
)
```

Parameters | Descriptions
-- | --
`value: String` | The value of your text input
`label: String` | The label to be displayed inside the text input container and pushed at the top of text input when the component takes the focus
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`icon: @Composable (() -> Unit)? = null` | The optional trailing icon to be displayed at the end of the text input container
`helperText: String? = null` | The optional helper text to be displayed at the start bottom outside the text input container
`counter: Pair<Int, Int>? = null` | The optional counter to be displayed the the end bottom outside the text input container
`colors: TextInputStateColors = TextInputsState.normal()` | The color to notify your user if they are in normal, error or success state 
`textStyle: TextStyle = VitaminTheme.typography.body2` | The typography of the text inside the text input
`transformation: VisualTransformation = TextInputsTransformations.none` | Transforms the visual representation of the input value
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the text input
`keyboardOptions: KeyboardOptions = KeyboardOptions.Default` | Software keyboard options that contains such as KeyboardType and ImeAction
`keyboardActions: KeyboardActions = KeyboardActions.Default` | When the text input emit an IME action, the corresponding callback is called
`singleLine: Boolean = false` | True if the text input doesn't extend their height, otherwise, false
`maxLines: Int = Int.MAX_VALUE` | The number of maximum lines the text input can have if the `singleLine` is set to `true`
`isEnabled: Boolean = true` | True if you can type in the text input, otherwise false
`readOnly: Boolean = false` | True if you don't want open the keyboard when the user click on the text field
`onValueChange: (String) -> Unit` | The callback to be called when the user type a new character

### Filled

```kotlin
object VitaminTextInputs {
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
    )
}
```

Filled text input to get an input value from the user.

The minimal usage of the component is the value of your text input, a label associated to it and
the callback to be called when the user type a new character but you can configure yout text
input much more.

```kotlin
VitaminTextInputs.Filled(
    value = "Input",
    label = "Label",
    helperText = "Helper Text",
    counter = 999 to 999,
    icon = {
        Icon(
            painter = painterResource(id = R.drawable.ic_vtmn_heart_3_line),
            contentDescription = null
        )
    },
    onValueChange = {}
)
```

Parameters | Descriptions
-- | --
`value: String` | The value of your text input
`label: String` | The label to be displayed inside the text input container and pushed at the top of text input when the component takes the focus
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`icon: @Composable (() -> Unit)? = null` | The optional trailing icon to be displayed at the end of the text input container
`helperText: String? = null` | The optional helper text to be displayed at the start bottom outside the text input container
`counter: Pair<Int, Int>? = null` | The optional counter to be displayed the the end bottom outside the text input container
`colors: TextInputStateColors = TextInputsState.normal()` | The color to notify your user if they are in normal, error or success state
`textStyle: TextStyle = VitaminTheme.typography.body2` | The typography of the text inside the text input
`transformation: VisualTransformation = TextInputsTransformations.none` | Transforms the visual representation of the input value
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the text input
`keyboardOptions: KeyboardOptions = KeyboardOptions.Default` | Software keyboard options that contains such as KeyboardType and ImeAction
`keyboardActions: KeyboardActions = KeyboardActions.Default` | When the text input emit an IME action, the corresponding callback is called
`singleLine: Boolean = false` | True if the text input doesn't extend their height, otherwise, false
`maxLines: Int = Int.MAX_VALUE` | The number of maximum lines the text input can have if the `singleLine` is set to `true`
`isEnabled: Boolean = true` | True if you can type in the text input, otherwise false
`readOnly: Boolean = false` | True if you don't want open the keyboard when the user click on the text field
`onValueChange: (String) -> Unit` | The callback to be called when the user type a new character
