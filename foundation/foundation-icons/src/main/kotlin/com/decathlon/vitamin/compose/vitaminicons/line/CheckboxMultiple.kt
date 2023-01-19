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

public val LineGroup.CheckboxMultiple: ImageVector
    get() {
        if (_checkboxMultiple != null) {
            return _checkboxMultiple!!
        }
        _checkboxMultiple = Builder(name = "CheckboxMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6625f, 4.6625f)
                verticalLineTo(1.9965f)
                curveTo(4.6625f, 1.8197f, 4.7327f, 1.6502f, 4.8577f, 1.5252f)
                curveTo(4.9827f, 1.4002f, 5.1522f, 1.33f, 5.329f, 1.33f)
                horizontalLineTo(13.9935f)
                curveTo(14.1703f, 1.33f, 14.3398f, 1.4002f, 14.4648f, 1.5252f)
                curveTo(14.5898f, 1.6502f, 14.66f, 1.8197f, 14.66f, 1.9965f)
                verticalLineTo(10.661f)
                curveTo(14.66f, 10.8378f, 14.5898f, 11.0073f, 14.4648f, 11.1323f)
                curveTo(14.3398f, 11.2573f, 14.1703f, 11.3275f, 13.9935f, 11.3275f)
                horizontalLineTo(11.3275f)
                verticalLineTo(13.9889f)
                curveTo(11.3275f, 14.3594f, 11.0283f, 14.66f, 10.6564f, 14.66f)
                horizontalLineTo(2.0012f)
                curveTo(1.913f, 14.6601f, 1.8257f, 14.6428f, 1.7442f, 14.6091f)
                curveTo(1.6628f, 14.5754f, 1.5887f, 14.526f, 1.5264f, 14.4636f)
                curveTo(1.4641f, 14.4013f, 1.4146f, 14.3273f, 1.3809f, 14.2458f)
                curveTo(1.3472f, 14.1643f, 1.3299f, 14.077f, 1.33f, 13.9889f)
                lineTo(1.332f, 5.3337f)
                curveTo(1.332f, 4.9631f, 1.6313f, 4.6625f, 2.0032f, 4.6625f)
                horizontalLineTo(4.6625f)
                close()
                moveTo(5.9955f, 4.6625f)
                horizontalLineTo(10.6564f)
                curveTo(11.0269f, 4.6625f, 11.3275f, 4.9618f, 11.3275f, 5.3337f)
                verticalLineTo(9.9945f)
                horizontalLineTo(13.327f)
                verticalLineTo(2.663f)
                horizontalLineTo(5.9955f)
                verticalLineTo(4.6625f)
                close()
                moveTo(9.9945f, 5.9955f)
                horizontalLineTo(2.665f)
                lineTo(2.663f, 13.327f)
                horizontalLineTo(9.9945f)
                verticalLineTo(5.9955f)
                close()
                moveTo(5.6643f, 11.994f)
                lineTo(3.3075f, 9.6373f)
                lineTo(4.2499f, 8.6948f)
                lineTo(5.6643f, 10.1092f)
                lineTo(8.4916f, 7.2812f)
                lineTo(9.434f, 8.2236f)
                lineTo(5.6643f, 11.994f)
                close()
            }
        }
        .build()
        return _checkboxMultiple!!
    }

private var _checkboxMultiple: ImageVector? = null
