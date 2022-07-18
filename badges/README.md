# Badge components

## Badge design specs

You can find the design specs on [decathlon.design](https://www.decathlon.design/).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:badges:<versions>")
```

### VitaminCountBadges

```kotlin
object VitaminCountBadges {
    @Composable
    fun Default(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        colors: BadgeColors = VitaminBadgeColors.default(),
        sizes: BadgeSizes = VitaminBadgeSizes.small(),
        anchor: @Composable BoxScope.() -> Unit,
    )
}
```

The minimal usage of the component is the count of the badge and the anchor (Image or other composable). 
Customize the size with a small, medium or large size variants
Customize the badge style with BadgeStyle object
Select the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )

```kotlin
VitaminCountBadges.Default(count = 5) {
    //YOUR COMPOSABLE CONTENT
}
```

Parameters | Descriptions
-- | --
`count: Int` | the text inside the badge
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`nbMaxChar: Int = LayoutId.defaultMaxChar` | the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
`colors: BadgeColors = VitaminBadgeColors.default()` | the colors of the background and text 
`sizes: BadgeSizes = VitaminBadgeSizes.small()` | the sizes of the text and padding
`anchor: @Composable BoxScope.() -> Unit`| the icon or content which own the badge

### VitaminStandaloneBadges

```kotlin
object VitaminStandaloneBadges {
    @Composable
    fun Default(
        count: Int,
        modifier: Modifier = Modifier,
        nbMaxChar: Int = LayoutId.defaultMaxChar,
        areHiddenItemsLeft: Boolean = false,
        colors: BadgeColors = VitaminBadgeColors.default(),
        sizes: BadgeSizes = VitaminBadgeSizes.small(),
    )
}
```

The minimal usage of the component is the count of the badge
Customize the size with a small, medium or large size variants
Customize the badge style with BadgeStyle object
Select the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
select if the badge is use to hidden more elements ex (+4)

```kotlin
VitaminStandaloneBadges.Default(count = 5)
```

Parameters | Descriptions
-- | --
`count: Int`| the text inside de badge
`modifier: Modifier = Modifier` | The `Modifier` to be applied to the component
`nbMaxChar: Int = LayoutId.defaultMaxChar` | the number of digit that you want before "+" (nbMaxChar = 2, count= 110, result = 99+ )
`areHiddenItemsLeft: Boolean`| check if the badge is use to hidden more elements ex (+4)
`colors: BadgeColors = VitaminBadgeColors.default()` | the colors of the background and text
`sizes: BadgeSizes = VitaminBadgeSizes.small()` | the sizes of the text and padding

### VitaminBadges without count

```kotlin
object VitaminBadges {
    @Composable
    fun Default(
        colors: BadgeColors = VitaminBadgeColors.default(),
        anchor: @Composable BoxScope.() -> Unit
    )
}
```
The minimal usage of the component is the anchor (Image or other composable).
You can customize the backgroundColor of the badge

```kotlin
VitaminBadges.Default {
    //YOUR COMPOSABLE CONTENT 
}
```

Parameters | Descriptions
-- | --
`colors: BadgeColors = VitaminBadgeColors.default()`| color of the badge background
`anchor: @Composable BoxScope.() -> Unit`| the icon or content which own the badge

### All Variants

There are multiple variants of the badge with the same parameters:

* `Brand`: should be used to help draw attention to a new element (ex: the number of unread messages).`
* `Reversed`: should be used on dark backgrounds to highlight contrast.`
* `Accent`:  should be used with a shopping cart icon to indicate the number of items currently in the cart that are awaiting checkout.`
* `Alert`: should be used with a label or an icon for alerts.
