# Dropdown Menu components

## Dropdown Menu design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:menus:<versions>")
```

### Dropdown

```kotlin
object VitaminMenus {
    @Composable
    fun Dropdown(
        anchor: @Composable () -> Unit,
        modifier: Modifier = Modifier,
        expanded: MutableState<Boolean> = remember { mutableStateOf(false) },
        onDismissRequest: () -> Unit = {},
        children: @Composable VitaminMenuItems.() -> Unit
    )
}
```

A dropdown contains a list of options that have an immediate effect like filter or sort content on a page.

The minimal usage of the component is the anchor where you want to attach your menu and the children
where you declare your menu items. Check other parameters to expand the menu when you want or
to be notified when your menu should be dismiss.

```kotlin
val expanded = remember { mutableStateOf(false) }
VitaminMenus.Dropdown(
    expanded = expanded,
    anchor = {
        VitaminButtons.Primary("Open menu")
    },
    children = {
        PrimaryItem(
            onClick = { expanded.value = false },
            content = { Text("Option 1") }
        )
        PrimaryItem(
            onClick = { expanded.value = false },
            content = { Text("Option 2") }
        )
    }
)
```

Parameters | Descriptions
-- | --
`anchor: @Composable () -> Unit` | Component where the dropdown menu is attached
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`expanded: MutableState<Boolean> = remember { mutableStateOf(false) }` | State to open or close the dropdown menu
`onDismissRequest: () -> Unit = {}` | The callback to be called when the dropdown menu is dismiss
`children: @Composable VitaminMenuItems.() -> Unit` | Declare your dropdown menu item components inside your dropdown

### Dropdown Menu Item

```kotlin
object VitaminMenuItems {
    @Composable
    fun PrimaryItem(
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: MenuItemColors = VitaminMenuItemColors.primary(),
        contentPadding: PaddingValues = MenuDefaults.DropdownMenuItemContentPadding,
        startIcon: (@Composable () -> Unit)? = null,
        endIcon: (@Composable () -> Unit)? = null,
        content: @Composable () -> Unit
    )
}
```

Dropdown menu item should be declared inside the dropdown menu.

The minimal usage of the component is the click callback to get the option of the user and the label
content of the item which is displayed at the center of the item menu. You can optionaly add icons
at the start and the end of the item and enable or disable the click on it.

Parameters | Descriptions
-- | --
`onClick: () -> Unit` | The callback to be called when the user click on the dropdown item
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can click on the button, otherwise false
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the dropdown item
`colors: MenuItemColors = VitaminMenuItemColors.primary()` | The colors of the background and the content elements
`contentPadding: PaddingValues = MenuDefaults.DropdownMenuItemContentPadding` | The padding applied to the content of this menu item
`startIcon: (@Composable () -> Unit)? = null` | Icon displayed at the beginning of the dropdown item
`endIcon: (@Composable () -> Unit)? = null` | Icon displayed at the end of the dropdown item
`content: @Composable () -> Unit` | Option label displayed in the center of the dropdown item
