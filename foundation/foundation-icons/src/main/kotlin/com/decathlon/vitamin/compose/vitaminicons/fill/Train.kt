package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4667f, 13.3333f)
                lineTo(12.6667f, 14.3333f)
                verticalLineTo(14.6667f)
                horizontalLineTo(3.3333f)
                verticalLineTo(14.3333f)
                lineTo(4.5333f, 13.3333f)
                horizontalLineTo(3.3333f)
                curveTo(2.9797f, 13.3333f, 2.6406f, 13.1929f, 2.3905f, 12.9428f)
                curveTo(2.1405f, 12.6928f, 2.0f, 12.3536f, 2.0f, 12.0f)
                verticalLineTo(4.6667f)
                curveTo(2.0f, 3.9594f, 2.281f, 3.2812f, 2.781f, 2.781f)
                curveTo(3.2812f, 2.281f, 3.9594f, 2.0f, 4.6667f, 2.0f)
                horizontalLineTo(11.3333f)
                curveTo(12.0406f, 2.0f, 12.7189f, 2.281f, 13.219f, 2.781f)
                curveTo(13.719f, 3.2812f, 14.0f, 3.9594f, 14.0f, 4.6667f)
                verticalLineTo(12.0f)
                curveTo(14.0f, 12.3536f, 13.8595f, 12.6928f, 13.6095f, 12.9428f)
                curveTo(13.3594f, 13.1929f, 13.0203f, 13.3333f, 12.6667f, 13.3333f)
                horizontalLineTo(11.4667f)
                close()
                moveTo(3.3333f, 4.6667f)
                verticalLineTo(7.3333f)
                horizontalLineTo(12.6667f)
                verticalLineTo(4.6667f)
                horizontalLineTo(3.3333f)
                close()
                moveTo(8.0f, 12.0f)
                curveTo(8.3536f, 12.0f, 8.6928f, 11.8595f, 8.9428f, 11.6095f)
                curveTo(9.1929f, 11.3594f, 9.3333f, 11.0203f, 9.3333f, 10.6667f)
                curveTo(9.3333f, 10.313f, 9.1929f, 9.9739f, 8.9428f, 9.7239f)
                curveTo(8.6928f, 9.4738f, 8.3536f, 9.3333f, 8.0f, 9.3333f)
                curveTo(7.6464f, 9.3333f, 7.3072f, 9.4738f, 7.0572f, 9.7239f)
                curveTo(6.8071f, 9.9739f, 6.6667f, 10.313f, 6.6667f, 10.6667f)
                curveTo(6.6667f, 11.0203f, 6.8071f, 11.3594f, 7.0572f, 11.6095f)
                curveTo(7.3072f, 11.8595f, 7.6464f, 12.0f, 8.0f, 12.0f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
