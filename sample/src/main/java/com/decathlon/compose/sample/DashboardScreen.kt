package com.decathlon.compose.sample

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.compose.sample.screens.Screen
import com.decathlon.vitamin.compose.foundation.VitaminTheme

@Composable
fun DashboardScreen(navController: NavHostController, screens: List<Screen>) {
    SampleScaffold(title = "Dashboard") {
        LazyColumn {
            items(screens) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .clickable { navController.navigate(it.navigationKey) },
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = it.name,
                        style = VitaminTheme.typography.h6,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                }
            }
        }
    }
}
