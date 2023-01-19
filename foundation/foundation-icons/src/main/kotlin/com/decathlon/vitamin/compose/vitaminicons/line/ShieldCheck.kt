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
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 0.6667f)
                lineTo(13.478f, 1.884f)
                curveTo(13.7827f, 1.952f, 14.0f, 2.222f, 14.0f, 2.5347f)
                verticalLineTo(9.1927f)
                curveTo(14.0f, 10.53f, 13.3313f, 11.7794f, 12.2187f, 12.5207f)
                lineTo(8.0f, 15.3334f)
                lineTo(3.7813f, 12.5207f)
                curveTo(2.668f, 11.7787f, 2.0f, 10.53f, 2.0f, 9.1933f)
                verticalLineTo(2.5347f)
                curveTo(2.0f, 2.222f, 2.2173f, 1.952f, 2.522f, 1.884f)
                lineTo(8.0f, 0.6667f)
                close()
                moveTo(8.0f, 2.0327f)
                lineTo(3.3333f, 3.0693f)
                verticalLineTo(9.1927f)
                curveTo(3.3333f, 10.084f, 3.7787f, 10.9167f, 4.5207f, 11.4113f)
                lineTo(8.0f, 13.7313f)
                lineTo(11.4793f, 11.4113f)
                curveTo(12.2213f, 10.9167f, 12.6667f, 10.0847f, 12.6667f, 9.1933f)
                verticalLineTo(3.0693f)
                lineTo(8.0f, 2.0333f)
                verticalLineTo(2.0327f)
                close()
                moveTo(11.9114f, 6.424f)
                lineTo(10.9681f, 5.4814f)
                verticalLineTo(5.4807f)
                lineTo(7.6681f, 8.7807f)
                lineTo(5.7828f, 6.8954f)
                lineTo(4.8401f, 7.838f)
                lineTo(7.6687f, 10.6667f)
                lineTo(11.9114f, 6.424f)
                close()
            }
        }
        .build()
        return _shieldCheck!!
    }

private var _shieldCheck: ImageVector? = null
