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

public val FillGroup.SunCloudy: ImageVector
    get() {
        if (_sunCloudy != null) {
            return _sunCloudy!!
        }
        _sunCloudy = Builder(name = "SunCloudy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.656f, 3.3734f)
                curveTo(6.9264f, 2.8583f, 7.2978f, 2.403f, 7.748f, 2.0345f)
                curveTo(8.1981f, 1.6661f, 8.7179f, 1.3921f, 9.2762f, 1.2288f)
                curveTo(9.8346f, 1.0655f, 10.4201f, 1.0163f, 10.9979f, 1.0841f)
                curveTo(11.5756f, 1.152f, 12.1338f, 1.3355f, 12.6392f, 1.6236f)
                curveTo(13.1445f, 1.9118f, 13.5867f, 2.2988f, 13.9393f, 2.7615f)
                curveTo(14.2918f, 3.2242f, 14.5477f, 3.7532f, 14.6914f, 4.3169f)
                curveTo(14.8352f, 4.8805f, 14.864f, 5.4674f, 14.7762f, 6.0425f)
                curveTo(14.6883f, 6.6175f, 14.4855f, 7.169f, 14.1799f, 7.6641f)
                curveTo(14.7147f, 8.1676f, 15.0859f, 8.8202f, 15.2453f, 9.5372f)
                curveTo(15.4048f, 10.2542f, 15.3453f, 11.0026f, 15.0745f, 11.6854f)
                curveTo(14.8036f, 12.3682f, 14.334f, 12.9538f, 13.7263f, 13.3666f)
                curveTo(13.1187f, 13.7793f, 12.4011f, 14.0f, 11.6666f, 14.0001f)
                lineTo(5.9999f, 13.9994f)
                curveTo(5.2722f, 13.9988f, 4.5523f, 13.8494f, 3.8845f, 13.5602f)
                curveTo(3.2167f, 13.271f, 2.6152f, 12.8482f, 2.1169f, 12.3178f)
                curveTo(1.6186f, 11.7874f, 1.2342f, 11.1607f, 0.9872f, 10.4761f)
                curveTo(0.7402f, 9.7916f, 0.636f, 9.0638f, 0.6808f, 8.3374f)
                curveTo(0.7256f, 7.6111f, 0.9186f, 6.9016f, 1.2479f, 6.2527f)
                curveTo(1.5772f, 5.6037f, 2.0359f, 5.029f, 2.5956f, 4.564f)
                curveTo(3.1553f, 4.0989f, 3.8043f, 3.7533f, 4.5026f, 3.5484f)
                curveTo(5.2009f, 3.3435f, 5.9337f, 3.2838f, 6.656f, 3.3727f)
                verticalLineTo(3.3734f)
                close()
                moveTo(8.0366f, 3.736f)
                curveTo(8.7025f, 4.0121f, 9.3058f, 4.4198f, 9.8102f, 4.9347f)
                curveTo(10.3146f, 5.4497f, 10.7098f, 6.0613f, 10.9719f, 6.7327f)
                curveTo(11.6705f, 6.5988f, 12.3929f, 6.6699f, 13.0519f, 6.9374f)
                curveTo(13.361f, 6.2779f, 13.4196f, 5.5285f, 13.2167f, 4.829f)
                curveTo(13.0139f, 4.1295f, 12.5636f, 3.5277f, 11.9497f, 3.1358f)
                curveTo(11.3358f, 2.7438f, 10.6003f, 2.5887f, 9.8804f, 2.6991f)
                curveTo(9.1606f, 2.8096f, 8.5054f, 3.1781f, 8.0373f, 3.736f)
                horizontalLineTo(8.0366f)
                close()
            }
        }
        .build()
        return _sunCloudy!!
    }

private var _sunCloudy: ImageVector? = null
