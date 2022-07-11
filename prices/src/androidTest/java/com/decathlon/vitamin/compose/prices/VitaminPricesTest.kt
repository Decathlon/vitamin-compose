package com.decathlon.vitamin.compose.prices

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.printToLog
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.decathlon.vitamin.compose.foundation.VitaminTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class VitaminPricesTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun strikethrough_price_text_richer_for_accessibility() {
        val price = "50 €"
        composeTestRule.setContent {
            VitaminTheme {
                VitaminPrices.Strikethrough(price, sizes = VitaminPriceSizes.small())
            }
        }

        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(
                R.string.vtmn_price_strikethrough,
                price
            )
        ).assertExists()
    }

    @Test
    fun default_price_text() {
        val price = "50 €"
        composeTestRule.setContent {
            VitaminTheme {
                VitaminPrices.Default(price, sizes = VitaminPriceSizes.small())
            }
        }

        composeTestRule.onNodeWithText(price)
            .assertExists()
    }

    @Test
    fun accent_price_text() {
        val price = "50 €"
        composeTestRule.setContent {
            VitaminTheme {
                VitaminPrices.Accent(price, sizes = VitaminPriceSizes.small())
            }
        }

        composeTestRule.onRoot().printToLog("Fanny")

        composeTestRule.onNodeWithText(price)
            .assertExists()
    }

    @Test
    fun alert_price_text() {
        val price = "50 €"
        composeTestRule.setContent {
            VitaminTheme {
                VitaminPrices.Alert(price, sizes = VitaminPriceSizes.small())
            }
        }

        composeTestRule.onNodeWithText(price)
            .assertExists()
    }
}
