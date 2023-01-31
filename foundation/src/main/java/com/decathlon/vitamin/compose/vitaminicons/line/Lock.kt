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

public val LineGroup.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 9.0f, 3.0f, 9.4477f, 3.0f, 10.0f)
                verticalLineTo(22.0f)
                curveTo(3.0f, 22.5523f, 3.4477f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 23.0f, 21.0f, 22.5523f, 21.0f, 22.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 9.4477f, 20.5523f, 9.0f, 20.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 4.6863f, 15.3137f, 2.0f, 12.0f, 2.0f)
                curveTo(8.6863f, 2.0f, 6.0f, 4.6863f, 6.0f, 8.0f)
                close()
                moveTo(5.0f, 21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(11.0f, 16.732f)
                curveTo(10.2161f, 16.2794f, 9.8339f, 15.3567f, 10.0681f, 14.4823f)
                curveTo(10.3024f, 13.6079f, 11.0948f, 12.9999f, 12.0f, 12.9999f)
                curveTo(12.9052f, 12.9999f, 13.6976f, 13.6079f, 13.9319f, 14.4823f)
                curveTo(14.1661f, 15.3567f, 13.7839f, 16.2794f, 13.0f, 16.732f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.732f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                curveTo(8.0f, 5.7909f, 9.7909f, 4.0f, 12.0f, 4.0f)
                curveTo(14.2091f, 4.0f, 16.0f, 5.7909f, 16.0f, 8.0f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
