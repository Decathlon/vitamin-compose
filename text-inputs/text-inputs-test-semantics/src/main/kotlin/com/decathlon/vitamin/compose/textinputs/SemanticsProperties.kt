package com.decathlon.vitamin.compose.textinputs

import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.SemanticsPropertyReceiver

val SemanticsProperties.EditableHelperText: SemanticsPropertyKey<String>
    get() = TextInputSemanticsProperties.EditableHelperText

val SemanticsProperties.EditableCounter: SemanticsPropertyKey<Pair<Int, Int>>
    get() = TextInputSemanticsProperties.EditableCounter

var SemanticsPropertyReceiver.editableHelperText by TextInputSemanticsProperties.EditableHelperText

var SemanticsPropertyReceiver.editableCounter by TextInputSemanticsProperties.EditableCounter
