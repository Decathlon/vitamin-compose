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

public val FillGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0001f, 15.3333f)
                curveTo(6.9982f, 15.3332f, 6.0194f, 15.0322f, 5.1907f, 14.4691f)
                curveTo(4.3619f, 13.9061f, 3.7215f, 13.1071f, 3.3523f, 12.1757f)
                curveTo(2.9831f, 11.2443f, 2.9023f, 10.2235f, 3.1202f, 9.2456f)
                curveTo(3.3382f, 8.2676f, 3.8449f, 7.3778f, 4.5747f, 6.6913f)
                curveTo(5.4694f, 5.8493f, 7.6667f, 4.3333f, 7.3334f, 1.0f)
                curveTo(11.3334f, 3.6667f, 13.3334f, 6.3333f, 9.3334f, 10.3333f)
                curveTo(10.0001f, 10.3333f, 11.0001f, 10.3333f, 12.6667f, 8.6867f)
                curveTo(12.8467f, 9.202f, 13.0001f, 9.756f, 13.0001f, 10.3333f)
                curveTo(13.0001f, 11.6594f, 12.4733f, 12.9312f, 11.5356f, 13.8689f)
                curveTo(10.5979f, 14.8065f, 9.3261f, 15.3333f, 8.0001f, 15.3333f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
