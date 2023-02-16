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

public val LineGroup.Suitcase: ImageVector
    get() {
        if (_suitcase != null) {
            return _suitcase!!
        }
        _suitcase = Builder(name = "Suitcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9946f, 2.0f)
                curveTo(10.3625f, 2.0f, 10.6611f, 2.2986f, 10.6611f, 2.6665f)
                verticalLineTo(3.9995f)
                horizontalLineTo(13.9936f)
                curveTo(14.3615f, 3.9995f, 14.6601f, 4.2981f, 14.6601f, 4.666f)
                verticalLineTo(13.3305f)
                curveTo(14.6601f, 13.6984f, 14.3615f, 13.997f, 13.9936f, 13.997f)
                horizontalLineTo(1.9966f)
                curveTo(1.6287f, 13.997f, 1.3301f, 13.6984f, 1.3301f, 13.3305f)
                verticalLineTo(4.666f)
                curveTo(1.3301f, 4.2981f, 1.6287f, 3.9995f, 1.9966f, 3.9995f)
                horizontalLineTo(5.3291f)
                verticalLineTo(2.6665f)
                curveTo(5.3291f, 2.2986f, 5.6277f, 2.0f, 5.9956f, 2.0f)
                horizontalLineTo(9.9946f)
                close()
                moveTo(10.6611f, 5.3325f)
                horizontalLineTo(5.3291f)
                verticalLineTo(12.664f)
                horizontalLineTo(10.6611f)
                verticalLineTo(5.3325f)
                close()
                moveTo(2.6631f, 5.3325f)
                verticalLineTo(12.664f)
                horizontalLineTo(3.9961f)
                verticalLineTo(5.3325f)
                horizontalLineTo(2.6631f)
                close()
                moveTo(9.3281f, 3.333f)
                horizontalLineTo(6.6621f)
                verticalLineTo(3.9995f)
                horizontalLineTo(9.3281f)
                verticalLineTo(3.333f)
                close()
                moveTo(11.9941f, 5.3325f)
                verticalLineTo(12.664f)
                horizontalLineTo(13.3271f)
                verticalLineTo(5.3325f)
                horizontalLineTo(11.9941f)
                close()
            }
        }
        .build()
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
