# Tag components

## Tag design specs

You can find the design specs on [decathlon.design - tag (android)](https://www.decathlon.design/726f8c765/p/129f57-tag/b/93aae6).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:tags:<versions>")
```

### Brand

```kotlin
object VitaminTags {
    @Composable
    fun Brand(
        label: String,
        modifier: Modifier = Modifier,
        iconPainter: Painter? = null,
        colors: TagColors = VitaminTagColors.brand(),
        sizes: TagSizes = VitaminTagSizes.medium(),
        onClick: (() -> Unit)? = null,
    )
}
```

Tags highlights, organizes and categorizes items.

The minimal usage of this component is a label:

```kotlin
VitaminTags.Brand(label = "Tag label")
```

Parameters | Descriptions
-- | --
`label: String` | The item label
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`iconPainter: Painter? = null` | the `Painter` resource used for the icon
`colors: TagColors = VitaminTagColors.brand()` | define the background and text color used to accentuate the tag
`sizes: TagSizes = VitaminTagSizes.medium()` | The sizes for the text, paddings and icon sizes
`onClick: (() -> Unit)? = null` | The callback to be called when the user click on the tag

### All Variants

There are multiple variants of the tag with the same parameters:

* `Accent`: Accent tag accentuate an item.
* `Alert`: Alert tag accentuate an item.
* `DecorativeGravel`: Decorative tag can be used to organize a large amount of content.
* `DecorativeBrick`: Decorative tag can be used to organize a large amount of content.
* `DecorativeSaffron`: Decorative tag can be used to organize a large amount of content.
* `DecorativeGold`: Decorative tag can be used to organize a large amount of content.
* `DecorativeJade`: Decorative tag can be used to organize a large amount of content.
* `DecorativeEmerald`: Decorative tag can be used to organize a large amount of content.
* `DecorativeCobalt`: Decorative tag can be used to organize a large amount of content.
* `DecorativeAmethyst`: Decorative tag can be used to organize a large amount of content. 
