package com.decathlon.vitamin.compose.textinputs

import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

object TextInputsTransformations {
  val none = VisualTransformation.None
  val password = PasswordVisualTransformation()
}