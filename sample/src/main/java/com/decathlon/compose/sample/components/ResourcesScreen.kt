package com.decathlon.compose.sample.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.decathlon.vitamin.compose.AllAssets
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.appbars.topbars.ActionItem
import com.decathlon.vitamin.compose.appbars.topbars.SearchActionItem
import com.decathlon.vitamin.compose.appbars.topbars.VitaminTopBars
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Search

@Composable
fun ResourcesScreen(
    name: String,
    navController: NavController?,
    resources: List<Resource>,
    resourceContent: @Composable (Resource) -> Unit
) {
    val searchMode = remember { mutableStateOf(false) }
    val query = remember { mutableStateOf("") }
    val displayedIcons = remember {
        mutableStateOf(resources)
    }

    Scaffold(
        topBar = {
            if (searchMode.value) {
                searchBar(
                    query,
                    onValueChange = { searching ->
                        query.value = searching
                        displayedIcons.value = resources
                            .filter { resource ->
                                resource.name.contains(query.value, true)
                            }
                            .sortedBy { resource -> resource.vector.name }
                    },
                    onBackClick = { searchMode.value = false }
                )
            } else {
                VitaminTopBars.Primary(
                    title = name,
                    navigationIcon = {
                        PreviousPage(
                            onClick = { navController?.popBackStack() },
                            contentDescription = "Click to return to previous page"
                        )
                    },
                    actions = arrayListOf(
                        ActionItem(
                            icon = rememberVectorPainter(image = VitaminIcons.Line.Search),
                            contentDescription = null,
                            content = { Text("Search resource") },
                            onClick = {
                                searchMode.value = true
                            }
                        ),
                    )
                )
            }
        },
        modifier = Modifier.padding(8.dp),
        content = {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                displayedIcons.value
                    .forEach { resource ->
                        item {
                            resourceContent(resource)
                        }
                    }
            }
        }
    )
}

@Composable
private fun searchBar(
    query: MutableState<String>,
    onValueChange: (String) -> Unit,
    onBackClick: () -> Unit
) {
    VitaminTopBars.Search(
        value = query.value,
        placeholder = "Search by name",
        onValueChange = onValueChange,
        navigationIcon = {
            Context(
                onClick = onBackClick,
                contentDescription = null
            )
        },
        actions = arrayListOf(
            SearchActionItem.Close(
                contentDescription = null,
                onClick = { query.value = "" }
            )
        )
    )
}

data class Resource(val vector: ImageVector, val name: String)

@Preview
@Composable
private fun PreviewResourceScreen() {
    VitaminTheme(darkTheme = true) {
        ResourcesScreen(
            "Icons",
            navController = null,
            resources = VitaminIcons.AllAssets.map { Resource(it, it.name) },
            resourceContent = { resource ->
                Image(
                    modifier = Modifier.padding(16.dp),
                    imageVector = resource.vector,
                    contentDescription = null
                )
                Text(text = resource.name)
            }
        )
    }
}
