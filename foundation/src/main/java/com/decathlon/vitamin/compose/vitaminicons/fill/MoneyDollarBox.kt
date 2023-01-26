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

public val FillGroup.MoneyDollarBox: ImageVector
    get() {
        if (_moneyDollarBox != null) {
            return _moneyDollarBox!!
        }
        _moneyDollarBox = Builder(name = "MoneyDollarBox", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.5f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                curveTo(14.2761f, 14.0f, 14.5f, 13.7761f, 14.5f, 13.5f)
                curveTo(14.5f, 13.2239f, 14.2761f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(10.0f)
                curveTo(8.6193f, 13.0f, 7.5f, 11.8807f, 7.5f, 10.5f)
                curveTo(7.5f, 9.1193f, 8.6193f, 8.0f, 10.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                curveTo(9.7239f, 10.0f, 9.5f, 10.2239f, 9.5f, 10.5f)
                curveTo(9.5f, 10.7761f, 9.7239f, 11.0f, 10.0f, 11.0f)
                horizontalLineTo(14.0f)
                curveTo(15.3807f, 11.0f, 16.5f, 12.1193f, 16.5f, 13.5f)
                curveTo(16.5f, 14.8807f, 15.3807f, 16.0f, 14.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _moneyDollarBox!!
    }

private var _moneyDollarBox: ImageVector? = null
