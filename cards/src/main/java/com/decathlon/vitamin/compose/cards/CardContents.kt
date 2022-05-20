package com.decathlon.vitamin.compose.cards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.vtmnLightColorPalette

object TopImageContent {
    /**
     * Content of a standard Top image card.
     * @param title the title.
     * @param text the text under the title.
     * */
    @Composable
    fun TitleAndText(
        title: String,
        text: String
    ) {
        CardDescription(
            title = title,
            text = text,
            textColor = VitaminTheme.colors.vtmnContentPrimary,
        )
    }
}

object FullImageContent {
    /**
     * Content of a standard Full image card.
     * @param title the title.
     * @param text the text under the title.
     * @param buttonText the text of the button
     * @param onButtonClick the callback called when button is clicked
     * */
    @Composable
    fun TitleTextAndButton(
        title: String,
        text: String,
        buttonText: String,
        onButtonClick: (() -> Unit)
    ) {
        CardDescription(
            title = title,
            text = text,
            textColor = vtmnLightColorPalette.vtmnContentPrimaryReversed, // always light
            buttonText = buttonText,
            onButtonClick = onButtonClick
        )
    }
}

object SideImageContent {
    /**
     * Content of a standard side image card.
     * @param title the title.
     * @param text the text under the title.
     * */
    @Composable
    fun TitleAndText(
        title: String,
        text: String
    ) {
        CardDescription(
            title = title,
            text = text,
            textColor = VitaminTheme.colors.vtmnContentPrimary
        )
    }
}

object SideImageActionContent {
    /**
     * Content of actions row with icon buttons.
     * @param actions list of [CardActionItem].
     * @param text the text under the title.
     * */
    @Composable
    fun Icons(
        actions: List<CardActionItem>
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
        ) {
            actions.forEach {
                IconButton(onClick = it.onClick) {
                    Icon(
                        painter = it.painter,
                        contentDescription = it.contentDescription
                    )
                }
            }
        }
    }

    open class CardActionItem(
        val painter: Painter,
        val contentDescription: String?,
        val onClick: () -> Unit,
    )
}

object WithoutImageContent {
    /**
     * Content of a standard without image card.
     * @param title the title.
     * @param text the text under the title.
     * */
    @Composable
    fun TitleAndText(
        title: String,
        text: String
    ) {
        CardDescription(
            title = title,
            text = text,
            textColor = VitaminTheme.colors.vtmnContentPrimary,
        )
    }
}
