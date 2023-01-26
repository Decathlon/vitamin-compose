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
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(12.941f, 3.0f, 21.0f, 11.059f, 21.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 12.716f, 11.284f, 6.0f, 3.0f, 6.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(3.0f, 10.0f)
                curveTo(9.075f, 10.0f, 14.0f, 14.925f, 14.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 18.8783f, 10.1571f, 16.8434f, 8.6568f, 15.3431f)
                curveTo(7.1566f, 13.8429f, 5.1217f, 13.0f, 3.0f, 13.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.0f, 17.0f)
                curveTo(4.0609f, 17.0f, 5.0783f, 17.4214f, 5.8284f, 18.1716f)
                curveTo(6.5786f, 18.9217f, 7.0f, 19.9391f, 7.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
