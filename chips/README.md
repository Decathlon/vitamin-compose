# Chip components

Chips appear dynamically as a group of multiple interactive elements. With chips, users can filter
content, enter information, make selections or trigger actions.

## Chip design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:chips:<versions>")
```

### Action

Action chip offers actions related to the content.
It appears dynamically and contextually in the interface.

```kotlin
object VitaminChips {
    
    @Composable
    fun Action(
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        onClick: () -> Unit,
        leadingIcon: (@Composable () -> Unit)? = null
    )
}
```

Parameters | Descriptions
-- | --
`label: String` | Text to be displayed into the Chip
`modifier: Modifier` | `Modifier` to be applied to the component
`enabled: Boolean` | True if you can click on the Chip. Default is true.
`colors: ChipColors` | Colors to be applied to the Chip
`sizes: ChipSizes` | Sizes to be applied to the Chip. (default VitaminChipSizes.medium() | VitaminChipSizes.small())
`onClick: (() -> Unit)?` | Callback to be called when the action Chip is clicked
`leadingIcon: (@Composable () -> Unit)?` | Optional Content to be displayed before label into the Chip

_In your project :_
```kotlin
VitaminChips.Action(
    label = "Share",
    onClick = {},
    leadingIcon = {
        Icon(
            painter = painterResource(id = R.drawable.ic_vtmn_share_line),
            contentDescription = null
        )
    }
)
```

### Filter Chip

Filter chips are used as filters for list or content.
Multiple chips can be selected or unselected.
A selected Filter Chip displays a tick as start content.

```kotlin
object VitaminChips {

    @Composable
    fun Filter(
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        selected: Boolean = false,
        colors: SelectableChipColors = VitaminChipColors.selectable(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        onClick: () -> Unit
    )
}

```

Parameters | Descriptions
-- | --
`label: String` | Text to be displayed into the Chip
`modifier: Modifier` | `Modifier` to be applied to the component
`enabled: Boolean` | True if you can click on the Chip. Default is true.
`selected: Boolean` | If True, leading tick Icon will be displayed. Default is false.
`colors: SelectableChipColors` | Colors to be applied to the Chip, default selectable()
`sizes: ChipSizes` | Sizes to be applied to the Chip. (default VitaminChipSizes.medium() | VitaminChipSizes.small())
`onClick: (() -> Unit)?` | Callback to be called when the Chip is clicked

_In your project :_
```kotlin
VitaminChips.Filter(
    label = "Climbing",
    selected = true,
    sizes = VitaminChipSizes.small(),
    onClick = { 
        // callback when chip is clicked
    }
)
```

### Input Chip

Input chips represent complex information used in fields or filters, like person, place, thing, attributes, or text.
An icon or an image can be used to give information about the kind of information.
If both icon and Content are given, the icon will be displayed. 

```kotlin
object VitaminChips {

    @Composable
    fun Input(
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: SelectableChipColors = VitaminChipColors.selectable(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        onClick: () -> Unit,
        leadingIcon: (@Composable () -> Unit)? = null,
        leadingContent: (@Composable () -> Unit)? = null
    )
}
```

Parameters | Descriptions
-- | --
`label: String` | Text to be displayed into the Chip
`selected: Boolean,` | True if the Chip is selected, otherwise false
`modifier: Modifier` | `Modifier` to be applied to the component
`enabled: Boolean` | True if you can click on the Chip. Default is true.
`colors: ChipColors` | Colors to be applied to the Chip
`sizes: ChipSizes` | Sizes to be applied to the Chip. (default VitaminChipSizes.medium() | VitaminChipSizes.small())
`onClick: (() -> Unit)?` | Callback to be called when the Chip is clicked
`leadingIcon: (@Composable () -> Unit)` | Icon Content to be displayed before label into the Chip
`leadingContent: (@Composable () -> Unit)` | Content to be displayed before label into the Chip

_In your project :_

#### Text alone
```kotlin
VitaminChips.Input(
    label = "Walking",
    onClick = {
        // Callback to handle Chip state 
    }
)
```

#### With Icon
```kotlin
VitaminChips.InputWithIcon(
    label = "Walking",
    onClick = {
        // Callback to handle Chip state 
    },
    leadingIcon = {
        Icon(
            painter = painterResource(
                id = R.drawable.ic_vtmn_walk_line
            ),
            contentDescription = null
        )
    }
)
```

#### With Image
```kotlin
VitaminChips.InputWithImage(
    label = "Walking",
    onClick = {
        // Callback to handle Chip state 
    },
    leadingContent = {
        Image(
            painter = painterResource(R.drawable.vtmn_flag_fr),
            contentScale = ContentScale.Crop,
            alignment = Alignment.Center,
            contentDescription = null
        )
    }
)
```

### Single Choice Chip

Single choice chips allow the selection of a single chip from a set of options.

```kotlin
object VitaminChips {
    
    @Composable
    fun SingleChoice(
        label: String,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        selected: Boolean = false,
        colors: SelectableChipColors = VitaminChipColors.selectable(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        onClick: () -> Unit
    )
}
```

Parameters | Descriptions
-- | --
`label: String` | Text to be displayed into the Chip
`modifier: Modifier` | `Modifier` to be applied to the component
`enabled: Boolean` | True if you can click on the Chip. Default is true.
`selected: Boolean` | True if the Chip is selected. Default is false.
`colors: ChipColors` | Colors to be applied to the Chip
`sizes: ChipSizes` | Sizes to be applied to the Chip. (default VitaminChipSizes.medium() | VitaminChipSizes.small())
`onClick: (() -> Unit)?` | Callback to be called when the action Chip is clicked

_In your project :_
```kotlin
VitaminChips.SingleChoice(
    label = "Easy",
    onClick = { 
        // Callback to handle Single selection
    }
)
```

