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

public val FillGroup.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(23.95f, 15.536f)
                lineTo(20.414f, 12.0f)
                lineTo(23.95f, 8.464f)
                lineTo(22.536f, 7.05f)
                lineTo(19.0f, 10.586f)
                lineTo(15.464f, 7.05f)
                lineTo(14.05f, 8.464f)
                lineTo(17.586f, 12.0f)
                lineTo(14.05f, 15.536f)
                lineTo(15.464f, 16.95f)
                lineTo(19.0f, 13.414f)
                lineTo(22.536f, 16.95f)
                lineTo(23.95f, 15.536f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
