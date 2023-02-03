# Modal components

## Modal design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:modals:<versions>")
```

### Acknowledge

```kotlin
object VitaminModals {
    @Composable
    fun Acknowledge(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        title: String? = null,
        painter: Painter? = null,
        contentScrollState: ScrollState = rememberScrollState(),
        colors: ModalColors = VitaminModalColors.primary(),
        sizes: ModalSizes = VitaminModalSizes.medium(),
        button: (@Composable VitaminModalButtons.() -> Unit)? = null,
    )
}
```

The Acknowledge modal used to provide information.

The minimal usage of the component is callback to be notified when the user need to dismiss the modal.

```kotlin
VitaminModals.Acknowledge(
    content = {
        Text(text = "Simple information displayed to the user")
    },
    onDismissRequest = {},
    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
    title = "title",
    button = {
        VitaminModalButtons.Primary(
            text = "Got it",
            onClick = {}
        )
    }
)
```

Parameters | Descriptions
-- | --
`content: @Composable (() -> Unit)` | The content to be displayed below the title
`onDismissRequest: () -> Unit` | The callback to be called when the user need to dismiss the modal
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`title: String? = null` | The optional title to be displayed at the top of the modal
`painter: Painter? = null` | The optional leading icon to be displayed at the start of the title
`contentScrollState: ScrollState = rememberScrollState()` | The optional scroll state to observe the scrolling
`colors: ModalColors = VitaminModalColors.primary()` | The optional sizes used to define colors of icon, title, content and background of the modal
`sizes: ModalSizes = VitaminModalSizes.medium()` | The optional sizes used to define modal padding, spacers sizes and icon size
`button: (@Composable VitaminModalButtons.() -> Unit)? = null,` | The optional button to do the acknowledgement action

### Confirmation

```kotlin
object VitaminModals {
    @Composable
    fun Confirmation(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        rightButton: (@Composable VitaminModalButtons.() -> Unit),
        middleButton: (@Composable VitaminModalButtons.() -> Unit),
        modifier: Modifier = Modifier,
        title: String? = null,
        painter: Painter? = null,
        buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        contentScrollState: ScrollState = rememberScrollState(),
        colors: ModalColors = VitaminModalColors.primary(),
        sizes: ModalSizes = VitaminModalSizes.medium(),
        leftButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
    )
}
```

The Confirmation modal used to ask for decision.

The minimal usage of the component is callback to be notified when the user need to dismiss the modal and action buttons (confirm & dismiss).

```kotlin
VitaminModals.Confirmation(
    content = {
        Text(text = "Description of the action you want to confirm")
    },
    onDismissRequest = {},
    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
    title = "title",
    rightButton = {
        VitaminModalButtons.Primary(
            text = "Confirm",
            onClick = {}
        )
    },
    middleButton = {
        VitaminModalButtons.Primary(
            text = "Dismiss",
            onClick = {}
        )
    },
    leftButton = {
        VitaminModalButtons.Primary(
            text = "Third action",
            onClick = {}
        )
    }
)
```

Parameters | Descriptions
-- | --
`content: @Composable (() -> Unit)` | The content to be displayed below the title
`onDismissRequest: () -> Unit` | The callback to be called when the user need to dismiss the modal
`rightButton: (@Composable VitaminModalButtons.() -> Unit),` | The button used to confirm the action
`middleButton: (@Composable VitaminModalButtons.() -> Unit),` | The button used to dismiss the action
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`title: String? = null` | The optional title to be displayed at the top of the modal
`painter: Painter? = null` | The optional leading icon to be displayed at the start of the title
`buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL,` | The optional buttons orientation to display buttons vertically or horizontally
`contentScrollState: ScrollState = rememberScrollState()` | The optional scroll state to observe the scrolling
`colors: ModalColors = VitaminModalColors.primary()` | The optional sizes used to define colors of icon, title, content and background of the modal
`sizes: ModalSizes = VitaminModalSizes.medium()` | The optional sizes used to define modal padding, spacers sizes and icon size
`leftButton: (@Composable VitaminModalButtons.() -> Unit)? = null,`| The optional button used to display a third action
