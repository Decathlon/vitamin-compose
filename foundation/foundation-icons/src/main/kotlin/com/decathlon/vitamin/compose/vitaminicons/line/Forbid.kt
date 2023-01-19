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

public val LineGroup.Forbid: ImageVector
    get() {
        if (_forbid != null) {
            return _forbid!!
        }
        _forbid = Builder(name = "Forbid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0002f, 14.6667f)
                curveTo(4.3182f, 14.6667f, 1.3335f, 11.682f, 1.3335f, 8.0f)
                curveTo(1.3335f, 4.318f, 4.3182f, 1.3334f, 8.0002f, 1.3334f)
                curveTo(11.6822f, 1.3334f, 14.6668f, 4.318f, 14.6668f, 8.0f)
                curveTo(14.6668f, 11.682f, 11.6822f, 14.6667f, 8.0002f, 14.6667f)
                close()
                moveTo(8.0002f, 13.3334f)
                curveTo(9.4146f, 13.3334f, 10.7712f, 12.7715f, 11.7714f, 11.7713f)
                curveTo(12.7716f, 10.7711f, 13.3335f, 9.4145f, 13.3335f, 8.0f)
                curveTo(13.3335f, 6.5855f, 12.7716f, 5.229f, 11.7714f, 4.2288f)
                curveTo(10.7712f, 3.2286f, 9.4146f, 2.6667f, 8.0002f, 2.6667f)
                curveTo(6.5857f, 2.6667f, 5.2291f, 3.2286f, 4.2289f, 4.2288f)
                curveTo(3.2287f, 5.229f, 2.6668f, 6.5855f, 2.6668f, 8.0f)
                curveTo(2.6668f, 9.4145f, 3.2287f, 10.7711f, 4.2289f, 11.7713f)
                curveTo(5.2291f, 12.7715f, 6.5857f, 13.3334f, 8.0002f, 13.3334f)
                close()
                moveTo(5.6822f, 4.7394f)
                lineTo(11.2608f, 10.318f)
                curveTo(11.0012f, 10.6825f, 10.6826f, 11.001f, 10.3182f, 11.2607f)
                lineTo(4.7395f, 5.682f)
                curveTo(4.9992f, 5.3179f, 5.3178f, 4.9995f, 5.6822f, 4.74f)
                verticalLineTo(4.7394f)
                close()
            }
        }
        .build()
        return _forbid!!
    }

private var _forbid: ImageVector? = null
