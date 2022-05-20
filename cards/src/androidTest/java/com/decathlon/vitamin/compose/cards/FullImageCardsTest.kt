package com.decathlon.vitamin.compose.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.test.rule.GrantPermissionRule
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import com.karumi.shot.ScreenshotTest
import org.junit.Rule
import org.junit.Test

class FullImageCardsTest : ScreenshotTest {

    @get:Rule
    var permissionRule: GrantPermissionRule =
        GrantPermissionRule.grant(android.Manifest.permission.WRITE_EXTERNAL_STORAGE, android.Manifest.permission.READ_EXTERNAL_STORAGE)

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun card_fullImage_with_gradient_title_text_and_button() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminCards.FullImage(
                    painter = painterResource(id = R.drawable.card_placeholder),
                    contentDescription = "We should set here a description " +
                        "of the content if not decorative, otherwise null",
                    content = {
                        TitleTextAndButton(
                            title = "Card Title - Clickable card",
                            text = "A container for content representing a single entity. " +
                                "e.g. a contact, article, or task.",
                            buttonText = "Button",
                            onButtonClick = {}
                        )
                    },
                    imageWithGradient = true
                )
            }
        }

        compareScreenshot(composeTestRule)
    }

    @Test
    fun card_full_image_with_gradient_and_custom_content() {
        composeTestRule.setContent {
            VitaminTheme {
                VitaminCards.FullImage(
                    painter = painterResource(id = R.drawable.card_placeholder),
                    contentDescription = "We should set here a description " +
                        "of the content if not decorative, otherwise null",
                    content = {
                        CustomContentSample()
                    },
                    imageWithGradient = true
                )
            }
        }
        compareScreenshot(composeTestRule)
    }

    @Test
    fun card_dark_mode_full_image_with_title_text_and_button() {
        composeTestRule.setContent {
            VitaminTheme(darkTheme = true) {
                VitaminCards.FullImage(
                    painter = painterResource(id = R.drawable.card_placeholder),
                    contentDescription = "We should set here a description " +
                        "of the content if not decorative, otherwise null",
                    content = {
                        TitleTextAndButton(
                            title = "Card Title - Clickable card",
                            text = "A container for content representing a single entity. " +
                                "e.g. a contact, article, or task.",
                            buttonText = "Button",
                            onButtonClick = {}
                        )
                    }
                )
            }
        }
        compareScreenshot(composeTestRule)
    }

    companion object {
        @Composable
        fun CustomContentSample(text: String = "Replace this instance") {
            Column(
                modifier = Modifier
                    .background(
                        color = VitaminTheme.colors.vtmnBackgroundSecondary,
                        shape = RoundedCornerShape(6.dp)
                    )
                    .border(BorderStroke(2.dp, SolidColor(VitaminTheme.colors.vtmnActiveBrand)))
                    .padding(24.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = text,
                    style = VitaminTheme.typography.body2.copy(fontWeight = FontWeight.Bold)
                )
                Text(
                    text = "By your own or vitamin component",
                    style = VitaminTheme.typography.body3
                )
            }
        }
    }
}
