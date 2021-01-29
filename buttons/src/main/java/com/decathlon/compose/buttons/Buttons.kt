package com.decathlon.compose.buttons

import androidx.compose.foundation.AmbientIndication
import androidx.compose.foundation.Indication
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.theme.VitaminTheme

@OptIn(ExperimentalMaterialApi::class)
object VitaminButtons {
  @Composable
  fun Primary(
    text: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconSide: IconSide = IconSide.LEFT,
    enabled: Boolean = true,
    size: ButtonSizes = VitaminButtonSizes.mediumSize(),
    onClick: () -> Unit
  ) = VitaminButton(
    text = text,
    icon = icon,
    iconSide = iconSide,
    enabled = enabled,
    ripple = rememberRipple(color = VitaminTheme.colors.textPrimary),
    size = size,
    modifier = modifier,
    onClick = onClick
  )

  @Composable
  fun PrimaryReversed(
    text: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconSide: IconSide = IconSide.LEFT,
    enabled: Boolean = true,
    size: ButtonSizes = VitaminButtonSizes.mediumSize(),
    onClick: () -> Unit
  ) = VitaminButton(
    text = text,
    icon = icon,
    iconSide = iconSide,
    enabled = enabled,
    colors = VitaminButtonsColors.primaryReversed,
    ripple = rememberRipple(color = VitaminButtonsColors.primary.backgroundColor(true)),
    border = VitaminButtonsBorders.primaryReversed,
    size = size,
    modifier = modifier,
    onClick = onClick
  )

  @Composable
  fun Secondary(
    text: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconSide: IconSide = IconSide.LEFT,
    enabled: Boolean = true,
    size: ButtonSizes = VitaminButtonSizes.mediumSize(),
    onClick: () -> Unit
  ) = VitaminButton(
    text = text,
    icon = icon,
    iconSide = iconSide,
    enabled = enabled,
    colors = VitaminButtonsColors.secondary,
    border = VitaminButtonsBorders.secondary,
    size = size,
    modifier = modifier,
    onClick = onClick
  )

  @Composable
  fun SecondaryReversed(
    text: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconSide: IconSide = IconSide.LEFT,
    enabled: Boolean = true,
    size: ButtonSizes = VitaminButtonSizes.mediumSize(),
    onClick: () -> Unit
  ) = VitaminButton(
    text = text,
    icon = icon,
    iconSide = iconSide,
    enabled = enabled,
    colors = VitaminButtonsColors.secondaryReversed,
    border = VitaminButtonsBorders.secondaryReversed,
    elevation = null,
    size = size,
    modifier = modifier,
    onClick = onClick
  )

  @Composable
  fun Ghost(
    text: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconSide: IconSide = IconSide.LEFT,
    enabled: Boolean = true,
    size: ButtonSizes = VitaminButtonSizes.mediumSize(),
    onClick: () -> Unit
  ) = VitaminButton(
    text = text,
    icon = icon,
    iconSide = iconSide,
    enabled = enabled,
    colors = VitaminButtonsColors.ghost,
    border = VitaminButtonsBorders.none,
    elevation = null,
    size = size,
    modifier = modifier,
    onClick = onClick
  )

  @Composable
  fun GhostReversed(
    text: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconSide: IconSide = IconSide.LEFT,
    enabled: Boolean = true,
    size: ButtonSizes = VitaminButtonSizes.mediumSize(),
    onClick: () -> Unit
  ) = VitaminButton(
    text = text,
    icon = icon,
    iconSide = iconSide,
    enabled = enabled,
    colors = VitaminButtonsColors.ghostReversed,
    border = VitaminButtonsBorders.none,
    elevation = null,
    size = size,
    modifier = modifier,
    onClick = onClick
  )

  @Composable
  fun Conversion(
    text: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    iconSide: IconSide = IconSide.LEFT,
    enabled: Boolean = true,
    size: ButtonSizes = VitaminButtonSizes.mediumSize(),
    onClick: () -> Unit
  ) = VitaminButton(
    text = text,
    icon = icon,
    iconSide = iconSide,
    enabled = enabled,
    colors = VitaminButtonsColors.conversion,
    ripple = rememberRipple(color = Color.White),
    border = VitaminButtonsBorders.none,
    size = size,
    modifier = modifier,
    onClick = onClick
  )
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
internal fun VitaminButton(
  text: String,
  modifier: Modifier = Modifier,
  icon: ImageVector? = null,
  iconSide: IconSide = IconSide.LEFT,
  enabled: Boolean = true,
  colors: ButtonColors = VitaminButtonsColors.primary,
  ripple: Indication = rememberRipple(color = colors.contentColor(enabled = enabled)),
  border: DefaultBorderStroke = VitaminButtonsBorders.primary,
  elevation: ButtonElevation? = ButtonDefaults.elevation(),
  size: ButtonSizes = VitaminButtonSizes.mediumSize(),
  style: TextStyle = VitaminTheme.typography.button,
  onClick: () -> Unit
) {
  val iconButton = @Composable {
    icon?.let {
      if (iconSide == IconSide.RIGHT) Spacer(Modifier.preferredWidth(ButtonIconPadding))
      Icon(
        imageVector = icon,
        modifier = Modifier.size(size.iconSize),
        tint = colors.contentColor(enabled = enabled)
      )
      if (iconSide == IconSide.LEFT) Spacer(Modifier.preferredWidth(ButtonIconPadding))
    }
  }
  Providers(AmbientIndication provides @Composable { ripple }) {
    Button(
      enabled = enabled,
      modifier = modifier
        .widthIn(min = size.minWidth)
        .preferredHeight(size.height),
      colors = colors,
      border = if (enabled) border.stroke else border.disabled,
      contentPadding = size.contentPadding,
      elevation = elevation,
      onClick = onClick
    ) {
      if (iconSide == IconSide.LEFT) iconButton()
      Text(
        text = text,
        style = style,
        fontSize = size.fontSize
      )
      if (iconSide == IconSide.RIGHT) iconButton()
    }
  }
}

enum class IconSide { LEFT, RIGHT }

private val ButtonIconPadding = 8.dp

@Preview
@Composable
fun VitaminButtonPreview() {
  VitaminTheme {
    VitaminButtons.Primary(text = "La sélection cadeaux") {}
  }
}

@Preview
@Composable
fun VitaminPrimaryReversedButtonPreview() {
  VitaminTheme {
    VitaminButtons.PrimaryReversed(text = "La sélection cadeaux") {}
  }
}

@Preview
@Composable
fun VitaminSecondaryButtonPreview() {
  VitaminTheme {
    VitaminButtons.Secondary(text = "La sélection cadeaux") {}
  }
}

@Preview
@Composable
fun VitaminSecondaryReversedButtonPreview() {
  VitaminTheme {
    VitaminButtons.SecondaryReversed(text = "La sélection cadeaux") {}
  }
}

@Preview
@Composable
fun VitaminGhostButtonPreview() {
  VitaminTheme {
    VitaminButtons.Ghost(text = "La sélection cadeaux") {}
  }
}

@Preview
@Composable
fun VitaminGhostReversedButtonPreview() {
  VitaminTheme {
    VitaminButtons.Ghost(text = "La sélection cadeaux") {}
  }
}

@Preview
@Composable
fun VitaminConversionButtonPreview() {
  VitaminTheme {
    VitaminButtons.Conversion(text = "La sélection cadeaux") {}
  }
}