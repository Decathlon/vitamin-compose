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

public val FillGroup.Counter: ImageVector
    get() {
        if (_counter != null) {
            return _counter!!
        }
        _counter = Builder(name = "Counter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.596f, 7.404f)
                curveTo(16.392f, 7.199f, 16.07f, 7.171f, 15.833f, 7.337f)
                curveTo(12.943f, 9.365f, 11.313f, 10.567f, 10.939f, 10.939f)
                curveTo(10.354f, 11.525f, 10.354f, 12.475f, 10.939f, 13.061f)
                curveTo(11.525f, 13.646f, 12.475f, 13.646f, 13.061f, 13.061f)
                curveTo(13.28f, 12.841f, 14.479f, 11.21f, 16.659f, 8.164f)
                curveTo(16.827f, 7.93f, 16.8f, 7.608f, 16.596f, 7.404f)
                close()
                moveTo(17.5f, 11.0f)
                curveTo(16.948f, 11.0f, 16.5f, 11.448f, 16.5f, 12.0f)
                curveTo(16.5f, 12.552f, 16.948f, 13.0f, 17.5f, 13.0f)
                curveTo(18.052f, 13.0f, 18.5f, 12.552f, 18.5f, 12.0f)
                curveTo(18.5f, 11.448f, 18.052f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(6.5f, 11.0f)
                curveTo(5.948f, 11.0f, 5.5f, 11.448f, 5.5f, 12.0f)
                curveTo(5.5f, 12.552f, 5.948f, 13.0f, 6.5f, 13.0f)
                curveTo(7.052f, 13.0f, 7.5f, 12.552f, 7.5f, 12.0f)
                curveTo(7.5f, 11.448f, 7.052f, 11.0f, 6.5f, 11.0f)
                close()
                moveTo(8.818f, 7.404f)
                curveTo(8.428f, 7.014f, 7.794f, 7.014f, 7.404f, 7.404f)
                curveTo(7.014f, 7.794f, 7.014f, 8.427f, 7.404f, 8.818f)
                curveTo(7.794f, 9.208f, 8.427f, 9.208f, 8.818f, 8.818f)
                curveTo(9.208f, 8.428f, 9.208f, 7.794f, 8.818f, 7.404f)
                close()
                moveTo(12.0f, 5.5f)
                curveTo(11.448f, 5.5f, 11.0f, 5.948f, 11.0f, 6.5f)
                curveTo(11.0f, 7.052f, 11.448f, 7.5f, 12.0f, 7.5f)
                curveTo(12.552f, 7.5f, 13.0f, 7.052f, 13.0f, 6.5f)
                curveTo(13.0f, 5.948f, 12.552f, 5.5f, 12.0f, 5.5f)
                close()
            }
        }
        .build()
        return _counter!!
    }

private var _counter: ImageVector? = null
