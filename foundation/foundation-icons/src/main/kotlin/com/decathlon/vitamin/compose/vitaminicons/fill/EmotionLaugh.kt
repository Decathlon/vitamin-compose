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

public val FillGroup.EmotionLaugh: ImageVector
    get() {
        if (_emotionLaugh != null) {
            return _emotionLaugh!!
        }
        _emotionLaugh = Builder(name = "EmotionLaugh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.3334f)
                curveTo(11.682f, 1.3334f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3334f, 8.0f, 1.3334f)
                close()
                moveTo(8.0f, 7.3334f)
                curveTo(6.6667f, 7.3334f, 5.5554f, 7.5554f, 4.6667f, 8.0f)
                curveTo(4.6667f, 8.8841f, 5.0179f, 9.7319f, 5.643f, 10.3571f)
                curveTo(6.2681f, 10.9822f, 7.116f, 11.3334f, 8.0f, 11.3334f)
                curveTo(8.8841f, 11.3334f, 9.7319f, 10.9822f, 10.3571f, 10.3571f)
                curveTo(10.9822f, 9.7319f, 11.3334f, 8.8841f, 11.3334f, 8.0f)
                curveTo(10.4447f, 7.5554f, 9.3334f, 7.3334f, 8.0f, 7.3334f)
                close()
                moveTo(5.6667f, 4.6667f)
                curveTo(4.8987f, 4.6667f, 4.252f, 5.1867f, 4.0587f, 5.8934f)
                lineTo(4.0334f, 6.0f)
                horizontalLineTo(7.3f)
                curveTo(7.2232f, 5.6236f, 7.0187f, 5.2852f, 6.721f, 5.0423f)
                curveTo(6.4234f, 4.7993f, 6.0509f, 4.6666f, 5.6667f, 4.6667f)
                close()
                moveTo(10.3334f, 4.6667f)
                curveTo(9.5654f, 4.6667f, 8.9187f, 5.1867f, 8.7254f, 5.8934f)
                lineTo(8.7f, 6.0f)
                horizontalLineTo(11.9667f)
                curveTo(11.8899f, 5.6236f, 11.6853f, 5.2852f, 11.3877f, 5.0423f)
                curveTo(11.09f, 4.7993f, 10.7176f, 4.6666f, 10.3334f, 4.6667f)
                close()
            }
        }
        .build()
        return _emotionLaugh!!
    }

private var _emotionLaugh: ImageVector? = null
