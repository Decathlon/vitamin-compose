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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                horizontalLineTo(2.6667f)
                curveTo(2.6667f, 10.9453f, 5.0546f, 13.3333f, 8.0f, 13.3333f)
                curveTo(10.9453f, 13.3333f, 13.3333f, 10.9453f, 13.3333f, 8.0f)
                curveTo(13.3333f, 5.0546f, 10.9453f, 2.6667f, 8.0f, 2.6667f)
                curveTo(6.1666f, 2.6667f, 4.5493f, 3.5913f, 3.59f, 5.0f)
                horizontalLineTo(5.3333f)
                verticalLineTo(6.3333f)
                horizontalLineTo(1.3333f)
                verticalLineTo(2.3333f)
                horizontalLineTo(2.6667f)
                verticalLineTo(4.0f)
                curveTo(3.8826f, 2.38f, 5.8193f, 1.3333f, 8.0f, 1.3333f)
                close()
                moveTo(8.6666f, 4.6666f)
                verticalLineTo(7.7233f)
                lineTo(10.8286f, 9.8853f)
                lineTo(9.8853f, 10.8286f)
                lineTo(7.3333f, 8.2753f)
                verticalLineTo(4.6666f)
                horizontalLineTo(8.6666f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
