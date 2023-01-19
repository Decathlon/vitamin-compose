package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3276f, 2.663f)
                horizontalLineTo(13.9936f)
                curveTo(14.1703f, 2.663f, 14.3399f, 2.7332f, 14.4649f, 2.8582f)
                curveTo(14.5899f, 2.9832f, 14.6601f, 3.1527f, 14.6601f, 3.3295f)
                verticalLineTo(13.9935f)
                curveTo(14.6601f, 14.1703f, 14.5899f, 14.3398f, 14.4649f, 14.4648f)
                curveTo(14.3399f, 14.5898f, 14.1703f, 14.66f, 13.9936f, 14.66f)
                horizontalLineTo(1.9966f)
                curveTo(1.8198f, 14.66f, 1.6503f, 14.5898f, 1.5253f, 14.4648f)
                curveTo(1.4003f, 14.3398f, 1.3301f, 14.1703f, 1.3301f, 13.9935f)
                verticalLineTo(3.3295f)
                curveTo(1.3301f, 3.1527f, 1.4003f, 2.9832f, 1.5253f, 2.8582f)
                curveTo(1.6503f, 2.7332f, 1.8198f, 2.663f, 1.9966f, 2.663f)
                horizontalLineTo(4.6626f)
                verticalLineTo(1.33f)
                horizontalLineTo(5.9956f)
                verticalLineTo(2.663f)
                horizontalLineTo(9.9946f)
                verticalLineTo(1.33f)
                horizontalLineTo(11.3276f)
                verticalLineTo(2.663f)
                close()
                moveTo(9.9946f, 3.996f)
                horizontalLineTo(5.9956f)
                verticalLineTo(5.329f)
                horizontalLineTo(4.6626f)
                verticalLineTo(3.996f)
                horizontalLineTo(2.6631f)
                verticalLineTo(6.662f)
                horizontalLineTo(13.3271f)
                verticalLineTo(3.996f)
                horizontalLineTo(11.3276f)
                verticalLineTo(5.329f)
                horizontalLineTo(9.9946f)
                verticalLineTo(3.996f)
                close()
                moveTo(13.3271f, 7.995f)
                horizontalLineTo(2.6631f)
                verticalLineTo(13.327f)
                horizontalLineTo(13.3271f)
                verticalLineTo(7.995f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
