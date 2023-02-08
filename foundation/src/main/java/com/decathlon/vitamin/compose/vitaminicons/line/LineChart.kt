package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.LineChart: ImageVector
    get() {
        if (_lineChart != null) {
            return _lineChart!!
        }
        _lineChart = Builder(name = "LineChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(20.293f, 6.293f)
                lineTo(21.707f, 7.707f)
                lineTo(16.0f, 13.414f)
                lineTo(13.0f, 10.415f)
                lineTo(8.707f, 14.707f)
                lineTo(7.293f, 13.293f)
                lineTo(13.0f, 7.586f)
                lineTo(16.0f, 10.585f)
                lineTo(20.293f, 6.293f)
                close()
            }
        }
        .build()
        return _lineChart!!
    }

private var _lineChart: ImageVector? = null
