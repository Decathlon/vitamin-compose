package com.decathlon.compose.sample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.decathlon.compose.sample.screens.AppBars
import com.decathlon.compose.sample.screens.Buttons
import com.decathlon.compose.sample.screens.Checkboxes
import com.decathlon.compose.sample.screens.Progress
import com.decathlon.compose.sample.screens.RadioButtons
import com.decathlon.compose.sample.screens.Switches
import com.decathlon.compose.sample.screens.Tabs
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
                val statusColor = VitaminTheme.colors.vtmnBackgroundPrimary
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
                val screens = remember {
                    arrayListOf(
                        Buttons,
                        TextInputs,
                        Checkboxes,
                        Switches,
                        Progress,
                        RadioButtons,
                        AppBars,
                        Tabs
                    )
                }
                NavHost(navController = navController, startDestination = "dashboard") {
                    composable("dashboard") { DashboardScreen(navController, screens) }
                    screens.forEach { screen ->
                        composable(screen.navigationKey) { screen.Screen() }
                    }
                }
            }
        }
    }
}
