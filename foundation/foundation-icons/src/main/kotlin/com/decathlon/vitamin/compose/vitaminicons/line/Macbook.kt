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

public val LineGroup.Macbook: ImageVector
    get() {
        if (_macbook != null) {
            return _macbook!!
        }
        _macbook = Builder(name = "Macbook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3333f, 2.6713f)
                curveTo(1.3333f, 2.3007f, 1.6367f, 2.0f, 1.9947f, 2.0f)
                horizontalLineTo(14.0054f)
                curveTo(14.3707f, 2.0f, 14.6667f, 2.2993f, 14.6667f, 2.6713f)
                verticalLineTo(12.0f)
                horizontalLineTo(1.3333f)
                verticalLineTo(2.6713f)
                close()
                moveTo(2.6667f, 3.3333f)
                verticalLineTo(10.6667f)
                horizontalLineTo(13.3334f)
                verticalLineTo(3.3333f)
                horizontalLineTo(2.6667f)
                close()
                moveTo(15.3334f, 12.6667f)
                horizontalLineTo(0.6667f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.3334f)
                verticalLineTo(12.6667f)
                close()
            }
        }
        .build()
        return _macbook!!
    }

private var _macbook: ImageVector? = null
