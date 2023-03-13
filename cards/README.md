# Card components

## Card design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/726f8c765/p/88fc2b-card/b/51e109).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:cards:<versions>")
```

### Primary

**Cards**

```kotlin
object VitaminCards {
    @Composable
    fun Primary(
        modifier: Modifier = Modifier,
        colors: CardColors = VitaminCardsColors.primary(),
        sizes: CardSizes = VitaminCardSizes.medium(),
        content: @Composable () -> Unit
    )
}
```

The card is a flexible and extensible content container.

It can be composed of:

- A customizable media area (full or fit image) at the top
- A content area with title + text
- Additional content areas (tag, price, additional information...)
- A call-to-action area at the bottom
Most of the time the card is used to convey one single idea, and it serves as a call to action to have more detailed content.

The minimal usage of the component is the text of the button but you can add an icon or customize
the size with a medium or large size variants.

```kotlin
VitaminCards.Primary {
    // Add card content here
}
```

Parameters | Descriptions
-- | --
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`colors: CardColors = VitaminCardColors.primary()` | The colors for the card, background and content colors of the card can be customized
`sizes: CardSizes = VitaminCardSizes.medium()` | The sizes for the card, elevation and radius can be customized
`content: @Composable () -> Unit` | The content to add inside the card