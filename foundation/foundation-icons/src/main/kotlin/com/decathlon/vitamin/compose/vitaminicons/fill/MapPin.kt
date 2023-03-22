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

public val FillGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 17.364f)
                lineTo(12.0f, 23.728f)
                lineTo(5.636f, 17.364f)
                curveTo(4.3773f, 16.1053f, 3.5202f, 14.5017f, 3.1729f, 12.7558f)
                curveTo(2.8257f, 11.01f, 3.0039f, 9.2004f, 3.6851f, 7.5559f)
                curveTo(4.3663f, 5.9114f, 5.5198f, 4.5058f, 6.9999f, 3.5168f)
                curveTo(8.4799f, 2.5279f, 10.22f, 2.0001f, 12.0f, 2.0001f)
                curveTo(13.78f, 2.0001f, 15.5201f, 2.5279f, 17.0001f, 3.5168f)
                curveTo(18.4802f, 4.5058f, 19.6337f, 5.9114f, 20.3149f, 7.5559f)
                curveTo(20.9961f, 9.2004f, 21.1743f, 11.01f, 20.8271f, 12.7558f)
                curveTo(20.4798f, 14.5017f, 19.6227f, 16.1053f, 18.364f, 17.364f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.0609f, 15.0f, 14.0783f, 14.5786f, 14.8284f, 13.8284f)
                curveTo(15.5786f, 13.0783f, 16.0f, 12.0608f, 16.0f, 11.0f)
                curveTo(16.0f, 9.9391f, 15.5786f, 8.9217f, 14.8284f, 8.1716f)
                curveTo(14.0783f, 7.4214f, 13.0609f, 7.0f, 12.0f, 7.0f)
                curveTo(10.9391f, 7.0f, 9.9217f, 7.4214f, 9.1716f, 8.1716f)
                curveTo(8.4214f, 8.9217f, 8.0f, 9.9391f, 8.0f, 11.0f)
                curveTo(8.0f, 12.0608f, 8.4214f, 13.0783f, 9.1716f, 13.8284f)
                curveTo(9.9217f, 14.5786f, 10.9391f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(11.4696f, 13.0f, 10.9609f, 12.7893f, 10.5858f, 12.4142f)
                curveTo(10.2107f, 12.0391f, 10.0f, 11.5304f, 10.0f, 11.0f)
                curveTo(10.0f, 10.4696f, 10.2107f, 9.9608f, 10.5858f, 9.5858f)
                curveTo(10.9609f, 9.2107f, 11.4696f, 9.0f, 12.0f, 9.0f)
                curveTo(12.5304f, 9.0f, 13.0391f, 9.2107f, 13.4142f, 9.5858f)
                curveTo(13.7893f, 9.9608f, 14.0f, 10.4696f, 14.0f, 11.0f)
                curveTo(14.0f, 11.5304f, 13.7893f, 12.0391f, 13.4142f, 12.4142f)
                curveTo(13.0391f, 12.7893f, 12.5304f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
