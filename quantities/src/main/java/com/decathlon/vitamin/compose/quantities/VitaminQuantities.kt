package com.decathlon.vitamin.compose.quantities

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled

private const val VtmnStatesEnabled = 1.0f

object VitaminQuantities {

    @Composable
    fun Primary(
        value: String,
        modifier: Modifier = Modifier,
        addEnabled: Boolean = true,
        subtractEnabled: Boolean = true,
        editTextEnabled: Boolean = true,
        hasQuantityError: Boolean = false,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        colors: QuantityColors = VitaminQuantitiesColors.primary(),
        onAddClicked: () -> Unit,
        onSubtractClicked: () -> Unit,
        onValueChange: (String?) -> Unit,
    ) {
        Row(
            modifier = modifier
                .height(48.dp)
                .width(154.dp)
        ) {
            LeftButton(onSubtractClicked, colors, subtractEnabled)

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
                hasQuantityError = hasQuantityError,
                colors = colors,
                value = value,
                onValueChange = onValueChange,
                editTextEnabled = editTextEnabled,
                keyboardOptions = keyboardOptions

            )

            RightButton(onAddClicked = onAddClicked, addEnabled = addEnabled, colors = colors)
        }
    }
}

@Composable
private fun MiddleTextField(
    modifier: Modifier,
    addEnabled: Boolean,
    subtractEnabled: Boolean,
    hasQuantityError: Boolean,
    colors: QuantityColors,
    value: String,
    onValueChange: (String?) -> Unit,
    editTextEnabled: Boolean,
    keyboardOptions: KeyboardOptions,
) {

    val focus = remember { mutableStateOf(false) }

    Column(
        modifier = modifier
    ) {
        val dividerEnable =
            if (addEnabled || subtractEnabled) VtmnStatesEnabled else VtmnStatesDisabled

        Divider(
            color = colors.borderColor.copy(alpha = dividerEnable)
        )

        val boxModifier = when {
            hasQuantityError -> {
                Modifier
                    .weight(1.0f)
                    .border(border = BorderStroke(1.dp, colors.borderColorError))
            }
            focus.value -> {
                Modifier
                    .weight(1.0f)
                    .border(border = BorderStroke(1.dp, colors.borderColorActive))
            }
            else -> {
                Modifier.weight(1.0f)
            }
        }
        Box(
            modifier = boxModifier,
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                modifier = Modifier.onFocusChanged { focusState ->
                   focus.value = focusState.isFocused
                },
                value = value,
                onValueChange = onValueChange,
                enabled = editTextEnabled && (addEnabled || subtractEnabled),
                textStyle = VitaminTheme.typography.text2.copy(
                    textAlign = TextAlign.Center,
                    color = colors.textColor
                ),
                keyboardOptions = keyboardOptions,
                singleLine = true
            )
        }

        Divider(
            color = colors.borderColor.copy(alpha = dividerEnable),
            modifier = Modifier
        )
    }
}

@Composable
private fun RightButton(onAddClicked: () -> Unit, addEnabled: Boolean, colors: QuantityColors) {
    Button(
        onClick = onAddClicked,
        modifier = Modifier
            .fillMaxHeight()
            .width(48.dp),
        enabled = addEnabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colors.backgroundColor,
            disabledBackgroundColor = colors.backgroundColor.copy(alpha = VtmnStatesDisabled)
        ),
        shape = RoundedCornerShape(
            topStart = 0.dp,
            topEnd = 4.dp,
            bottomEnd = 4.dp,
            bottomStart = 0.dp
        ),
        border = BorderStroke(
            width = 1.dp,
            color = colors.borderColor.copy(alpha = if (addEnabled) VtmnStatesEnabled else VtmnStatesDisabled)
        ),
        elevation = ButtonDefaults.elevation(0.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_vtmn_add_fill),
            contentDescription = stringResource(id = R.string.vtmn_add_button_description),
            tint = VitaminTheme.colors.vtmnContentAction.copy(
                alpha = if (addEnabled) VtmnStatesEnabled else VtmnStatesDisabled
            )
        )
    }
}

@Composable
private fun LeftButton(
    onSubtractClicked: () -> Unit,
    colors: QuantityColors,
    subtractEnabled: Boolean,
) {
    Button(
        onClick = onSubtractClicked,
        modifier = Modifier
            .fillMaxHeight()
            .width(48.dp),
        enabled = subtractEnabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colors.backgroundColor,
            disabledBackgroundColor = colors.backgroundColor.copy(alpha = VtmnStatesDisabled)
        ),
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 0.dp,
            bottomEnd = 0.dp,
            bottomStart = 4.dp
        ),
        border = BorderStroke(
            width = 1.dp,
            color = colors.borderColor.copy(alpha = if (subtractEnabled) VtmnStatesEnabled else VtmnStatesDisabled)
        ),
        elevation = ButtonDefaults.elevation(0.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_vtmn_subtract_fill),
            contentDescription = stringResource(id = R.string.vtmn_subtract_button_description),
            tint = VitaminTheme.colors.vtmnContentAction.copy(
                alpha = if (subtractEnabled) VtmnStatesEnabled else VtmnStatesDisabled
            )
        )
    }
}

@Preview(
    showBackground = true,
    backgroundColor = 0xffffff00
)
@Composable
fun PreviewQuantities() {
    VitaminTheme {
        Column(modifier = Modifier.padding(10.dp)) {
            Column(Modifier.height(48.dp)) {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = true,
                    onAddClicked = {},
                    onSubtractClicked = {},
                    onValueChange = {},
                    editTextEnabled = false,
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column(Modifier.height(48.dp)) {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = false,
                    onAddClicked = {},
                    onSubtractClicked = {},
                    onValueChange = {},
                    hasQuantityError = true
                )
            }
            Spacer(modifier = Modifier.height(10.dp))

            Column(Modifier.height(48.dp)) {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = false,
                    addEnabled = false,
                    onAddClicked = {},
                    onSubtractClicked = {},
                    onValueChange = {}
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDarkQuantities() {
    VitaminTheme(darkTheme = true) {
        Column(modifier = Modifier.padding(10.dp)) {
            Column(Modifier.height(48.dp)) {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = true,
                    onAddClicked = {},
                    onSubtractClicked = {},
                    onValueChange = {}
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column(Modifier.height(48.dp)) {
                VitaminQuantities.Primary(
                    value = "0",
                    subtractEnabled = false,
                    onAddClicked = {},
                    onSubtractClicked = {},
                    onValueChange = {}
                )
            }
        }
    }
}
