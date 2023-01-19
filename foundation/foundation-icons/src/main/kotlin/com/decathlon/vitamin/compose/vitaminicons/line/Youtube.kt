package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.362f, 4.332f)
                curveTo(14.6667f, 5.52f, 14.6667f, 8.0f, 14.6667f, 8.0f)
                curveTo(14.6667f, 8.0f, 14.6667f, 10.48f, 14.362f, 11.668f)
                curveTo(14.1927f, 12.3247f, 13.6974f, 12.8413f, 13.07f, 13.016f)
                curveTo(11.9307f, 13.3333f, 8.0f, 13.3333f, 8.0f, 13.3333f)
                curveTo(8.0f, 13.3333f, 4.0714f, 13.3333f, 2.93f, 13.016f)
                curveTo(2.3f, 12.8387f, 1.8054f, 12.3227f, 1.638f, 11.668f)
                curveTo(1.3334f, 10.48f, 1.3334f, 8.0f, 1.3334f, 8.0f)
                curveTo(1.3334f, 8.0f, 1.3334f, 5.52f, 1.638f, 4.332f)
                curveTo(1.8074f, 3.6753f, 2.3027f, 3.1587f, 2.93f, 2.984f)
                curveTo(4.0714f, 2.6667f, 8.0f, 2.6667f, 8.0f, 2.6667f)
                curveTo(8.0f, 2.6667f, 11.9307f, 2.6667f, 13.07f, 2.984f)
                curveTo(13.7f, 3.1613f, 14.1947f, 3.6773f, 14.362f, 4.332f)
                close()
                moveTo(13.0707f, 4.6633f)
                curveTo(13.02f, 4.4647f, 12.876f, 4.3147f, 12.7114f, 4.2687f)
                curveTo(12.42f, 4.1867f, 11.0f, 4.0f, 8.0f, 4.0f)
                curveTo(5.0f, 4.0f, 3.5814f, 4.1867f, 3.2874f, 4.2687f)
                curveTo(3.1247f, 4.314f, 2.9807f, 4.464f, 2.9294f, 4.6633f)
                curveTo(2.8567f, 4.946f, 2.6667f, 6.1307f, 2.6667f, 8.0f)
                curveTo(2.6667f, 9.8693f, 2.8567f, 11.0533f, 2.9294f, 11.3373f)
                curveTo(2.98f, 11.5353f, 3.124f, 11.6853f, 3.288f, 11.7307f)
                curveTo(3.5814f, 11.8133f, 5.0f, 12.0f, 8.0f, 12.0f)
                curveTo(11.0f, 12.0f, 12.4194f, 11.8133f, 12.7127f, 11.7313f)
                curveTo(12.8754f, 11.686f, 13.0194f, 11.536f, 13.0707f, 11.3367f)
                curveTo(13.1434f, 11.054f, 13.3334f, 9.8667f, 13.3334f, 8.0f)
                curveTo(13.3334f, 6.1333f, 13.1434f, 4.9467f, 13.0707f, 4.6633f)
                close()
                moveTo(6.6667f, 5.6667f)
                verticalLineTo(10.3333f)
                lineTo(10.6667f, 8.0f)
                lineTo(6.6667f, 5.6667f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
