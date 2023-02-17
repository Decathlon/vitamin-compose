package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Return: ImageVector
    get() {
        if (_return != null) {
            return _return!!
        }
        _return = Builder(name = "Return", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2929f, 5.2929f)
                lineTo(6.5858f, 9.0f)
                lineTo(10.2929f, 12.7071f)
                lineTo(11.7071f, 11.2929f)
                lineTo(10.4142f, 10.0f)
                horizontalLineTo(13.0f)
                curveTo(13.7847f, 10.0f, 14.5372f, 10.2645f, 15.0814f, 10.7539f)
                curveTo(15.6079f, 11.2273f, 16.0f, 11.9638f, 16.0f, 13.0513f)
                curveTo(16.0f, 14.1361f, 15.6106f, 14.8394f, 15.0958f, 15.2847f)
                curveTo(14.5587f, 15.7493f, 13.8044f, 16.0f, 13.0f, 16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1956f, 18.0f, 15.4413f, 17.6302f, 16.4042f, 16.7974f)
                curveTo(17.3894f, 15.9452f, 18.0f, 14.6742f, 18.0f, 13.0513f)
                curveTo(18.0f, 11.4311f, 17.3921f, 10.1419f, 16.4186f, 9.2667f)
                curveTo(15.4628f, 8.4073f, 14.2153f, 8.0f, 13.0f, 8.0f)
                horizontalLineTo(10.4142f)
                lineTo(11.7071f, 6.7071f)
                lineTo(10.2929f, 5.2929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                curveTo(2.0f, 2.4477f, 2.4477f, 2.0f, 3.0f, 2.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 2.0f, 22.0f, 2.4477f, 22.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 22.0f, 2.0f, 21.5523f, 2.0f, 21.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _return!!
    }

private var _return: ImageVector? = null
