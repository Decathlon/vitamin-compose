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

public val LineGroup.Store: ImageVector
    get() {
        if (_store != null) {
            return _store!!
        }
        _store = Builder(name = "Store", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9936f, 8.665f)
                verticalLineTo(13.3305f)
                curveTo(13.9936f, 13.5073f, 13.9234f, 13.6768f, 13.7984f, 13.8018f)
                curveTo(13.6734f, 13.9268f, 13.5038f, 13.997f, 13.3271f, 13.997f)
                horizontalLineTo(2.6631f)
                curveTo(2.4863f, 13.997f, 2.3168f, 13.9268f, 2.1918f, 13.8018f)
                curveTo(2.0668f, 13.6768f, 1.9966f, 13.5073f, 1.9966f, 13.3305f)
                verticalLineTo(8.665f)
                horizontalLineTo(1.3301f)
                verticalLineTo(7.332f)
                lineTo(1.9966f, 3.9995f)
                horizontalLineTo(13.9936f)
                lineTo(14.6601f, 7.332f)
                verticalLineTo(8.665f)
                horizontalLineTo(13.9936f)
                close()
                moveTo(3.3296f, 8.665f)
                verticalLineTo(12.664f)
                horizontalLineTo(12.6606f)
                verticalLineTo(8.665f)
                horizontalLineTo(3.3296f)
                close()
                moveTo(2.6897f, 7.332f)
                horizontalLineTo(13.3004f)
                lineTo(12.9005f, 5.3325f)
                horizontalLineTo(3.0896f)
                lineTo(2.6897f, 7.332f)
                close()
                moveTo(3.9961f, 9.3315f)
                horizontalLineTo(9.3281f)
                verticalLineTo(11.331f)
                horizontalLineTo(3.9961f)
                verticalLineTo(9.3315f)
                close()
                moveTo(1.9966f, 2.0f)
                horizontalLineTo(13.9936f)
                verticalLineTo(3.333f)
                horizontalLineTo(1.9966f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _store!!
    }

private var _store: ImageVector? = null
