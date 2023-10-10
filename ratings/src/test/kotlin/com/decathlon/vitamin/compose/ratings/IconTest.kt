package com.decathlon.vitamin.compose.ratings

import org.junit.Assert.assertEquals
import org.junit.Test

class IconTest {
    @Test
    fun integer() {
        assertStars(number = 3.0f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Empty, Icon.Empty)
    }

    @Test
    fun close_above_int() {
        assertStars(number = 3.2f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Empty, Icon.Empty)
    }

    @Test
    fun lower_limit_of_half() {
        assertStars(number = 3.25f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Half, Icon.Empty)
    }

    @Test
    fun close_below_half() {
        assertStars(number = 3.4f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Half, Icon.Empty)
    }

    @Test
    fun strictly_half() {
        assertStars(number = 3.5f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Half, Icon.Empty)
    }

    @Test
    fun close_above_half() {
        assertStars(number = 3.6f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Half, Icon.Empty)
    }

    @Test
    fun high_limit_of_half() {
        assertStars(number = 3.75f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Half, Icon.Empty)
    }

    @Test
    fun close_below_int() {
        assertStars(number = 3.8f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Empty)
    }

    @Test
    fun close_edge_case_below_int() {
        assertStars(number = 3.751f, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Fill, Icon.Empty)
    }

    /**
     * Asserts that a given [number] produces an expected list of icons.
     */
    private fun assertStars(
        number: Float,
        icon1: Icon,
        icon2: Icon,
        icon3: Icon,
        icon4: Icon,
        icon5: Icon
    ) {
        assertEquals("1st star of $number should be ${icon1::class.simpleName}", icon1, Icon.get(0, number))
        assertEquals("2nd star of $number should be ${icon2::class.simpleName}", icon2, Icon.get(1, number))
        assertEquals("3rd star of $number should be ${icon3::class.simpleName}", icon3, Icon.get(2, number))
        assertEquals("4th star of $number should be ${icon4::class.simpleName}", icon4, Icon.get(3, number))
        assertEquals("5th star of $number should be ${icon5::class.simpleName}", icon5, Icon.get(4, number))
    }
}
