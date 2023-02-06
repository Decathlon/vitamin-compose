package com.decathlon.compose.sample.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.snackbars.VitaminSnackbars

object Snackbars : Screen {
    override val name: String
        get() = "Snackbars"
    override val navigationKey: String
        get() = "snackbars"

    @Composable
    override fun Screen(navController: NavController?) {
        SampleScaffold(
            title = AppBars.name,
            onBackClick = {
                navController?.popBackStack()
            }
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = 4.dp,
                        vertical = 4.dp
                    ),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                item {
                    VitaminSnackbars.Primary(text = "This is the description of the snackbar")
                }
                item {
                    VitaminSnackbars.Primary(
                        text = "This is the description of the snackbar",
                        action = {
                            Button(
                                text = "Button",
                                onClick = { Log.d("Snackbars", "Click on Action") }
                            )
                        }
                    )
                }
                item {
                    VitaminSnackbars.Primary(
                        text = "This is the description of the snackbar",
                        action = {
                            Button(
                                text = "Button",
                                onClick = { Log.d("Snackbars", "Click on Action") }
                            )
                        },
                        actionOnNewLine = true
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewSnackbars() {
    VitaminTheme {
        Snackbars.Screen(null)
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDarkSnackbars() {
    VitaminTheme(darkTheme = true) {
        Snackbars.Screen(null)
    }
}
