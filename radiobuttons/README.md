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
        onClick: (() -> Unit)?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: RadioButtonColors = VitaminRadioButtonColors.primary(),
        sizes: RadioButtonSizes = VitaminRadioButtonSizes.medium(),
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
`onClick: (() -> Unit)?` | The callback to be called when the state of the radio button changed
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can check the radio button, otherwise false
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the radio button
`colors: RadioButtonColors = VitaminRadioButtonColors.primary()` | The colors of the radio button and the optional label
`sizes: RadioButtonSizes = VitaminRadioButtonSizes.medium()` | The sizes for the radio button, paddings and optional label
`endContent: (@Composable () -> Unit)? = null` | The optional end content displayed after the radio button
