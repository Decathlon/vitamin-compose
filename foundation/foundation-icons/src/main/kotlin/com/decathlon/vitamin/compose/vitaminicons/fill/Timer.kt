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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.6664f, 1.3333f)
                horizontalLineTo(5.3331f)
                verticalLineTo(2.6667f)
                horizontalLineTo(10.6664f)
                verticalLineTo(1.3333f)
                close()
                moveTo(11.7451f, 4.6453f)
                lineTo(12.7137f, 3.6766f)
                lineTo(13.6564f, 4.6193f)
                lineTo(12.6877f, 5.5879f)
                curveTo(14.6751f, 8.0756f, 14.3733f, 11.6824f, 12.0f, 13.8051f)
                curveTo(9.6268f, 15.9278f, 6.0088f, 15.8271f, 3.7574f, 13.5756f)
                curveTo(1.5059f, 11.3242f, 1.4052f, 7.7062f, 3.5279f, 5.333f)
                curveTo(5.6506f, 2.9597f, 9.2574f, 2.6579f, 11.7451f, 4.6453f)
                close()
                moveTo(7.3331f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.6664f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.3331f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
