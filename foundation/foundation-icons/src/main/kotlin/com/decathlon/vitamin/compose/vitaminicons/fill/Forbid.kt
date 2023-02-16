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

public val FillGroup.Forbid: ImageVector
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
                moveTo(5.6822f, 4.7394f)
                curveTo(5.318f, 4.9991f, 4.9996f, 5.3177f, 4.7402f, 5.682f)
                lineTo(10.3188f, 11.2607f)
                curveTo(10.6832f, 11.001f, 11.0018f, 10.6825f, 11.2615f, 10.318f)
                lineTo(5.6822f, 4.7394f)
                close()
            }
        }
        .build()
        return _forbid!!
    }

private var _forbid: ImageVector? = null
