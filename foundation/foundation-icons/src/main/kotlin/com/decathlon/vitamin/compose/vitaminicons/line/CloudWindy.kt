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

public val LineGroup.CloudWindy: ImageVector
    get() {
        if (_cloudWindy != null) {
            return _cloudWindy!!
        }
        _cloudWindy = Builder(name = "CloudWindy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.5f)
                curveTo(18.077f, 16.0f, 18.6451f, 15.8572f, 19.1536f, 15.5845f)
                curveTo(19.6622f, 15.3118f, 20.0954f, 14.9176f, 20.4147f, 14.4369f)
                curveTo(20.734f, 13.9563f, 20.9296f, 13.4042f, 20.9839f, 12.8297f)
                curveTo(21.0383f, 12.2552f, 20.9498f, 11.6762f, 20.7262f, 11.1443f)
                curveTo(20.5027f, 10.6123f, 20.1511f, 10.1438f, 19.7028f, 9.7806f)
                curveTo(19.2544f, 9.4173f, 18.7232f, 9.1705f, 18.1564f, 9.0622f)
                curveTo(17.5896f, 8.9539f, 17.0049f, 8.9874f, 16.4542f, 9.1598f)
                curveTo(15.9035f, 9.3321f, 15.4039f, 9.6379f, 15.0f, 10.05f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 8.4087f, 14.3679f, 6.8826f, 13.2426f, 5.7574f)
                curveTo(12.1174f, 4.6322f, 10.5913f, 4.0f, 9.0f, 4.0f)
                curveTo(7.4087f, 4.0f, 5.8826f, 4.6322f, 4.7574f, 5.7574f)
                curveTo(3.6321f, 6.8826f, 3.0f, 8.4087f, 3.0f, 10.0f)
                verticalLineTo(10.007f)
                horizontalLineTo(1.0f)
                verticalLineTo(10.0f)
                curveTo(0.9985f, 8.1332f, 1.6499f, 6.3246f, 2.8414f, 4.8875f)
                curveTo(4.033f, 3.4503f, 5.6896f, 2.4752f, 7.5244f, 2.1308f)
                curveTo(9.3592f, 1.7865f, 11.2567f, 2.0947f, 12.8882f, 3.002f)
                curveTo(14.5197f, 3.9093f, 15.7826f, 5.3587f, 16.458f, 7.099f)
                curveTo(17.2103f, 6.9543f, 17.9846f, 6.9684f, 18.7312f, 7.1403f)
                curveTo(19.4778f, 7.3123f, 20.1802f, 7.6383f, 20.7935f, 8.0975f)
                curveTo(21.4067f, 8.5567f, 21.9173f, 9.139f, 22.2924f, 9.807f)
                curveTo(22.6676f, 10.475f, 22.899f, 11.214f, 22.9719f, 11.9767f)
                curveTo(23.0448f, 12.7393f, 22.9575f, 13.5088f, 22.7158f, 14.2358f)
                curveTo(22.474f, 14.9628f, 22.083f, 15.6312f, 21.5678f, 16.1983f)
                curveTo(21.0527f, 16.7654f, 20.4247f, 17.2186f, 19.7242f, 17.5288f)
                curveTo(19.0237f, 17.8391f, 18.2661f, 17.9996f, 17.5f, 18.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _cloudWindy!!
    }

private var _cloudWindy: ImageVector? = null
