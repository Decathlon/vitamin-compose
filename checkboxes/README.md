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
        modifier: Modifier = Modifier,
        onCheckedChange: (Boolean) -> Unit,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
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
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`onCheckedChange: (Boolean) -> Unit` | The callback to be called when the state of the checkbox changed
`enabled: Boolean = true` | True if you can check the checkbox, otherwise false
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the checkbox
`endContent: (@Composable () -> Unit)? = null` | The optional end content displayed after the checkbox