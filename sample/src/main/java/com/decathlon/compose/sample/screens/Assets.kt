package com.decathlon.compose.sample.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.compose.sample.components.Resource
import com.decathlon.compose.sample.components.ResourcesScreen
import com.decathlon.vitamin.compose.VitaminAssets
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminassets.AllAssets
import com.decathlon.vitamin.compose.vitaminassets.Flags
import com.decathlon.vitamin.compose.vitaminassets.Logos
import com.decathlon.vitamin.compose.vitaminassets.Payments
import com.decathlon.vitamin.compose.vitaminassets.Placeholders

object Assets : Screen {
    override val name: String
        get() = "Assets"

    override val navigationKey: String
        get() = "Assets"

    private val resources =
        VitaminAssets.Flags.AllAssets.map { asset ->
            Resource(asset, "Flag.${asset.name}")
        }.sortedBy { asset ->
            asset.name
        } + VitaminAssets.Logos.AllAssets.map { asset ->
            Resource(asset, "Logos.${asset.name}")
        }.sortedBy { asset ->
            asset.name
        } + VitaminAssets.Payments.AllAssets.map { asset ->
            Resource(asset, "Payments.${asset.name}")
        }.sortedBy { asset ->
            asset.name
        } + VitaminAssets.Placeholders.AllAssets.map { asset ->
            Resource(asset, "Placeholder.${asset.name}")
        }.sortedBy { asset ->
            asset.name
        }

    @Composable
    override fun Screen(navController: NavController?) {
        ResourcesScreen(
            name = name,
            navController = navController,
            resources = resources,
            resourceContent =
            { resource ->
                AssetCell(resource)
            }
        )
    }
}

@Composable
private fun AssetCell(
    resource: Resource
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier.padding(16.dp),
            imageVector = resource.vector,
            contentDescription = null
        )
        Text(text = resource.name)
    }
}

@Preview
@Composable
private fun PreviewAssetsScreen() {
    VitaminTheme {
        Assets.Screen(null)
    }
}
