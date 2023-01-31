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

public val FillGroup.MoneyEuroBox: ImageVector
    get() {
        if (_moneyEuroBox != null) {
            return _moneyEuroBox!!
        }
        _moneyEuroBox = Builder(name = "MoneyEuroBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.4477f, 21.5523f, 3.0f, 21.0f, 3.0f)
                close()
                moveTo(11.6803f, 9.1371f)
                curveTo(10.8459f, 9.4265f, 10.2262f, 10.1347f, 10.05f, 11.0f)
                lineTo(15.0f, 11.001f)
                verticalLineTo(13.001f)
                lineTo(10.05f, 13.0f)
                curveTo(10.2265f, 13.8652f, 10.8463f, 14.573f, 11.6806f, 14.8623f)
                curveTo(12.5149f, 15.1515f, 13.4398f, 14.9792f, 14.114f, 14.409f)
                lineTo(15.815f, 15.543f)
                curveTo(14.6222f, 16.8431f, 12.7796f, 17.3261f, 11.1024f, 16.7784f)
                curveTo(9.4252f, 16.2308f, 8.2228f, 14.7535f, 8.027f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.028f)
                curveTo(8.2241f, 9.247f, 9.4263f, 7.7702f, 11.1031f, 7.2226f)
                curveTo(12.78f, 6.675f, 14.6221f, 7.1576f, 15.815f, 8.457f)
                lineTo(14.114f, 9.59f)
                curveTo(13.4397f, 9.0198f, 12.5146f, 8.8476f, 11.6803f, 9.1371f)
                close()
            }
        }
        .build()
        return _moneyEuroBox!!
    }

private var _moneyEuroBox: ImageVector? = null
