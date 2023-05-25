package com.decathlon.vitamin.compose.quantity.pickers

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.error
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.quantity.pickers.internals.HelperText
import com.decathlon.vitamin.compose.quantity.pickers.internals.Picker
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Information

internal const val VtmnStatesEnabled = 1.0f

object VitaminQuantityPickers {
    /**
     * A quantity allows users to change the number of items.
     * @param value Value of the quantity picker
     * @param modifier The [Modifier] to be applied to the component
     * @param addEnabled Whether add button is enable or not
     * @param subtractEnabled Whether substract button is enable or not
     * @param editTextEnabled Whether textField is enable or not
     * @param isExpanded if true, component will fill max width, otherwise get default width
     * @param helperText Helper text displayed at the QuantityPicker's bottom
     * @param keyboardOptions Software keyboard options that contains such as KeyboardType and ImeAction
     * @param keyboardActions When the text input emit an IME action, the corresponding callback is called
     * @param colors The color to notify your user if they are in normal or error state
     * @param sizes Sizes to be applied to the QuantityPicker. (VitaminQuantitiesSizes.primary())
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
        isExpanded: Boolean = false,
        helperText: String? = null,
        keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        colors: QuantityColors = VitaminQuantitiesColors.normal(),
        sizes: QuantitySizes = VitaminQuantitiesSizes.primary(),
        ripple: RippleTheme = VitaminTheme.ripples.brand,
        onAddClicked: () -> Unit,
        onSubtractClicked: () -> Unit,
        onValueChange: (String) -> Unit
    ) {
        CompositionLocalProvider(LocalRippleTheme provides ripple) {
            val contentDescription = stringResource(id = R.string.vtmn_quantity_picker_accessibility_message, value)

            Column(
                modifier = modifier
                    .semantics(
                        mergeDescendants = false
                    ) {
                        this.contentDescription = contentDescription
                        helperText?.let {
                            this.error(it)
                        }
                    }
            ) {
                Picker(
                    value = value,
                    modifier = modifier,
                    addEnabled = addEnabled,
                    subtractEnabled = subtractEnabled,
                    editTextEnabled = editTextEnabled,
                    isExpanded = isExpanded,
                    keyboardOptions = keyboardOptions,
                    keyboardActions = keyboardActions,
                    colors = colors,
                    sizes = sizes,
                    onAddClicked = onAddClicked,
                    onSubtractClicked = onSubtractClicked,
                    onValueChange = onValueChange
                )

                helperText?.let {
                    HelperText(
                        text = it,
                        textStyle = sizes.helperTextStyle,
                        icon = VitaminIcons.Line.Information,
                        iconSize = sizes.helperIconSize,
                        color = colors.helperColor
                    )
                }
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

            Spacer(modifier = Modifier.height(10.dp))

            Column(Modifier) {
                VitaminQuantityPickers.Primary(
                    value = "0",
                    addEnabled = true,
                    subtractEnabled = true,
                    onAddClicked = {},
                    onSubtractClicked = {},
                    helperText = "Error message goes here",
                    colors = VitaminQuantitiesColors.error()
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

            Spacer(modifier = Modifier.height(10.dp))

            Column(Modifier) {
                VitaminQuantityPickers.Primary(
                    value = "0",
                    addEnabled = true,
                    subtractEnabled = true,
                    onAddClicked = {},
                    onSubtractClicked = {},
                    helperText = "Error message goes here",
                    colors = VitaminQuantitiesColors.error()
                ) {}
            }
        }
    }
}
