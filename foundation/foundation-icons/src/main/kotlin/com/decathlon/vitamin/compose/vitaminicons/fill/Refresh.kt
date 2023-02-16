package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Refresh: ImageVector
    get() {
        if (_refresh != null) {
            return _refresh!!
        }
        _refresh = Builder(name = "Refresh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.4725f, 4.9448f)
                curveTo(5.3281f, 3.9577f, 6.5912f, 3.3333f, 8.0001f, 3.3333f)
                curveTo(10.5774f, 3.3333f, 12.6667f, 5.4227f, 12.6667f, 8.0f)
                lineTo(11.3334f, 8.0f)
                lineTo(13.3334f, 12.0f)
                lineTo(15.3334f, 8.0f)
                lineTo(14.0001f, 8.0f)
                curveTo(14.0001f, 4.6863f, 11.3138f, 2.0f, 8.0001f, 2.0f)
                curveTo(6.3842f, 2.0f, 4.9176f, 2.6387f, 3.8388f, 3.6775f)
                lineTo(4.4725f, 4.9448f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0001f, 12.6667f)
                curveTo(9.409f, 12.6667f, 10.672f, 12.0423f, 11.5277f, 11.0552f)
                lineTo(12.1613f, 12.3225f)
                curveTo(11.0826f, 13.3613f, 9.6159f, 14.0f, 8.0001f, 14.0f)
                curveTo(4.6864f, 14.0f, 2.0001f, 11.3137f, 2.0001f, 8.0f)
                lineTo(0.6667f, 8.0f)
                lineTo(2.6667f, 4.0f)
                lineTo(4.6667f, 8.0f)
                lineTo(3.3334f, 8.0f)
                curveTo(3.3334f, 10.5773f, 5.4227f, 12.6667f, 8.0001f, 12.6667f)
                close()
            }
        }
        .build()
        return _refresh!!
    }

private var _refresh: ImageVector? = null
