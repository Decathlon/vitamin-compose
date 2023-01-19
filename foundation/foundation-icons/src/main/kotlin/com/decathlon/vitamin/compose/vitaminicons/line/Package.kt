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

public val LineGroup.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(name = "Package", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9966f, 1.33f)
                curveTo(1.63f, 1.33f, 1.3301f, 1.6299f, 1.3301f, 1.9965f)
                verticalLineTo(13.9935f)
                curveTo(1.3301f, 14.3601f, 1.63f, 14.66f, 1.9966f, 14.66f)
                horizontalLineTo(13.9936f)
                curveTo(14.3602f, 14.66f, 14.6601f, 14.3601f, 14.6601f, 13.9935f)
                verticalLineTo(1.9965f)
                curveTo(14.6601f, 1.6299f, 14.3602f, 1.33f, 13.9936f, 1.33f)
                horizontalLineTo(1.9966f)
                close()
                moveTo(5.3291f, 2.663f)
                verticalLineTo(7.3285f)
                curveTo(5.3291f, 7.6951f, 5.629f, 7.995f, 5.9956f, 7.995f)
                horizontalLineTo(9.9946f)
                curveTo(10.3612f, 7.995f, 10.6611f, 7.6951f, 10.6611f, 7.3285f)
                verticalLineTo(2.663f)
                horizontalLineTo(13.3271f)
                verticalLineTo(13.327f)
                horizontalLineTo(2.6631f)
                verticalLineTo(2.663f)
                horizontalLineTo(5.3291f)
                close()
                moveTo(9.3281f, 2.663f)
                verticalLineTo(6.662f)
                horizontalLineTo(6.6621f)
                verticalLineTo(2.663f)
                horizontalLineTo(9.3281f)
                close()
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
