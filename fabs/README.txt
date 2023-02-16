# Floating Action Button components

## FAB design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:fabs:<versions>")
```

### Primary

**FAB**

```kotlin
object VitaminFabs {
    @Composable
    fun Primary(
        icon: Painter,
        contentDescription: String?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: FabsColor = VitaminFabsColors.primary(),
        sizes: FabSizes = VitaminFabSizes.default(),
        onClick: () -> Unit
    )
}
```

Use FABs for primary, positive actions.

The minimal usage of the component is the fab with an icon and a content description.

```kotlin
VitaminFabs.Primary(
    icon = rememberVectorPainter(image = VitaminIcons.Fill.Add),
    contentDescription = "Add"
) {
    // Click event
}
```

Parameters | Descriptions
-- | --
`icon: Painter` | The icon to be displayed inside the FAB
`contentDescription: String?` | The icon content description for accessibility
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can click on the FAB, otherwise false
`colors: FabsColors = VitaminFabsColors.primary()` | The colors of the background and the content in enabled and disabled
`sizes: FabSizes = VitaminFabSizes.medium()` | The sizes for the icon and the component itself
`onClick: () -> Unit` | The callback to be called when the user click on the FAB


**FAB extended**

```kotlin
object VitaminFabsExtended {
    @Composable
    fun Primary(
        text: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        icon: Painter? = null,
        colors: FabsColors = VitaminFabsColors.primary(),
        sizes: FabExtendedSizes = VitaminFabExtendedSizes.default(),
        onClick: () -> Unit
    )
}


The minimal usage of the component is the fab extended with a label. You can also add an icon.

```kotlin
VitaminFabsExtended.Primary(
    text = "Label"
) {
    // Click event
}
```

```
Parameters | Descriptions
-- | --
`text: String` | The text inside the FAB extended
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`icon: Painter` | The optional icon to be displayed inside the FAB extended on the right left side of the text
`enabled: Boolean = true` | True if you can click on the FAB, otherwise false
`colors: FabsColors = VitaminFabsColors.primary()` | The colors of the background and the content in enabled and disabled
`sizes: FabSizes = VitaminFabExtendedSizes.default()` | The sizes for the icon, the text and the component itself
`onClick: () -> Unit` | The callback to be called when the user click on the FAB extended
