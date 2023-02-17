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

public val LineGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 20.9f)
                lineTo(16.95f, 15.95f)
                curveTo(17.9289f, 14.971f, 18.5955f, 13.7237f, 18.8656f, 12.3659f)
                curveTo(19.1356f, 11.008f, 18.9969f, 9.6006f, 18.4671f, 8.3215f)
                curveTo(17.9373f, 7.0425f, 17.04f, 5.9493f, 15.8889f, 5.1802f)
                curveTo(14.7378f, 4.411f, 13.3844f, 4.0005f, 12.0f, 4.0005f)
                curveTo(10.6156f, 4.0005f, 9.2622f, 4.411f, 8.1111f, 5.1802f)
                curveTo(6.96f, 5.9493f, 6.0627f, 7.0425f, 5.5329f, 8.3215f)
                curveTo(5.0031f, 9.6006f, 4.8644f, 11.008f, 5.1344f, 12.3659f)
                curveTo(5.4045f, 13.7237f, 6.0711f, 14.971f, 7.05f, 15.95f)
                lineTo(12.0f, 20.9f)
                close()
                moveTo(12.0f, 23.728f)
                lineTo(5.636f, 17.364f)
                curveTo(4.3773f, 16.1053f, 3.5202f, 14.5017f, 3.1729f, 12.7558f)
                curveTo(2.8257f, 11.01f, 3.0039f, 9.2004f, 3.6851f, 7.5559f)
                curveTo(4.3663f, 5.9114f, 5.5198f, 4.5058f, 6.9999f, 3.5168f)
                curveTo(8.4799f, 2.5279f, 10.22f, 2.0001f, 12.0f, 2.0001f)
                curveTo(13.78f, 2.0001f, 15.5201f, 2.5279f, 17.0001f, 3.5168f)
                curveTo(18.4802f, 4.5058f, 19.6337f, 5.9114f, 20.3149f, 7.5559f)
                curveTo(20.9961f, 9.2004f, 21.1743f, 11.01f, 20.8271f, 12.7558f)
                curveTo(20.4798f, 14.5017f, 19.6227f, 16.1053f, 18.364f, 17.364f)
                lineTo(12.0f, 23.728f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.5304f, 13.0f, 13.0391f, 12.7893f, 13.4142f, 12.4142f)
                curveTo(13.7893f, 12.0391f, 14.0f, 11.5304f, 14.0f, 11.0f)
                curveTo(14.0f, 10.4696f, 13.7893f, 9.9608f, 13.4142f, 9.5858f)
                curveTo(13.0391f, 9.2107f, 12.5304f, 9.0f, 12.0f, 9.0f)
                curveTo(11.4696f, 9.0f, 10.9609f, 9.2107f, 10.5858f, 9.5858f)
                curveTo(10.2107f, 9.9608f, 10.0f, 10.4696f, 10.0f, 11.0f)
                curveTo(10.0f, 11.5304f, 10.2107f, 12.0391f, 10.5858f, 12.4142f)
                curveTo(10.9609f, 12.7893f, 11.4696f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(10.9391f, 15.0f, 9.9217f, 14.5786f, 9.1716f, 13.8284f)
                curveTo(8.4214f, 13.0783f, 8.0f, 12.0608f, 8.0f, 11.0f)
                curveTo(8.0f, 9.9391f, 8.4214f, 8.9217f, 9.1716f, 8.1716f)
                curveTo(9.9217f, 7.4214f, 10.9391f, 7.0f, 12.0f, 7.0f)
                curveTo(13.0609f, 7.0f, 14.0783f, 7.4214f, 14.8284f, 8.1716f)
                curveTo(15.5786f, 8.9217f, 16.0f, 9.9391f, 16.0f, 11.0f)
                curveTo(16.0f, 12.0608f, 15.5786f, 13.0783f, 14.8284f, 13.8284f)
                curveTo(14.0783f, 14.5786f, 13.0609f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
