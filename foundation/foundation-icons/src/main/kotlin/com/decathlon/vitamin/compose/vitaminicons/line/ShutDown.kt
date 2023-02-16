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

public val LineGroup.ShutDown: ImageVector
    get() {
        if (_shutDown != null) {
            return _shutDown!!
        }
        _shutDown = Builder(name = "ShutDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.3333f, 1.3333f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.6666f)
                verticalLineTo(1.3333f)
                horizontalLineTo(7.3333f)
                close()
                moveTo(4.9413f, 3.6307f)
                lineTo(4.1767f, 2.538f)
                curveTo(2.3934f, 3.7847f, 1.3318f, 5.8241f, 1.3333f, 8.0f)
                curveTo(1.3333f, 11.682f, 4.318f, 14.6667f, 8.0f, 14.6667f)
                curveTo(11.682f, 14.6667f, 14.6666f, 11.682f, 14.6666f, 8.0f)
                curveTo(14.6682f, 5.8241f, 13.6066f, 3.7847f, 11.8233f, 2.538f)
                lineTo(11.0586f, 3.6307f)
                curveTo(12.9656f, 4.9657f, 13.7864f, 7.3832f, 13.0865f, 9.6033f)
                curveTo(12.3867f, 11.8234f, 10.3278f, 13.3331f, 8.0f, 13.3331f)
                curveTo(5.6722f, 13.3331f, 3.6133f, 11.8234f, 2.9134f, 9.6033f)
                curveTo(2.2135f, 7.3832f, 3.0344f, 4.9657f, 4.9413f, 3.6307f)
                close()
            }
        }
        .build()
        return _shutDown!!
    }

private var _shutDown: ImageVector? = null
