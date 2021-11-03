package com.decathlon.compose.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.textinputs.*
import com.decathlon.vitamin.compose.textinputs.R

@Composable
fun TextInputsScreen() {
  Surface(
    color = VitaminTheme.colors.vtmnBackgroundPrimary,
    modifier = Modifier.padding(horizontal = 8.dp)
  ) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
      item {
        VitaminTextInputs.Outlined(
          value = "",
          label = "Label"
        ) {}
      }
      item {
        VitaminTextInputs.Outlined(
          value = "Input",
          label = "Label",
          helperText = "Helper Text",
          counter = 999 to 999,
          icon = { Icon(painter = painterResource(id = R.drawable.ic_vtmn_heart_3_line), contentDescription = null) }
        ) {}
      }
      item {
        VitaminTextInputs.Outlined(
          value = "",
          label = "Label",
          helperText = "Helper Text",
          counter = 999 to 999,
          colors = TextInputsState.error()
        ) {}
      }
      item {
        VitaminTextInputs.Outlined(
          value = "",
          label = "Label",
          helperText = "Helper Text",
          counter = 999 to 999,
          colors = TextInputsState.success()
        ) {}
      }
      item {
        VitaminTextInputs.Outlined(
          value = "",
          label = "Label",
          isEnabled = false
        ) {}
      }
      item {
        VitaminTextInputs.Outlined(
          value = "Input",
          label = "Label",
          helperText = "Helper Text",
          counter = 999 to 999,
          isEnabled = false
        ) {}
      }
      item {
        VitaminTextInputs.Filled(
          value = "",
          label = "Label"
        ) {}
      }
      item {
        VitaminTextInputs.Filled(
          value = "Input",
          label = "Label",
          helperText = "Helper Text",
          counter = 999 to 999,
          icon = { Icon(painter = painterResource(id = R.drawable.ic_vtmn_heart_3_line), contentDescription = null) }
        ) {}
      }
      item {
        VitaminTextInputs.Filled(
          value = "",
          label = "Label",
          helperText = "Helper Text",
          counter = 999 to 999,
          colors = TextInputsState.error()
        ) {}
      }
      item {
        VitaminTextInputs.Filled(
          value = "",
          label = "Label",
          helperText = "Helper Text",
          counter = 999 to 999,
          colors = TextInputsState.success()
        ) {}
      }
      item {
        VitaminTextInputs.Filled(
          value = "",
          label = "Label",
          isEnabled = false
        ) {}
      }
      item {
        VitaminTextInputs.Filled(
          value = "Input",
          label = "Label",
          helperText = "Helper Text",
          counter = 999 to 999,
          isEnabled = false
        ) {}
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun TextInputsScreenPreview() {
  VitaminTheme {
    TextInputsScreen()
  }
}
