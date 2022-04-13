# Skeleton components

## Skeleton design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:skeleton:<versions>")
```

### Rectangular


```kotlin
object VitaminSkeleton {
    @Composable
    fun Rectangular(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
        highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        cornerRadius: Dp = 0.dp,
        contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)
    )
}
```

This component draw a rectangle. You can add a modifier, but you can also customize the colors and the corner radius of the shape.

```kotlin
VitaminSkeleton.Rectangular()
```

Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`color: Color = VitaminTheme.colors.vtmnBackgroundTertiary` | color of this skeleton shape
`highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary` | color of the shimmer effect
`cornerRadius: Dp = 0.dp` | size of the rectangle shape corner radius, no radius by default
`contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)` | the [String] for the content description

### Rounded

```kotlin
object VitaminSkeleton {
    @Composable
    fun Rounded(
        modifier: Modifier = Modifier,
        color: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
        highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
        contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)
    )
}
```

This component draw a round. You can add a modifier, but you can also customize the colors.

```kotlin
VitaminSkeleton.Rounded()
```

Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`color: Color = VitaminTheme.colors.vtmnBackgroundTertiary` | color of this skeleton shape
`highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary` | color of the shimmer effect
`contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)` | the [String] for the content description

### Modifier extension

```kotlin
fun Modifier.vtmnSkeleton(
    visible: Boolean = true,
    color: Color = VitaminTheme.colors.vtmnBackgroundTertiary,
    shape: Shape = RectangleShape,
    highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary,
    contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)
): Modifier
```

This Modifier extension allow to apply the shimmer effect on any @Composable

```kotlin
Box(
    modifier = Modifier
        .vtmnSkeleton()
)
```

Parameters | Descriptions
-- | --
`visible: Boolean = true` | visibility state of the shimmer effect
`color: Color = VitaminTheme.colors.vtmnBackgroundTertiary` | color of the skeleton shape
`shape: Shape = RectangleShape` | shape of the skeleton
`highlightColor: Color = VitaminTheme.colors.vtmnBackgroundPrimary` | color of the shimmer effect
`contentDescription: String = stringResource(R.string.vtmn_cd_is_loading)` | the [String] for the content description