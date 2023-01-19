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

public val LineGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.244f, 7.1213f)
                curveTo(6.8696f, 8.2203f, 7.7797f, 9.1304f, 8.8787f, 9.756f)
                lineTo(9.468f, 8.9307f)
                curveTo(9.5628f, 8.798f, 9.7029f, 8.7046f, 9.8619f, 8.6682f)
                curveTo(10.0208f, 8.6319f, 10.1876f, 8.655f, 10.3307f, 8.7333f)
                curveTo(11.2735f, 9.2486f, 12.3148f, 9.5585f, 13.386f, 9.6427f)
                curveTo(13.5532f, 9.6559f, 13.7092f, 9.7317f, 13.823f, 9.8549f)
                curveTo(13.9368f, 9.9781f, 14.0f, 10.1396f, 14.0f, 10.3073f)
                verticalLineTo(13.282f)
                curveTo(14.0f, 13.4471f, 13.9388f, 13.6063f, 13.8282f, 13.7288f)
                curveTo(13.7177f, 13.8513f, 13.5655f, 13.9285f, 13.4013f, 13.9453f)
                curveTo(13.0465f, 13.982f, 12.69f, 14.0002f, 12.3333f, 14.0f)
                curveTo(6.6267f, 14.0f, 2.0f, 9.3733f, 2.0f, 3.6667f)
                curveTo(2.0f, 3.308f, 2.018f, 2.952f, 2.0547f, 2.5987f)
                curveTo(2.0715f, 2.4345f, 2.1487f, 2.2824f, 2.2712f, 2.1718f)
                curveTo(2.3937f, 2.0612f, 2.5529f, 2.0f, 2.718f, 2.0f)
                horizontalLineTo(5.6927f)
                curveTo(5.8604f, 2.0f, 6.0219f, 2.0632f, 6.1451f, 2.177f)
                curveTo(6.2683f, 2.2908f, 6.3441f, 2.4468f, 6.3573f, 2.614f)
                curveTo(6.4415f, 3.6852f, 6.7514f, 4.7264f, 7.2667f, 5.6693f)
                curveTo(7.345f, 5.8124f, 7.3681f, 5.9792f, 7.3318f, 6.1381f)
                curveTo(7.2954f, 6.2971f, 7.202f, 6.4372f, 7.0693f, 6.532f)
                lineTo(6.244f, 7.1213f)
                close()
                moveTo(4.5627f, 6.6833f)
                lineTo(5.8293f, 5.7787f)
                curveTo(5.4699f, 5.0027f, 5.2236f, 4.1792f, 5.098f, 3.3333f)
                horizontalLineTo(3.34f)
                curveTo(3.336f, 3.444f, 3.334f, 3.5553f, 3.334f, 3.6667f)
                curveTo(3.3333f, 8.6373f, 7.3627f, 12.6667f, 12.3333f, 12.6667f)
                curveTo(12.4447f, 12.6667f, 12.556f, 12.6647f, 12.6667f, 12.66f)
                verticalLineTo(10.902f)
                curveTo(11.8208f, 10.7764f, 10.9973f, 10.5301f, 10.2213f, 10.1707f)
                lineTo(9.3167f, 11.4373f)
                curveTo(8.9524f, 11.2958f, 8.5987f, 11.1287f, 8.258f, 10.9373f)
                lineTo(8.2193f, 10.9153f)
                curveTo(6.9117f, 10.1711f, 5.8288f, 9.0883f, 5.0847f, 7.7807f)
                lineTo(5.0627f, 7.742f)
                curveTo(4.8713f, 7.4013f, 4.7042f, 7.0476f, 4.5627f, 6.6833f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
