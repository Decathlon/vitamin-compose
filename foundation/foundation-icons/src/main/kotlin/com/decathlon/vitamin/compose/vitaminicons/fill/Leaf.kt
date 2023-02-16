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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                verticalLineTo(3.3333f)
                curveTo(14.0f, 9.7513f, 10.418f, 12.6667f, 6.0f, 12.6667f)
                horizontalLineTo(4.732f)
                curveTo(4.8733f, 10.6587f, 5.4987f, 9.4433f, 7.1307f, 7.9993f)
                curveTo(7.9333f, 7.2893f, 7.8653f, 6.8793f, 7.47f, 7.1147f)
                curveTo(4.7473f, 8.7347f, 3.3953f, 10.924f, 3.3353f, 14.42f)
                lineTo(3.3333f, 14.6667f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 13.758f, 2.0773f, 12.9333f, 2.2307f, 12.1787f)
                curveTo(2.0773f, 11.316f, 2.0f, 10.1453f, 2.0f, 8.6667f)
                curveTo(2.0f, 4.9847f, 4.9847f, 2.0f, 8.6667f, 2.0f)
                curveTo(10.0f, 2.0f, 11.3333f, 2.6667f, 14.0f, 2.0f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
