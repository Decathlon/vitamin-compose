package com.decathlon.compose.sample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.SideEffect
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.decathlon.compose.sample.screens.Buttons
import com.decathlon.compose.sample.screens.TextInputs
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VitaminTheme {
                val systemUiController = rememberSystemUiController()
                val useDarkIcons = MaterialTheme.colors.isLight
                val navigationColor = MaterialTheme.colors.background
                val statusColor = MaterialTheme.colors.primary
                SideEffect {
                    systemUiController.setStatusBarColor(
                        color = statusColor,
                        darkIcons = useDarkIcons
                    )
                    systemUiController.setNavigationBarColor(
                        color = navigationColor,
                        darkIcons = useDarkIcons
                    )
                }
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "dashboard") {
                    composable("dashboard") { DashboardScreen(navController) }
                    composable(Buttons.navigationKey) { Buttons.Screen() }
                    composable(TextInputs.navigationKey) { TextInputs.Screen() }
                }
            }
        }
    }
}
