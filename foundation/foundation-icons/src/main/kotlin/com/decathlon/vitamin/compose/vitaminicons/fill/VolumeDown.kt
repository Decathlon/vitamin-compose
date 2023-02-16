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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.3334f, 10.6666f)
                horizontalLineTo(5.9261f)
                lineTo(9.4554f, 13.5546f)
                curveTo(9.5551f, 13.6364f, 9.693f, 13.6533f, 9.8094f, 13.5981f)
                curveTo(9.9259f, 13.5429f, 10.0002f, 13.4255f, 10.0001f, 13.2966f)
                verticalLineTo(2.7033f)
                curveTo(10.0002f, 2.5744f, 9.9259f, 2.457f, 9.8094f, 2.4018f)
                curveTo(9.693f, 2.3467f, 9.5551f, 2.3636f, 9.4554f, 2.4453f)
                lineTo(5.9261f, 5.3333f)
                horizontalLineTo(3.3334f)
                curveTo(2.9652f, 5.3333f, 2.6667f, 5.6318f, 2.6667f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(2.6667f, 10.3682f, 2.9652f, 10.6666f, 3.3334f, 10.6666f)
                close()
                moveTo(11.6274f, 10.1126f)
                lineTo(12.5754f, 11.0606f)
                curveTo(13.4467f, 10.3266f, 14.0f, 9.228f, 14.0f, 8.0f)
                curveTo(14.0011f, 6.7286f, 13.3968f, 5.5327f, 12.3727f, 4.7793f)
                lineTo(11.4134f, 5.7386f)
                curveTo(12.1667f, 6.21f, 12.6667f, 7.0466f, 12.6667f, 8.0f)
                curveTo(12.6675f, 8.8274f, 12.2834f, 9.6082f, 11.6274f, 10.1126f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
