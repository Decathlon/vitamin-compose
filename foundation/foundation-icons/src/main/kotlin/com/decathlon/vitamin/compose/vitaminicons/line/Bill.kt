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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.6667f, 14.6667f)
                horizontalLineTo(13.3333f)
                curveTo(13.7015f, 14.6667f, 14.0f, 14.3682f, 14.0f, 14.0f)
                verticalLineTo(2.0f)
                curveTo(14.0f, 1.6318f, 13.7015f, 1.3333f, 13.3333f, 1.3333f)
                horizontalLineTo(2.6667f)
                curveTo(2.2985f, 1.3333f, 2.0f, 1.6318f, 2.0f, 2.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 14.3682f, 2.2985f, 14.6667f, 2.6667f, 14.6667f)
                close()
                moveTo(12.6667f, 2.6667f)
                verticalLineTo(13.3333f)
                horizontalLineTo(3.3333f)
                verticalLineTo(2.6667f)
                horizontalLineTo(12.6667f)
                close()
                moveTo(5.3333f, 6.0f)
                horizontalLineTo(10.6667f)
                verticalLineTo(7.3333f)
                horizontalLineTo(5.3333f)
                verticalLineTo(6.0f)
                close()
                moveTo(10.6667f, 8.6667f)
                horizontalLineTo(5.3333f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.6667f)
                verticalLineTo(8.6667f)
                close()
            }
        }
        .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
