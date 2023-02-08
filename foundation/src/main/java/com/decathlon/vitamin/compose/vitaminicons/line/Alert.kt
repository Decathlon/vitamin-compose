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

public val LineGroup.Alert: ImageVector
    get() {
        if (_alert != null) {
            return _alert!!
        }
        _alert = Builder(name = "Alert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.918f, 20.0f)
                lineTo(12.392f, 3.5f)
                curveTo(12.2133f, 3.1906f, 11.8832f, 3.0f, 11.526f, 3.0f)
                curveTo(11.1687f, 3.0f, 10.8386f, 3.1906f, 10.66f, 3.5f)
                lineTo(1.134f, 20.0f)
                curveTo(0.9553f, 20.3094f, 0.9553f, 20.6905f, 1.134f, 20.9999f)
                curveTo(1.3126f, 21.3093f, 1.6427f, 21.4999f, 2.0f, 21.5f)
                horizontalLineTo(21.052f)
                curveTo(21.4092f, 21.4999f, 21.7394f, 21.3093f, 21.918f, 20.9999f)
                curveTo(22.0966f, 20.6905f, 22.0966f, 20.3094f, 21.918f, 20.0f)
                close()
                moveTo(19.32f, 19.5f)
                horizontalLineTo(3.732f)
                lineTo(11.526f, 6.0f)
                lineTo(19.32f, 19.5f)
                close()
                moveTo(12.526f, 16.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(10.526f)
                verticalLineTo(16.5f)
                horizontalLineTo(12.526f)
                close()
                moveTo(12.526f, 9.5f)
                horizontalLineTo(10.526f)
                verticalLineTo(14.5f)
                horizontalLineTo(12.526f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _alert!!
    }

private var _alert: ImageVector? = null
