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

public val FillGroup.MoneyPoundBox: ImageVector
    get() {
        if (_moneyPoundBox != null) {
            return _moneyPoundBox!!
        }
        _moneyPoundBox = Builder(name = "MoneyPoundBox", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(6.0f, 10.0f)
                verticalLineTo(8.6667f)
                horizontalLineTo(5.3334f)
                verticalLineTo(7.3333f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.6667f)
                curveTo(6.001f, 5.5501f, 6.7927f, 4.5906f, 7.8888f, 4.3776f)
                curveTo(8.9848f, 4.1646f, 10.0783f, 4.7577f, 10.4974f, 5.7927f)
                lineTo(9.1734f, 6.1233f)
                curveTo(8.9327f, 5.7508f, 8.4755f, 5.5813f, 8.0502f, 5.7069f)
                curveTo(7.6248f, 5.8324f, 7.333f, 6.2232f, 7.3334f, 6.6667f)
                verticalLineTo(7.3333f)
                horizontalLineTo(9.3334f)
                verticalLineTo(8.6667f)
                horizontalLineTo(7.3334f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.6667f)
                verticalLineTo(11.3333f)
                horizontalLineTo(5.3334f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _moneyPoundBox!!
    }

private var _moneyPoundBox: ImageVector? = null
