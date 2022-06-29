package com.decathlon.vitamin.compose.snackbars

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.decathlon.vitamin.compose.foundation.VitaminTheme

object VitaminSnackbarsAction {

    @Composable
    fun SnackbarAction(
        text: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
    ) =
        Button(
            onClick = onClick,
            modifier = modifier,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = VitaminTheme.colors.vtmnBackgroundPrimaryReversed,
                contentColor = VitaminTheme.colors.vtmnContentActionReversed
            )
        ) {
            Text(text = text,
            style = VitaminTheme.typography.button)
        }
}

@Preview
@Composable
fun PreviewSnackbarAction() {
    VitaminTheme {
        VitaminSnackbarsAction.SnackbarAction(text = "Action", onClick = { /*Click*/ })
    }
}
