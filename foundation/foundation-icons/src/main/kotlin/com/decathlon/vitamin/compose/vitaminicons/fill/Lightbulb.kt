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

public val FillGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 18.0f)
                horizontalLineTo(7.941f)
                curveTo(7.644f, 16.727f, 6.304f, 15.686f, 5.754f, 15.0f)
                curveTo(4.8122f, 13.8233f, 4.2219f, 12.4044f, 4.0512f, 10.9069f)
                curveTo(3.8805f, 9.4094f, 4.1364f, 7.8942f, 4.7892f, 6.5357f)
                curveTo(5.4421f, 5.1772f, 6.4654f, 4.0308f, 7.7413f, 3.2286f)
                curveTo(9.0172f, 2.4263f, 10.4938f, 2.0007f, 12.001f, 2.001f)
                curveTo(13.5082f, 2.0012f, 14.9847f, 2.4272f, 16.2604f, 3.2299f)
                curveTo(17.536f, 4.0326f, 18.559f, 5.1793f, 19.2114f, 6.538f)
                curveTo(19.8638f, 7.8967f, 20.1192f, 9.412f, 19.948f, 10.9095f)
                curveTo(19.7768f, 12.4069f, 19.1861f, 13.8256f, 18.244f, 15.002f)
                curveTo(17.694f, 15.687f, 16.356f, 16.728f, 16.059f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(16.0f, 20.0f)
                verticalLineTo(21.0f)
                curveTo(16.0f, 21.5304f, 15.7892f, 22.0391f, 15.4142f, 22.4142f)
                curveTo(15.0391f, 22.7893f, 14.5304f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4695f, 23.0f, 8.9608f, 22.7893f, 8.5857f, 22.4142f)
                curveTo(8.2107f, 22.0391f, 8.0f, 21.5304f, 8.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
