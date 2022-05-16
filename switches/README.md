# Switch components

## Switch design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:switches:<versions>")
```

### Primary

```kotlin
object VitaminSwitches {
    @Composable
    fun Primary(
        checked: Boolean,
        modifier: Modifier = Modifier,
        onCheckedChange: ((Boolean) -> Unit)? = null,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    )
}
```

The primary switch toggle the state of a single item on or off.

The minimal usage of the component is the checked information but you should configure it to know
when the user interact with the switch.

```kotlin
val state = remember { mutableStateOf(true) }
VitaminSwitches.Primary(
    checked = state.value,
    enabled = true,
    onCheckedChange = {
        state.value = it
    }
)
```

Parameters | Descriptions
-- | --
`checked: Boolean` | Whether Switch is checked or unchecked
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`onCheckedChange: ((Boolean) -> Unit)? = null` | The callback to be called when the state of the switch changed
`enabled: Boolean = true` | True if you can check the switch, otherwise false
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the switch