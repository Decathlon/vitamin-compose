# Price components

## Price design specs

You can find the design specs on [decathlon.design - Price (android)](https://www.decathlon.design/726f8c765/p/81e6be-price).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:prices:<versions>")
```

### Default

```kotlin
object VitaminPrices {
    @Composable
    fun Default(
        text: String,
        modifier: Modifier = Modifier,
        colors: PriceColors = VitaminPriceColors.default(),
        sizes: PriceSizes = VitaminPriceSizes.medium(),
    )
}
```

A price is used to display the monetary value of a product or service.

The minimal usage of the component is the text of the price but you can customize the size with 
a small, medium or large size variants and colors with default, accent, alert and strikethrough.

```kotlin
VitaminPrices.Alert(
    text = "250 €"
)
```

Parameters | Descriptions
-- | --
`text: String` | The text of the price
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`colors: PriceColors = VitaminPriceColors.default()` | The colors of the background and the content elements
`sizes: PriceSizes = VitaminPriceSizes.medium()` | The sizes for the text

### All Variants

There are multiple variants of the price with the same parameters:

* `Accent`: Accent price is used to display the monetary value of a product or service.
* `Alert`: Alert price is used to display the monetary value of a product or service.
* `Strikethrough`: Strikethrough price is used to display the monetary value of a product or service.
