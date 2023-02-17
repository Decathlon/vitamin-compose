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

public val FillGroup.TempCold: ImageVector
    get() {
        if (_tempCold != null) {
            return _tempCold!!
        }
        _tempCold = Builder(name = "TempCold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.255f)
                verticalLineTo(5.0f)
                curveTo(8.0f, 3.9391f, 8.4214f, 2.9217f, 9.1716f, 2.1716f)
                curveTo(9.9217f, 1.4214f, 10.9391f, 1.0f, 12.0f, 1.0f)
                curveTo(13.0609f, 1.0f, 14.0783f, 1.4214f, 14.8284f, 2.1716f)
                curveTo(15.5786f, 2.9217f, 16.0f, 3.9391f, 16.0f, 5.0f)
                verticalLineTo(10.255f)
                curveTo(17.223f, 11.1066f, 18.1423f, 12.3262f, 18.6241f, 13.7365f)
                curveTo(19.1059f, 15.1467f, 19.125f, 16.6739f, 18.6788f, 18.0958f)
                curveTo(18.2325f, 19.5176f, 17.3441f, 20.76f, 16.1429f, 21.642f)
                curveTo(14.9416f, 22.524f, 13.4903f, 22.9996f, 12.0f, 22.9996f)
                curveTo(10.5097f, 22.9996f, 9.0584f, 22.524f, 7.8571f, 21.642f)
                curveTo(6.6559f, 20.76f, 5.7675f, 19.5176f, 5.3212f, 18.0958f)
                curveTo(4.875f, 16.6739f, 4.8941f, 15.1467f, 5.3759f, 13.7365f)
                curveTo(5.8577f, 12.3262f, 6.777f, 11.1066f, 8.0f, 10.255f)
                close()
                moveTo(8.0f, 16.0f)
                curveTo(8.0f, 17.0609f, 8.4214f, 18.0783f, 9.1716f, 18.8284f)
                curveTo(9.9217f, 19.5786f, 10.9391f, 20.0f, 12.0f, 20.0f)
                curveTo(13.0609f, 20.0f, 14.0783f, 19.5786f, 14.8284f, 18.8284f)
                curveTo(15.5786f, 18.0783f, 16.0f, 17.0609f, 16.0f, 16.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _tempCold!!
    }

private var _tempCold: ImageVector? = null
