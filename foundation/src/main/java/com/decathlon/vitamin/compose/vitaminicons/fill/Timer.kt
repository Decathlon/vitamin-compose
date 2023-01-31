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

public val FillGroup.Timer: ImageVector
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
                moveTo(17.6176f, 6.968f)
                lineTo(19.0706f, 5.515f)
                lineTo(20.4846f, 6.929f)
                lineTo(19.0316f, 8.382f)
                curveTo(22.0127f, 12.1134f, 21.5599f, 17.5237f, 18.0001f, 20.7077f)
                curveTo(14.4403f, 23.8918f, 9.0132f, 23.7407f, 5.6361f, 20.3635f)
                curveTo(2.2589f, 16.9864f, 2.1078f, 11.5593f, 5.2919f, 7.9995f)
                curveTo(8.4759f, 4.4397f, 13.8861f, 3.9869f, 17.6176f, 6.968f)
                close()
                moveTo(10.9996f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.9996f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.9996f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
