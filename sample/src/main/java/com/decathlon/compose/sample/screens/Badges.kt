package com.decathlon.compose.sample.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.compose.sample.R
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.badges.VitaminBadgeSizes
import com.decathlon.vitamin.compose.badges.VitaminBadges.Accent
import com.decathlon.vitamin.compose.badges.VitaminBadges.Alert
import com.decathlon.vitamin.compose.badges.VitaminBadges.Brand
import com.decathlon.vitamin.compose.badges.VitaminBadges.Default
import com.decathlon.vitamin.compose.badges.VitaminBadges.Reversed
import com.decathlon.vitamin.compose.badges.VitaminCountBadges
import com.decathlon.vitamin.compose.badges.VitaminStandaloneBadges
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object Badges : Screen {
    override val name: String
        get() = "Badges"

    override val navigationKey: String
        get() = "Badges"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen() {
        SampleScaffold(title = name) {
            LazyColumn(
                modifier = Modifier
                    .background(Color(red = 234, green = 242, blue = 248))
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                item {
                    Spacer(Modifier.height(20.dp))
                    Row {
                        VitaminCountBadges.Accent(
                            count = 1000,
                            nbMaxChar = 3,
                            sizes = VitaminBadgeSizes.large()
                        ) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Accent(
                            count = 50,
                            sizes = VitaminBadgeSizes.medium()
                        ) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Accent(count = 1) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Accent(count = 0) {
                            Content()
                        }
                    }
                }
                item {
                    Spacer(Modifier.height(20.dp))
                    Row {
                        VitaminCountBadges.Brand(count = 120) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Brand(count = 50) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Brand(count = 1) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Brand(count = 0) {
                            Content()
                        }
                    }
                }
                item {
                    Spacer(Modifier.height(20.dp))
                    Row {
                        VitaminCountBadges.Alert(count = 120) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Alert(count = 50) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Alert(count = 1) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Alert(count = 0) {
                            Content()
                        }
                    }
                }
                item {
                    Spacer(Modifier.height(20.dp))
                    Row {
                        VitaminCountBadges.Default(count = 120) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Default(count = 50) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Default(count = 1) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Default(count = 0) {
                            Content()
                        }
                    }
                }
                item {
                    Spacer(Modifier.height(20.dp))
                    Row {
                        VitaminCountBadges.Reversed(count = 120) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Reversed(count = 50) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Reversed(count = 1) {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminCountBadges.Reversed(count = 0) {
                            Content()
                        }
                    }
                }

                item {
                    Spacer(Modifier.height(20.dp))
                    Row {
                        Accent {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        Brand {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        Alert {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        Default {
                            Content()
                        }
                        Spacer(Modifier.width(30.dp))
                        Reversed {
                            Content()
                        }
                    }
                }

                item {
                    Spacer(Modifier.height(20.dp))
                    Row {
                        Column {
                            VitaminStandaloneBadges.Accent(
                                count = 120,
                                sizes = VitaminBadgeSizes.large()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Accent(
                                count = 120,
                                sizes = VitaminBadgeSizes.medium()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Accent(
                                count = 120,
                                sizes = VitaminBadgeSizes.small()
                            )
                        }
                        Spacer(Modifier.width(30.dp))
                        Column {
                            VitaminStandaloneBadges.Brand(
                                count = 50,
                                sizes = VitaminBadgeSizes.large()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Brand(
                                count = 50,
                                sizes = VitaminBadgeSizes.medium()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Brand(
                                count = 50,
                                sizes = VitaminBadgeSizes.small()
                            )
                        }
                        Spacer(Modifier.width(30.dp))
                        Column {
                            VitaminStandaloneBadges.Alert(
                                count = 10,
                                sizes = VitaminBadgeSizes.large()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Alert(
                                count = 10,
                                sizes = VitaminBadgeSizes.medium()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Alert(
                                count = 10,
                                sizes = VitaminBadgeSizes.small()
                            )
                        }
                        Spacer(Modifier.width(30.dp))
                        Column {
                            VitaminStandaloneBadges.Default(
                                count = 5,
                                sizes = VitaminBadgeSizes.large()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Default(
                                count = 5,
                                sizes = VitaminBadgeSizes.medium()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Default(
                                count = 5,
                                sizes = VitaminBadgeSizes.small()
                            )
                        }
                        Spacer(Modifier.width(30.dp))
                        Column {
                            VitaminStandaloneBadges.Reversed(
                                count = 1,
                                sizes = VitaminBadgeSizes.large()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Reversed(
                                count = 1,
                                sizes = VitaminBadgeSizes.medium()
                            )
                            Spacer(Modifier.height(3.dp))
                            VitaminStandaloneBadges.Reversed(
                                count = 1,
                                sizes = VitaminBadgeSizes.small()
                            )
                        }
                        Spacer(Modifier.width(30.dp))
                        VitaminStandaloneBadges.Reversed(count = 0)
                    }
                }
            }
        }
    }

    @Composable
    private fun Content() {
        Icon(
            painter = painterResource(id = R.drawable.ic_vtmn_earth_fill),
            contentDescription = ""
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BadgesScreenPreview() {
    VitaminTheme {
        Badges.Screen()
    }
}
