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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.366f, 10.682f)
                curveTo(10.3043f, 12.3305f, 11.6695f, 13.6957f, 13.318f, 14.634f)
                lineTo(14.202f, 13.396f)
                curveTo(14.3442f, 13.1969f, 14.5543f, 13.0569f, 14.7928f, 13.0023f)
                curveTo(15.0313f, 12.9478f, 15.2814f, 12.9825f, 15.496f, 13.1f)
                curveTo(16.9103f, 13.8729f, 18.4722f, 14.3378f, 20.079f, 14.464f)
                curveTo(20.3298f, 14.4839f, 20.5638f, 14.5975f, 20.7345f, 14.7823f)
                curveTo(20.9052f, 14.9671f, 21.0f, 15.2094f, 21.0f, 15.461f)
                verticalLineTo(19.923f)
                curveTo(21.0001f, 20.1706f, 20.9083f, 20.4094f, 20.7424f, 20.5932f)
                curveTo(20.5765f, 20.777f, 20.3483f, 20.8927f, 20.102f, 20.918f)
                curveTo(19.5698f, 20.9729f, 19.0351f, 21.0003f, 18.5f, 21.0f)
                curveTo(9.94f, 21.0f, 3.0f, 14.06f, 3.0f, 5.5f)
                curveTo(3.0f, 4.962f, 3.027f, 4.428f, 3.082f, 3.898f)
                curveTo(3.1072f, 3.6517f, 3.223f, 3.4235f, 3.4068f, 3.2576f)
                curveTo(3.5906f, 3.0917f, 3.8294f, 2.9999f, 4.077f, 3.0f)
                horizontalLineTo(8.539f)
                curveTo(8.7906f, 3.0f, 9.0329f, 3.0947f, 9.2177f, 3.2655f)
                curveTo(9.4025f, 3.4362f, 9.5161f, 3.6702f, 9.536f, 3.921f)
                curveTo(9.6622f, 5.5278f, 10.1271f, 7.0897f, 10.9f, 8.504f)
                curveTo(11.0175f, 8.7186f, 11.0522f, 8.9687f, 10.9977f, 9.2072f)
                curveTo(10.9431f, 9.4457f, 10.8031f, 9.6558f, 10.604f, 9.798f)
                lineTo(9.366f, 10.682f)
                close()
                moveTo(6.844f, 10.025f)
                lineTo(8.744f, 8.668f)
                curveTo(8.2048f, 7.5041f, 7.8354f, 6.2688f, 7.647f, 5.0f)
                horizontalLineTo(5.01f)
                curveTo(5.004f, 5.166f, 5.001f, 5.333f, 5.001f, 5.5f)
                curveTo(5.0f, 12.956f, 11.044f, 19.0f, 18.5f, 19.0f)
                curveTo(18.667f, 19.0f, 18.834f, 18.997f, 19.0f, 18.99f)
                verticalLineTo(16.353f)
                curveTo(17.7312f, 16.1646f, 16.4959f, 15.7952f, 15.332f, 15.256f)
                lineTo(13.975f, 17.156f)
                curveTo(13.4287f, 16.9437f, 12.898f, 16.6931f, 12.387f, 16.406f)
                lineTo(12.329f, 16.373f)
                curveTo(10.3676f, 15.2567f, 8.7433f, 13.6324f, 7.627f, 11.671f)
                lineTo(7.594f, 11.613f)
                curveTo(7.3069f, 11.102f, 7.0563f, 10.5713f, 6.844f, 10.025f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
