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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3333f, 6.6667f)
                horizontalLineTo(6.6667f)
                verticalLineTo(9.3333f)
                horizontalLineTo(9.3333f)
                verticalLineTo(6.6667f)
                close()
                moveTo(10.6667f, 6.6667f)
                verticalLineTo(9.3333f)
                horizontalLineTo(12.6667f)
                verticalLineTo(6.6667f)
                horizontalLineTo(10.6667f)
                close()
                moveTo(9.3333f, 12.6667f)
                verticalLineTo(10.6667f)
                horizontalLineTo(6.6667f)
                verticalLineTo(12.6667f)
                horizontalLineTo(9.3333f)
                close()
                moveTo(10.6667f, 12.6667f)
                horizontalLineTo(12.6667f)
                verticalLineTo(10.6667f)
                horizontalLineTo(10.6667f)
                verticalLineTo(12.6667f)
                close()
                moveTo(9.3333f, 3.3333f)
                horizontalLineTo(6.6667f)
                verticalLineTo(5.3333f)
                horizontalLineTo(9.3333f)
                verticalLineTo(3.3333f)
                close()
                moveTo(10.6667f, 3.3333f)
                verticalLineTo(5.3333f)
                horizontalLineTo(12.6667f)
                verticalLineTo(3.3333f)
                horizontalLineTo(10.6667f)
                close()
                moveTo(5.3333f, 6.6667f)
                horizontalLineTo(3.3333f)
                verticalLineTo(9.3333f)
                horizontalLineTo(5.3333f)
                verticalLineTo(6.6667f)
                close()
                moveTo(5.3333f, 12.6667f)
                verticalLineTo(10.6667f)
                horizontalLineTo(3.3333f)
                verticalLineTo(12.6667f)
                horizontalLineTo(5.3333f)
                close()
                moveTo(5.3333f, 3.3333f)
                horizontalLineTo(3.3333f)
                verticalLineTo(5.3333f)
                horizontalLineTo(5.3333f)
                verticalLineTo(3.3333f)
                close()
                moveTo(2.6667f, 2.0f)
                horizontalLineTo(13.3333f)
                curveTo(13.5101f, 2.0f, 13.6797f, 2.0702f, 13.8047f, 2.1953f)
                curveTo(13.9298f, 2.3203f, 14.0f, 2.4899f, 14.0f, 2.6667f)
                verticalLineTo(13.3333f)
                curveTo(14.0f, 13.5101f, 13.9298f, 13.6797f, 13.8047f, 13.8047f)
                curveTo(13.6797f, 13.9298f, 13.5101f, 14.0f, 13.3333f, 14.0f)
                horizontalLineTo(2.6667f)
                curveTo(2.4899f, 14.0f, 2.3203f, 13.9298f, 2.1953f, 13.8047f)
                curveTo(2.0702f, 13.6797f, 2.0f, 13.5101f, 2.0f, 13.3333f)
                verticalLineTo(2.6667f)
                curveTo(2.0f, 2.4899f, 2.0702f, 2.3203f, 2.1953f, 2.1953f)
                curveTo(2.3203f, 2.0702f, 2.4899f, 2.0f, 2.6667f, 2.0f)
                close()
            }
        }
        .build()
        return _grid!!
    }

private var _grid: ImageVector? = null
