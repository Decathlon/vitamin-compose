# Button components

## Button design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:buttons:<versions>")
```

### Primary

**Buttons**

```kotlin
object VitaminButtons {
    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.primary(),
        sizes: VitaminButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonsBorders.none(),
        ripple: RippleTheme = VitaminTheme.ripples.brand,
        onClick: () -> Unit
    )
}
```

The primary button should only be used once per view (not including a modal dialog), 
these buttons have the most emphasis.

The minimal usage of the component is the text of the button but you can add an icon or customize
the size with a medium or large size variants.

```kotlin
VitaminButtons.Primary(text = "Primary") {
    // Click event
}
```

Parameters | Descriptions
-- | --
`text: String` | The text inside the button
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`icon: Painter? = null` | The optional icon to be displayed at the start or the end of the button container
`iconSide: IconSide = IconSide.LEFT` | If an icon is added, you can configure the side at the start or end of the button
`enabled: Boolean = true` | True if you can click on the button, otherwise false
`colors: ButtonColors = VitaminButtonsColors.primary()` | The colors of the background and the content in enabled and disabled
`sizes: VitaminButtonSizes = VitaminButtonsSizes.medium()` | The sizes for the text, paddings and width/height
`borders: ButtonBorders = VitaminButtonsBorders.none()` | The width and color of the border in enabled and disabled
`ripple: RippleTheme = VitaminTheme.ripples.brand` | The ripple effect applied on the component
`onClick: () -> Unit` | The callback to be called when the user click on the button


**Icon Buttons**

```kotlin
object VitaminIconButtons {
    @Composable
    fun Primary(
        icon: Painter,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ButtonColors = VitaminButtonsColors.primary(),
        sizes: VitaminButtonSizes = VitaminButtonsSizes.medium(),
        borders: ButtonBorders = VitaminButtonsBorders.none(),
        ripple: RippleTheme = VitaminTheme.ripples.brand,
        onClick: () -> Unit
    )
}
```
The minimal usage of the component is an icon and the associated contentDescription

```kotlin
VitaminIconButtons.Primary(
    icon = rememberVectorPainter(VitaminIcons.Line.Add),
    contentDescription = "Add"
) {}
```

Parameters | Descriptions
-- | --
`icon: Painter` | The icon to be displayed inside the button
`contentDescription: String?` | The content description of the icon for accessibility
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can click on the button, otherwise false
`colors: ButtonColors = VitaminButtonsColors.primary()` | The colors of the background and the content in enabled and disabled
`sizes: VitaminIconButtonSizes = VitaminIconButtonsSizes.medium()` | The sizes for the icon, paddings and width/height
`borders: ButtonBorders = VitaminButtonsBorders.none()` | The width and color of the border in enabled and disabled
`ripple: RippleTheme = VitaminTheme.ripples.brand` | The ripple effect applied on the component
`onClick: () -> Unit` | The callback to be called when the user click on the button

### All Variants

There are multiple variants of the button and the icon button with the same parameters:

* `PrimaryReversed`: The primary reversed should be used for primary actions on pictures or dark backgrounds
* `Secondary`: The secondary button is the standard button for most use cases. The outlined styling places less emphasis on these buttons
* `Tertiary`: The tertiary button is usually used for miscellaneous actions: the action is important, but may not be what the user is looking to do right then
* `Ghost`: The ghost button should be used for secondary actions when combined with a primary button or when you need to list multiple actions in one single view as a preference page
* `GhostReversed`: The ghost reversed should be used on pictures or dark backgrounds
* `Conversion`: The conversion button must be used for transactional actions
