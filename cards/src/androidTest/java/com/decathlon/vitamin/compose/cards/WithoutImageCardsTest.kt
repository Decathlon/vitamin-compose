package com.decathlon.vitamin.compose.cards

import androidx.compose.ui.test.junit4.createComposeRule
import com.decathlon.vitamin.compose.cards.FullImageCardsTest.Companion.CustomContentSample
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.karumi.shot.ScreenshotTest
import org.junit.Rule
import org.junit.Test

class WithoutImageCardsTest : ScreenshotTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun card_without_image_with_title_and_text() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminCards.WithoutImage(
                    content = {
                        TitleAndText(
                            title = "Card without image",
                            text = "A container for content representing a single entity. e.g. a contact, article, or task."
                        )
                    }
                )
            }
        }
        compareScreenshot(composeTestRule)
    }

    @Test
    fun card_without_image_with_custom_content() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminCards.WithoutImage(
                    content = {
                        CustomContentSample("Card without image - Custom content")
                    }
                )
            }
        }
        compareScreenshot(composeTestRule)
    }
}
