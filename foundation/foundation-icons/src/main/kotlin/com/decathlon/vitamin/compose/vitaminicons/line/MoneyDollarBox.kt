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

public val LineGroup.MoneyDollarBox: ImageVector
    get() {
        if (_moneyDollarBox != null) {
            return _moneyDollarBox!!
        }
        _moneyDollarBox = Builder(name = "MoneyDollarBox", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(9.3333f, 9.3333f)
                horizontalLineTo(5.6666f)
                verticalLineTo(10.6667f)
                horizontalLineTo(7.3333f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.6666f)
                verticalLineTo(10.6667f)
                horizontalLineTo(9.3333f)
                curveTo(10.2538f, 10.6667f, 11.0f, 9.9205f, 11.0f, 9.0f)
                curveTo(11.0f, 8.0795f, 10.2538f, 7.3333f, 9.3333f, 7.3333f)
                horizontalLineTo(6.6666f)
                curveTo(6.4826f, 7.3333f, 6.3333f, 7.1841f, 6.3333f, 7.0f)
                curveTo(6.3333f, 6.8159f, 6.4826f, 6.6667f, 6.6666f, 6.6667f)
                horizontalLineTo(10.3333f)
                verticalLineTo(5.3333f)
                horizontalLineTo(8.6666f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.3333f)
                verticalLineTo(5.3333f)
                horizontalLineTo(6.6666f)
                curveTo(5.7462f, 5.3333f, 5.0f, 6.0795f, 5.0f, 7.0f)
                curveTo(5.0f, 7.9205f, 5.7462f, 8.6667f, 6.6666f, 8.6667f)
                horizontalLineTo(9.3333f)
                curveTo(9.5174f, 8.6667f, 9.6666f, 8.8159f, 9.6666f, 9.0f)
                curveTo(9.6666f, 9.1841f, 9.5174f, 9.3333f, 9.3333f, 9.3333f)
                close()
            }
        }
        .build()
        return _moneyDollarBox!!
    }

private var _moneyDollarBox: ImageVector? = null
