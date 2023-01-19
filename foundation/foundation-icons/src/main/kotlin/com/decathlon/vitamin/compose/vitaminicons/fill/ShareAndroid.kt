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

public val FillGroup.ShareAndroid: ImageVector
    get() {
        if (_shareAndroid != null) {
            return _shareAndroid!!
        }
        _shareAndroid = Builder(name = "ShareAndroid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0508f, 11.514f)
                lineTo(5.6441f, 9.656f)
                curveTo(5.3171f, 9.9806f, 4.9013f, 10.2011f, 4.4492f, 10.2897f)
                curveTo(3.997f, 10.3784f, 3.5288f, 10.3312f, 3.1034f, 10.1541f)
                curveTo(2.6781f, 9.9769f, 2.3147f, 9.6779f, 2.059f, 9.2945f)
                curveTo(1.8034f, 8.9112f, 1.667f, 8.4607f, 1.667f, 8.0f)
                curveTo(1.667f, 7.5392f, 1.8034f, 7.0888f, 2.059f, 6.7055f)
                curveTo(2.3147f, 6.3221f, 2.6781f, 6.023f, 3.1034f, 5.8459f)
                curveTo(3.5288f, 5.6688f, 3.997f, 5.6216f, 4.4492f, 5.7102f)
                curveTo(4.9013f, 5.7989f, 5.3171f, 6.0194f, 5.6441f, 6.344f)
                lineTo(9.0508f, 4.486f)
                curveTo(8.934f, 3.9378f, 9.0183f, 3.3659f, 9.2885f, 2.8748f)
                curveTo(9.5587f, 2.3838f, 9.9966f, 2.0064f, 10.5222f, 1.8116f)
                curveTo(11.0478f, 1.6169f, 11.6259f, 1.6178f, 12.1508f, 1.8143f)
                curveTo(12.6757f, 2.0108f, 13.1124f, 2.3897f, 13.3809f, 2.8816f)
                curveTo(13.6495f, 3.3736f, 13.732f, 3.9458f, 13.6133f, 4.4936f)
                curveTo(13.4947f, 5.0413f, 13.1828f, 5.5281f, 12.7347f, 5.8649f)
                curveTo(12.2867f, 6.2016f, 11.7324f, 6.3658f, 11.1732f, 6.3275f)
                curveTo(10.614f, 6.2891f, 10.0874f, 6.0508f, 9.6895f, 5.656f)
                lineTo(6.2828f, 7.514f)
                curveTo(6.3508f, 7.8344f, 6.3508f, 8.1656f, 6.2828f, 8.486f)
                lineTo(9.6895f, 10.344f)
                curveTo(10.0874f, 9.9492f, 10.614f, 9.7109f, 11.1732f, 9.6725f)
                curveTo(11.7324f, 9.6342f, 12.2867f, 9.7984f, 12.7347f, 10.1351f)
                curveTo(13.1828f, 10.4719f, 13.4947f, 10.9586f, 13.6133f, 11.5064f)
                curveTo(13.732f, 12.0542f, 13.6495f, 12.6264f, 13.3809f, 13.1184f)
                curveTo(13.1124f, 13.6103f, 12.6757f, 13.9892f, 12.1508f, 14.1857f)
                curveTo(11.6259f, 14.3821f, 11.0478f, 14.3831f, 10.5222f, 14.1884f)
                curveTo(9.9966f, 13.9936f, 9.5587f, 13.6162f, 9.2885f, 13.1252f)
                curveTo(9.0183f, 12.6341f, 8.934f, 12.0622f, 9.0508f, 11.514f)
                close()
            }
        }
        .build()
        return _shareAndroid!!
    }

private var _shareAndroid: ImageVector? = null
