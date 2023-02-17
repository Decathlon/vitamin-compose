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

public val LineGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                curveTo(4.0609f, 17.0f, 5.0783f, 17.4214f, 5.8284f, 18.1716f)
                curveTo(6.5786f, 18.9217f, 7.0f, 19.9391f, 7.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(3.0f, 10.0f)
                curveTo(9.075f, 10.0f, 14.0f, 14.925f, 14.0f, 21.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 18.6131f, 11.0518f, 16.3239f, 9.364f, 14.636f)
                curveTo(7.6761f, 12.9482f, 5.387f, 12.0f, 3.0f, 12.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.0f, 3.0f)
                curveTo(12.941f, 3.0f, 21.0f, 11.059f, 21.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 12.163f, 11.837f, 5.0f, 3.0f, 5.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
