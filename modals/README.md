# Modal components

## Modal design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:modals:<versions>")
```

### Primary

```kotlin
object VitaminModals {
    @Composable
    fun Primary2(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        title: String? = null,
        painter: Painter? = null,
        buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        contentScrollState: ScrollState = rememberScrollState(),
        colors: ModalColors = VitaminModalColors.primary(),
        sizes: ModalSizes = VitaminModalSizes.medium(),
        positiveButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
        negativeButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
        neutralButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
    )
}
```

The primary modal used to provide critical information or ask for decision.

The minimal usage of the component is callback to be notified when the user need to dismiss the modal.

```kotlin
VitaminModals.Primary(
    content = {
        Text(
            text = "Simple information displayed to the user"
        )
    },
    onDismissRequest = {},
    modifier = Modifier,
    title = "Amazon",
    painter = rememberVectorPainter(VitaminIcons.Line.MapPin),
    contentScrollState = rememberScrollState(),
    positiveButton = {
        VitaminModalButtons.Primary(
            text = "Positive",
            onClick = {}
        )
    },
    negativeButton = {
        VitaminModalButtons.Primary(
            text = "Negative",
            onClick = {}
        )
    },
    neutralButton = {
        VitaminModalButtons.Primary(
            text = "Neutral",
            onClick = {}
        )
    },
    buttonsOrientation = ModalButtonsOrientation.HORIZONTAL,
    sizes = VitaminModalSizes.medium(),
    colors = VitaminModalColors.primary()
)
```

Parameters | Descriptions
-- | --
`content: @Composable (() -> Unit)` | The content to be displayed below the title
`onDismissRequest: () -> Unit` | The callback to be called when the user need to dismiss the modal
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`title: String? = null` | The optional title to be displayed at the top of the modal
`painter: Painter? = null` | The optional leading icon to be displayed at the start of the title
`buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL` | The optional buttons orientation to display buttons vertically or horizontally
`contentScrollState: ScrollState = rememberScrollState()` | The optional scroll state to observe the scrolling
`colors: ModalColors = VitaminModalColors.primary()` | The optional sizes used to define colors of icon, title, content and background of the modal
`sizes: ModalSizes = VitaminModalSizes.medium()` | The optional sizes used to define modal padding, spacers sizes and icon size
`positiveButton: (@Composable VitaminModalButtons.() -> Unit)? = null` | The optional positive button to be displayed at the bottom of the modal 
`negativeButton: (@Composable VitaminModalButtons.() -> Unit)? = null` | The optional negative button to be displayed at the bottom of the modal
`neutralButton: (@Composable VitaminModalButtons.() -> Unit)? = null` | The optional neutral button to be displayed at the bottom of the modal
