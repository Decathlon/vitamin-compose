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

public val LineGroup.ChartLine: ImageVector
    get() {
        if (_chartLine != null) {
            return _chartLine!!
        }
        _chartLine = Builder(name = "ChartLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.3333f, 2.0f)
                verticalLineTo(12.6667f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(3.3333f)
                close()
                moveTo(13.5287f, 4.1953f)
                lineTo(14.4713f, 5.138f)
                lineTo(10.6667f, 8.9427f)
                lineTo(8.6667f, 6.9433f)
                lineTo(5.8047f, 9.8047f)
                lineTo(4.862f, 8.862f)
                lineTo(8.6667f, 5.0573f)
                lineTo(10.6667f, 7.0567f)
                lineTo(13.5287f, 4.1953f)
                close()
            }
        }
        .build()
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
