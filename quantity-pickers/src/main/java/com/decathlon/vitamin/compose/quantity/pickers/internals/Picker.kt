package com.decathlon.vitamin.compose.quantity.pickers.internals

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VtmnStatesDisabled
import com.decathlon.vitamin.compose.quantity.pickers.QuantityColors
import com.decathlon.vitamin.compose.quantity.pickers.QuantitySizes
import com.decathlon.vitamin.compose.quantity.pickers.R
import com.decathlon.vitamin.compose.quantity.pickers.VitaminQuantitiesColors
import com.decathlon.vitamin.compose.quantity.pickers.VitaminQuantitiesSizes
import com.decathlon.vitamin.compose.quantity.pickers.VtmnStatesEnabled
import com.decathlon.vitamin.compose.vitaminicons.Fill
import com.decathlon.vitamin.compose.vitaminicons.fill.Add
import com.decathlon.vitamin.compose.vitaminicons.fill.Subtract

@Composable
internal fun Picker(
    value: String,
    modifier: Modifier = Modifier,
    addEnabled: Boolean = true,
    subtractEnabled: Boolean = true,
    editTextEnabled: Boolean = true,
    isExpanded: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    colors: QuantityColors = VitaminQuantitiesColors.normal(),
    sizes: QuantitySizes = VitaminQuantitiesSizes.primary(),
    onAddClicked: () -> Unit,
    onSubtractClicked: () -> Unit,
    onValueChange: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .height(sizes.height)
            .then(
                if (isExpanded) {
                    modifier.fillMaxWidth()
                } else {
                    modifier.width(sizes.width)
                }
            )
    ) {
        IconButton(
            painter = rememberVectorPainter(VitaminIcons.Fill.Subtract),
            contentDescription = stringResource(id = R.string.vtmn_subtract_button_description),
            enabled = subtractEnabled,
            colors = colors,
            shape = sizes.shape.copy(
                topEnd = CornerSize(0.dp),
                bottomEnd = CornerSize(0.dp)
            ),
            onClick = onSubtractClicked
        )

        MiddleTextField(
            modifier = Modifier
                .background(
                    color = colors.backgroundColor.copy(
                        alpha = if (!addEnabled && !subtractEnabled) {
                            VtmnStatesDisabled
                        } else {
                            VtmnStatesEnabled
                        }
                    )
                )
                .fillMaxHeight()
                .weight(1.0f),
            addEnabled = addEnabled,
            subtractEnabled = subtractEnabled,
            colors = colors,
            textStyle = sizes.textStyle,
            value = value,
            onValueChange = onValueChange,
            editTextEnabled = editTextEnabled,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions
        )

        IconButton(
            painter = rememberVectorPainter(VitaminIcons.Fill.Add),
            contentDescription = stringResource(id = R.string.vtmn_add_button_description),
            enabled = addEnabled,
            colors = colors,
            shape = sizes.shape.copy(
                topStart = CornerSize(0.dp),
                bottomStart = CornerSize(0.dp)
            ),
            onClick = onAddClicked
        )
    }
}
