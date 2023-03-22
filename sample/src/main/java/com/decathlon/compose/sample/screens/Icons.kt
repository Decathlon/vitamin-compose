package com.decathlon.compose.sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.compose.sample.components.Resource
import com.decathlon.compose.sample.components.ResourcesScreen
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminicons.AllAssets
import com.decathlon.vitamin.compose.vitaminicons.Fill
import com.decathlon.vitamin.compose.vitaminicons.Line

object Icons : Screen {
    override val name: String
        get() = "Icons"

    override val navigationKey: String
        get() = "Icons"

    private val resources = (
        VitaminIcons.Fill.AllAssets.map { vector ->
            Resource(vector, "Fill.${vector.name}")
        } + VitaminIcons.Line.AllAssets.map { vector ->
            Resource(vector, "Line.${vector.name}")
        }
        ).sortedBy { it.vector.name }

    @Composable
    override fun Screen(navController: NavController?) {
        ResourcesScreen(
            name = name,
            navController = navController,
            resources = resources,
            resourceContent = { resource ->
                IconCell(resource)
            }
        )
    }
}

@Composable
private fun IconCell(
    resource: Resource
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            modifier = Modifier.padding(16.dp),
            imageVector = resource.vector,
            contentDescription = null,
            tint = VitaminTheme.colors.vtmnContentPrimary
        )
        Text(text = resource.name)
    }
}

@Preview
@Composable
private fun PreviewIconsScreen() {
    VitaminTheme(darkTheme = true) {
        Icons.Screen(null)
    }
}
