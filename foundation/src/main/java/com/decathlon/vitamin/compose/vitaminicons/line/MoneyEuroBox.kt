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

public val LineGroup.MoneyEuroBox: ImageVector
    get() {
        if (_moneyEuroBox != null) {
            return _moneyEuroBox!!
        }
        _moneyEuroBox = Builder(name = "MoneyEuroBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(15.0f, 11.0f)
                horizontalLineTo(10.05f)
                curveTo(10.2262f, 10.1347f, 10.8459f, 9.4265f, 11.6803f, 9.1371f)
                curveTo(12.5146f, 8.8476f, 13.4397f, 9.0198f, 14.114f, 9.59f)
                lineTo(15.815f, 8.457f)
                curveTo(14.6222f, 7.1569f, 12.7796f, 6.6739f, 11.1024f, 7.2216f)
                curveTo(9.4252f, 7.7692f, 8.2228f, 9.2465f, 8.027f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.028f)
                curveTo(8.2244f, 14.7526f, 9.4265f, 16.2289f, 11.1029f, 16.7764f)
                curveTo(12.7793f, 17.3239f, 14.621f, 16.8417f, 15.814f, 15.543f)
                lineTo(14.114f, 14.41f)
                curveTo(13.4397f, 14.9802f, 12.5146f, 15.1524f, 11.6803f, 14.8629f)
                curveTo(10.8459f, 14.5735f, 10.2262f, 13.8653f, 10.05f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _moneyEuroBox!!
    }

private var _moneyEuroBox: ImageVector? = null
