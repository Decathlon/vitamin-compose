# Divider components

## Divider design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:dividers:<versions>")
```

### FullBleed

```kotlin
object VitaminDividers {
    @Composable
    fun FullBleed(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBorderSecondary,
        thickness: Dp = 1.dp
    )
}
```

Full-bleed dividers are used to separate sections, such as:

- List elements
- Layout elements

Full-bleed dividers separate content into sections. They can also be used to establish a hierarchy

```kotlin
VitaminDividers.FullBleed()
```

Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`color: Color = VitaminTheme.colors.vtmnBorderSecondary` | color of the divider line
`thickness: Dp = 1.dp` | thickness of the dividers line, 1 dp is used by default

### Inset

```kotlin
object VitaminDividers {
    @Composable
    fun Inset(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBorderSecondary,
        thickness: Dp = 1.dp,
        startIndent: Dp = 64.dp
    )
}
```

Inset dividers separate related content, such as list item or thread. They should be used with anchoring elements such as icons or avatars, and left-aligned with the app bar title to group items.

```kotlin
VitaminDividers.Inset()
```

Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`color: Color = VitaminTheme.colors.vtmnBorderSecondary` | color of the dividers line
`thickness: Dp = 1.dp` | thickness of the dividers line, 1 dp is used by default
`startIndent: Dp = 64.dp` | the start indent padding, default value is 64.dp

### Middle

```kotlin
object VitaminDividers {
    @Composable
    fun Middle(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBorderSecondary,
        thickness: Dp = 1.dp,
        startIndent: Dp = 32.dp,
        endIndent: Dp = 32.dp
    )
}
```

Middle dividers are used in the middle of the layout. They can be used for separating related content or actions

```kotlin
VitaminDividers.Middle()
```


Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`color: Color = VitaminTheme.colors.vtmnBorderSecondary` | color of the dividers line
`thickness: Dp = 1.dp` | thickness of the dividers line, 1 dp is used by default
`startIndent: Dp = 32.dp` | the start indent padding, default value is 32.dp
`endIndent: Dp = 32.dp` | the end indent padding, default value is 32.dp

