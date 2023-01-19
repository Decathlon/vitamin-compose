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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 13.9953f)
                verticalLineTo(5.3333f)
                lineTo(9.998f, 1.3333f)
                horizontalLineTo(2.668f)
                curveTo(2.2993f, 1.3333f, 2.0f, 1.6367f, 2.0f, 1.9947f)
                verticalLineTo(14.0053f)
                curveTo(2.0004f, 14.3707f, 2.2966f, 14.6667f, 2.662f, 14.6667f)
                horizontalLineTo(13.338f)
                curveTo(13.5148f, 14.6654f, 13.6839f, 14.594f, 13.808f, 14.4681f)
                curveTo(13.9322f, 14.3422f, 14.0012f, 14.1721f, 14.0f, 13.9953f)
                close()
                moveTo(9.3333f, 6.0f)
                horizontalLineTo(12.6667f)
                verticalLineTo(13.3333f)
                horizontalLineTo(3.3333f)
                verticalLineTo(2.6667f)
                horizontalLineTo(9.3333f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
