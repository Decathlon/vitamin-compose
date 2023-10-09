package com.decathlon.vitamin.compose.ratings

import org.junit.Assert.*
import org.junit.Test

class IconTest {
    @Test
    fun integer() {
        val number = 3.0f

        assertEquals(Icon.Fill, Icon.get(0, number))
        assertEquals(Icon.Fill, Icon.get(1, number))
        assertEquals(Icon.Fill, Icon.get(2, number))
        assertEquals(Icon.Empty, Icon.get(3, number))
        assertEquals(Icon.Empty, Icon.get(4, number))
    }

    @Test
    fun close_above_int() {
        val number = 3.2f

        assertEquals(Icon.Fill, Icon.get(0, number))
        assertEquals(Icon.Fill, Icon.get(1, number))
        assertEquals(Icon.Fill, Icon.get(2, number))
        assertEquals(Icon.Empty, Icon.get(3, number))
        assertEquals(Icon.Empty, Icon.get(4, number))
    }

    @Test
    fun close_below_half() {
        val number = 3.4f

        assertEquals(Icon.Fill, Icon.get(0, number))
        assertEquals(Icon.Fill, Icon.get(1, number))
        assertEquals(Icon.Fill, Icon.get(2, number))
        assertEquals(Icon.Half, Icon.get(3, number))
        assertEquals(Icon.Empty, Icon.get(4, number))
    }

    @Test
    fun strictly_half() {
        val number = 3.5f

        assertEquals(Icon.Fill, Icon.get(0, number))
        assertEquals(Icon.Fill, Icon.get(1, number))
        assertEquals(Icon.Fill, Icon.get(2, number))
        assertEquals(Icon.Half, Icon.get(3, number))
        assertEquals(Icon.Empty, Icon.get(4, number))
    }

    @Test
    fun close_above_half() {
        val number = 3.6f

        assertEquals(Icon.Fill, Icon.get(0, number))
        assertEquals(Icon.Fill, Icon.get(1, number))
        assertEquals(Icon.Fill, Icon.get(2, number))
        assertEquals(Icon.Half, Icon.get(3, number))
        assertEquals(Icon.Empty, Icon.get(4, number))
    }

    @Test
    fun close_below_int() {
        val number = 3.8f

        assertEquals(Icon.Fill, Icon.get(0, number))
        assertEquals(Icon.Fill, Icon.get(1, number))
        assertEquals(Icon.Fill, Icon.get(2, number))
        assertEquals(Icon.Fill, Icon.get(3, number))
        assertEquals(Icon.Empty, Icon.get(4, number))
    }
}
