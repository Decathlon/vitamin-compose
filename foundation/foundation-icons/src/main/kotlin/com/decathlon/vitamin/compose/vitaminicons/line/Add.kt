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

public val LineGroup.Add: ImageVector
    get() {
        if (_add != null) {
            return _add!!
        }
        _add = Builder(name = "Add", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3333f, 7.3333f)
                verticalLineTo(3.3333f)
                horizontalLineTo(8.6666f)
                verticalLineTo(7.3333f)
                horizontalLineTo(12.6666f)
                verticalLineTo(8.6666f)
                horizontalLineTo(8.6666f)
                verticalLineTo(12.6666f)
                horizontalLineTo(7.3333f)
                verticalLineTo(8.6666f)
                horizontalLineTo(3.3333f)
                verticalLineTo(7.3333f)
                horizontalLineTo(7.3333f)
                close()
            }
        }
        .build()
        return _add!!
    }

private var _add: ImageVector? = null
