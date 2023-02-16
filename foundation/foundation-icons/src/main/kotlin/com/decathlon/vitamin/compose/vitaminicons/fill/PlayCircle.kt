package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = Builder(name = "PlayCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3333f, 8.0f)
                curveTo(1.3333f, 11.682f, 4.3179f, 14.6666f, 7.9999f, 14.6666f)
                curveTo(11.6819f, 14.6666f, 14.6666f, 11.682f, 14.6666f, 8.0f)
                curveTo(14.6666f, 4.318f, 11.6819f, 1.3333f, 7.9999f, 1.3333f)
                curveTo(4.3179f, 1.3333f, 1.3333f, 4.318f, 1.3333f, 8.0f)
                close()
                moveTo(6.8077f, 5.5965f)
                curveTo(6.8944f, 5.5503f, 6.9995f, 5.5554f, 7.0813f, 5.61f)
                lineTo(10.3339f, 7.778f)
                curveTo(10.4082f, 7.8274f, 10.4528f, 7.9107f, 10.4528f, 8.0f)
                curveTo(10.4528f, 8.0892f, 10.4082f, 8.1725f, 10.3339f, 8.222f)
                lineTo(7.0813f, 10.39f)
                curveTo(6.9995f, 10.4445f, 6.8944f, 10.4497f, 6.8077f, 10.4034f)
                curveTo(6.721f, 10.3571f, 6.6668f, 10.2669f, 6.6666f, 10.1686f)
                verticalLineTo(5.8313f)
                curveTo(6.6668f, 5.733f, 6.721f, 5.6428f, 6.8077f, 5.5965f)
                close()
            }
        }
        .build()
        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
