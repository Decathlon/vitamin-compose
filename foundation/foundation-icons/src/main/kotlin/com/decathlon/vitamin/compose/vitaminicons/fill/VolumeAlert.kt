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

public val FillGroup.VolumeAlert: ImageVector
    get() {
        if (_volumeAlert != null) {
            return _volumeAlert!!
        }
        _volumeAlert = Builder(name = "VolumeAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.889f, 16.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 16.0f, 1.0f, 15.5523f, 1.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.0f, 8.4477f, 1.4477f, 8.0f, 2.0f, 8.0f)
                horizontalLineTo(5.889f)
                lineTo(11.183f, 3.668f)
                curveTo(11.3325f, 3.5454f, 11.5393f, 3.52f, 11.714f, 3.6028f)
                curveTo(11.8888f, 3.6855f, 12.0001f, 3.8616f, 12.0f, 4.055f)
                verticalLineTo(19.945f)
                curveTo(12.0001f, 20.1383f, 11.8888f, 20.3144f, 11.714f, 20.3972f)
                curveTo(11.5393f, 20.4799f, 11.3325f, 20.4545f, 11.183f, 20.332f)
                lineTo(5.889f, 16.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _volumeAlert!!
    }

private var _volumeAlert: ImageVector? = null
