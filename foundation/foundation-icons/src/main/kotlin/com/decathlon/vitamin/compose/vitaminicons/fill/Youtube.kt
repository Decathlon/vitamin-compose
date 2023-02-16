package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.6666f, 8.0f)
                curveTo(14.6666f, 8.0f, 14.6666f, 5.52f, 14.3619f, 4.332f)
                curveTo(14.1946f, 3.6773f, 13.6999f, 3.1613f, 13.0699f, 2.984f)
                curveTo(11.9306f, 2.6667f, 7.9999f, 2.6667f, 7.9999f, 2.6667f)
                curveTo(7.9999f, 2.6667f, 4.0712f, 2.6667f, 2.9299f, 2.984f)
                curveTo(2.3026f, 3.1587f, 1.8073f, 3.6753f, 1.6379f, 4.332f)
                curveTo(1.3333f, 5.52f, 1.3333f, 8.0f, 1.3333f, 8.0f)
                curveTo(1.3333f, 8.0f, 1.3333f, 10.48f, 1.6379f, 11.668f)
                curveTo(1.8053f, 12.3227f, 2.2999f, 12.8387f, 2.9299f, 13.016f)
                curveTo(4.0712f, 13.3333f, 7.9999f, 13.3333f, 7.9999f, 13.3333f)
                curveTo(7.9999f, 13.3333f, 11.9306f, 13.3333f, 13.0699f, 13.016f)
                curveTo(13.6973f, 12.8413f, 14.1926f, 12.3247f, 14.3619f, 11.668f)
                curveTo(14.6666f, 10.48f, 14.6666f, 8.0f, 14.6666f, 8.0f)
                close()
                moveTo(10.6666f, 8.0f)
                lineTo(6.6666f, 10.3333f)
                verticalLineTo(5.6667f)
                lineTo(10.6666f, 8.0f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
