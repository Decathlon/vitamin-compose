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

public val LineGroup.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(name = "HeartPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                curveTo(19.538f, 3.0f, 22.0f, 5.5f, 22.0f, 9.0f)
                curveTo(22.0f, 16.0f, 14.5f, 20.0f, 12.0f, 21.5f)
                curveTo(10.023f, 20.314f, 4.917f, 17.563f, 2.869f, 13.001f)
                lineTo(1.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.21f)
                curveTo(2.074f, 10.364f, 2.0f, 9.698f, 2.0f, 9.0f)
                curveTo(2.0f, 5.5f, 4.5f, 3.0f, 7.5f, 3.0f)
                curveTo(9.36f, 3.0f, 11.0f, 4.0f, 12.0f, 5.0f)
                curveTo(13.0f, 4.0f, 14.64f, 3.0f, 16.5f, 3.0f)
                close()
                moveTo(16.5f, 5.0f)
                curveTo(15.424f, 5.0f, 14.26f, 5.57f, 13.414f, 6.414f)
                lineTo(12.0f, 7.828f)
                lineTo(10.586f, 6.414f)
                curveTo(9.74f, 5.57f, 8.576f, 5.0f, 7.5f, 5.0f)
                curveTo(5.56f, 5.0f, 4.0f, 6.656f, 4.0f, 9.0f)
                curveTo(4.0f, 9.685f, 4.09f, 10.352f, 4.267f, 11.0f)
                horizontalLineTo(6.434f)
                lineTo(8.5f, 7.556f)
                lineTo(11.5f, 12.556f)
                lineTo(12.434f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.566f)
                lineTo(11.5f, 16.444f)
                lineTo(8.5f, 11.444f)
                lineTo(7.566f, 13.0f)
                horizontalLineTo(5.108f)
                curveTo(5.898f, 14.374f, 7.093f, 15.668f, 8.645f, 16.903f)
                curveTo(9.39f, 17.495f, 10.185f, 18.048f, 11.066f, 18.603f)
                curveTo(11.365f, 18.792f, 11.661f, 18.973f, 12.0f, 19.175f)
                curveTo(12.339f, 18.973f, 12.635f, 18.792f, 12.934f, 18.604f)
                curveTo(13.815f, 18.048f, 14.61f, 17.495f, 15.354f, 16.903f)
                curveTo(18.335f, 14.533f, 20.0f, 11.943f, 20.0f, 9.0f)
                curveTo(20.0f, 6.64f, 18.463f, 5.0f, 16.5f, 5.0f)
                close()
            }
        }
        .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
