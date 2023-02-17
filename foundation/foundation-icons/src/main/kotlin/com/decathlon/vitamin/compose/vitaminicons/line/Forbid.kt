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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(14.1217f, 20.0f, 16.1566f, 19.1571f, 17.6569f, 17.6569f)
                curveTo(19.1571f, 16.1566f, 20.0f, 14.1217f, 20.0f, 12.0f)
                curveTo(20.0f, 9.8783f, 19.1571f, 7.8434f, 17.6569f, 6.3432f)
                curveTo(16.1566f, 4.8429f, 14.1217f, 4.0f, 12.0f, 4.0f)
                curveTo(9.8783f, 4.0f, 7.8434f, 4.8429f, 6.3432f, 6.3432f)
                curveTo(4.8429f, 7.8434f, 4.0f, 9.8783f, 4.0f, 12.0f)
                curveTo(4.0f, 14.1217f, 4.8429f, 16.1566f, 6.3432f, 17.6569f)
                curveTo(7.8434f, 19.1571f, 9.8783f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(8.523f, 7.109f)
                lineTo(16.891f, 15.477f)
                curveTo(16.5015f, 16.0236f, 16.0236f, 16.5015f, 15.477f, 16.891f)
                lineTo(7.109f, 8.523f)
                curveTo(7.4986f, 7.9767f, 7.9765f, 7.4992f, 8.523f, 7.11f)
                verticalLineTo(7.109f)
                close()
            }
        }
        .build()
        return _forbid!!
    }

private var _forbid: ImageVector? = null
