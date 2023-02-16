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

public val LineGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5507f, 12.6988f)
                curveTo(5.4929f, 13.1328f, 4.3067f, 13.1328f, 3.249f, 12.6988f)
                curveTo(2.8149f, 11.641f, 2.8149f, 10.4548f, 3.249f, 9.397f)
                lineTo(4.3143f, 10.4624f)
                curveTo(4.2375f, 10.8466f, 4.2365f, 11.2445f, 4.3138f, 11.6339f)
                curveTo(4.7028f, 11.7116f, 5.1011f, 11.7102f, 5.4858f, 11.6339f)
                lineTo(6.5507f, 12.6988f)
                close()
                moveTo(10.1772f, 11.4274f)
                lineTo(10.0508f, 13.4393f)
                lineTo(9.1425f, 14.3477f)
                lineTo(1.6f, 6.8053f)
                lineTo(2.5084f, 5.8969f)
                lineTo(4.5203f, 5.7705f)
                lineTo(7.2568f, 3.034f)
                curveTo(8.8987f, 1.3921f, 11.4764f, 1.1753f, 13.642f, 2.3057f)
                curveTo(14.7724f, 4.4713f, 14.5556f, 7.049f, 12.9137f, 8.6909f)
                lineTo(10.1772f, 11.4274f)
                close()
                moveTo(8.7983f, 12.118f)
                lineTo(8.8785f, 10.8405f)
                lineTo(11.9709f, 7.7481f)
                curveTo(13.0636f, 6.6554f, 13.3191f, 4.9196f, 12.6403f, 3.3074f)
                curveTo(11.0281f, 2.6286f, 9.2928f, 2.8836f, 8.1996f, 3.9768f)
                lineTo(5.1072f, 7.0692f)
                lineTo(3.8297f, 7.1494f)
                lineTo(8.7983f, 12.118f)
                close()
                moveTo(9.1425f, 6.8053f)
                curveTo(8.8924f, 6.5552f, 8.7519f, 6.2161f, 8.7519f, 5.8624f)
                curveTo(8.7519f, 5.5088f, 8.8924f, 5.1697f, 9.1425f, 4.9196f)
                curveTo(9.3925f, 4.6696f, 9.7316f, 4.5291f, 10.0853f, 4.5291f)
                curveTo(10.4389f, 4.5291f, 10.778f, 4.6696f, 11.0281f, 4.9196f)
                curveTo(11.2781f, 5.1697f, 11.4186f, 5.5088f, 11.4186f, 5.8624f)
                curveTo(11.4186f, 6.2161f, 11.2781f, 6.5552f, 11.0281f, 6.8053f)
                curveTo(10.778f, 7.0553f, 10.4389f, 7.1958f, 10.0853f, 7.1958f)
                curveTo(9.7316f, 7.1958f, 9.3925f, 7.0553f, 9.1425f, 6.8053f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
