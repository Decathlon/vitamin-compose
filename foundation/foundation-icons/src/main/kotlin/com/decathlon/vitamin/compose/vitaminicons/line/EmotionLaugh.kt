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

public val LineGroup.EmotionLaugh: ImageVector
    get() {
        if (_emotionLaugh != null) {
            return _emotionLaugh!!
        }
        _emotionLaugh = Builder(name = "EmotionLaugh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(15.667f, 11.333f, 14.0f, 11.0f, 12.0f, 11.0f)
                curveTo(10.0f, 11.0f, 8.333f, 11.333f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
                curveTo(14.7614f, 17.0f, 17.0f, 14.7614f, 17.0f, 12.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(9.6882f, 6.9998f, 10.7124f, 7.8358f, 10.95f, 9.0f)
                horizontalLineTo(6.05f)
                curveTo(6.2876f, 7.8358f, 7.3118f, 6.9998f, 8.5f, 7.0f)
                close()
                moveTo(17.95f, 9.0f)
                curveTo(17.7124f, 7.8358f, 16.6882f, 6.9998f, 15.5f, 7.0f)
                curveTo(14.3118f, 6.9998f, 13.2876f, 7.8358f, 13.05f, 9.0f)
                horizontalLineTo(17.95f)
                close()
            }
        }
        .build()
        return _emotionLaugh!!
    }

private var _emotionLaugh: ImageVector? = null
