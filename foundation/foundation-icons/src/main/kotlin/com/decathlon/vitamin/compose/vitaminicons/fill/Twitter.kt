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

public val FillGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1621f, 5.656f)
                curveTo(21.3986f, 5.9937f, 20.589f, 6.2155f, 19.7601f, 6.314f)
                curveTo(20.6338f, 5.7914f, 21.2878f, 4.969f, 21.6001f, 4.0f)
                curveTo(20.7801f, 4.488f, 19.8811f, 4.83f, 18.9441f, 5.015f)
                curveTo(17.6499f, 3.6303f, 15.5863f, 3.2891f, 13.9153f, 4.1835f)
                curveTo(12.2443f, 5.0778f, 11.3837f, 6.9841f, 11.8181f, 8.829f)
                curveTo(8.4551f, 8.6604f, 5.3218f, 7.072f, 3.1981f, 4.459f)
                curveTo(2.8263f, 5.0975f, 2.631f, 5.8232f, 2.6321f, 6.562f)
                curveTo(2.6321f, 8.012f, 3.37f, 9.293f, 4.4921f, 10.043f)
                curveTo(3.8281f, 10.0221f, 3.1787f, 9.8428f, 2.5981f, 9.52f)
                verticalLineTo(9.572f)
                curveTo(2.5985f, 11.563f, 4.0016f, 13.2781f, 5.9531f, 13.673f)
                curveTo(5.3367f, 13.84f, 4.6904f, 13.8647f, 4.063f, 13.745f)
                curveTo(4.6102f, 15.4492f, 6.1805f, 16.6168f, 7.97f, 16.65f)
                curveTo(6.218f, 18.026f, 3.9908f, 18.6491f, 1.779f, 18.382f)
                curveTo(3.6907f, 19.6114f, 5.9162f, 20.2641f, 8.189f, 20.262f)
                curveTo(15.8821f, 20.262f, 20.0891f, 13.889f, 20.0891f, 8.362f)
                curveTo(20.0891f, 8.182f, 20.0841f, 8.0f, 20.0761f, 7.822f)
                curveTo(20.8949f, 7.2302f, 21.6017f, 6.497f, 22.1631f, 5.657f)
                lineTo(22.1621f, 5.656f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
