package com.decathlon.vitamin.compose.textinputs

import androidx.compose.ui.semantics.SemanticsPropertyKey

internal object TextInputSemanticsProperties {
    val EditableHelperText: SemanticsPropertyKey<String> =
        SemanticsPropertyKey(name = "EditableHelperText")
    val EditableCounter: SemanticsPropertyKey<Pair<Int, Int>> =
        SemanticsPropertyKey(name = "EditableCounter")
}
