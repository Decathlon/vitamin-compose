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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(13.0254f, 2.0f, 14.6667f, 3.6667f, 14.6667f, 6.0f)
                curveTo(14.6667f, 10.6667f, 9.6667f, 13.3333f, 8.0f, 14.3333f)
                curveTo(6.682f, 13.5427f, 3.278f, 11.7087f, 1.9127f, 8.6673f)
                lineTo(0.6667f, 8.6667f)
                verticalLineTo(7.3333f)
                horizontalLineTo(1.4734f)
                curveTo(1.3827f, 6.9093f, 1.3333f, 6.4653f, 1.3333f, 6.0f)
                curveTo(1.3333f, 3.6667f, 3.0f, 2.0f, 5.0f, 2.0f)
                curveTo(6.24f, 2.0f, 7.3334f, 2.6667f, 8.0f, 3.3333f)
                curveTo(8.6667f, 2.6667f, 9.76f, 2.0f, 11.0f, 2.0f)
                close()
                moveTo(11.0f, 3.3333f)
                curveTo(10.2827f, 3.3333f, 9.5067f, 3.7133f, 8.9427f, 4.276f)
                lineTo(8.0f, 5.2187f)
                lineTo(7.0574f, 4.276f)
                curveTo(6.4934f, 3.7133f, 5.7174f, 3.3333f, 5.0f, 3.3333f)
                curveTo(3.7067f, 3.3333f, 2.6667f, 4.4373f, 2.6667f, 6.0f)
                curveTo(2.6667f, 6.4567f, 2.7267f, 6.9013f, 2.8447f, 7.3333f)
                horizontalLineTo(4.2894f)
                lineTo(5.6667f, 5.0373f)
                lineTo(7.6667f, 8.3707f)
                lineTo(8.2893f, 7.3333f)
                horizontalLineTo(11.3334f)
                verticalLineTo(8.6667f)
                horizontalLineTo(9.044f)
                lineTo(7.6667f, 10.9627f)
                lineTo(5.6667f, 7.6293f)
                lineTo(5.044f, 8.6667f)
                horizontalLineTo(3.4053f)
                curveTo(3.932f, 9.5827f, 4.7287f, 10.4453f, 5.7634f, 11.2687f)
                curveTo(6.26f, 11.6633f, 6.79f, 12.032f, 7.3773f, 12.402f)
                curveTo(7.5767f, 12.528f, 7.774f, 12.6487f, 8.0f, 12.7833f)
                curveTo(8.226f, 12.6487f, 8.4234f, 12.528f, 8.6227f, 12.4027f)
                curveTo(9.21f, 12.032f, 9.74f, 11.6633f, 10.236f, 11.2687f)
                curveTo(12.2234f, 9.6887f, 13.3334f, 7.962f, 13.3334f, 6.0f)
                curveTo(13.3334f, 4.4267f, 12.3087f, 3.3333f, 11.0f, 3.3333f)
                close()
            }
        }
        .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
