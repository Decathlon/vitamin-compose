# Quantity components

## Quantity design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:quantities:<versions>")
```

### Default

```kotlin
object VitaminQuantities {
    @Composable
    fun Default(
        value: String,
        modifier: Modifier = Modifier,
        addEnabled: Boolean = true,
        subtractEnabled: Boolean = true,
        editTextEnabled: Boolean = true,
        colors: QuantityColors = VitaminQuantitiesColors.default(),
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        onAddClicked: () -> Unit,
        onSubtractClicked: () -> Unit,
        onValueChange: (String?) -> Unit,
    )
}
```

Quantity increase or decrease a value.
The default quantity allows users to choose between typing into the text field or stepping with the buttons.

```kotlin
 VitaminQuantities.Default(
    modifier = Modifier,
    value = quantity,
    onAddClicked = {},
    onSubtractClicked = {},
    onValueChange = {},
    subtractEnabled = true,
    addEnabled = true,
    editTextEnabled = true,
    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
    colors = QuantityColors(
        textColor = VitaminTheme.colors.vtmnContentPrimary,
        backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimary,
        borderColor = VitaminTheme.colors.vtmnBorderInactive
    )
)
```

Parameters | Descriptions
-- | --
`value: String` | The text value of textfield
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`onAddClicked: (Boolean) -> Unit` | The callback to be called when add button is clicked
`onSubtractClicked: (Boolean) -> Unit` | The callback to be called when substract button is clicked
`onValueChange: (Boolean)-> Unit ` | The callback to be called when text is set into textfield
`subtractEnabled: (Boolean)` | Whether substract button is enable or not 
`addEnabled: (Boolean)` | Whether add button is enable or not
`editTextEnabled: (Boolean)` | Whether textField is enable or not
`colors: QuantityColors = VitaminQuantitiesColors.default()` | The colors of the components
`keyboardOptions: KeyboardOptions = KeyboardOptions.Default` | The keyboard option for the textField