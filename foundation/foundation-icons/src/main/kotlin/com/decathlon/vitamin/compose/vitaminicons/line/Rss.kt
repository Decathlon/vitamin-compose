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
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.3333f)
                curveTo(2.7072f, 11.3333f, 3.3855f, 11.6143f, 3.8856f, 12.1144f)
                curveTo(4.3857f, 12.6145f, 4.6667f, 13.2928f, 4.6667f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.3333f)
                close()
                moveTo(2.0f, 6.6667f)
                curveTo(6.05f, 6.6667f, 9.3333f, 9.95f, 9.3333f, 14.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 12.4087f, 7.3679f, 10.8826f, 6.2426f, 9.7574f)
                curveTo(5.1174f, 8.6321f, 3.5913f, 8.0f, 2.0f, 8.0f)
                verticalLineTo(6.6667f)
                close()
                moveTo(2.0f, 2.0f)
                curveTo(8.6273f, 2.0f, 14.0f, 7.3727f, 14.0f, 14.0f)
                horizontalLineTo(12.6667f)
                curveTo(12.6667f, 8.1087f, 7.8913f, 3.3333f, 2.0f, 3.3333f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
