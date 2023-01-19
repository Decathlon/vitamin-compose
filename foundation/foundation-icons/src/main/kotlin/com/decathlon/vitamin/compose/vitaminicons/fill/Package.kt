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

public val FillGroup.Package: ImageVector
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
                curveTo(1.6285f, 1.33f, 1.3301f, 1.6284f, 1.3301f, 1.9965f)
                verticalLineTo(13.9935f)
                curveTo(1.3301f, 14.3616f, 1.6285f, 14.66f, 1.9966f, 14.66f)
                horizontalLineTo(13.9936f)
                curveTo(14.3617f, 14.66f, 14.6601f, 14.3616f, 14.6601f, 13.9935f)
                verticalLineTo(1.9965f)
                curveTo(14.6601f, 1.6284f, 14.3617f, 1.33f, 13.9936f, 1.33f)
                horizontalLineTo(1.9966f)
                close()
                moveTo(10.6611f, 7.3285f)
                curveTo(10.6611f, 7.6966f, 10.3627f, 7.995f, 9.9946f, 7.995f)
                horizontalLineTo(5.9956f)
                curveTo(5.6275f, 7.995f, 5.3291f, 7.6966f, 5.3291f, 7.3285f)
                verticalLineTo(2.663f)
                horizontalLineTo(6.6621f)
                verticalLineTo(6.662f)
                horizontalLineTo(9.3281f)
                verticalLineTo(2.663f)
                horizontalLineTo(10.6611f)
                verticalLineTo(7.3285f)
                close()
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
