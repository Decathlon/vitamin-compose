# AppBar components

## AppBar design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:appbars:<versions>")
```

### TopBar

#### Primary

```kotlin
object VitaminTopBars {
    @Composable
    fun Primary(
        title: String,
        modifier: Modifier = Modifier,
        maxActions: Int = 3,
        actions: List<ActionItem> = emptyList(),
        expandedMenu: MutableState<Boolean> = remember { mutableStateOf(false) },
        colors: TopBarsColors = VitaminTopBarColors.primary(),
        onDismissOverflowMenu: (() -> Unit)? = null,
        overflowIcon: (@Composable VitaminMenuIconButtons.() -> Unit)? = null,
        navigationIcon: (@Composable VitaminNavigationIconButtons.() -> Unit)? = null
    )
}
```

The primary TopBar displays information and actions related to the current screen.

The minimal usage of the component is a title which display a label at the left but you can
configure all top app bars content if you want something more complex.

```kotlin
val expanded = remember { mutableStateOf(false) }
VitaminTopBars.Primary(
    title = "My title",
    navigationIcon = {
        Context(
            onClick = {},
            contentDescription = "Back"
        )
    },
    actions = arrayListOf(
        ActionItem(
            icon = rememberVectorPainter(image = VitaminIcons.Line.Android),
            contentDescription = null,
            text = { Text("Android") },
            onClick = { return@ActionItem true }
        ),
        ActionItem(
            icon = null,
            contentDescription = null,
            content = { Text("Windows") },
            onClick = { return@ActionItem true }
        ),
        ActionItem(
            icon = painterResource(R.drawable.ic_vtmn_apple_line),
            contentDescription = null,
            content = { Text("Apple") },
            onClick = { return@ActionItem true }
        )
    ),
    overflowIcon = {
        More(
            onClick = { expanded.value = true },
            contentDescription = "More",
        )
    },
    expanded = expanded
)
```

Parameters | Descriptions
-- | --
`title: String` | The title of your screen
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`maxActions: Int = 2` | The max number of icon actions at the right of the TopBar
`actions: List<ActionItem> = emptyList()` | The `ActionItem` actions of your topBar. `ActionItem` define the look and the event associated to an item in the topBar
`expandedMenu: MutableState<Boolean> = remember { mutableStateOf(false) }` | Open menu for actions greater than `maxActions` value
`colors: TopBarsColors = VitaminTopBarColors.primary()` | The colors of the background and the content elements in enabled and disabled mode
`onDismissOverflowMenu: (() -> Unit)? = null` | The callback called when the menu should be removed
`overflowIcon: (@Composable VitaminMenuIconButtons.() -> Unit)? = null` | The icon to open overflow menu
`navigationIcon: (@Composable VitaminNavigationIconButtons.() -> Unit)? = null` | The navigation icon displayed at the start of the TopBar

#### Search

```kotlin
object VitaminTopBars {
    @Composable
    fun Search(
        value: String,
        placeholder: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        actions: List<SearchActionItem> = emptyList(),
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        colors: TopBarsColors = VitaminTopBarColors.search(),
        textStyle: TextStyle = VitaminTheme.typography.body2,
        onValueChange: (String) -> Unit,
        navigationIcon: @Composable VitaminSearchNavigationIconButtons.() -> Unit,
    )
}
```

The search TopBar displays a text input to search in the current screen.

The minimal usage of the component is the value of your search, a placeholder inside
the text input and the callback to be called when the user type a new character but
you can configure your text input and add actions at the right of the text input.

```kotlin
val searching = remember { mutableStateOf("Search Terms") }
VitaminTopBars.Search(
    value = searching.value,
    placeholder = "Placeholder",
    onValueChange = {
        searching.value = it
    },
    navigationIcon = {
        if (searching.value == "") {
            Search(contentDescription = "Apply search")
        } else {
            Context(onClick = {}, contentDescription = "Back")
        }
    },
    actions = arrayListOf(
        SearchActionItem.Microphone(
            contentDescription = "Microphone",
            onClick = {}
        ),
        SearchActionItem.Close(
            contentDescription = "Close search bar",
            onClick = {}
        )
    )
)
```

Parameters | Descriptions
-- | --
`value: String` | The value of your search
`placeholder: String` | The placeholder value inside the text input of the TopBar
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can type in the search bar, otherwise false
`actions: List<SearchActionItem> = emptyList()` | The `SearchActionItem` actions of your topBar. `SearchActionItem` define the look and the event associated to an item in the topBar
`keyboardOptions: KeyboardOptions = KeyboardOptions.Default` | Software keyboard options that contains options such as KeyboardType or ImeAction
`keyboardActions: KeyboardActions = KeyboardActions.Default` | When the text input emit an IME action, the corresponding callback is called
`interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }` | Representing the stream of interaction for the text input
`colors: TopBarsColors = VitaminTopBarColors.search()` | The colors of the background and the content elements in enabled and disabled mode
`textStyle: TextStyle = VitaminTheme.typography.body2` | The typography of the text inside the text input
`onValueChange: (String) -> Unit` | The callback to be called when the user type a new character
`navigationIcon: (@Composable VitaminNavigationIconButtons.() -> Unit)? = null` | The navigation icon displayed at the start of the TopBar

### BottomNavigation

```kotlin
object VitaminBottomNavigations {
    @Composable
    fun Primary(
        actions: List<SelectedActionItem>,
        modifier: Modifier = Modifier,
        colors: BottomNavigationColors = VitaminBottomNavigationColors.primary()
    )
}
```

The bottom navigation allow the user to switch between destinations in an app.

```kotlin
VitaminBottomNavigations.Primary(
    actions = arrayListOf(
        SelectedActionItem(
            selected = true,
            icon = rememberVectorPainter(image = VitaminIcons.Line.Android),
            contentDescription = null,
            content = "Android",
            onClick = { return@SelectedActionItem true }
        ),
        SelectedActionItem(
            selected = false,
            icon = painterResource(R.drawable.ic_vtmn_apple_line),
            contentDescription = null,
            content = "Apple",
            onClick = { return@SelectedActionItem true }
        ),
        SelectedActionItem(
            selected = false,
            icon = painterResource(R.drawable.ic_vtmn_amazon_line),
            contentDescription = null,
            content = "Amazon",
            onClick = { return@SelectedActionItem true }
        )
    )
)
```


Parameters | Descriptions
-- | --
`actions: List<SelectedActionItem>` | The `SelectedActionItem` actions of your bottom navigation. `SelectedActionItem` define the look and the event associated to an item in the bottom navigation
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`colors: BottomNavigationColors = VitaminBottomNavigationColors.primary()` | The colors of the background and the content elements in selected and unselected mode
