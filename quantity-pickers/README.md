# Quantity Picker components

## Quantity Picker design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:quantity-pickers:<versions>")
```

### Default

```kotlin
object VitaminQuantityPickers {
    @Composable
    fun Primary(
        value: String,
        modifier: Modifier = Modifier,
        addEnabled: Boolean = true,
        subtractEnabled: Boolean = true,
        editTextEnabled: Boolean = true,
        keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        colors: QuantityColors = VitaminQuantitiesColors.normal(),
        shape: CornerBasedShape = VitaminTheme.shapes.radius100,
        textStyle: TextStyle = VitaminTheme.typography.text2,
        ripple: RippleTheme = VitaminTheme.ripples.brand,
        onAddClicked: () -> Unit,
        onSubtractClicked: () -> Unit,
        onValueChange: (String) -> Unit
    )
}
```

A quantity allows users to change the number of items.
The default quantity allows users to choose between typing into the text field or stepping with the buttons.

```kotlin
 VitaminQuantityPickers.Primary(
    value = quantity,
    modifier = Modifier,
    onAddClicked = {},
    onSubtractClicked = {},
    onValueChange = {}
)
```

Parameters | Descriptions
-- | --
`value: String` | Value of the quantity picker
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`addEnabled: (Boolean)` | Whether add button is enable or not
`subtractEnabled: (Boolean)` | Whether substract button is enable or not
`editTextEnabled: (Boolean)` | Whether textField is enable or not
`keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)` | Software keyboard options that contains such as KeyboardType and ImeAction
`keyboardActions: KeyboardActions = KeyboardActions.Default` | When the text input emit an IME action, the corresponding callback is called
`colors: QuantityColors = VitaminQuantitiesColors.normal()` | The color to notify your user if they are in normal or error state
`shape: CornerBasedShape = VitaminTheme.shapes.radius100` | The shape for icon buttons
`textStyle: TextStyle = VitaminTheme.typography.text2` | The typography of the text inside the text input
`ripple: RippleTheme = VitaminTheme.ripples.brand` | The ripple effect applied on buttons
`onAddClicked: (Boolean) -> Unit` | The callback to be called when add button is clicked
`onSubtractClicked: (Boolean) -> Unit` | The callback to be called when substract button is clicked
`onValueChange: (String)-> Unit ` | The callback to be called when text is set into textfield
