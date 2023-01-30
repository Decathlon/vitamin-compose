# Tab components

## Tab design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:tabs:<versions>")
```

### Fixed Tabs

```kotlin
object VitaminTabs {
    @Composable
    fun Fixed(
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
        colors: TabColors = VitaminTabColors.primary(),
        textStyle: TextStyle = VitaminTheme.typography.text2Bold,
        textOverflow: TextOverflow = TextOverflow.Ellipsis,
        onTabClicked: (tabItem: TabItem) -> Unit
    )
}
```

The fixed tabs displays all tabs in a set simultaneously.

The minimal usage of the component is the list of tab items with a label and optionally an icon.
You can configure all tabs content if you want something more complex.

This component need to have at least 2 tabItems. Otherwise an [IllegalArgumentException] will be thrown.

```kotlin
val icon = painterResource(id = R.drawable.ic_vtmn_heart_3_line)
val list = remember {
    (0..2).map {
        TabItem(label = "Label $it", icon = icon, selected = it == 0)
    }
}
VitaminTabs.Fixed(
    tabItems = list,
    onTabClicked = { }
)
```

Parameters | Descriptions
-- | --
`tabItems: List<TabItem>` | The `TabItem` actions of your tabs. `TabItem` define the look to the items
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`colors: TabColors = VitaminTabColors.primary()` | The colors of the icon, label, background and indicator
`textStyle: TextStyle = VitaminTheme.typography.text2Bold` | The text style of the label inside tabs
`textOverflow: TextOverflow = TextOverflow.Ellipsis` | How visual overflow should be handled
`onTabClicked: (tabItem: TabItem) -> Unit` | The callback to be called when the user click on a tab

### Scrollable Tabs

```kotlin
object VitaminTabs {
    @Composable
    fun Scrollable(
        tabItems: List<TabItem>,
        modifier: Modifier = Modifier,
        colors: TabColors = VitaminTabColors.primary(),
        textStyle: TextStyle = VitaminTheme.typography.text2Bold,
        textOverflow: TextOverflow = TextOverflow.Ellipsis,
        onTabClicked: (tabItem: TabItem) -> Unit
    )
}
```

When a set of tabs cannot fit on screen, use scrollable tabs. Scrollable tabs can use longer 
text labels and a larger number of tabs. They are best used for browsing on touch interfaces.

The minimal usage of the component is the list of tab items with a label and optionally an icon.
You can configure all tabs content if you want something more complex.

This component need to have at least 2 tabItems. Otherwise an [IllegalArgumentException] will be thrown.

```kotlin
val icon = painterResource(id = R.drawable.ic_vtmn_heart_3_line)
val list = remember {
    (0..10).map {
        TabItem(label = "Label $it", icon = icon, selected = it == 0)
    }
}
VitaminTabs.Scrollable(
    tabItems = list,
    onTabClicked = { }
)
```

Parameters | Descriptions
-- | --
`tabItems: List<TabItem>` | The `TabItem` actions of your tabs. `TabItem` define the look to the items
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`colors: TabColors = VitaminTabColors.primary()` | The colors of the icon, label, background and indicator
`textStyle: TextStyle = VitaminTheme.typography.text2Bold` | The text style of the label inside tabs
`textOverflow: TextOverflow = TextOverflow.Ellipsis` | How visual overflow should be handled
`onTabClicked: (tabItem: TabItem) -> Unit` | The callback to be called when the user click on a tab
