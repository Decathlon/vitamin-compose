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

public val LineGroup.ErrorWarning: ImageVector
    get() {
        if (_errorWarning != null) {
            return _errorWarning!!
        }
        _errorWarning = Builder(name = "ErrorWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3333f, 8.0f)
                curveTo(1.3333f, 11.682f, 4.318f, 14.6666f, 8.0f, 14.6666f)
                curveTo(11.682f, 14.6666f, 14.6666f, 11.682f, 14.6666f, 8.0f)
                curveTo(14.6666f, 4.318f, 11.682f, 1.3333f, 8.0f, 1.3333f)
                curveTo(4.318f, 1.3333f, 1.3333f, 4.318f, 1.3333f, 8.0f)
                close()
                moveTo(13.3333f, 8.0f)
                curveTo(13.3333f, 10.9455f, 10.9455f, 13.3333f, 8.0f, 13.3333f)
                curveTo(5.0545f, 13.3333f, 2.6667f, 10.9455f, 2.6667f, 8.0f)
                curveTo(2.6667f, 5.0545f, 5.0545f, 2.6667f, 8.0f, 2.6667f)
                curveTo(10.9455f, 2.6667f, 13.3333f, 5.0545f, 13.3333f, 8.0f)
                close()
                moveTo(8.6666f, 10.0f)
                verticalLineTo(11.3333f)
                horizontalLineTo(7.3333f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.6666f)
                close()
                moveTo(8.6666f, 8.6666f)
                verticalLineTo(4.6666f)
                horizontalLineTo(7.3333f)
                verticalLineTo(8.6666f)
                horizontalLineTo(8.6666f)
                close()
            }
        }
        .build()
        return _errorWarning!!
    }

private var _errorWarning: ImageVector? = null
