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

public val FillGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                curveTo(8.6273f, 2.0f, 14.0f, 7.3727f, 14.0f, 14.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 8.4773f, 7.5227f, 4.0f, 2.0f, 4.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(2.0f, 6.6667f)
                curveTo(6.05f, 6.6667f, 9.3333f, 9.95f, 9.3333f, 14.0f)
                horizontalLineTo(7.3333f)
                curveTo(7.3333f, 12.5855f, 6.7714f, 11.229f, 5.7712f, 10.2288f)
                curveTo(4.771f, 9.2286f, 3.4145f, 8.6667f, 2.0f, 8.6667f)
                verticalLineTo(6.6667f)
                close()
                moveTo(2.0f, 11.3333f)
                curveTo(2.7072f, 11.3333f, 3.3855f, 11.6143f, 3.8856f, 12.1144f)
                curveTo(4.3857f, 12.6145f, 4.6667f, 13.2928f, 4.6667f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.3333f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
