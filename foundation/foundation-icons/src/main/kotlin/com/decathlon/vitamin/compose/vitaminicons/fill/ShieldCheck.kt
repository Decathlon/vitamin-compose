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
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.478f, 1.884f)
                lineTo(8.0f, 0.6667f)
                lineTo(2.522f, 1.884f)
                curveTo(2.2173f, 1.952f, 2.0f, 2.222f, 2.0f, 2.5347f)
                verticalLineTo(9.1933f)
                curveTo(2.0f, 10.53f, 2.668f, 11.7787f, 3.7813f, 12.5207f)
                lineTo(8.0f, 15.3334f)
                lineTo(12.2187f, 12.5207f)
                curveTo(13.3313f, 11.7794f, 14.0f, 10.53f, 14.0f, 9.1927f)
                verticalLineTo(2.5347f)
                curveTo(14.0f, 2.222f, 13.7827f, 1.952f, 13.478f, 1.884f)
                close()
                moveTo(7.6681f, 8.7807f)
                lineTo(10.9681f, 5.4814f)
                lineTo(11.9114f, 6.424f)
                lineTo(7.6687f, 10.6667f)
                lineTo(4.8401f, 7.838f)
                lineTo(5.7828f, 6.8954f)
                lineTo(7.6681f, 8.7807f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
