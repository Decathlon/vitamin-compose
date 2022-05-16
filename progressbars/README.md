# ProgressBars components

## ProgressBar design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:progressbars:<versions>")
```

### Linear ProgressBars

#### Progression

```kotlin
object VitaminProgressBars {
    @Composable
    fun Linear(
        progress: Float,
        modifier: Modifier = Modifier,
        size: LinearSizes = VitaminLinearProgressBarSizes.smallSize(),
        label: String? = null
    )
}
```

Linear progress indicators displays the length of a process.

The minimal usage of the component is the progression but you can customize the size and add
a label above the progress bar.

```kotlin
VitaminProgressBars.Linear(
    progress = 0.1f,
    modifier = Modifier.progressScreenModifier(),
    size = VitaminLinearProgressBarSizes.smallSize(),
    label = "Download"
)
```

Parameters | Descriptions
-- | --
`progress: Float` | The progress of this progress indicator, where 0.0 represents no progress and 1.0 represents full progress
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`size: LinearSizes = VitaminLinearProgressBarSizes.smallSize()` | Different sizes for the progress bar
`label: String? = null` | The optional label above the progress bar with the progression at the end

#### Indeterminate

```kotlin
object VitaminProgressBars {
    @Composable
    fun Linear(
        modifier: Modifier = Modifier,
        size: LinearSizes = VitaminLinearProgressBarSizes.smallSize(),
        label: String? = null
    )
}
```

Linear progress indicators express an unspecified wait time.

The minimal usage of the component is simply the declaration of the component without any
parameter but you can customize the size and add a label above the progress bar.

```kotlin
VitaminProgressBars.Linear(
    modifier = Modifier.progressScreenModifier(),
    size = VitaminLinearProgressBarSizes.smallSize(),
    label = "Download"
)
```

Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`size: LinearSizes = VitaminLinearProgressBarSizes.smallSize()` | Different sizes for the progress bar
`label: String? = null` | The optional label above the progress bar with the progression at the end

### Circular ProgressBars

#### Progression

```kotlin
object VitaminProgressBars {
    @Composable
    fun Circular(
        progress: Float,
        modifier: Modifier = Modifier,
        size: CircularSizes = VitaminCircularProgressBarSizes.smallSize(),
        content: (@Composable VitaminCircularContent.() -> Unit)? = null
    )
}
```

Circular progress indicators displays the length of a process.

The minimal usage of the component is the progression but you can customize the size and add
a content inside the circular progress bar.

```kotlin
VitaminProgressBars.Circular(
    progress = 0.6f,
    modifier = Modifier.progressScreenModifier(),
    size = VitaminCircularProgressBarSizes.mediumSize(),
    content = {
        ImageCircular(
            painter = painterResource(id = R.drawable.store_decathlon),
            contentDescription = "Decathlon Store"
        )
    }
)
```

Parameters | Descriptions
-- | --
`progress: Float` | The progress of this progress indicator, where 0.0 represents no progress and 1.0 represents full progress
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`size: CircularSizes = VitaminCircularProgressBarSizes.smallSize()` | Different sizes for the progress bar
`content: (@Composable VitaminCircularContent.() -> Unit)? = null` | The optional content inside the circular progress bar

#### Indeterminate

```kotlin
object VitaminProgressBars {
    @Composable
    fun Circular(
        modifier: Modifier = Modifier,
        size: CircularSizes = VitaminCircularProgressBarSizes.smallSize(),
        content: (@Composable VitaminCircularContent.() -> Unit)? = null
    )
}
```

Circular progress indicators express an unspecified wait time.

The minimal usage of the component is simply the declaration of the component without any
parameter but you can customize the size and add a content inside the circular progress bar.

```kotlin
VitaminProgressBars.Circular(
    modifier = Modifier.progressScreenModifier(),
    size = VitaminCircularProgressBarSizes.mediumSize(),
    content = {
        ImageCircular(
            painter = painterResource(id = R.drawable.store_decathlon),
            contentDescription = "Decathlon Store"
        )
    }
)
```

Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`size: CircularSizes = VitaminCircularProgressBarSizes.smallSize()` | Different sizes for the progress bar
`content: (@Composable VitaminCircularContent.() -> Unit)? = null` | The optional content inside the circular progress bar
