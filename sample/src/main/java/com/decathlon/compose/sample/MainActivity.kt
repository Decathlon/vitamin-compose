package com.decathlon.compose.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.decathlon.compose.theme.VitaminTheme

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      VitaminTheme {
        ButtonsScreen()
      }
    }
  }
}
