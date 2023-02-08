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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.2652f, 9.0f, 20.5196f, 9.1054f, 20.7071f, 9.2929f)
                curveTo(20.8946f, 9.4804f, 21.0f, 9.7348f, 21.0f, 10.0f)
                verticalLineTo(22.0f)
                curveTo(21.0f, 22.2652f, 20.8946f, 22.5196f, 20.7071f, 22.7071f)
                curveTo(20.5196f, 22.8946f, 20.2652f, 23.0f, 20.0f, 23.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7348f, 23.0f, 3.4804f, 22.8946f, 3.2929f, 22.7071f)
                curveTo(3.1054f, 22.5196f, 3.0f, 22.2652f, 3.0f, 22.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 9.7348f, 3.1054f, 9.4804f, 3.2929f, 9.2929f)
                curveTo(3.4804f, 9.1054f, 3.7348f, 9.0f, 4.0f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                curveTo(6.0f, 6.4087f, 6.6321f, 4.8826f, 7.7574f, 3.7574f)
                curveTo(8.8826f, 2.6321f, 10.4087f, 2.0f, 12.0f, 2.0f)
                curveTo(13.5913f, 2.0f, 15.1174f, 2.6321f, 16.2426f, 3.7574f)
                curveTo(17.3679f, 4.8826f, 18.0f, 6.4087f, 18.0f, 8.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(11.0f, 16.732f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.732f)
                curveTo(13.3813f, 16.5119f, 13.6793f, 16.1721f, 13.8478f, 15.7653f)
                curveTo(14.0162f, 15.3586f, 14.0458f, 14.9076f, 13.9319f, 14.4823f)
                curveTo(13.8179f, 14.057f, 13.5668f, 13.6813f, 13.2175f, 13.4132f)
                curveTo(12.8682f, 13.1452f, 12.4403f, 12.9999f, 12.0f, 12.9999f)
                curveTo(11.5597f, 12.9999f, 11.1318f, 13.1452f, 10.7825f, 13.4132f)
                curveTo(10.4332f, 13.6813f, 10.1821f, 14.057f, 10.0681f, 14.4823f)
                curveTo(9.9542f, 14.9076f, 9.9838f, 15.3586f, 10.1522f, 15.7653f)
                curveTo(10.3207f, 16.1721f, 10.6187f, 16.5119f, 11.0f, 16.732f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 6.9391f, 15.5786f, 5.9217f, 14.8284f, 5.1716f)
                curveTo(14.0783f, 4.4214f, 13.0609f, 4.0f, 12.0f, 4.0f)
                curveTo(10.9391f, 4.0f, 9.9217f, 4.4214f, 9.1716f, 5.1716f)
                curveTo(8.4214f, 5.9217f, 8.0f, 6.9391f, 8.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
