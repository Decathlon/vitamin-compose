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

public val FillGroup.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 16.0f)
                horizontalLineTo(8.889f)
                lineTo(14.183f, 20.332f)
                curveTo(14.3325f, 20.4546f, 14.5393f, 20.48f, 14.714f, 20.3972f)
                curveTo(14.8888f, 20.3145f, 15.0001f, 20.1384f, 15.0f, 19.945f)
                verticalLineTo(4.055f)
                curveTo(15.0001f, 3.8617f, 14.8888f, 3.6856f, 14.714f, 3.6028f)
                curveTo(14.5393f, 3.5201f, 14.3325f, 3.5454f, 14.183f, 3.668f)
                lineTo(8.889f, 8.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 8.0f, 4.0f, 8.4477f, 4.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 15.5523f, 4.4477f, 16.0f, 5.0f, 16.0f)
                close()
                moveTo(17.441f, 15.169f)
                lineTo(18.863f, 16.591f)
                curveTo(20.17f, 15.49f, 21.0f, 13.842f, 21.0f, 12.0f)
                curveTo(21.0016f, 10.093f, 20.0952f, 8.2991f, 18.559f, 7.169f)
                lineTo(17.12f, 8.608f)
                curveTo(18.25f, 9.315f, 19.0f, 10.57f, 19.0f, 12.0f)
                curveTo(19.0011f, 13.2413f, 18.425f, 14.4124f, 17.441f, 15.169f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
