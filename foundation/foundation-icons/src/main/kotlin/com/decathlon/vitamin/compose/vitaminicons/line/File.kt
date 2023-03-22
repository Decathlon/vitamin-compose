package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 20.993f)
                verticalLineTo(8.0f)
                lineTo(14.997f, 2.0f)
                horizontalLineTo(4.002f)
                curveTo(3.449f, 2.0f, 3.0f, 2.455f, 3.0f, 2.992f)
                verticalLineTo(21.008f)
                curveTo(3.0006f, 21.556f, 3.445f, 22.0f, 3.993f, 22.0f)
                horizontalLineTo(20.007f)
                curveTo(20.2722f, 21.9981f, 20.5258f, 21.891f, 20.7121f, 21.7022f)
                curveTo(20.8983f, 21.5133f, 21.0019f, 21.2582f, 21.0f, 20.993f)
                close()
                moveTo(14.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
