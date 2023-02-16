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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                verticalLineTo(3.3333f)
                curveTo(14.0f, 9.7513f, 10.418f, 12.6667f, 6.0f, 12.6667f)
                horizontalLineTo(3.4953f)
                curveTo(3.3867f, 13.2747f, 3.3333f, 13.938f, 3.3333f, 14.6667f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 13.758f, 2.0773f, 12.9333f, 2.2307f, 12.1787f)
                curveTo(2.0773f, 11.316f, 2.0f, 10.1453f, 2.0f, 8.6667f)
                curveTo(2.0f, 4.9847f, 4.9847f, 2.0f, 8.6667f, 2.0f)
                curveTo(10.0f, 2.0f, 11.3333f, 2.6667f, 14.0f, 2.0f)
                close()
                moveTo(8.6667f, 3.3333f)
                curveTo(5.7213f, 3.3333f, 3.3333f, 5.7213f, 3.3333f, 8.6667f)
                curveTo(3.3333f, 8.908f, 3.3353f, 9.1407f, 3.34f, 9.364f)
                curveTo(4.176f, 8.0453f, 5.4007f, 7.0033f, 7.0027f, 6.088f)
                lineTo(7.664f, 7.2453f)
                curveTo(5.7607f, 8.3333f, 4.498f, 9.5693f, 3.8507f, 11.3333f)
                horizontalLineTo(6.0f)
                curveTo(10.01f, 11.3333f, 12.5807f, 8.6847f, 12.6647f, 3.592f)
                curveTo(11.75f, 3.6807f, 10.9f, 3.624f, 9.8513f, 3.4667f)
                curveTo(9.0847f, 3.3513f, 8.934f, 3.3333f, 8.6667f, 3.3333f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
