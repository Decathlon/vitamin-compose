package com.decathlon.vitamin.compose.modals

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.buttons.VitaminButtons
import com.decathlon.vitamin.compose.buttons.VitaminButtonsSizes

enum class ModalButtonsOrientation {
    HORIZONTAL,
    VERTICAL
}

object VitaminModalButtons {

    @Composable
    fun Default(
        text: String,
        onClick: () -> Unit
    ) {
        VitaminButtons.Ghost(
            text = text,
            sizes = VitaminButtonsSizes.medium(
                minWidth = 0.dp,
                contentPadding = PaddingValues(0.dp)
            ),
            onClick = onClick
        )
    }
}
