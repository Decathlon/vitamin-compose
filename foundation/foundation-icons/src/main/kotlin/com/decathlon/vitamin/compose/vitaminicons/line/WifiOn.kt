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

public val LineGroup.WifiOn: ImageVector
    get() {
        if (_wifiOn != null) {
            return _wifiOn!!
        }
        _wifiOn = Builder(name = "WifiOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.6899f, 6.997f)
                curveTo(3.889f, 4.4053f, 7.8828f, 2.9939f, 11.9999f, 3.0f)
                curveTo(16.2849f, 3.0f, 20.2199f, 4.497f, 23.3099f, 6.997f)
                lineTo(22.0539f, 8.553f)
                curveTo(19.2102f, 6.2491f, 15.6599f, 4.9944f, 11.9999f, 5.0f)
                curveTo(8.1909f, 5.0f, 4.6939f, 6.33f, 1.9459f, 8.553f)
                lineTo(0.6899f, 6.997f)
                close()
                moveTo(3.8309f, 10.887f)
                curveTo(6.1415f, 9.015f, 9.0262f, 7.9955f, 11.9999f, 8.0f)
                curveTo(15.0939f, 8.0f, 17.9359f, 9.081f, 20.1689f, 10.886f)
                lineTo(18.9119f, 12.442f)
                curveTo(16.9568f, 10.8583f, 14.516f, 9.996f, 11.9999f, 10.0f)
                curveTo(9.3819f, 10.0f, 6.9769f, 10.915f, 5.0879f, 12.442f)
                lineTo(3.8309f, 10.886f)
                verticalLineTo(10.887f)
                close()
                moveTo(6.9729f, 14.777f)
                curveTo(8.3948f, 13.6249f, 10.1699f, 12.9974f, 11.9999f, 13.0f)
                curveTo(13.9039f, 13.0f, 15.6529f, 13.665f, 17.0269f, 14.776f)
                lineTo(15.7699f, 16.332f)
                curveTo(14.7035f, 15.4682f, 13.3723f, 14.9979f, 11.9999f, 15.0f)
                curveTo(10.5719f, 15.0f, 9.2599f, 15.499f, 8.2299f, 16.332f)
                lineTo(6.9729f, 14.776f)
                verticalLineTo(14.777f)
                close()
                moveTo(10.1149f, 18.667f)
                curveTo(10.648f, 18.2347f, 11.3136f, 17.9992f, 11.9999f, 18.0f)
                curveTo(12.7139f, 18.0f, 13.3699f, 18.25f, 13.8849f, 18.666f)
                lineTo(11.9999f, 21.0f)
                lineTo(10.1149f, 18.667f)
                close()
            }
        }
        .build()
        return _wifiOn!!
    }

private var _wifiOn: ImageVector? = null
