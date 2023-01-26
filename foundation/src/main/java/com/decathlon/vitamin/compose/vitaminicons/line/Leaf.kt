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

public val LineGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 14.627f, 15.627f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(5.243f)
                curveTo(5.08f, 19.912f, 5.0f, 20.907f, 5.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 20.637f, 3.116f, 19.4f, 3.346f, 18.268f)
                curveTo(3.116f, 16.974f, 3.0f, 15.218f, 3.0f, 13.0f)
                curveTo(3.0f, 7.477f, 7.477f, 3.0f, 13.0f, 3.0f)
                curveTo(15.0f, 3.0f, 17.0f, 4.0f, 21.0f, 3.0f)
                close()
                moveTo(13.0f, 5.0f)
                curveTo(8.582f, 5.0f, 5.0f, 8.582f, 5.0f, 13.0f)
                curveTo(5.0f, 13.362f, 5.003f, 13.711f, 5.01f, 14.046f)
                curveTo(6.264f, 12.068f, 8.101f, 10.505f, 10.504f, 9.132f)
                lineTo(11.496f, 10.868f)
                curveTo(8.641f, 12.5f, 6.747f, 14.354f, 5.776f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(15.015f, 17.0f, 18.871f, 13.027f, 18.997f, 5.388f)
                curveTo(17.625f, 5.521f, 16.35f, 5.436f, 14.777f, 5.2f)
                curveTo(13.627f, 5.027f, 13.401f, 5.0f, 13.0f, 5.0f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
