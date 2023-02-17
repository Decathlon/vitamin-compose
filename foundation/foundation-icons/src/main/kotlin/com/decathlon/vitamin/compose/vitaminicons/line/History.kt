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

public val LineGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(9.25f, 4.0f, 6.824f, 5.387f, 5.385f, 7.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                curveTo(5.824f, 3.57f, 8.729f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineTo(11.585f)
                lineTo(16.243f, 14.828f)
                lineTo(14.828f, 16.243f)
                lineTo(11.0f, 12.413f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
