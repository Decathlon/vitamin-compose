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

public val LineGroup.VolumeAlert: ImageVector
    get() {
        if (_volumeAlert != null) {
            return _volumeAlert!!
        }
        _volumeAlert = Builder(name = "VolumeAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.9261f, 10.6666f)
                horizontalLineTo(1.3334f)
                curveTo(0.9652f, 10.6666f, 0.6667f, 10.3682f, 0.6667f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(0.6667f, 5.6318f, 0.9652f, 5.3333f, 1.3334f, 5.3333f)
                horizontalLineTo(3.9261f)
                lineTo(7.4555f, 2.4453f)
                curveTo(7.5551f, 2.3636f, 7.693f, 2.3467f, 7.8095f, 2.4018f)
                curveTo(7.926f, 2.457f, 8.0002f, 2.5744f, 8.0001f, 2.7033f)
                verticalLineTo(13.2966f)
                curveTo(8.0002f, 13.4255f, 7.926f, 13.5429f, 7.8095f, 13.5981f)
                curveTo(7.693f, 13.6533f, 7.5551f, 13.6364f, 7.4555f, 13.5546f)
                lineTo(3.9261f, 10.6666f)
                close()
                moveTo(6.6668f, 4.8133f)
                lineTo(4.4021f, 6.6667f)
                horizontalLineTo(2.0001f)
                verticalLineTo(9.3333f)
                horizontalLineTo(4.4021f)
                lineTo(6.6668f, 11.1867f)
                verticalLineTo(4.8133f)
                close()
                moveTo(10.6667f, 4.6667f)
                horizontalLineTo(12.0001f)
                verticalLineTo(8.6667f)
                horizontalLineTo(10.6667f)
                verticalLineTo(4.6667f)
                close()
                moveTo(10.6667f, 10.0f)
                horizontalLineTo(12.0001f)
                verticalLineTo(11.3333f)
                horizontalLineTo(10.6667f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _volumeAlert!!
    }

private var _volumeAlert: ImageVector? = null
