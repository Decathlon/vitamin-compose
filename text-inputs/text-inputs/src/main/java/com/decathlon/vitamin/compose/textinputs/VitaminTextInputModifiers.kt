package com.decathlon.vitamin.compose.textinputs

import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.semantics

/**
 * Apply custom semantics to Vitamin TextInput components.
 * @param helperText Optional helper text attached to the TextInput
 * @param counter Optional counter attached to the TextInput
 */
internal fun Modifier.vtmnSemantics(
    helperText: String?,
    counter: Pair<Int, Int>?
) = semantics {
    if (helperText != null) {
        this.editableHelperText = helperText
    }
    if (counter != null) {
        this.editableCounter = counter
    }
}
