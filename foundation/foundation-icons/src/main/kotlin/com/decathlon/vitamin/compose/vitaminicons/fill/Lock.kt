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

public val FillGroup.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.9967f)
                horizontalLineTo(13.3333f)
                curveTo(13.5101f, 5.9967f, 13.6797f, 6.0669f, 13.8047f, 6.1919f)
                curveTo(13.9298f, 6.317f, 14.0f, 6.4865f, 14.0f, 6.6634f)
                verticalLineTo(14.6634f)
                curveTo(14.0f, 14.8402f, 13.9298f, 15.0097f, 13.8047f, 15.1348f)
                curveTo(13.6797f, 15.2598f, 13.5101f, 15.33f, 13.3333f, 15.33f)
                horizontalLineTo(2.6667f)
                curveTo(2.4899f, 15.33f, 2.3203f, 15.2598f, 2.1953f, 15.1348f)
                curveTo(2.0702f, 15.0097f, 2.0f, 14.8402f, 2.0f, 14.6634f)
                verticalLineTo(6.6634f)
                curveTo(2.0f, 6.4865f, 2.0702f, 6.317f, 2.1953f, 6.1919f)
                curveTo(2.3203f, 6.0669f, 2.4899f, 5.9967f, 2.6667f, 5.9967f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.33f)
                curveTo(4.0f, 4.2691f, 4.4214f, 3.2517f, 5.1716f, 2.5016f)
                curveTo(5.9217f, 1.7514f, 6.9391f, 1.33f, 8.0f, 1.33f)
                curveTo(9.0609f, 1.33f, 10.0783f, 1.7514f, 10.8284f, 2.5016f)
                curveTo(11.5786f, 3.2517f, 12.0f, 4.2691f, 12.0f, 5.33f)
                verticalLineTo(5.9967f)
                close()
                moveTo(7.3333f, 11.1514f)
                verticalLineTo(12.6634f)
                horizontalLineTo(8.6667f)
                verticalLineTo(11.1514f)
                curveTo(8.9209f, 11.0046f, 9.1195f, 10.7781f, 9.2318f, 10.5069f)
                curveTo(9.3442f, 10.2357f, 9.3639f, 9.9351f, 9.2879f, 9.6516f)
                curveTo(9.2119f, 9.368f, 9.0445f, 9.1175f, 8.8117f, 8.9389f)
                curveTo(8.5788f, 8.7602f, 8.2935f, 8.6633f, 8.0f, 8.6633f)
                curveTo(7.7065f, 8.6633f, 7.4212f, 8.7602f, 7.1883f, 8.9389f)
                curveTo(6.9555f, 9.1175f, 6.7881f, 9.368f, 6.7121f, 9.6516f)
                curveTo(6.6361f, 9.9351f, 6.6558f, 10.2357f, 6.7682f, 10.5069f)
                curveTo(6.8805f, 10.7781f, 7.0791f, 11.0046f, 7.3333f, 11.1514f)
                close()
                moveTo(10.6667f, 5.9967f)
                verticalLineTo(5.33f)
                curveTo(10.6667f, 4.6228f, 10.3857f, 3.9445f, 9.8856f, 3.4444f)
                curveTo(9.3855f, 2.9443f, 8.7072f, 2.6634f, 8.0f, 2.6634f)
                curveTo(7.2928f, 2.6634f, 6.6145f, 2.9443f, 6.1144f, 3.4444f)
                curveTo(5.6143f, 3.9445f, 5.3333f, 4.6228f, 5.3333f, 5.33f)
                verticalLineTo(5.9967f)
                horizontalLineTo(10.6667f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
