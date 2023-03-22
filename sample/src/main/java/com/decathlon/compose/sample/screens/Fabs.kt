package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.compose.sample.components.SampleScaffold
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.fabs.VitaminFabSizes
import com.decathlon.vitamin.compose.fabs.VitaminFabs
import com.decathlon.vitamin.compose.fabs.VitaminFabsExtended
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminicons.Fill
import com.decathlon.vitamin.compose.vitaminicons.fill.Add

object Fabs : Screen {
    override val name: String
        get() = "Floating Action Buttons"

    override val navigationKey: String
        get() = "fabs"

    @SuppressWarnings("LongMethod")
    @Composable
    override fun Screen(navController: NavController?) {
        SampleScaffold(
            title = name,
            onBackClick = {
                navController?.popBackStack()
            }
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Text(
                    modifier = Modifier.padding(start = 16.dp, top = 16.dp),
                    text = "Regular fab",
                    style = VitaminTheme.typography.h6
                )

                Row(modifier = Modifier.padding(start = 16.dp, top = 16.dp)) {
                    VitaminFabs.Primary(
                        modifier = Modifier.padding(end = 16.dp),
                        icon = rememberVectorPainter(image = VitaminIcons.Fill.Add),
                        contentDescription = "Add"
                    ) {}
                    VitaminFabs.Primary(
                        icon = rememberVectorPainter(image = VitaminIcons.Fill.Add),
                        contentDescription = "Add",
                        enabled = false
                    ) {}
                }

                Text(
                    modifier = Modifier.padding(start = 16.dp, top = 32.dp),
                    text = "Mini fab",
                    style = VitaminTheme.typography.h6
                )

                Row(modifier = Modifier.padding(start = 16.dp, top = 16.dp)) {
                    VitaminFabs.Primary(
                        modifier = Modifier.padding(end = 16.dp),
                        icon = rememberVectorPainter(image = VitaminIcons.Fill.Add),
                        contentDescription = "Add",
                        sizes = VitaminFabSizes.mini()
                    ) {}
                    VitaminFabs.Primary(
                        icon = rememberVectorPainter(image = VitaminIcons.Fill.Add),
                        contentDescription = "Add",
                        sizes = VitaminFabSizes.mini(),
                        enabled = false
                    ) {}
                }

                Text(
                    modifier = Modifier.padding(start = 16.dp, top = 32.dp),
                    text = "Extended fab",
                    style = VitaminTheme.typography.h6
                )

                Row(modifier = Modifier.padding(start = 16.dp, top = 16.dp)) {
                    VitaminFabsExtended.Primary(
                        modifier = Modifier.padding(end = 16.dp),
                        text = "Label",
                        icon = rememberVectorPainter(image = VitaminIcons.Fill.Add)
                    ) {}
                    VitaminFabsExtended.Primary(
                        text = "Label",
                        icon = rememberVectorPainter(image = VitaminIcons.Fill.Add),
                        enabled = false
                    ) {}
                }
                VitaminFabsExtended.Primary(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 16.dp, end = 16.dp),
                    text = "Label",
                    icon = rememberVectorPainter(image = VitaminIcons.Fill.Add)
                ) {}

                VitaminFabsExtended.Primary(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 16.dp, end = 16.dp),
                    text = "Label",
                    icon = rememberVectorPainter(image = VitaminIcons.Fill.Add),
                    enabled = false
                ) {}
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    VitaminTheme {
        Fabs.Screen(null)
    }
}
