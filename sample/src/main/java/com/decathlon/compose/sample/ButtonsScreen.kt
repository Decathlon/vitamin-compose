package com.decathlon.compose.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.buttons.IconSide
import com.decathlon.compose.buttons.VitaminButtons
import com.decathlon.compose.theme.VitaminTheme

@Composable
fun ButtonsScreen() {
  Surface(color = VitaminTheme.colors.uiBackground) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
      item {
        ButtonRow(firstItem = true) {
          VitaminButtons.Primary(text = "Primary") {}
          VitaminButtons.Primary(text = "Primary", enabled = false) {}
        }
      }
      item {
        ButtonRow {
          VitaminButtons.Primary(
            text = "Primary",
            icon = painterResource(id = R.drawable.ic_add_fill)
          ) {}
          VitaminButtons.Primary(
            text = "Primary",
            icon = painterResource(id = R.drawable.ic_add_fill),
            enabled = false
          ) {}
        }
      }
      item {
        ButtonRow {
          VitaminButtons.Primary(
            text = "Primary",
            icon = painterResource(id = R.drawable.ic_add_fill),
            iconSide = IconSide.RIGHT
          ) {}
          VitaminButtons.Primary(
            text = "Primary",
            icon = painterResource(id = R.drawable.ic_add_fill),
            iconSide = IconSide.RIGHT,
            enabled = false
          ) {}
        }
      }
      item {
        ButtonRow {
          VitaminButtons.Secondary(text = "Secondary") {}
          VitaminButtons.Secondary(text = "Secondary", enabled = false) {}
        }
      }
      item {
        ButtonRow {
          VitaminButtons.Secondary(
            text = "Secondary",
            icon = painterResource(id = R.drawable.ic_add_fill)
          ) {}
          VitaminButtons.Secondary(
            text = "Secondary",
            icon = painterResource(id = R.drawable.ic_add_fill),
            enabled = false
          ) {}
        }
      }
      item {
        ButtonRow {
          VitaminButtons.Ghost(text = "Ghost") {}
          VitaminButtons.Ghost(text = "Ghost", enabled = false) {}
        }
      }
      item {
        ButtonRow {
          VitaminButtons.Ghost(
            text = "Ghost",
            icon = painterResource(id = R.drawable.ic_add_fill)
          ) {}
          VitaminButtons.Ghost(
            text = "Ghost",
            icon = painterResource(id = R.drawable.ic_add_fill),
            enabled = false
          ) {}
        }
      }
      item {
        ButtonRow {
          VitaminButtons.Conversion(text = "Conversion") {}
          VitaminButtons.Conversion(text = "Conversion", enabled = false) {}
        }
      }
      item {
        ButtonRow(lastItem = true) {
          VitaminButtons.Conversion(
            text = "Conversion",
            icon = painterResource(id = R.drawable.ic_add_fill)
          ) {}
          VitaminButtons.Conversion(
            text = "Conversion",
            icon = painterResource(id = R.drawable.ic_add_fill),
            enabled = false
          ) {}
        }
      }
      item {
        ButtonRow(firstItem = true, color = VitaminTheme.colors.brand) {
          VitaminButtons.PrimaryReversed(text = "Primary") {}
          VitaminButtons.PrimaryReversed(text = "Primary", enabled = false) {}
        }
      }
      item {
        ButtonRow(color = VitaminTheme.colors.brand) {
          VitaminButtons.PrimaryReversed(
            text = "Primary",
            icon = painterResource(id = R.drawable.ic_add_fill)
          ) {}
          VitaminButtons.PrimaryReversed(
            text = "Primary",
            icon = painterResource(id = R.drawable.ic_add_fill),
            enabled = false
          ) {}
        }
      }
      item {
        ButtonRow(color = VitaminTheme.colors.brand) {
          VitaminButtons.SecondaryReversed(text = "Secondary") {}
          VitaminButtons.SecondaryReversed(text = "Secondary", enabled = false) {}
        }
      }
      item {
        ButtonRow(color = VitaminTheme.colors.brand) {
          VitaminButtons.SecondaryReversed(
            text = "Secondary",
            icon = painterResource(id = R.drawable.ic_add_fill)
          ) {}
          VitaminButtons.SecondaryReversed(
            text = "Secondary",
            icon = painterResource(id = R.drawable.ic_add_fill),
            enabled = false
          ) {}
        }
      }
      item {
        ButtonRow(color = VitaminTheme.colors.brand) {
          VitaminButtons.GhostReversed(text = "Ghost") {}
          VitaminButtons.GhostReversed(text = "Ghost", enabled = false) {}
        }
      }
      item {
        ButtonRow(lastItem = true, color = VitaminTheme.colors.brand) {
          VitaminButtons.GhostReversed(
            text = "Ghost",
            icon = painterResource(id = R.drawable.ic_add_fill)
          ) {}
          VitaminButtons.GhostReversed(
            text = "Ghost",
            icon = painterResource(id = R.drawable.ic_add_fill),
            enabled = false
          ) {}
        }
      }
    }
  }
}

@Composable
fun ButtonRow(
  firstItem: Boolean = false,
  lastItem: Boolean = false,
  color: Color = VitaminTheme.colors.uiBackground,
  content: @Composable RowScope.() -> Unit
) {
  Row(
    horizontalArrangement = Arrangement.SpaceAround,
    modifier = Modifier
      .fillMaxWidth()
      .background(color = color)
      .padding(
        top = if (firstItem) 10.dp else 5.dp,
        bottom = if (lastItem) 10.dp else 5.dp
      ),
    content = content
  )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  VitaminTheme {
    ButtonsScreen()
  }
}