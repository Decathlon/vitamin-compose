package com.decathlon.compose.sample.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

interface Screen {
    val name: String
    val navigationKey: String

    @Composable
    fun Screen(navController: NavController?)
}
