# Chip components

Chips appear dynamically as a group of multiple interactive elements. With chips, users can filter content, enter information, make selections or trigger actions.

## Chip design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:chip:<versions>")
```

### Action

```kotlin
object VitaminChips {

    @ExperimentalMaterialApi
    @Composable
    fun Action(
        label: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        startIcon: (@Composable () -> Unit)? = null,
        enabled: Boolean = true,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        ripples: RippleTheme = VitaminChipRipples.default()
    )
}

```

Action chip offers actions related to the content related to. 
It appears dynamically and contextually in the interface.


```kotlin
VitaminChips.Action(
    label = "Share",
    onClick = {},
    startIcon = {
        Icon(
            painter = painterResource(id = R.drawable.ic_vtmn_share_line),
            contentDescription = null
        )
    },
    enabled = actionChipsEnabled
)
```

Parameters | Descriptions
-- | --
`label: String` | Text to be displayed into the Chip
`onClick: (() -> Unit)?` | Callback to be called when the action Chip is clicked
`modifier: Modifier = Modifier` | `Modifier` to be applied to the component
`startIcon: (@Composable () -> Unit)? = null` | Optional Content to be displayed before label into the Chip
`enabled: Boolean = true` | True if you can click on the Chip, otherwise false
`colors: ChipColors = VitaminChipColors.default()` | Colors to be applied to the Chip
`sizes: ChipSizes = VitaminChipSizes.medium()` | Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
`ripples: RippleTheme` | The ripple effect to be applied to the Chip

### Filter Chip

```kotlin
object VitaminChips {

    @ExperimentalMaterialApi
    @Composable
    fun Filter(
        label: String,
        onClick: (Boolean) -> Unit,
        selected: Boolean,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        ripples: RippleTheme = VitaminChipRipples.default()
    )
}

```

Filter chips are used as filters for list or content. 
Multiple chips can be selected or unselected.
A selected Filter Chip displays a tick as start content. 

```kotlin
VitaminChips.Filter(
    label = "Climbing",
    onClick = { isSelected ->
        // callback to change Chip state
    },
    selected = true,
    sizes = VitaminChipSizes.small()
)
```

Parameters | Descriptions
-- | --
`label: String` | Text to be displayed into the Chip
`onClick: (() -> Unit)?` | Callback to be called when the action Chip is clicked
`selected: Boolean,` | True if the Chip is selected, otherwise false
`modifier: Modifier = Modifier` | `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can click on the Chip, otherwise false
`colors: ChipColors = VitaminChipColors.default()` | Colors to be applied to the Chip
`sizes: ChipSizes = VitaminChipSizes.medium()` | Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
`ripples: RippleTheme` | The ripple effect to be applied to the Chip


### Input Chip

```kotlin
object VitaminChips {

    @ExperimentalMaterialApi
    @Composable
    fun Input(
        label: String,
        onClick: (Boolean) -> Unit,
        selected: Boolean,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        startContent: (@Composable () -> Unit)? = null,
        removeContent: (@Composable VitaminChipButtons.() -> Unit)? = null,
        colors: ChipColors = VitaminChipColors.default(),
        sizes: ChipSizes = VitaminChipSizes.medium(),
        ripple: RippleTheme = VitaminChipRipples.default()
    )
}

```

Input chips represent complex information used in fields or filters, like person, place, thing, attributes, or text. 
An icon or an image can be used to give information about the kind of information.

```kotlin
VitaminChips.Input(
    label = "Walking",
    onClick = { selected -> 
        // Callback to handle Chip state
    },
    startContent = {
        Icon(
            painter = painterResource(
                id = R.drawable.ic_vtmn_walk_line
            ),
            contentDescription = null
        )
    },
    removeContent = {
        Close(
            onClick = { 
                // Callback when endContent is clicked
            }
        )
    }
)
```

Parameters | Descriptions
-- | --
`label: String` | Text to be displayed into the Chip
`onClick: (() -> Unit)?` | Callback to be called when the action Chip is clicked
`selected: Boolean,` | True if the Chip is selected, otherwise false
`modifier: Modifier = Modifier` | `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can click on the Chip, otherwise false
`startContent: (@Composable () -> Unit)? = null` | Optional Content to be displayed before label into the Chip
`removeContent: (@Composable VitaminChipButtons.() -> Unit)? = null` | Optional Content to be displayed after label into the Chip
`colors: ChipColors = VitaminChipColors.default()` | Colors to be applied to the Chip
`sizes: ChipSizes = VitaminChipSizes.medium()` | Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
`ripple: RippleTheme` | The ripple effect to be applied to the Chip

### Single Choice Chip

Single choice chips allow the selection of a single chip from a set of options.

```kotlin
VitaminChips.Input(
    label = "Walking",
    onClick = { selected -> 
        // Callback to handle Single selection
    }
)
```

Parameters | Descriptions
-- | --
`label: String` | Text to be displayed into the Chip
`onClick: (() -> Unit)?` | Callback to be called when the action Chip is clicked
`selected: Boolean,` | True if the Chip is selected, otherwise false
`modifier: Modifier = Modifier` | `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can click on the Chip, otherwise false
`startContent: (@Composable () -> Unit)? = null` | Optional Content to be displayed before label into the Chip
`removeContent: (@Composable VitaminChipButtons.() -> Unit)? = null` | Optional Content to be displayed after label into the Chip
`colors: ChipColors = VitaminChipColors.default()` | Colors to be applied to the Chip
`sizes: ChipSizes = VitaminChipSizes.medium()` | Sizes to be applied to the Chip. (VitaminChipSizes.medium() | VitaminChipSizes.small())
`ripple: RippleTheme` | The ripple effect to be applied to the Chip
