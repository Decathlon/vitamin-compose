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

public val LineGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.9996f, 2.0f)
                horizontalLineTo(7.9996f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.9996f)
                verticalLineTo(2.0f)
                close()
                moveTo(19.0706f, 5.515f)
                lineTo(17.6176f, 6.968f)
                curveTo(13.8861f, 3.9869f, 8.4759f, 4.4397f, 5.2919f, 7.9995f)
                curveTo(2.1078f, 11.5593f, 2.2589f, 16.9864f, 5.6361f, 20.3635f)
                curveTo(9.0132f, 23.7407f, 14.4403f, 23.8918f, 18.0001f, 20.7077f)
                curveTo(21.5599f, 17.5237f, 22.0127f, 12.1134f, 19.0316f, 8.382f)
                lineTo(20.4846f, 6.929f)
                lineTo(19.0706f, 5.515f)
                close()
                moveTo(18.0618f, 17.5f)
                curveTo(16.8113f, 19.6658f, 14.5004f, 21.0f, 11.9996f, 21.0f)
                curveTo(8.1336f, 21.0f, 4.9996f, 17.866f, 4.9996f, 14.0f)
                curveTo(4.9996f, 10.134f, 8.1336f, 7.0f, 11.9996f, 7.0f)
                curveTo(14.5004f, 7.0f, 16.8113f, 8.3342f, 18.0618f, 10.5f)
                curveTo(19.3122f, 12.6658f, 19.3122f, 15.3342f, 18.0618f, 17.5f)
                close()
                moveTo(12.9996f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.9996f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.9996f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
