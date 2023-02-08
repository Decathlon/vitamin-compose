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

public val LineGroup.Task: ImageVector
    get() {
        if (_task != null) {
            return _task!!
        }
        _task = Builder(name = "Task", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 2.992f)
                verticalLineTo(21.008f)
                curveTo(20.9956f, 21.5544f, 20.5534f, 21.9962f, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                curveTo(3.445f, 22.0f, 3.0006f, 21.556f, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0044f, 2.4456f, 3.4466f, 2.0038f, 3.993f, 2.0f)
                horizontalLineTo(20.007f)
                curveTo(20.555f, 2.0f, 21.0f, 2.444f, 21.0f, 2.992f)
                close()
                moveTo(19.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(15.536f, 8.879f)
                lineTo(11.293f, 13.121f)
                lineTo(8.818f, 10.646f)
                lineTo(7.403f, 12.06f)
                lineTo(11.293f, 15.95f)
                lineTo(16.95f, 10.293f)
                lineTo(15.536f, 8.879f)
                close()
            }
        }
        .build()
        return _task!!
    }

private var _task: ImageVector? = null
