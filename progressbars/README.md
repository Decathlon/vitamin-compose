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
        label: String? = null,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        sizes: LinearProgressBarSizes = VitaminLinearProgressBarSizes.medium(),
    )
}
```

Linear progress indicators displays the length of a process.

The minimal usage of the component is the progression but you can customize the size and add
a label above the progress bar.

```kotlin
VitaminProgressBars.Linear(
    progress = 0.1f,
    label = "Download"
)
```

Parameters | Descriptions
-- | --
`progress: Float` | The progress of this progress indicator, where 0.0 represents no progress and 1.0 represents full progress
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`label: String? = null` | The optional label above the progress bar with the progression at the end
`colors: ProgressBarColors = VitaminProgressBarColors.primary()` | The colors of the background, the progress and the label
`sizes: LinearSizes = VitaminLinearProgressBarSizes.medium()` | Different sizes for the progress bar

#### Indeterminate

```kotlin
object VitaminProgressBars {
    @Composable
    fun Linear(
        modifier: Modifier = Modifier,
        label: String? = null,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        sizes: LinearProgressBarSizes = VitaminLinearProgressBarSizes.medium(),
    )
}
```

Linear progress indicators express an unspecified wait time.

The minimal usage of the component is simply the declaration of the component without any
parameter but you can customize the size and add a label above the progress bar.

```kotlin
VitaminProgressBars.Linear(
    label = "Download"
)
```

Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`label: String? = null` | The optional label above the progress bar with the progression at the end
`colors: ProgressBarColors = VitaminProgressBarColors.primary()` | The colors of the background, the progress and the label
`sizes: LinearSizes = VitaminLinearProgressBarSizes.medium()` | Different sizes for the progress bar

### Circular ProgressBars

#### Progression

```kotlin
object VitaminProgressBars {
    @Composable
    fun Circular(
        progress: Float,
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        sizes: CircularProgressBarSizes = VitaminCircularProgressBarSizes.smallSize(),
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
`colors: ProgressBarColors = VitaminProgressBarColors.primary()` | The colors of the background, the progress and the optional label
`sizes: CircularProgressBarSizes = VitaminCircularProgressBarSizes.smallSize()` | Different sizes for the progress bar
`content: (@Composable VitaminCircularContent.() -> Unit)? = null` | The optional content inside the circular progress bar

#### Indeterminate

```kotlin
object VitaminProgressBars {
    @Composable
    fun Circular(
        modifier: Modifier = Modifier,
        colors: ProgressBarColors = VitaminProgressBarColors.primary(),
        sizes: CircularProgressBarSizes = VitaminCircularProgressBarSizes.smallSize(),
        content: (@Composable VitaminCircularContent.() -> Unit)? = null
    )
}
```

Circular progress indicators express an unspecified wait time.

The minimal usage of the component is simply the declaration of the component without any
parameter but you can customize the size and add a content inside the circular progress bar.

```kotlin
VitaminProgressBars.Circular(
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
`colors: ProgressBarColors = VitaminProgressBarColors.primary()` | The colors of the background, the progress and the optional label
`sizes: CircularProgressBarSizes = VitaminCircularProgressBarSizes.smallSize()` | Different sizes for the progress bar
`content: (@Composable VitaminCircularContent.() -> Unit)? = null` | The optional content inside the circular progress bar
