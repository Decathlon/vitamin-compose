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

public val LineGroup.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.3333f)
                curveTo(9.4145f, 13.3333f, 10.7711f, 12.7714f, 11.7713f, 11.7712f)
                curveTo(12.7715f, 10.7711f, 13.3334f, 9.4145f, 13.3334f, 8.0f)
                curveTo(13.3334f, 6.5855f, 12.7715f, 5.229f, 11.7713f, 4.2288f)
                curveTo(10.7711f, 3.2286f, 9.4145f, 2.6667f, 8.0f, 2.6667f)
                curveTo(6.5855f, 2.6667f, 5.229f, 3.2286f, 4.2288f, 4.2288f)
                curveTo(3.2286f, 5.229f, 2.6667f, 6.5855f, 2.6667f, 8.0f)
                curveTo(2.6667f, 9.4145f, 3.2286f, 10.7711f, 4.2288f, 11.7712f)
                curveTo(5.229f, 12.7714f, 6.5855f, 13.3333f, 8.0f, 13.3333f)
                close()
                moveTo(8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                close()
                moveTo(5.9267f, 8.78f)
                lineTo(4.2614f, 8.2607f)
                curveTo(3.9014f, 8.1507f, 3.8994f, 7.9027f, 4.342f, 7.7247f)
                lineTo(10.8307f, 5.218f)
                curveTo(11.2074f, 5.0647f, 11.4207f, 5.2587f, 11.2987f, 5.7447f)
                lineTo(10.194f, 10.958f)
                curveTo(10.1167f, 11.3293f, 9.8934f, 11.418f, 9.5834f, 11.2467f)
                lineTo(7.8827f, 9.988f)
                lineTo(7.09f, 10.7533f)
                curveTo(7.0087f, 10.832f, 6.9427f, 10.8993f, 6.8174f, 10.916f)
                curveTo(6.6927f, 10.9333f, 6.59f, 10.896f, 6.5147f, 10.6893f)
                lineTo(5.9347f, 8.7753f)
                lineTo(5.9267f, 8.7807f)
                verticalLineTo(8.78f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
