package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Leaf: ImageVector
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
                horizontalLineTo(7.098f)
                curveTo(7.31f, 15.988f, 8.248f, 14.165f, 10.696f, 11.999f)
                curveTo(11.9f, 10.934f, 11.798f, 10.319f, 11.205f, 10.672f)
                curveTo(7.121f, 13.102f, 5.093f, 16.386f, 5.003f, 21.63f)
                lineTo(5.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 20.637f, 3.116f, 19.4f, 3.346f, 18.268f)
                curveTo(3.116f, 16.974f, 3.0f, 15.218f, 3.0f, 13.0f)
                curveTo(3.0f, 7.477f, 7.477f, 3.0f, 13.0f, 3.0f)
                curveTo(15.0f, 3.0f, 17.0f, 4.0f, 21.0f, 3.0f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
