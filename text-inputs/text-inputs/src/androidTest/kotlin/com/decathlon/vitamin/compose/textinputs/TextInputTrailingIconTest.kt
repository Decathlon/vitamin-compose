package com.decathlon.vitamin.compose.textinputs

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.ui.test.assertHasClickAction
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import com.decathlon.vitamin.compose.VitaminIcons
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.decathlon.vitamin.compose.vitaminicons.Line
import com.decathlon.vitamin.compose.vitaminicons.line.Check
import org.junit.Rule
import org.junit.Test

class TextInputTrailingIconTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    /**
     * Given a TextInput with a trailing icon
     * When we compose the component tree
     * Then we can find the icon by content description and click on it
     */
    @Test
    fun checkIconButtonDeclaredInTextInputCanBeClickable() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminTextInputs.Outlined(
                    value = "My value",
                    label = "My label",
                    onValueChange = {
                    },
                    icon = {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = VitaminIcons.Line.Check,
                                contentDescription = "check"
                            )
                        }
                    }
                )
            }
        }
        composeTestRule.onNodeWithContentDescription(label = "check")
            .assertIsDisplayed()
            .assertHasClickAction()
    }
}
