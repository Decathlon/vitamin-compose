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

public val LineGroup.Feedback: ImageVector
    get() {
        if (_feedback != null) {
            return _feedback!!
        }
        _feedback = Builder(name = "Feedback", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3033f, 12.6667f)
                lineTo(1.3333f, 15.0f)
                verticalLineTo(2.6667f)
                curveTo(1.3333f, 2.4899f, 1.4036f, 2.3203f, 1.5286f, 2.1953f)
                curveTo(1.6536f, 2.0702f, 1.8232f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(14.1768f, 2.0f, 14.3464f, 2.0702f, 14.4714f, 2.1953f)
                curveTo(14.5964f, 2.3203f, 14.6666f, 2.4899f, 14.6666f, 2.6667f)
                verticalLineTo(12.0f)
                curveTo(14.6666f, 12.1768f, 14.5964f, 12.3464f, 14.4714f, 12.4714f)
                curveTo(14.3464f, 12.5964f, 14.1768f, 12.6667f, 14.0f, 12.6667f)
                horizontalLineTo(4.3033f)
                close()
                moveTo(2.6667f, 12.2567f)
                lineTo(3.842f, 11.3333f)
                horizontalLineTo(13.3333f)
                verticalLineTo(3.3333f)
                horizontalLineTo(2.6667f)
                verticalLineTo(12.2567f)
                close()
                moveTo(7.3333f, 8.6667f)
                horizontalLineTo(8.6666f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.3333f)
                verticalLineTo(8.6667f)
                close()
                moveTo(7.3333f, 4.6667f)
                horizontalLineTo(8.6666f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.3333f)
                verticalLineTo(4.6667f)
                close()
            }
        }
        .build()
        return _feedback!!
    }

private var _feedback: ImageVector? = null
