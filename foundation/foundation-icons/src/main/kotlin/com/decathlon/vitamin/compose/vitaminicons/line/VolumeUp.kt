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

public val LineGroup.VolumeUp: ImageVector
    get() {
        if (_volumeUp != null) {
            return _volumeUp!!
        }
        _volumeUp = Builder(name = "VolumeUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3333f, 10.6666f)
                horizontalLineTo(3.926f)
                lineTo(7.4553f, 13.5546f)
                curveTo(7.555f, 13.6364f, 7.6928f, 13.6533f, 7.8093f, 13.5981f)
                curveTo(7.9258f, 13.5429f, 8.0f, 13.4255f, 8.0f, 13.2966f)
                verticalLineTo(2.7033f)
                curveTo(8.0f, 2.5744f, 7.9258f, 2.457f, 7.8093f, 2.4018f)
                curveTo(7.6928f, 2.3467f, 7.555f, 2.3636f, 7.4553f, 2.4453f)
                lineTo(3.926f, 5.3333f)
                horizontalLineTo(1.3333f)
                curveTo(0.9651f, 5.3333f, 0.6666f, 5.6318f, 0.6666f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(0.6666f, 10.3682f, 0.9651f, 10.6666f, 1.3333f, 10.6666f)
                close()
                moveTo(4.402f, 6.6667f)
                lineTo(6.6666f, 4.8133f)
                verticalLineTo(11.1867f)
                lineTo(4.402f, 9.3333f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.6667f)
                horizontalLineTo(4.402f)
                close()
                moveTo(12.9373f, 13.4226f)
                lineTo(11.9933f, 12.4786f)
                curveTo(13.2716f, 11.3412f, 14.002f, 9.7111f, 13.9999f, 8.0f)
                curveTo(14.0016f, 6.1991f, 13.1927f, 4.4931f, 11.7973f, 3.3546f)
                lineTo(12.7439f, 2.408f)
                curveTo(14.3881f, 3.7999f, 15.3354f, 5.8457f, 15.3333f, 8.0f)
                curveTo(15.3333f, 10.1486f, 14.4093f, 12.0813f, 12.9373f, 13.4226f)
                close()
                moveTo(9.6272f, 10.1126f)
                lineTo(10.5753f, 11.0606f)
                curveTo(11.4466f, 10.3266f, 11.9999f, 9.228f, 11.9999f, 8.0f)
                curveTo(12.001f, 6.7286f, 11.3967f, 5.5327f, 10.3726f, 4.7793f)
                lineTo(9.4132f, 5.7386f)
                curveTo(10.1666f, 6.21f, 10.6666f, 7.0466f, 10.6666f, 8.0f)
                curveTo(10.6673f, 8.8274f, 10.2832f, 9.6082f, 9.6272f, 10.1126f)
                close()
            }
        }
        .build()
        return _volumeUp!!
    }

private var _volumeUp: ImageVector? = null
