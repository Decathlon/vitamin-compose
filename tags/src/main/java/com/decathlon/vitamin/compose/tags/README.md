# Tag components

##Tag design specs

You can find the design specs on [decathlon.design - tag (android)](https://www.decathlon.design/726f8c765/p/129f57-tag/b/93aae6).

## Usage

If you want to use components of this module in your android mobile application, you should
first add the Gradle dependency in your Gradle file:

```kotlin
implementation("com.decathlon.vitamin.compose:tags:<versions>")
```

### Tags

The minimal usage of this component is a label:

```kotlin
 VitaminTag(label = "Tag label")
```

A tag with vitamin `accent` color as a background, with an icon and which is clickable may look like this :
```kotlin
VitaminTag(
    label = "Accent tag",
    color = VitaminTagColors.accent(),
    iconPainter = painterResource(id = R.drawable.ic_vtmn_football_fill),
    onClick = {}
)
```

| Parameters | Descriptions |
| ---------- | ------------ |
| `label: String` | The label of the tag |
| `modifier: Modifier = Modifier` | The modifier to be applied to the tag. |
| `variant: VitaminTagColor = VitaminTagColors.brand()` | The `VitaminTagColor` to color the tag |
| `textStyle: TextStyle = VitaminTheme.typography.body3` | The style to be applied to the text label in the tag. |
| `iconPainter: Painter? = null` | The icon to display at the left of the label. ⚠️ Be careful to use vector drawable with a single item inside and with no `<selector>`. |
| `onClick: (() -> Unit)? = null` | The callback to be called if the tag is clicked. |