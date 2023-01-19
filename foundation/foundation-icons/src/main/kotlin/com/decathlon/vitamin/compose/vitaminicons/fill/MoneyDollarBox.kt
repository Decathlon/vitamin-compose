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
                moveTo(5.6667f, 10.6667f)
                verticalLineTo(9.3333f)
                horizontalLineTo(9.3334f)
                curveTo(9.5175f, 9.3333f, 9.6667f, 9.1841f, 9.6667f, 9.0f)
                curveTo(9.6667f, 8.8159f, 9.5175f, 8.6667f, 9.3334f, 8.6667f)
                horizontalLineTo(6.6667f)
                curveTo(5.7462f, 8.6667f, 5.0f, 7.9205f, 5.0f, 7.0f)
                curveTo(5.0f, 6.0795f, 5.7462f, 5.3333f, 6.6667f, 5.3333f)
                horizontalLineTo(7.3334f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(5.3333f)
                horizontalLineTo(10.3334f)
                verticalLineTo(6.6667f)
                horizontalLineTo(6.6667f)
                curveTo(6.4826f, 6.6667f, 6.3334f, 6.8159f, 6.3334f, 7.0f)
                curveTo(6.3334f, 7.1841f, 6.4826f, 7.3333f, 6.6667f, 7.3333f)
                horizontalLineTo(9.3334f)
                curveTo(10.2538f, 7.3333f, 11.0f, 8.0795f, 11.0f, 9.0f)
                curveTo(11.0f, 9.9205f, 10.2538f, 10.6667f, 9.3334f, 10.6667f)
                horizontalLineTo(8.6667f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.3334f)
                verticalLineTo(10.6667f)
                horizontalLineTo(5.6667f)
                close()
            }
        }
        .build()
        return _moneyDollarBox!!
    }

private var _moneyDollarBox: ImageVector? = null
