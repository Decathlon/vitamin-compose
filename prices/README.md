# Price components

##Price design specs

You can find the design specs on [decathlon.design - Price (android)](https://www.decathlon.design/726f8c765/p/81e6be-price).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:prices:<versions>")
```

### Prices

There is 4 types of price that you can use :
- Default
- Accent
- Alert
- Strikethrough

They all have only 1 mandatory parameter : text.

Size is represented by `VitaminPriceSize` class and there is 3 defaults implementation in Vitamin library :
- small
- medium
- large

A simple Price implementation looks like :

```kotlin
VitaminPrices.Alert(
    text = "250 €"
)
```


| Parameters | Descriptions |
| ---------- | ------------ |
| `text: String` | The text of the component |
| `size: VitaminPriceSize` | The `VitaminPriceSize` of the component |
| `modifier: Modifier = Modifier` | The modifier to be applied to the tag. |