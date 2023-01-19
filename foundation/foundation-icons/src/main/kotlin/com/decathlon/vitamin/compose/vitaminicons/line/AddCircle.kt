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

public val LineGroup.AddCircle: ImageVector
    get() {
        if (_addCircle != null) {
            return _addCircle!!
        }
        _addCircle = Builder(name = "AddCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3286f, 7.3285f)
                verticalLineTo(4.6625f)
                horizontalLineTo(8.6616f)
                verticalLineTo(7.3285f)
                horizontalLineTo(11.3276f)
                verticalLineTo(8.6615f)
                horizontalLineTo(8.6616f)
                verticalLineTo(11.3275f)
                horizontalLineTo(7.3286f)
                verticalLineTo(8.6615f)
                horizontalLineTo(4.6626f)
                verticalLineTo(7.3285f)
                horizontalLineTo(7.3286f)
                close()
                moveTo(7.9951f, 14.66f)
                curveTo(4.314f, 14.66f, 1.3301f, 11.6761f, 1.3301f, 7.995f)
                curveTo(1.3301f, 4.3139f, 4.314f, 1.33f, 7.9951f, 1.33f)
                curveTo(11.6762f, 1.33f, 14.6601f, 4.3139f, 14.6601f, 7.995f)
                curveTo(14.6601f, 11.6761f, 11.6762f, 14.66f, 7.9951f, 14.66f)
                close()
                moveTo(7.9951f, 13.327f)
                curveTo(9.4092f, 13.327f, 10.7654f, 12.7653f, 11.7654f, 11.7653f)
                curveTo(12.7653f, 10.7654f, 13.3271f, 9.4092f, 13.3271f, 7.995f)
                curveTo(13.3271f, 6.5809f, 12.7653f, 5.2247f, 11.7654f, 4.2247f)
                curveTo(10.7654f, 3.2248f, 9.4092f, 2.663f, 7.9951f, 2.663f)
                curveTo(6.5809f, 2.663f, 5.2247f, 3.2248f, 4.2248f, 4.2247f)
                curveTo(3.2248f, 5.2247f, 2.6631f, 6.5809f, 2.6631f, 7.995f)
                curveTo(2.6631f, 9.4092f, 3.2248f, 10.7654f, 4.2248f, 11.7653f)
                curveTo(5.2247f, 12.7653f, 6.5809f, 13.327f, 7.9951f, 13.327f)
                close()
            }
        }
        .build()
        return _addCircle!!
    }

private var _addCircle: ImageVector? = null
