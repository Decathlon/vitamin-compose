# TextInput components

## TextInput design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:snackbars:<versions>")
```

### Primary

```kotlin
object VitaminSnackbars {
    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        actionOnNewLine: Boolean = false,
        colors: SnackbarColors = VitaminSnackbarColors.primary(),
        action: @Composable (VitaminSnackbarsActions.() -> Unit)? = null
    )
}
```

A snackbar is used to provide non-disruptive feedback about the outcome of an event.

The minimal usage of the component is the value of your text to show in the snackbar but you can add an action and it's position.

```kotlin
VitaminSnackbars.Primary(
    text = "This is the description of the snackbar",
    action = {
        VitaminSnackbarsActions.Button(
            text = "Button",
            onClick = { /*TODO*/ }
        )
    },
    actionOnNewLine = true
)
```

Parameters | Descriptions
-- | --
`text: String` | The text inside the snackbar
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`actionOnNewLine: Boolean = false` | whether or not action should be put on the separate line. Recommended for action with long action text
`colors: SnackbarColors = VitaminSnackbarColors.primary()` | The colors of the background and the content
`action: @Composable (VitaminSnackbarsActions.() -> Unit)? = null` | Vitamin action the snackbar
