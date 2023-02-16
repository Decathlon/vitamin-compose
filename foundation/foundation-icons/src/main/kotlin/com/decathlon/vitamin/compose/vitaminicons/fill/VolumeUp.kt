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

public val FillGroup.VolumeUp: ImageVector
    get() {
        if (_volumeUp != null) {
            return _volumeUp!!
        }
        _volumeUp = Builder(name = "VolumeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.9261f, 10.6666f)
                horizontalLineTo(1.3334f)
                curveTo(0.9652f, 10.6666f, 0.6667f, 10.3682f, 0.6667f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(0.6667f, 5.6318f, 0.9652f, 5.3333f, 1.3334f, 5.3333f)
                horizontalLineTo(3.9261f)
                lineTo(7.4554f, 2.4453f)
                curveTo(7.5551f, 2.3636f, 7.693f, 2.3467f, 7.8094f, 2.4018f)
                curveTo(7.9259f, 2.457f, 8.0002f, 2.5744f, 8.0001f, 2.7033f)
                verticalLineTo(13.2966f)
                curveTo(8.0002f, 13.4255f, 7.9259f, 13.5429f, 7.8094f, 13.5981f)
                curveTo(7.693f, 13.6533f, 7.5551f, 13.6364f, 7.4554f, 13.5546f)
                lineTo(3.9261f, 10.6666f)
                close()
                moveTo(12.9374f, 13.4226f)
                lineTo(11.9934f, 12.4786f)
                curveTo(13.2717f, 11.3412f, 14.0021f, 9.7111f, 14.0001f, 8.0f)
                curveTo(14.0017f, 6.1991f, 13.1928f, 4.4931f, 11.7974f, 3.3546f)
                lineTo(12.7441f, 2.408f)
                curveTo(14.3883f, 3.7999f, 15.3355f, 5.8457f, 15.3334f, 8.0f)
                curveTo(15.3334f, 10.1486f, 14.4094f, 12.0813f, 12.9374f, 13.4226f)
                close()
                moveTo(9.6274f, 10.1126f)
                lineTo(10.5754f, 11.0606f)
                curveTo(11.4467f, 10.3266f, 12.0f, 9.228f, 12.0f, 8.0f)
                curveTo(12.0011f, 6.7286f, 11.3968f, 5.5327f, 10.3727f, 4.7793f)
                lineTo(9.4134f, 5.7386f)
                curveTo(10.1667f, 6.21f, 10.6667f, 7.0466f, 10.6667f, 8.0f)
                curveTo(10.6675f, 8.8274f, 10.2834f, 9.6082f, 9.6274f, 10.1126f)
                close()
            }
        }
        .build()
        return _volumeUp!!
    }

private var _volumeUp: ImageVector? = null
