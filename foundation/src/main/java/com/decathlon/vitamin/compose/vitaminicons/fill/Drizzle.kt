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

public val FillGroup.Drizzle: ImageVector
    get() {
        if (_drizzle != null) {
            return _drizzle!!
        }
        _drizzle = Builder(name = "Drizzle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9999f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.9999f)
                verticalLineTo(18.0f)
                curveTo(7.544f, 17.9995f, 6.1158f, 17.6018f, 4.8692f, 16.8496f)
                curveTo(3.6226f, 16.0973f, 2.605f, 15.0192f, 1.9259f, 13.7313f)
                curveTo(1.2468f, 12.4434f, 0.9321f, 10.9947f, 1.0156f, 9.5411f)
                curveTo(1.0991f, 8.0876f, 1.5777f, 6.6844f, 2.3998f, 5.4828f)
                curveTo(3.2219f, 4.2811f, 4.3564f, 3.3266f, 5.6809f, 2.7222f)
                curveTo(7.0054f, 2.1177f, 8.4698f, 1.8861f, 9.9162f, 2.0524f)
                curveTo(11.3626f, 2.2187f, 12.7362f, 2.7765f, 13.889f, 3.6658f)
                curveTo(15.0417f, 4.5551f, 15.93f, 5.7422f, 16.4579f, 7.099f)
                curveTo(17.2103f, 6.9543f, 17.9845f, 6.9684f, 18.7311f, 7.1403f)
                curveTo(19.4777f, 7.3123f, 20.1802f, 7.6383f, 20.7934f, 8.0975f)
                curveTo(21.4067f, 8.5567f, 21.9172f, 9.139f, 22.2923f, 9.807f)
                curveTo(22.6675f, 10.475f, 22.8989f, 11.214f, 22.9718f, 11.9767f)
                curveTo(23.0447f, 12.7393f, 22.9575f, 13.5088f, 22.7157f, 14.2358f)
                curveTo(22.4739f, 14.9627f, 22.0829f, 15.6312f, 21.5677f, 16.1983f)
                curveTo(21.0526f, 16.7653f, 20.4246f, 17.2185f, 19.7241f, 17.5288f)
                curveTo(19.0236f, 17.8391f, 18.2661f, 17.9996f, 17.4999f, 18.0f)
                horizontalLineTo(10.9999f)
                close()
                moveTo(12.9999f, 20.0f)
                horizontalLineTo(14.9999f)
                verticalLineTo(23.0f)
                horizontalLineTo(12.9999f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _drizzle!!
    }

private var _drizzle: ImageVector? = null
