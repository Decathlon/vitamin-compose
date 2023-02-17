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

public val FillGroup.Snowy: ImageVector
    get() {
        if (_snowy != null) {
            return _snowy!!
        }
        _snowy = Builder(name = "Snowy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0271f, 17.43f)
                curveTo(4.3024f, 16.7377f, 2.8725f, 15.4669f, 1.9826f, 13.8354f)
                curveTo(1.0926f, 12.204f, 0.7982f, 10.3137f, 1.1498f, 8.4888f)
                curveTo(1.5014f, 6.664f, 2.4771f, 5.0185f, 3.9095f, 3.8345f)
                curveTo(5.3419f, 2.6505f, 7.1417f, 2.0019f, 9.0f, 2.0f)
                curveTo(10.6121f, 1.9999f, 12.1866f, 2.4866f, 13.5174f, 3.3965f)
                curveTo(14.8481f, 4.3063f, 15.8731f, 5.5968f, 16.4581f, 7.099f)
                curveTo(17.8656f, 6.9669f, 19.27f, 7.3819f, 20.3797f, 8.2578f)
                curveTo(21.4894f, 9.1337f, 22.2192f, 10.4033f, 22.4176f, 11.8031f)
                curveTo(22.616f, 13.2028f, 22.2678f, 14.6252f, 21.4452f, 15.775f)
                curveTo(20.6226f, 16.9248f, 19.3889f, 17.7137f, 18.0001f, 17.978f)
                curveTo(17.9951f, 16.4376f, 17.3979f, 14.9581f, 16.3321f, 13.846f)
                curveTo(15.2664f, 12.7338f, 13.8137f, 12.0741f, 12.2749f, 12.0035f)
                curveTo(10.7361f, 11.933f, 9.2292f, 12.457f, 8.0661f, 13.4669f)
                curveTo(6.903f, 14.4769f, 6.1729f, 15.8955f, 6.0271f, 17.429f)
                verticalLineTo(17.43f)
                close()
                moveTo(13.0001f, 16.267f)
                lineTo(14.9641f, 15.133f)
                lineTo(15.9641f, 16.865f)
                lineTo(14.0001f, 18.0f)
                lineTo(15.9641f, 19.134f)
                lineTo(14.9641f, 20.866f)
                lineTo(13.0001f, 19.732f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0001f)
                verticalLineTo(19.732f)
                lineTo(9.036f, 20.866f)
                lineTo(8.036f, 19.134f)
                lineTo(10.0001f, 18.0f)
                lineTo(8.036f, 16.866f)
                lineTo(9.036f, 15.134f)
                lineTo(11.0001f, 16.268f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(16.268f)
                verticalLineTo(16.267f)
                close()
            }
        }
        .build()
        return _snowy!!
    }

private var _snowy: ImageVector? = null
