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

public val LineGroup.MoneyPoundBox: ImageVector
    get() {
        if (_moneyPoundBox != null) {
            return _moneyPoundBox!!
        }
        _moneyPoundBox = Builder(name = "MoneyPoundBox", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(5.3333f, 8.6667f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.3333f)
                verticalLineTo(11.3333f)
                horizontalLineTo(10.6666f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.3333f)
                verticalLineTo(8.6667f)
                horizontalLineTo(9.3333f)
                verticalLineTo(7.3333f)
                horizontalLineTo(7.3333f)
                verticalLineTo(6.6667f)
                curveTo(7.332f, 6.2226f, 7.6238f, 5.831f, 8.0496f, 5.7052f)
                curveTo(8.4755f, 5.5795f, 8.9332f, 5.7498f, 9.1733f, 6.1233f)
                lineTo(10.4973f, 5.7927f)
                curveTo(10.0794f, 4.7562f, 8.9852f, 4.1617f, 7.8882f, 4.3748f)
                curveTo(6.7912f, 4.588f, 5.9993f, 5.5491f, 6.0f, 6.6667f)
                verticalLineTo(7.3333f)
                horizontalLineTo(5.3333f)
                verticalLineTo(8.6667f)
                close()
            }
        }
        .build()
        return _moneyPoundBox!!
    }

private var _moneyPoundBox: ImageVector? = null
