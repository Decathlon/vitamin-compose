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

public val LineGroup.VolumeUp: ImageVector
    get() {
        if (_volumeUp != null) {
            return _volumeUp!!
        }
        _volumeUp = Builder(name = "VolumeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 16.0f)
                horizontalLineTo(5.889f)
                lineTo(11.183f, 20.332f)
                curveTo(11.3325f, 20.4546f, 11.5393f, 20.48f, 11.714f, 20.3972f)
                curveTo(11.8888f, 20.3145f, 12.0001f, 20.1384f, 12.0f, 19.945f)
                verticalLineTo(4.055f)
                curveTo(12.0001f, 3.8617f, 11.8888f, 3.6856f, 11.714f, 3.6028f)
                curveTo(11.5393f, 3.5201f, 11.3325f, 3.5454f, 11.183f, 3.668f)
                lineTo(5.889f, 8.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 8.0f, 1.0f, 8.4477f, 1.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 15.5523f, 1.4477f, 16.0f, 2.0f, 16.0f)
                close()
                moveTo(6.603f, 10.0f)
                lineTo(10.0f, 7.22f)
                verticalLineTo(16.78f)
                lineTo(6.603f, 14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.603f)
                close()
                moveTo(19.406f, 20.134f)
                lineTo(17.99f, 18.718f)
                curveTo(19.9075f, 17.0119f, 21.0031f, 14.5667f, 21.0f, 12.0f)
                curveTo(21.0025f, 9.2987f, 19.7891f, 6.7397f, 17.696f, 5.032f)
                lineTo(19.116f, 3.612f)
                curveTo(21.5823f, 5.7f, 23.0032f, 8.7686f, 23.0f, 12.0f)
                curveTo(23.0f, 15.223f, 21.614f, 18.122f, 19.406f, 20.134f)
                close()
                moveTo(14.441f, 15.169f)
                lineTo(15.863f, 16.591f)
                curveTo(17.17f, 15.49f, 18.0f, 13.842f, 18.0f, 12.0f)
                curveTo(18.0016f, 10.093f, 17.0952f, 8.2991f, 15.559f, 7.169f)
                lineTo(14.12f, 8.608f)
                curveTo(15.25f, 9.315f, 16.0f, 10.57f, 16.0f, 12.0f)
                curveTo(16.0011f, 13.2413f, 15.425f, 14.4124f, 14.441f, 15.169f)
                close()
            }
        }
        .build()
        return _volumeUp!!
    }

private var _volumeUp: ImageVector? = null
