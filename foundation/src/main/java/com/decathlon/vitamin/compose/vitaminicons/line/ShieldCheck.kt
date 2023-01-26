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

public val LineGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                lineTo(20.217f, 2.826f)
                curveTo(20.674f, 2.928f, 21.0f, 3.333f, 21.0f, 3.802f)
                verticalLineTo(13.789f)
                curveTo(21.0f, 15.795f, 19.997f, 17.669f, 18.328f, 18.781f)
                lineTo(12.0f, 23.0f)
                lineTo(5.672f, 18.781f)
                curveTo(4.002f, 17.668f, 3.0f, 15.795f, 3.0f, 13.79f)
                verticalLineTo(3.802f)
                curveTo(3.0f, 3.333f, 3.326f, 2.928f, 3.783f, 2.826f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 3.049f)
                lineTo(5.0f, 4.604f)
                verticalLineTo(13.789f)
                curveTo(5.0f, 15.126f, 5.668f, 16.375f, 6.781f, 17.117f)
                lineTo(12.0f, 20.597f)
                lineTo(17.219f, 17.117f)
                curveTo(18.332f, 16.375f, 19.0f, 15.127f, 19.0f, 13.79f)
                verticalLineTo(4.604f)
                lineTo(12.0f, 3.05f)
                verticalLineTo(3.049f)
                close()
                moveTo(17.867f, 9.636f)
                lineTo(16.452f, 8.222f)
                verticalLineTo(8.221f)
                lineTo(11.502f, 13.171f)
                lineTo(8.674f, 10.343f)
                lineTo(7.26f, 11.757f)
                lineTo(11.503f, 16.0f)
                lineTo(17.867f, 9.636f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
