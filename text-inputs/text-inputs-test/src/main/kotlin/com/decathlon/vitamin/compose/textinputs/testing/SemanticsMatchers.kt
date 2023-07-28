package com.decathlon.vitamin.compose.textinputs.testing

import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.semantics.getOrNull
import androidx.compose.ui.test.SemanticsMatcher
import com.decathlon.vitamin.compose.textinputs.EditableCounter
import com.decathlon.vitamin.compose.textinputs.EditableHelperText

/**
 * Returns whether the node's editable text label contains the given value.
 *
 * @param label Label to match the editable text label from semantic tree
 * @param ignoreCase Whether case should be ignored.
 * @see SemanticsProperties.Text
 * @see SemanticsProperties.EditableText
 */
fun hasEditableTextLabel(label: String, ignoreCase: Boolean = false): SemanticsMatcher {
    return SemanticsMatcher("${SemanticsProperties.Text.name} = '$label'") {
        val hasSetTextAction = SemanticsActions.SetText in it.config
        val isInTextValue = it.config.getOrNull(SemanticsProperties.Text)
            ?.any { item -> item.text.equals(label, ignoreCase) } ?: false
        hasSetTextAction && isInTextValue
    }
}

/**
 * Returns whether the node's editable text value contains the given value.
 *
 * @param value Value to match the editable text value from semantic tree
 * @see SemanticsProperties.EditableText
 */
fun hasEditableTextValue(value: String): SemanticsMatcher {
    return SemanticsMatcher("${SemanticsProperties.EditableText.name} = '$value'") {
        val hasSetTextAction = SemanticsActions.SetText in it.config
        val isInEditableTextValue = it.config.getOrNull(SemanticsProperties.EditableText)
            ?.text?.equals(value) ?: false
        hasSetTextAction && isInEditableTextValue
    }
}

/**
 * Returns whether the node's editable text helper text contains the given value.
 *
 * @param helperText Helper text to match the editable text helper text from semantic tree
 * @see SemanticsProperties.EditableHelperText
 */
fun hasEditableTextHelperText(helperText: String): SemanticsMatcher {
    return SemanticsMatcher("${SemanticsProperties.EditableHelperText.name} = '$helperText'") {
        it.config.getOrNull(SemanticsProperties.EditableHelperText) == helperText
    }
}

/**
 * Returns whether the node's editable counter pair contains the given value.
 *
 * @param counter Counter to match the editable text counter from semantic tree
 * @see SemanticsProperties.EditableCounter
 */
fun hasEditableTextCounter(counter: Pair<Int, Int>): SemanticsMatcher {
    return SemanticsMatcher("${SemanticsProperties.EditableCounter.name} = '$counter'") {
        it.config.getOrNull(SemanticsProperties.EditableCounter) == counter
    }
}
