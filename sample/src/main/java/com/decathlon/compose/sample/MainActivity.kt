package com.decathlon.compose.sample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.decathlon.vitamin.foundation.VitaminTheme

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
