package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.6666f, 6.0f)
                curveTo(14.6666f, 3.6667f, 13.0253f, 2.0f, 11.0f, 2.0f)
                curveTo(9.76f, 2.0f, 8.6666f, 2.6667f, 8.0f, 3.3333f)
                curveTo(7.3333f, 2.6667f, 6.24f, 2.0f, 5.0f, 2.0f)
                curveTo(3.0f, 2.0f, 1.3333f, 3.6667f, 1.3333f, 6.0f)
                curveTo(1.3333f, 10.4006f, 5.7794f, 13.0228f, 7.6839f, 14.146f)
                curveTo(7.7991f, 14.2139f, 7.905f, 14.2763f, 8.0f, 14.3333f)
                curveTo(8.095f, 14.2763f, 8.2009f, 14.2139f, 8.316f, 14.146f)
                curveTo(10.2205f, 13.0228f, 14.6666f, 10.4006f, 14.6666f, 6.0f)
                close()
                moveTo(10.236f, 11.2687f)
                curveTo(9.74f, 11.6633f, 9.21f, 12.032f, 8.6227f, 12.4027f)
                curveTo(8.4233f, 12.528f, 8.226f, 12.6487f, 8.0f, 12.7833f)
                curveTo(7.774f, 12.6487f, 7.5767f, 12.528f, 7.3773f, 12.402f)
                curveTo(6.79f, 12.032f, 6.26f, 11.6633f, 5.7633f, 11.2687f)
                curveTo(3.7773f, 9.6887f, 2.6667f, 7.9627f, 2.6667f, 6.0f)
                curveTo(2.6667f, 4.4373f, 3.7067f, 3.3333f, 5.0f, 3.3333f)
                curveTo(5.7173f, 3.3333f, 6.4933f, 3.7133f, 7.0573f, 4.276f)
                lineTo(8.0f, 5.2187f)
                lineTo(8.9426f, 4.276f)
                curveTo(9.5066f, 3.7133f, 10.2826f, 3.3333f, 11.0f, 3.3333f)
                curveTo(12.3086f, 3.3333f, 13.3333f, 4.4267f, 13.3333f, 6.0f)
                curveTo(13.3333f, 7.962f, 12.2233f, 9.6887f, 10.236f, 11.2687f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
