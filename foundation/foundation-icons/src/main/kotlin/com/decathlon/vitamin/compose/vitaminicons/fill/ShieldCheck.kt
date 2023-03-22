package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.ShieldCheck: ImageVector
    get() {
        if (_shieldCheck != null) {
            return _shieldCheck!!
        }
        _shieldCheck = Builder(name = "ShieldCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.217f, 2.826f)
                lineTo(12.0f, 1.0f)
                lineTo(3.783f, 2.826f)
                curveTo(3.326f, 2.928f, 3.0f, 3.333f, 3.0f, 3.802f)
                verticalLineTo(13.79f)
                curveTo(3.0f, 15.795f, 4.002f, 17.668f, 5.672f, 18.781f)
                lineTo(12.0f, 23.0f)
                lineTo(18.328f, 18.781f)
                curveTo(19.997f, 17.669f, 21.0f, 15.795f, 21.0f, 13.789f)
                verticalLineTo(3.802f)
                curveTo(21.0f, 3.333f, 20.674f, 2.928f, 20.217f, 2.826f)
                close()
                moveTo(11.502f, 13.171f)
                lineTo(16.452f, 8.222f)
                lineTo(17.867f, 9.636f)
                lineTo(11.503f, 16.0f)
                lineTo(7.26f, 11.757f)
                lineTo(8.674f, 10.343f)
                lineTo(11.502f, 13.171f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
