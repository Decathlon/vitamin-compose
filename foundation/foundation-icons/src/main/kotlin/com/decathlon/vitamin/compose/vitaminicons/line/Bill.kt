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

public val LineGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 22.0f, 21.0f, 21.5523f, 21.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 2.4477f, 20.5523f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 2.0f, 3.0f, 2.4477f, 3.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.5523f, 3.4477f, 22.0f, 4.0f, 22.0f)
                close()
                moveTo(19.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(16.0f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
