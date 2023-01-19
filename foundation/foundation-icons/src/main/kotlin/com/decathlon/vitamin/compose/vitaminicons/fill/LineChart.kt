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
                moveTo(13.2933f, 3.96f)
                lineTo(14.7067f, 5.3733f)
                lineTo(10.6667f, 9.4147f)
                lineTo(8.6667f, 7.4147f)
                lineTo(6.04f, 10.0413f)
                lineTo(4.6267f, 8.6267f)
                lineTo(8.6667f, 4.5867f)
                lineTo(10.6667f, 6.5867f)
                lineTo(13.2933f, 3.96f)
                close()
            }
        }
        .build()
        return _lineChart!!
    }

private var _lineChart: ImageVector? = null
