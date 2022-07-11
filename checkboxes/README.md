# Checkbox components

## Checkbox design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:checkboxes:<versions>")
```

### Primary

```kotlin
object VitaminCheckboxes {
    @Composable
    fun Primary(
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: CheckboxColors = VitaminCheckboxColors.primary(),
        textStyle: TextStyle = VitaminTheme.typography.body2,
        endContent: (@Composable () -> Unit)? = null
    )
}
```

The primary Checkbox allows users to select one or more items from a set. Checkboxes can turn an
option on or off.

The minimal usage of the component is the checkbox in standalone but you can add a content at the
end of the box or customize it.

```kotlin
var checked by remember { mutableStateOf(true) }
VitaminCheckboxes.Primary(
    checked = checked,
    onCheckedChange = {
        checked = !checked
    },
    enabled = true,
    endContent = {
        Text(text = "Checkbox by default")
    }
)
```

Parameters | Descriptions
-- | --
`checked: Boolean` | Whether Checkbox is checked or unchecked
`onCheckedChange: (Boolean) -> Unit` | The callback to be called when the state of the checkbox changed
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can check the checkbox, otherwise false
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the checkbox
`colors: CheckboxColors = VitaminCheckboxColors.primary()` | The colors of checkbox states and the text at the end in enable and disable mode
`textStyle: TextStyle = VitaminTheme.typography.body2` | The typography of the text at the end of the checkbox
`endContent: (@Composable () -> Unit)? = null` | The optional end content displayed after the checkbox
