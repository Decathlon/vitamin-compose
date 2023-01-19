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

public val LineGroup.EmotionLaugh: ImageVector
    get() {
        if (_emotionLaugh != null) {
            return _emotionLaugh!!
        }
        _emotionLaugh = Builder(name = "EmotionLaugh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 1.3334f)
                curveTo(11.682f, 1.3334f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 4.318f, 4.318f, 1.3334f, 8.0f, 1.3334f)
                close()
                moveTo(8.0f, 2.6667f)
                curveTo(5.0545f, 2.6667f, 2.6667f, 5.0545f, 2.6667f, 8.0f)
                curveTo(2.6667f, 10.9456f, 5.0545f, 13.3334f, 8.0f, 13.3334f)
                curveTo(10.9455f, 13.3334f, 13.3333f, 10.9456f, 13.3333f, 8.0f)
                curveTo(13.3333f, 5.0545f, 10.9455f, 2.6667f, 8.0f, 2.6667f)
                close()
                moveTo(11.3333f, 8.0f)
                curveTo(10.4446f, 7.5554f, 9.3333f, 7.3334f, 8.0f, 7.3334f)
                curveTo(6.6666f, 7.3334f, 5.5553f, 7.5554f, 4.6666f, 8.0f)
                curveTo(4.6666f, 9.841f, 6.159f, 11.3334f, 8.0f, 11.3334f)
                curveTo(9.8409f, 11.3334f, 11.3333f, 9.841f, 11.3333f, 8.0f)
                close()
                moveTo(5.6667f, 4.6667f)
                curveTo(6.4588f, 4.6666f, 7.1416f, 5.2239f, 7.3f, 6.0f)
                horizontalLineTo(4.0334f)
                curveTo(4.1918f, 5.2239f, 4.8746f, 4.6666f, 5.6667f, 4.6667f)
                close()
                moveTo(11.9667f, 6.0f)
                curveTo(11.8083f, 5.2239f, 11.1255f, 4.6666f, 10.3334f, 4.6667f)
                curveTo(9.5413f, 4.6666f, 8.8585f, 5.2239f, 8.7001f, 6.0f)
                horizontalLineTo(11.9667f)
                close()
            }
        }
        .build()
        return _emotionLaugh!!
    }

private var _emotionLaugh: ImageVector? = null
