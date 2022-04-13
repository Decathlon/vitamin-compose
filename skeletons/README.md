# Skeleton components

## Skeleton design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:skeletons:<versions>")
```

### Rectangular


```kotlin
object VitaminSkeleton {
    @Composable
    fun Rectangular(
        modifier: Modifier = Modifier,
        colors: SkeletonColors = VitaminSkeletonColors.primary(),
        cornerRadius: Dp = 0.dp
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
`colors: SkeletonColors = VitaminSkeletonColors.primary()` | The colors of the background and the highlight effect
`cornerRadius: Dp = 0.dp` | size of the rectangle shape corner radius, no radius by default

### Rounded

```kotlin
object VitaminSkeleton {
    @Composable
    fun Rounded(
        modifier: Modifier = Modifier,
        colors: SkeletonColors = VitaminSkeletonColors.primary(),
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
`colors: SkeletonColors = VitaminSkeletonColors.primary()` | The colors of the background and the highlight effect

### Modifier extension

```kotlin
fun Modifier.vtmnSkeleton(
    visible: Boolean = true,
    colors: SkeletonColors = VitaminSkeletonColors.primary(),
    shape: Shape = RectangleShape
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
`colors: SkeletonColors = VitaminSkeletonColors.primary()` | The colors of the background and the highlight effect
`shape: Shape = RectangleShape` | shape of the skeleton