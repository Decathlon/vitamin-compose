package com.decathlon.vitamin.compose.snackbars

import androidx.compose.material.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.buttons.VitaminButtons
import com.decathlon.vitamin.compose.buttons.VitaminButtonsColors
import com.decathlon.vitamin.compose.buttons.VitaminButtonsSizes
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminSnackbarsActions {

    @Composable
    fun Button(
        text: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        colors: ButtonColors = VitaminButtonsColors.ghostReversed()
    ) =
        VitaminButtons.GhostReversed(
            text = text,
            onClick = onClick,
            modifier = modifier,
            colors = colors,
            sizes = VitaminButtonsSizes.small()
        )
}

@Preview
@Composable
private fun PreviewSnackbarsActions() {
    VitaminTheme {
        VitaminSnackbarsActions.Button(text = "Action", onClick = { /*Click*/ })
    }
}
