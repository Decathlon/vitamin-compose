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

public val LineGroup.EmotionNormal: ImageVector
    get() {
        if (_emotionNormal != null) {
            return _emotionNormal!!
        }
        _emotionNormal = Builder(name = "EmotionNormal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 4.318f, 4.318f, 1.3334f, 8.0f, 1.3334f)
                curveTo(11.682f, 1.3334f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                close()
                moveTo(8.0f, 13.3334f)
                curveTo(10.9455f, 13.3334f, 13.3333f, 10.9456f, 13.3333f, 8.0f)
                curveTo(13.3333f, 5.0545f, 10.9455f, 2.6667f, 8.0f, 2.6667f)
                curveTo(5.0545f, 2.6667f, 2.6667f, 5.0545f, 2.6667f, 8.0f)
                curveTo(2.6667f, 10.9456f, 5.0545f, 13.3334f, 8.0f, 13.3334f)
                close()
                moveTo(10.6666f, 10.6667f)
                verticalLineTo(9.3334f)
                horizontalLineTo(5.3333f)
                verticalLineTo(10.6667f)
                horizontalLineTo(10.6666f)
                close()
                moveTo(5.3333f, 7.3334f)
                curveTo(4.781f, 7.3334f, 4.3333f, 6.8857f, 4.3333f, 6.3334f)
                curveTo(4.3333f, 5.7811f, 4.781f, 5.3334f, 5.3333f, 5.3334f)
                curveTo(5.8856f, 5.3334f, 6.3333f, 5.7811f, 6.3333f, 6.3334f)
                curveTo(6.3333f, 6.8857f, 5.8856f, 7.3334f, 5.3333f, 7.3334f)
                close()
                moveTo(9.6666f, 6.3334f)
                curveTo(9.6666f, 6.8857f, 10.1144f, 7.3334f, 10.6666f, 7.3334f)
                curveTo(11.2189f, 7.3334f, 11.6666f, 6.8857f, 11.6666f, 6.3334f)
                curveTo(11.6666f, 5.7811f, 11.2189f, 5.3334f, 10.6666f, 5.3334f)
                curveTo(10.1144f, 5.3334f, 9.6666f, 5.7811f, 9.6666f, 6.3334f)
                close()
            }
        }
        .build()
        return _emotionNormal!!
    }

private var _emotionNormal: ImageVector? = null
