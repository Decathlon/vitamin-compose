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

public val LineGroup.Direction: ImageVector
    get() {
        if (_direction != null) {
            return _direction!!
        }
        _direction = Builder(name = "Direction", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.707f, 1.393f)
                lineTo(22.607f, 11.293f)
                curveTo(22.9974f, 11.6835f, 22.9974f, 12.3165f, 22.607f, 12.707f)
                lineTo(12.707f, 22.607f)
                curveTo(12.3165f, 22.9974f, 11.6835f, 22.9974f, 11.293f, 22.607f)
                lineTo(1.393f, 12.707f)
                curveTo(1.0026f, 12.3165f, 1.0026f, 11.6835f, 1.393f, 11.293f)
                lineTo(11.293f, 1.393f)
                curveTo(11.6835f, 1.0026f, 12.3165f, 1.0026f, 12.707f, 1.393f)
                close()
                moveTo(12.0f, 3.515f)
                lineTo(3.515f, 12.0f)
                lineTo(12.0f, 20.485f)
                lineTo(20.485f, 12.0f)
                lineTo(12.0f, 3.515f)
                close()
                moveTo(13.0f, 7.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4477f, 10.0f, 8.0f, 10.4477f, 8.0f, 11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.5f)
                lineTo(16.5f, 11.0f)
                lineTo(13.0f, 7.5f)
                close()
            }
        }
        .build()
        return _direction!!
    }

private var _direction: ImageVector? = null
