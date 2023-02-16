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
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(2.0f)
                curveTo(1.6319f, 2.0f, 1.3334f, 2.2985f, 1.3334f, 2.6667f)
                verticalLineTo(13.3333f)
                curveTo(1.3334f, 13.7015f, 1.6319f, 14.0f, 2.0f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(14.3682f, 14.0f, 14.6667f, 13.7015f, 14.6667f, 13.3333f)
                verticalLineTo(2.6667f)
                curveTo(14.6667f, 2.2985f, 14.3682f, 2.0f, 14.0f, 2.0f)
                close()
                moveTo(7.7869f, 6.0914f)
                curveTo(7.2307f, 6.2843f, 6.8175f, 6.7565f, 6.7f, 7.3333f)
                lineTo(10.0f, 7.334f)
                verticalLineTo(8.6673f)
                lineTo(6.7f, 8.6667f)
                curveTo(6.8177f, 9.2434f, 7.2309f, 9.7154f, 7.7871f, 9.9082f)
                curveTo(8.3433f, 10.101f, 8.9599f, 9.9861f, 9.4094f, 9.606f)
                lineTo(10.5434f, 10.362f)
                curveTo(9.7481f, 11.2287f, 8.5198f, 11.5507f, 7.4016f, 11.1856f)
                curveTo(6.2835f, 10.8205f, 5.4819f, 9.8357f, 5.3514f, 8.6667f)
                horizontalLineTo(4.6667f)
                verticalLineTo(7.3333f)
                horizontalLineTo(5.352f)
                curveTo(5.4828f, 6.1646f, 6.2843f, 5.1801f, 7.4021f, 4.8151f)
                curveTo(8.52f, 4.45f, 9.7481f, 4.7717f, 10.5434f, 5.638f)
                lineTo(9.4094f, 6.3933f)
                curveTo(8.9598f, 6.0132f, 8.3431f, 5.8984f, 7.7869f, 6.0914f)
                close()
            }
        }
        .build()
        return _moneyEuroBox!!
    }

private var _moneyEuroBox: ImageVector? = null
