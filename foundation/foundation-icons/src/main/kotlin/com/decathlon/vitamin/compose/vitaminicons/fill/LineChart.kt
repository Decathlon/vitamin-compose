package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.LineChart: ImageVector
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
                moveTo(19.94f, 5.94f)
                lineTo(22.06f, 8.06f)
                lineTo(16.0f, 14.122f)
                lineTo(13.0f, 11.122f)
                lineTo(9.06f, 15.062f)
                lineTo(6.94f, 12.94f)
                lineTo(13.0f, 6.88f)
                lineTo(16.0f, 9.88f)
                lineTo(19.94f, 5.94f)
                close()
            }
        }
        .build()
        return _lineChart!!
    }

private var _lineChart: ImageVector? = null
