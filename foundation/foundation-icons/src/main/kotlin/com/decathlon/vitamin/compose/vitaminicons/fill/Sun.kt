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

public val FillGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                curveTo(6.9391f, 12.0f, 5.9217f, 11.5785f, 5.1715f, 10.8284f)
                curveTo(4.4214f, 10.0782f, 4.0f, 9.0608f, 4.0f, 8.0f)
                curveTo(4.0f, 6.9391f, 4.4214f, 5.9217f, 5.1715f, 5.1715f)
                curveTo(5.9217f, 4.4214f, 6.9391f, 4.0f, 8.0f, 4.0f)
                curveTo(9.0608f, 4.0f, 10.0782f, 4.4214f, 10.8284f, 5.1715f)
                curveTo(11.5785f, 5.9217f, 12.0f, 6.9391f, 12.0f, 8.0f)
                curveTo(12.0f, 9.0608f, 11.5785f, 10.0782f, 10.8284f, 10.8284f)
                curveTo(10.0782f, 11.5785f, 9.0608f, 12.0f, 8.0f, 12.0f)
                close()
                moveTo(7.3333f, 0.6666f)
                horizontalLineTo(8.6666f)
                verticalLineTo(2.6666f)
                horizontalLineTo(7.3333f)
                verticalLineTo(0.6666f)
                close()
                moveTo(7.3333f, 13.3333f)
                horizontalLineTo(8.6666f)
                verticalLineTo(15.3333f)
                horizontalLineTo(7.3333f)
                verticalLineTo(13.3333f)
                close()
                moveTo(2.3433f, 3.286f)
                lineTo(3.286f, 2.3433f)
                lineTo(4.7f, 3.7573f)
                lineTo(3.7573f, 4.7f)
                lineTo(2.3433f, 3.2866f)
                verticalLineTo(3.286f)
                close()
                moveTo(11.3f, 12.2426f)
                lineTo(12.2426f, 11.3f)
                lineTo(13.6566f, 12.714f)
                lineTo(12.714f, 13.6566f)
                lineTo(11.3f, 12.2426f)
                close()
                moveTo(12.714f, 2.3426f)
                lineTo(13.6566f, 3.286f)
                lineTo(12.2426f, 4.7f)
                lineTo(11.3f, 3.7573f)
                lineTo(12.714f, 2.3433f)
                verticalLineTo(2.3426f)
                close()
                moveTo(3.7573f, 11.3f)
                lineTo(4.7f, 12.2426f)
                lineTo(3.286f, 13.6566f)
                lineTo(2.3433f, 12.714f)
                lineTo(3.7573f, 11.3f)
                close()
                moveTo(15.3333f, 7.3333f)
                verticalLineTo(8.6666f)
                horizontalLineTo(13.3333f)
                verticalLineTo(7.3333f)
                horizontalLineTo(15.3333f)
                close()
                moveTo(2.6666f, 7.3333f)
                verticalLineTo(8.6666f)
                horizontalLineTo(0.6666f)
                verticalLineTo(7.3333f)
                horizontalLineTo(2.6666f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
