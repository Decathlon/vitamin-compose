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

public val FillGroup.MoneyCnyBox: ImageVector
    get() {
        if (_moneyCnyBox != null) {
            return _moneyCnyBox!!
        }
        _moneyCnyBox = Builder(name = "MoneyCnyBox", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.6667f, 8.0f)
                verticalLineTo(8.6667f)
                horizontalLineTo(10.6667f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(11.3333f)
                horizontalLineTo(7.3334f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.3334f)
                verticalLineTo(8.6667f)
                horizontalLineTo(7.3334f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.3334f)
                verticalLineTo(6.6667f)
                horizontalLineTo(7.0574f)
                lineTo(5.6427f, 5.2533f)
                lineTo(6.586f, 4.3093f)
                lineTo(8.0f, 5.724f)
                lineTo(9.414f, 4.3093f)
                lineTo(10.3574f, 5.2527f)
                lineTo(8.9427f, 6.6667f)
                horizontalLineTo(10.6667f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.6667f)
                close()
            }
        }
        .build()
        return _moneyCnyBox!!
    }

private var _moneyCnyBox: ImageVector? = null
