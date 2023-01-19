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
                moveTo(12.7137f, 3.6766f)
                lineTo(11.7451f, 4.6453f)
                curveTo(9.2574f, 2.6579f, 5.6506f, 2.9597f, 3.5279f, 5.333f)
                curveTo(1.4052f, 7.7062f, 1.5059f, 11.3242f, 3.7574f, 13.5756f)
                curveTo(6.0088f, 15.8271f, 9.6268f, 15.9278f, 12.0f, 13.8051f)
                curveTo(14.3733f, 11.6824f, 14.6751f, 8.0756f, 12.6877f, 5.5879f)
                lineTo(13.6564f, 4.6193f)
                lineTo(12.7137f, 3.6766f)
                close()
                moveTo(12.0412f, 11.6666f)
                curveTo(11.2076f, 13.1105f, 9.667f, 14.0f, 7.9998f, 14.0f)
                curveTo(5.4224f, 14.0f, 3.3331f, 11.9106f, 3.3331f, 9.3333f)
                curveTo(3.3331f, 6.756f, 5.4224f, 4.6666f, 7.9998f, 4.6666f)
                curveTo(9.667f, 4.6666f, 11.2076f, 5.5561f, 12.0412f, 7.0f)
                curveTo(12.8748f, 8.4438f, 12.8748f, 10.2228f, 12.0412f, 11.6666f)
                close()
                moveTo(8.6664f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.3331f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.6664f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null
