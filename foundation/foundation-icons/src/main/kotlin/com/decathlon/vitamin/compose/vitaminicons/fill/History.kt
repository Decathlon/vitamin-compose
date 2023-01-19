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

public val FillGroup.History: ImageVector
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
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                horizontalLineTo(2.6667f)
                curveTo(2.6667f, 10.9453f, 5.0547f, 13.3333f, 8.0f, 13.3333f)
                curveTo(10.9454f, 13.3333f, 13.3334f, 10.9453f, 13.3334f, 8.0f)
                curveTo(13.3334f, 5.0546f, 10.9454f, 2.6667f, 8.0f, 2.6667f)
                curveTo(6.3574f, 2.6667f, 4.888f, 3.4093f, 3.91f, 4.5767f)
                lineTo(5.3334f, 6.0f)
                horizontalLineTo(1.3334f)
                verticalLineTo(2.0f)
                lineTo(2.9647f, 3.6307f)
                curveTo(4.1867f, 2.224f, 5.9894f, 1.3333f, 8.0f, 1.3333f)
                close()
                moveTo(8.6667f, 4.6666f)
                verticalLineTo(7.7233f)
                lineTo(10.8287f, 9.8853f)
                lineTo(9.8854f, 10.8286f)
                lineTo(7.3334f, 8.2753f)
                verticalLineTo(4.6666f)
                horizontalLineTo(8.6667f)
                close()
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
