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

#### To display an information

```kotlin
object VitaminModals {
    @Composable
    fun Primary(
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

This Primary modal implementation used to provide information.

The minimal usage of the component is callback to be notified when the user need to dismiss the modal.

```kotlin
VitaminModals.Primary(
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
`button: (@Composable VitaminModalButtons.() -> Unit)? = null` | The optional button to do the acknowledgement action

#### To confirm an action

```kotlin
object VitaminModals {
    @Composable
    fun Primary(
        content: @Composable (() -> Unit),
        onDismissRequest: () -> Unit,
        confirmationButton: (@Composable VitaminModalButtons.() -> Unit),
        dismissButton: (@Composable VitaminModalButtons.() -> Unit),
        modifier: Modifier = Modifier,
        title: String? = null,
        painter: Painter? = null,
        buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL,
        contentScrollState: ScrollState = rememberScrollState(),
        colors: ModalColors = VitaminModalColors.primary(),
        sizes: ModalSizes = VitaminModalSizes.medium(),
        thirdButton: (@Composable VitaminModalButtons.() -> Unit)? = null,
    )
}
```

This implementation will be use to validate an action or request information from the user.
In this case, two buttons are mandatory. One must be a confirming action, and the other a dismissing action.
Providing a third action, such as "Learn more" is not recommended as it navigates the user away from the dialog, leaving the dialog task unfinished.

The minimal usage of the component is callback to be notified when the user need to dismiss the modal and action buttons (confirm & dismiss).

```kotlin
VitaminModals.Primary(
    content = {
        Text(text = "Description of the action you want to confirm")
    },
    onDismissRequest = {},
    painter = rememberVectorPainter(image = VitaminIcons.Line.MapPin),
    title = "title",
    confirmationButton = {
        VitaminModalButtons.Primary(
            text = "Confirm",
            onClick = {}
        )
    },
    dismissButton = {
        VitaminModalButtons.Primary(
            text = "Dismiss",
            onClick = {}
        )
    },
    thirdButton = {
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
`confirmationButton: (@Composable VitaminModalButtons.() -> Unit)` | The button used to confirm the action
`dismissButton: (@Composable VitaminModalButtons.() -> Unit)` | The button used to dismiss the action
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`title: String? = null` | The optional title to be displayed at the top of the modal
`painter: Painter? = null` | The optional leading icon to be displayed at the start of the title
`buttonsOrientation: ModalButtonsOrientation = ModalButtonsOrientation.HORIZONTAL` | The optional buttons orientation to display buttons vertically or horizontally
`contentScrollState: ScrollState = rememberScrollState()` | The optional scroll state to observe the scrolling
`colors: ModalColors = VitaminModalColors.primary()` | The optional sizes used to define colors of icon, title, content and background of the modal
`sizes: ModalSizes = VitaminModalSizes.medium()` | The optional sizes used to define modal padding, spacers sizes and icon size
`thirdButton: (@Composable VitaminModalButtons.() -> Unit)? = null`| The optional button used to display a third action
