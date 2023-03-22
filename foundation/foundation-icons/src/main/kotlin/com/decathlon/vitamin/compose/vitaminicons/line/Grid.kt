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

public val LineGroup.Grid: ImageVector
    get() {
        if (_grid != null) {
            return _grid!!
        }
        _grid = Builder(name = "Grid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(16.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(14.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(14.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(16.0f, 5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.0f, 10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(8.0f, 19.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(8.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.2652f, 3.0f, 20.5196f, 3.1054f, 20.7071f, 3.2929f)
                curveTo(20.8946f, 3.4804f, 21.0f, 3.7348f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.2652f, 20.8946f, 20.5196f, 20.7071f, 20.7071f)
                curveTo(20.5196f, 20.8946f, 20.2652f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.7348f, 21.0f, 3.4804f, 20.8946f, 3.2929f, 20.7071f)
                curveTo(3.1054f, 20.5196f, 3.0f, 20.2652f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.7348f, 3.1054f, 3.4804f, 3.2929f, 3.2929f)
                curveTo(3.4804f, 3.1054f, 3.7348f, 3.0f, 4.0f, 3.0f)
                close()
            }
        }
        .build()
        return _grid!!
    }

private var _grid: ImageVector? = null
