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

public val LineGroup.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(name = "PlayCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                close()
                moveTo(8.0f, 13.3333f)
                curveTo(10.9456f, 13.3333f, 13.3334f, 10.9455f, 13.3334f, 8.0f)
                curveTo(13.3334f, 5.0545f, 10.9456f, 2.6667f, 8.0f, 2.6667f)
                curveTo(5.0545f, 2.6667f, 2.6667f, 5.0545f, 2.6667f, 8.0f)
                curveTo(2.6667f, 10.9455f, 5.0545f, 13.3333f, 8.0f, 13.3333f)
                close()
                moveTo(10.334f, 7.778f)
                lineTo(7.0814f, 5.61f)
                curveTo(6.9996f, 5.5554f, 6.8945f, 5.5503f, 6.8078f, 5.5965f)
                curveTo(6.7211f, 5.6428f, 6.6669f, 5.733f, 6.6667f, 5.8313f)
                verticalLineTo(10.1686f)
                curveTo(6.667f, 10.2667f, 6.7212f, 10.3566f, 6.8077f, 10.4029f)
                curveTo(6.8941f, 10.4491f, 6.999f, 10.4441f, 7.0807f, 10.39f)
                lineTo(10.334f, 8.222f)
                curveTo(10.4083f, 8.1725f, 10.453f, 8.0892f, 10.453f, 8.0f)
                curveTo(10.453f, 7.9107f, 10.4083f, 7.8274f, 10.334f, 7.778f)
                close()
            }
        }
        .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
