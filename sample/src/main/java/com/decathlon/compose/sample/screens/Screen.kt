package com.decathlon.compose.sample.screens

import androidx.compose.runtime.Composable

interface Screen {
    val name: String
    val navigationKey: String

    @Composable
    fun Screen()
}
