package com.decathlon.vitamin.compose.textinputs

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.ui.test.assertAll
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.textinputs.testing.assertEditableTextValueEquals
import com.decathlon.vitamin.compose.textinputs.testing.hasEditableTextLabel
import com.decathlon.vitamin.compose.textinputs.testing.hasEditableTextValue
import com.decathlon.vitamin.compose.textinputs.testing.onAllEditableTextNodeWithLabel
import com.decathlon.vitamin.compose.textinputs.testing.onAllEditableTextNodesWithValue
import com.decathlon.vitamin.compose.textinputs.testing.onEditableTextNodeWithLabel
import com.decathlon.vitamin.compose.textinputs.testing.onEditableTextNodeWithValue
import org.junit.Rule
import org.junit.Test

class TextInputFilteringTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    /**
     * Given Vitamin TextInput with a label
     * When we compose the component tree
     * Then we can filtering the text input by its label
     */
    @Test
    fun checkFilteringTextInputByLabel() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    colors = TextInputsState.normal()
                )
            }
        }
        composeTestRule.onEditableTextNodeWithLabel("My label")
            .assertEditableTextValueEquals("My value")
        composeTestRule.onEditableTextNodeWithLabel("Unknown label")
            .assertDoesNotExist()
    }

    /**
     * Given two Vitamin TextInputs with the same label
     * When we compose the component tree
     * Then we can filtering the text inputs by their label
     */
    @Test
    fun checkFilteringAllTextInputsByLabel() {
        composeTestRule.setContent {
            VitaminTheme {
                Column {
                    VitaminTextInputs.Outlined(
                        value = "My value",
                        label = "My label",
                        onValueChange = {
                        },
                        colors = TextInputsState.normal()
                    )
                    VitaminTextInputs.Outlined(
                        value = "My value",
                        label = "My label",
                        onValueChange = {
                        },
                        colors = TextInputsState.normal()
                    )
                }
            }
        }
        composeTestRule.onAllEditableTextNodeWithLabel("My label")
            .assertAll(hasEditableTextValue("My value"))
    }

    /**
     * Given Vitamin TextInput with a value
     * When we compose the component tree
     * Then we can filtering the text input by its value
     */
    @Test
    fun checkFilteringTextInputByValue() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    colors = TextInputsState.normal()
                )
            }
        }
        composeTestRule.onEditableTextNodeWithValue("My value")
            .assertIsDisplayed()
        composeTestRule.onEditableTextNodeWithValue("Unknown value")
            .assertDoesNotExist()
    }

    /**
     * Given two Vitamin TextInput with the same value
     * When we compose the component tree
     * Then we can filtering the text inputs by their value
     */
    @Test
    fun checkFilteringAllTextInputsByValue() {
        composeTestRule.setContent {
            VitaminTheme {
                Column {
                    VitaminTextInputs.Outlined(
                        value = "My value",
                        label = "My label",
                        onValueChange = {
                        },
                        colors = TextInputsState.normal()
                    )
                    VitaminTextInputs.Outlined(
                        value = "My value",
                        label = "My label",
                        onValueChange = {
                        },
                        colors = TextInputsState.normal()
                    )
                }
            }
        }
        composeTestRule.onAllEditableTextNodesWithValue("My value")
            .assertAll(hasEditableTextLabel("My label"))
    }

    /**
     * Given two Vitamin TextInput with different label
     * When we compose the component tree
     * Then we can filtering each Vitamin TextInput
     */
    @Test
    fun checkCanDistinctMultipleTextInputWithDifferentLabel() {
        composeTestRule.setContent {
            VitaminTheme {
                Column {
                    VitaminTextInputs.Outlined(
                        value = "My value",
                        label = "My label",
                        onValueChange = {
                        },
                        colors = TextInputsState.normal()
                    )
                    VitaminTextInputs.Outlined(
                        value = "My value",
                        label = "My label 2",
                        onValueChange = {
                        },
                        colors = TextInputsState.normal()
                    )
                }
            }
        }
        composeTestRule.onEditableTextNodeWithLabel("My label")
            .assertEditableTextValueEquals("My value")
        composeTestRule.onEditableTextNodeWithLabel("My label 2")
            .assertEditableTextValueEquals("My value")
    }

    /**
     * Given a text and a Vitamin TextInput with the same value
     * When we compose the component tree
     * Then the rule should only find the Vitamin TextInput instead of crash
     */
    @Test
    fun checkCanDistinctTextInputWithAnotherComponentWithSameValue() {
        composeTestRule.setContent {
            VitaminTheme {
                Column {
                    Text("My value")
                    VitaminTextInputs.Outlined(
                        value = "My value",
                        label = "My label",
                        onValueChange = {
                        },
                        colors = TextInputsState.normal()
                    )
                }
            }
        }
        composeTestRule.onEditableTextNodeWithValue("My value")
            .assertIsDisplayed()
    }
}
