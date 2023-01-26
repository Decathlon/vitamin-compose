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

public val FillGroup.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5199f, 5.934f)
                lineTo(1.3929f, 2.808f)
                lineTo(2.8079f, 1.393f)
                lineTo(22.6069f, 21.193f)
                lineTo(21.1919f, 22.607f)
                lineTo(17.8819f, 19.297f)
                curveTo(16.1231f, 20.4126f, 14.0826f, 21.0033f, 11.9999f, 21.0f)
                curveTo(6.6079f, 21.0f, 2.1219f, 17.12f, 1.1809f, 12.0f)
                curveTo(1.6109f, 9.6707f, 2.7815f, 7.5429f, 4.5199f, 5.934f)
                close()
                moveTo(14.7569f, 16.172f)
                lineTo(13.2929f, 14.708f)
                curveTo(12.1454f, 15.2571f, 10.7763f, 15.0227f, 9.8768f, 14.1231f)
                curveTo(8.9773f, 13.2236f, 8.7429f, 11.8545f, 9.2919f, 10.707f)
                lineTo(7.8279f, 9.243f)
                curveTo(6.5161f, 11.2253f, 6.7812f, 13.8571f, 8.462f, 15.5379f)
                curveTo(10.1428f, 17.2187f, 12.7746f, 17.4838f, 14.7569f, 16.172f)
                close()
                moveTo(11.9999f, 3.0f)
                curveTo(10.5799f, 3.0f, 9.2209f, 3.27f, 7.9739f, 3.76f)
                lineTo(11.2669f, 7.052f)
                curveTo(12.8332f, 6.8195f, 14.417f, 7.3426f, 15.5366f, 8.4623f)
                curveTo(16.6563f, 9.5819f, 17.1794f, 11.1657f, 16.9469f, 12.732f)
                lineTo(20.8069f, 16.592f)
                curveTo(21.8238f, 15.2376f, 22.5125f, 13.6657f, 22.8189f, 12.0f)
                curveTo(21.8779f, 6.88f, 17.3919f, 3.0f, 11.9999f, 3.0f)
                close()
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
