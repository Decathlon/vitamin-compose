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

public val LineGroup.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3333f, 8.0f)
                curveTo(1.3333f, 11.682f, 4.318f, 14.6666f, 8.0f, 14.6666f)
                curveTo(11.682f, 14.6666f, 14.6666f, 11.682f, 14.6666f, 8.0f)
                curveTo(14.6666f, 4.318f, 11.682f, 1.3333f, 8.0f, 1.3333f)
                curveTo(4.318f, 1.3333f, 1.3333f, 4.318f, 1.3333f, 8.0f)
                close()
                moveTo(13.3333f, 8.0f)
                curveTo(13.3333f, 10.9455f, 10.9455f, 13.3333f, 8.0f, 13.3333f)
                curveTo(5.0545f, 13.3333f, 2.6667f, 10.9455f, 2.6667f, 8.0f)
                curveTo(2.6667f, 5.0545f, 5.0545f, 2.6667f, 8.0f, 2.6667f)
                curveTo(10.9455f, 2.6667f, 13.3333f, 5.0545f, 13.3333f, 8.0f)
                close()
                moveTo(8.6666f, 10.0f)
                verticalLineTo(11.3333f)
                horizontalLineTo(7.3333f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.6666f)
                close()
                moveTo(8.6667f, 9.3333f)
                verticalLineTo(8.9033f)
                curveTo(9.7624f, 8.5767f, 10.4603f, 7.5044f, 10.3151f, 6.3703f)
                curveTo(10.1699f, 5.2361f, 9.2246f, 4.3741f, 8.0819f, 4.334f)
                curveTo(6.9392f, 4.2939f, 5.9357f, 5.0875f, 5.7113f, 6.2087f)
                lineTo(7.0194f, 6.4707f)
                curveTo(7.1226f, 5.9541f, 7.6089f, 5.6062f, 8.1311f, 5.6753f)
                curveTo(8.6533f, 5.7444f, 9.0324f, 6.2067f, 8.9978f, 6.7323f)
                curveTo(8.9632f, 7.258f, 8.5268f, 7.6666f, 8.0f, 7.6667f)
                curveTo(7.6318f, 7.6667f, 7.3334f, 7.9651f, 7.3334f, 8.3333f)
                verticalLineTo(9.3333f)
                horizontalLineTo(8.6667f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
