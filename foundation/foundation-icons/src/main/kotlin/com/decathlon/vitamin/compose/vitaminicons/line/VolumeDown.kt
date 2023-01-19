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

public val LineGroup.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.926f, 10.6666f)
                horizontalLineTo(3.3333f)
                curveTo(2.9651f, 10.6666f, 2.6666f, 10.3682f, 2.6666f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(2.6666f, 5.6318f, 2.9651f, 5.3333f, 3.3333f, 5.3333f)
                horizontalLineTo(5.926f)
                lineTo(9.4553f, 2.4453f)
                curveTo(9.555f, 2.3636f, 9.6928f, 2.3467f, 9.8093f, 2.4018f)
                curveTo(9.9258f, 2.457f, 10.0f, 2.5744f, 10.0f, 2.7033f)
                verticalLineTo(13.2966f)
                curveTo(10.0f, 13.4255f, 9.9258f, 13.5429f, 9.8093f, 13.5981f)
                curveTo(9.6928f, 13.6533f, 9.555f, 13.6364f, 9.4553f, 13.5546f)
                lineTo(5.926f, 10.6666f)
                close()
                moveTo(8.6666f, 4.8133f)
                lineTo(6.402f, 6.6667f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.3333f)
                horizontalLineTo(6.402f)
                lineTo(8.6666f, 11.1867f)
                verticalLineTo(4.8133f)
                close()
                moveTo(11.6273f, 10.1126f)
                lineTo(12.5753f, 11.0606f)
                curveTo(13.4466f, 10.3266f, 13.9999f, 9.228f, 13.9999f, 8.0f)
                curveTo(14.001f, 6.7286f, 13.3967f, 5.5327f, 12.3726f, 4.7793f)
                lineTo(11.4133f, 5.7386f)
                curveTo(12.1666f, 6.21f, 12.6666f, 7.0466f, 12.6666f, 8.0f)
                curveTo(12.6673f, 8.8274f, 12.2832f, 9.6082f, 11.6273f, 10.1126f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
