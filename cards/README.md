# Cards components

## Card design specs

A card is used to organize and display content about a single topic.

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:cards:<versions>")
```

## Variants

There are 4 type of cards :

- Top Image : card with image at top
- Side Image : card with thumbnail image at left
- Full Image : card with full image background
- Without Image : card without image

All cards variant can use a pre-defined layout for its content or a custom content.

### Top image

```kotlin
object VitaminCards {
    @Composable
    fun TopImage(
        painter: Painter,
        contentDescription: String?,
        content: @Composable (TopImageContent.() -> Unit),
        modifier: Modifier = Modifier,
        shape: Shape = RoundedCornerShape(4.dp),
        imageScale: VitaminCardImageScale = VitaminCardImageScale.Fit,
        imageOverlayAlignment: Alignment = Alignment.TopStart,
        imageOverlay: (@Composable () -> Unit)? = null,
    )
    /* ... */
}
```

The Top image card car have multiple variant :

- Fit image at top (default)
- Full image at top
- Image with overlay to set for example tags


The minimal usage of the component is an image, its content description and a content.

```kotlin
VitaminCards.TopImage(
    painter = painterResource(id = R.drawable.image),
    contentDescription = "We should set here a description " +
            "of the content if not decorative, otherwise null",
    content = {
        TitleAndText(
            title = "Card Top image - Full",
            text = "A container for content representing a single entity. " +
                    "e.g. a contact, article, or task."
        )
    }
)
```

Parameters | Descriptions
-- | --
`painter: Painter` | the `Painter` resource for the image
`contentDescription: String?` | to describe image for screen reader. Set to null only if image is decorative.
`content: @Composable (TopImageContent.() -> Unit)` | The content of the card. Can be a composable from `TopImageContent` or a custom composable.
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`shape: Shape = RoundedCornerShape(4.dp)` | to change the shape of the card.
`imageScale: VitaminCardImageScale = VitaminCardImageScale.Fit` | If an icon is added, you can configure the side at the start or end of the button
`imageOverlayAlignment: Alignment = Alignment.TopStart` | The overlay position if overlay is set. Default is `Alignment.TopStart`
`imageOverlay: (@Composable () -> Unit)? = null` | The overlay to set upon the image. No overlay by default.


There is a default implementation for the Top image content to display a title with a text underneath. For that you can `TopImageContent.TitleAndText` composable.

```kotlin
object TopImageContent {
    @Composable
    fun TitleAndText(
        title: String,
        text: String
    )
}
```

### Full image

```kotlin
object VitaminCards {
    @Composable
    fun FullImage(
        painter: Painter,
        contentDescription: String?,
        content: @Composable (FullImageContent.() -> Unit),
        modifier: Modifier = Modifier,
        shape: Shape = RoundedCornerShape(4.dp),
        imageWithGradient: Boolean = false,
    )
    /* ... */
}
```

The Full image card car have multiple variant :

- Full image with gradiant
- Full image at top
- Image with overlay to set for example tags


The minimal usage of the component is an image, its content description and a content.

```kotlin
VitaminCards.FullImage(
    painter = painterResource(id = R.drawable.image),
    contentDescription = "We should set here a description " +
            "of the content if not decorative, otherwise null",
    content = {
        TitleTextAndButton(
            title = "Card Title - Clickable card",
            text = "A container for content representing a single entity. " +
                    "e.g. a contact, article, or task.",
            buttonText = "Button",
            onButtonClick = {}
        )
    }
)
```

Parameters | Descriptions
-- | --
`painter: Painter` | the `Painter` resource for the image
`contentDescription: String?` | to describe image for screen reader. Set to null only if image is decorative.
`content: @Composable (FullImageContent.() -> Unit)` | The content of the card. Can be a composable from `FullImageContent` or a custom composable.
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component.
`shape: Shape = RoundedCornerShape(4.dp)` | to change the shape of the card.
`imageWithGradient: Boolean = false` | A boolean value to add a gradient effect to the image. No gradient by default.


There is a default implementation for the Full image content to display a title , a text underneath and a button. For that you can `FullImageContent.TitleTextAndButton` composable.

```kotlin
object FullImageContent {
    @Composable
    fun TitleTextAndButton(
        title: String,
        text: String,
        buttonText: String,
        onButtonClick: (() -> Unit)
    )
}
```

### Side image

```kotlin
object VitaminCards {
    @Composable
    fun SideImage(
        painter: Painter,
        contentDescription: String?,
        content: (@Composable SideImageContent.() -> Unit),
        modifier: Modifier = Modifier,
        actionContent: @Composable (SideImageActionContent.() -> Unit)? = null,
        shape: Shape = RoundedCornerShape(4.dp),
    )
    /* ... */
}
```

The Side image card car have multiple variant :

- Side image
- Side image with actions

The minimal usage of the component is an image, its content description and a content.

```kotlin
VitaminCards.SideImage(
    painter = painterResource(id = R.drawable.image),
    contentDescription =  "We should set here a description " +
            "of the content if not decorative, otherwise null",
    content = {
        TitleAndText(
            title = "Card Side",
            text = "A container for content representing a single entity. e.g. a contact, article, or task.",
        )
    }
)
```

Parameters | Descriptions
-- | --
`painter: Painter` | the `Painter` resource for the image
`contentDescription: String?` | to describe image for screen reader. Set to null only if image is decorative.
`content: @Composable (SideImageContent.() -> Unit)` | The content of the card. Can be a composable from `SideImageContent` or a custom composable.
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component.
`actionContent: @Composable (SideImageActionContent.() -> Unit)? = null` | to add actions icons at the top end of the card like clickable icon. Can be a composable from `SideImageActionContent` or a custom composable.
`shape: Shape = RoundedCornerShape(4.dp)` | to change the shape of the card.

There is a default implementation for the Side image content to display a title and a text underneath.

```kotlin
object SideImageContent {
    @Composable
    fun TitleAndText(
        title: String,
        text: String
    )
}
```

There is a default implementation for actions icons that can be displayed on the top end of the card.

```kotlin
object SideImageActionContent {
    @Composable
    fun Icons(
        actions: List<CardActionItem>
    )
}
```

Where `CardActionItem` helps you define each icon painter, its content description and the callback for the click action.

```kotlin
open class CardActionItem(
val painter: Painter,
val contentDescription: String?,
val onClick: () -> Unit,
)
```


### Without image

```kotlin
object VitaminCards {
    @Composable
    fun WithoutImage(
        content: (@Composable WithoutImageContent.() -> Unit),
        modifier: Modifier = Modifier,
        shape: Shape = RoundedCornerShape(4.dp),
    )
    /* ... */
}
```

The minimal usage of the component is a content.

```kotlin
VitaminCards.WithoutImage(
    content = {
        TitleAndText(
            title = "Card without image",
            text = "A container for content representing a single entity. e.g. a contact, article, or task."
        )
    }
)
```

Parameters | Descriptions
-- | --
`content: @Composable (WithoutImageContent.() -> Unit)` | The content of the card. Can be a composable from `WithoutImageContent` or a custom composable.
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component.
`shape: Shape = RoundedCornerShape(4.dp)` | to change the shape of the card.

There is a default implementation for the Side image content to display a title and a text underneath.

```kotlin
object WithoutImageContent {
    @Composable
    fun TitleAndText(
        title: String,
        text: String
    )
}
```