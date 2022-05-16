# RadioButton components

## RadioButton design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:radiobuttons:<versions>")
```

### Primary

```kotlin
object VitaminRadioButtons {
    @Composable
    fun Primary(
        selected: Boolean,
        modifier: Modifier = Modifier,
        onClick: (() -> Unit)?,
        enabled: Boolean = true,
        colors: RadioButtonColors = VitaminRadioButtonsColors.primary(selected = selected),
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        endContent: (@Composable () -> Unit)? = null
    )
}
```

The primary radio button allow users to select one option from a set.

The minimal usage of the component is the radio button in standalone but you can add a content at 
the end of the radio or customize it.

```kotlin
VitaminRadioButtons.Primary(
    selected = true,
    onClick = { },
    enabled = true,
    endContent = {
        Text(text = "RadioBox", style = VitaminTheme.typography.h6)
    }
)
```

Parameters | Descriptions
-- | --
`selected: Boolean` | Whether radio button is selected or unselected
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`onClick: (() -> Unit)?` | The callback to be called when the state of the radio button changed
`enabled: Boolean = true` | True if you can check the radio button, otherwise false
`colors: RadioButtonColors = VitaminRadioButtonsColors.primary(selected)` | The color of the radio button
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the radio button
`endContent: (@Composable () -> Unit)? = null` | The optional end content displayed after the radio button