# Scaffold components

## Scaffold design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:scaffolds:<versions>")
```

### Primary

```kotlin
object VitaminScaffolds {
    @Composable
    fun Primary(
        title: String,
        modifier: Modifier = Modifier,
        topBarConfiguration: TopBarConfiguration = TopBarConfiguration.Primary(),
        topActionsUi: TopActionsUi = TopActionsUi(),
        tabActionsUi: TabActionsUi = TabActionsUi(),
        bottomActionsUi: BottomActionsUi = BottomActionsUi(),
        fabAction: FabActionUi? = null,
        tabSelectedIndex: Int? = null,
        bottomRouteSelected: String? = null,
        onTopActionClicked: (TopActionUi) -> Unit = {},
        onTabClicked: (TabActionUi) -> Unit = {},
        onBottomActionClicked: (BottomActionUi) -> Unit = {},
        onFabActionClicked: (FabActionUi) -> Unit = {},
        onSearchValueChanged: (String) -> Unit = {},
        content: @Composable (PaddingValues) -> Unit
    )
}
```

Material design layout with Vitamin components.
Scaffold implements Material design visual layout structure and this component will use Vitamin 
TopBar, Tabs, BottomBar and Floating Action Button according to models given in input.

The minimal usage of the component is the title and content but it makes really sense to use this
component when you have TopBar, Tab, BottomBar and/or FAB configuration and more when it should
be dynamic at runtime.

```kotlin
VitaminScaffolds.Primary(title = "My title") { padding ->
    // content here
}
```

Parameters | Descriptions
-- | --
`title: String` | Title specified in the Vitamin TopBar.
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`topBarConfiguration: TopBarConfiguration = TopBarConfiguration.Primary()` | Switch dynamically from primary to search configuration.
`topActionsUi: TopActionsUi = TopActionsUi()` | List of the TopBar actions and maximum number of actions with icon you want to show.
`tabActionsUi: TabActionsUi = TabActionsUi()` | List of the Tab actions and whether it should be used in scrollable mode.
`bottomActionsUi: BottomActionsUi = BottomActionsUi()` | List of the BottomBar actions.
`fabAction: FabActionUi? = null` | Display a floating action button at the bottom end of the content.
`tabSelectedIndex: Int? = null` | Indicate which tab is currently selected.
`bottomRouteSelected: String? = null` | Indicate which bottom action is currently selected.
`onTopActionClicked: (TopActionUi) -> Unit = {}` | The callback to be called when the user click on a TopBar action.
`onTabClicked: (TabActionUi) -> Unit = {}` | The callback to be called when the user click on a tab action.
`onBottomActionClicked: (BottomActionUi) -> Unit = {}` | The callback to be called when the user click on a bottom action.
`onFabActionClicked: (FabActionUi) -> Unit = {}` | The callback to be called when the user click on the fab.
`onSearchValueChanged: (String) -> Unit = {}` | The callback to be called when the user type a character in the searchbar.
`content: @Composable (PaddingValues) -> Unit` | The content of your screen. As Material design Scaffold component, the expected [PaddingValues] is passed and should be used by your root component in this api slot.
