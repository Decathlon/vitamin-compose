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

public val FillGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2488f, 9.397f)
                lineTo(6.5505f, 12.6988f)
                curveTo(5.4928f, 13.1328f, 4.3066f, 13.1328f, 3.2488f, 12.6988f)
                curveTo(2.8148f, 11.641f, 2.8148f, 10.4548f, 3.2488f, 9.397f)
                close()
                moveTo(10.1771f, 11.4274f)
                lineTo(10.0507f, 13.4393f)
                lineTo(9.1423f, 14.3477f)
                lineTo(1.5999f, 6.8053f)
                lineTo(2.5082f, 5.8969f)
                lineTo(4.5202f, 5.7705f)
                lineTo(7.2567f, 3.034f)
                curveTo(8.8986f, 1.3921f, 11.4762f, 1.1753f, 13.6419f, 2.3057f)
                curveTo(14.7723f, 4.4713f, 14.5555f, 7.049f, 12.9136f, 8.6909f)
                lineTo(10.1771f, 11.4274f)
                close()
                moveTo(9.1423f, 6.8053f)
                curveTo(9.3924f, 7.0553f, 9.7315f, 7.1958f, 10.0851f, 7.1958f)
                curveTo(10.4388f, 7.1958f, 10.7779f, 7.0553f, 11.0279f, 6.8053f)
                curveTo(11.278f, 6.5552f, 11.4185f, 6.2161f, 11.4185f, 5.8624f)
                curveTo(11.4185f, 5.5088f, 11.278f, 5.1697f, 11.0279f, 4.9196f)
                curveTo(10.7779f, 4.6696f, 10.4388f, 4.5291f, 10.0851f, 4.5291f)
                curveTo(9.7315f, 4.5291f, 9.3924f, 4.6696f, 9.1423f, 4.9196f)
                curveTo(8.8923f, 5.1697f, 8.7518f, 5.5088f, 8.7518f, 5.8624f)
                curveTo(8.7518f, 6.2161f, 8.8923f, 6.5552f, 9.1423f, 6.8053f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
