# Rating components

## Rating design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:ratings:<versions>")
```

### Read Only

```kotlin
object VitaminRatings {
    @Composable
    fun ReadOnly(
        number: Float,
        modifier: Modifier = Modifier,
        showNote: Boolean = false,
        nbComments: Int? = null,
        maxValue: Int = 5,
        colors: RatingsColors = VitaminRatingsColors.primary(),
        sizes: RatingsSizes = VitaminRatingsSizes.mediumSize()
    )
}
```

The read only rating displays a note with 5 stars by default and can optionally display the
note with the number of comments at the end of the stars.

The minimal usage of the component is the note you want to display but you can customize the
colors and the sizes of the component with multiple variants.

```kotlin
VitaminRatings.ReadOnly(number = 4.86f)
```

Parameters | Descriptions
-- | --
`number: Float` | The note of the rating component
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`showNote: Boolean = false` | Displays the note and the number of comments at the end of the stars
`nbComments: Int? = null` | Number of comments attached to the note. Null if you want to display nothing
`maxValue: Int = 5` | Max value of the note. By default, 5
`colors: RatingsColors = VitaminRatingsColors.primary()` | Primary or emphasis colors applied on stars
`sizes: RatingsSizes = VitaminRatingsSizes.mediumSize()` | Small or medium size applied on stars and text if they are displayed

### ReadOnlyCompact

```kotlin
object VitaminRatings {
    @Composable
    fun ReadOnlyCompact(
        number: Float,
        modifier: Modifier = Modifier,
        nbComments: Int? = null,
        maxValue: Int = 5,
        colors: RatingsColors = VitaminRatingsColors.primary(),
        sizes: RatingsSizes = VitaminRatingsSizes.mediumSize(),
    )
}
```

The read only compact rating displays a note with 1 star and the note with the number of
comments at the end of the stars.

The minimal usage of the component is the note you want to display but you can customize the
colors and the sizes of the component with multiple variants.

```kotlin
VitaminRatings.ReadOnlyCompact(number = 4.86f)
```

Parameters | Descriptions
-- | --
`number: Float` | The note of the rating component
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`nbComments: Int? = null` | Number of comments attached to the note. Null if you want to display nothing
`maxValue: Int = 5` | Max value of the note. By default, 5
`colors: RatingsColors = VitaminRatingsColors.primary()` | Primary or emphasis colors applied on stars
`sizes: RatingsSizes = VitaminRatingsSizes.mediumSize()` | Small or medium size applied on stars and text if they are displayed

### Interactive

```kotlin
object VitaminRatings {
    @Composable
    fun Interactive(
        number: Int,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        maxValue: Int = 5,
        colors: RatingsColors = VitaminRatingsColors.primary(),
        sizes: RatingsSizes = VitaminRatingsSizes.mediumSize(),
        onValueChange: (number: Int) -> Unit
    )
}
```

The interactive rating allows the user to click on one star to give a note.

The minimal usage of the component is the number of star marked as selected. If you give 0, no
star will be marked as selected.

```kotlin
VitaminRatings.ReadOnlyCompact(number = 3)
```

Parameters | Descriptions
-- | --
`number: Int` | The number of star marked as selected
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`enabled: Boolean = true` | True if you can give a note, otherwise false
`maxValue: Int = 5` | Max value of the note. By default, 5
`colors: RatingsColors = VitaminRatingsColors.primary()` | Primary or emphasis colors applied on stars
`sizes: RatingsSizes = VitaminRatingsSizes.mediumSize()` | Small or medium size applied on stars and text if they are displayed
`onValueChange: (number: Int) -> Unit` | The callback to be called when the user click on a star
