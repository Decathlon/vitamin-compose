package com.decathlon.vitamin.compose.quantity.pickers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled
import com.decathlon.vitamin.compose.quantity.pickers.internals.IconButton
import com.decathlon.vitamin.compose.quantity.pickers.internals.MiddleTextField

internal const val VtmnStatesEnabled = 1.0f

object VitaminQuantityPickers {
    /**
     * A quantity allows users to change the number of items.
     * @param value Value of the quantity picker
     * @param modifier The [Modifier] to be applied to the component
     * @param addEnabled Whether add button is enable or not
     * @param subtractEnabled Whether substract button is enable or not
     * @param editTextEnabled Whether textField is enable or not
     * @param keyboardOptions Software keyboard options that contains such as KeyboardType and ImeAction
     * @param keyboardActions When the text input emit an IME action, the corresponding callback is called
     * @param colors The color to notify your user if they are in normal or error state
     * @param shape The shape for icon buttons
     * @param textStyle The typography of the text inside the text input
     * @param ripple The ripple effect applied on buttons
     * @param onAddClicked The callback to be called when add button is clicked
     * @param onSubtractClicked The callback to be called when substract button is clicked
     * @param onValueChange The callback to be called when text is set into textfield
     */
    @Composable
    fun Primary(
        value: String,
        modifier: Modifier = Modifier,
        addEnabled: Boolean = true,
        subtractEnabled: Boolean = true,
        editTextEnabled: Boolean = true,
        keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        colors: QuantityColors = VitaminQuantitiesColors.normal(),
        shape: CornerBasedShape = VitaminTheme.shapes.radius100,
        textStyle: TextStyle = VitaminTheme.typography.text2,
        ripple: RippleTheme = VitaminTheme.ripples.brand,
        onAddClicked: () -> Unit,
        onSubtractClicked: () -> Unit,
        onValueChange: (String) -> Unit
    ) {
        CompositionLocalProvider(LocalRippleTheme provides ripple) {
            Row(
                modifier = modifier
                    .height(48.dp)
                    .width(154.dp)
            ) {
                IconButton(
                    painter = painterResource(id = R.drawable.ic_vtmn_subtract_fill),
                    contentDescription = stringResource(id = R.string.vtmn_subtract_button_description),
                    enabled = subtractEnabled,
                    colors = colors,
                    shape = shape.copy(
                        topEnd = CornerSize(0.dp),
                        bottomEnd = CornerSize(0.dp)
                    ),
                    onClick = onSubtractClicked
                )

                MiddleTextField(
                    modifier = Modifier
                        .background(
                            color = colors.backgroundColor.copy(
                                alpha = if (!addEnabled && !subtractEnabled) VtmnStatesDisabled else VtmnStatesEnabled
                            )
                        )
                        .fillMaxHeight()
                        .weight(1.0f),
                    addEnabled = addEnabled,
                    subtractEnabled = subtractEnabled,
                    colors = colors,
                    textStyle = textStyle,
                    value = value,
                    onValueChange = onValueChange,
                    editTextEnabled = editTextEnabled,
                    keyboardOptions = keyboardOptions,
                    keyboardActions = keyboardActions
                )

                IconButton(
                    painter = painterResource(id = R.drawable.ic_vtmn_add_fill),
                    contentDescription = stringResource(id = R.string.vtmn_add_button_description),
                    enabled = addEnabled,
                    colors = colors,
                    shape = shape.copy(
                        topStart = CornerSize(0.dp),
                        bottomStart = CornerSize(0.dp)
                    ),
                    onClick = onAddClicked
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xffffff00
)
@Composable
private fun PreviewQuantities() {
    VitaminTheme {
        Column(modifier = Modifier.padding(10.dp)) {
            Column(Modifier.height(48.dp)) {
                VitaminQuantityPickers.Primary(
                    value = "0",
                    subtractEnabled = true,
                    editTextEnabled = false,
                    onAddClicked = {},
                    onSubtractClicked = {},
                ) {}
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column(Modifier.height(48.dp)) {
                VitaminQuantityPickers.Primary(
                    value = "0",
                    subtractEnabled = false,
                    onAddClicked = {},
                    onSubtractClicked = {}
                ) {}
            }
            Spacer(modifier = Modifier.height(10.dp))

            Column(Modifier.height(48.dp)) {
                VitaminQuantityPickers.Primary(
                    value = "0",
                    addEnabled = false,
                    subtractEnabled = false,
                    onAddClicked = {},
                    onSubtractClicked = {}
                ) {}
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewDarkQuantities() {
    VitaminTheme(darkTheme = true) {
        Column(modifier = Modifier.padding(10.dp)) {
            Column(Modifier.height(48.dp)) {
                VitaminQuantityPickers.Primary(
                    value = "0",
                    subtractEnabled = true,
                    onAddClicked = {},
                    onSubtractClicked = {}
                ) {}
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column(Modifier.height(48.dp)) {
                VitaminQuantityPickers.Primary(
                    value = "0",
                    subtractEnabled = false,
                    onAddClicked = {},
                    onSubtractClicked = {}
                ) {}
            }
        }
    }
}
