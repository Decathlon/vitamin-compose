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
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.3682f, 2.0f, 14.6666f, 2.2985f, 14.6666f, 2.6667f)
                verticalLineTo(13.3333f)
                curveTo(14.6666f, 13.7015f, 14.3682f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(2.0f)
                curveTo(1.6318f, 14.0f, 1.3333f, 13.7015f, 1.3333f, 13.3333f)
                verticalLineTo(2.6667f)
                curveTo(1.3333f, 2.2985f, 1.6318f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(2.6667f, 3.3333f)
                verticalLineTo(12.6667f)
                horizontalLineTo(13.3333f)
                verticalLineTo(3.3333f)
                horizontalLineTo(2.6667f)
                close()
                moveTo(10.0f, 7.3333f)
                horizontalLineTo(6.7f)
                curveTo(6.8175f, 6.7565f, 7.2306f, 6.2843f, 7.7868f, 6.0914f)
                curveTo(8.343f, 5.8984f, 8.9598f, 6.0132f, 9.4093f, 6.3933f)
                lineTo(10.5433f, 5.638f)
                curveTo(9.7481f, 4.7713f, 8.5197f, 4.4493f, 7.4016f, 4.8144f)
                curveTo(6.2834f, 5.1795f, 5.4818f, 6.1644f, 5.3513f, 7.3333f)
                horizontalLineTo(4.6666f)
                verticalLineTo(8.6667f)
                horizontalLineTo(5.352f)
                curveTo(5.4829f, 9.835f, 6.2843f, 10.8192f, 7.4019f, 11.1843f)
                curveTo(8.5195f, 11.5493f, 9.7473f, 11.2278f, 10.5426f, 10.362f)
                lineTo(9.4093f, 9.6067f)
                curveTo(8.9598f, 9.9868f, 8.343f, 10.1016f, 7.7868f, 9.9086f)
                curveTo(7.2306f, 9.7157f, 6.8175f, 9.2436f, 6.7f, 8.6667f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.3333f)
                close()
            }
        }
        .build()
        return _moneyEuroBox!!
    }

private var _moneyEuroBox: ImageVector? = null
