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

public val FillGroup.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9999f, 14.6667f)
                curveTo(4.3179f, 14.6667f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 4.318f, 4.3179f, 1.3333f, 7.9999f, 1.3333f)
                curveTo(11.6819f, 1.3333f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 11.682f, 11.6819f, 14.6667f, 7.9999f, 14.6667f)
                close()
                moveTo(5.9266f, 8.78f)
                lineTo(5.9352f, 8.7753f)
                lineTo(6.5153f, 10.6887f)
                curveTo(6.5899f, 10.896f, 6.6926f, 10.9333f, 6.8172f, 10.916f)
                curveTo(6.9426f, 10.8993f, 7.0086f, 10.832f, 7.0906f, 10.7533f)
                lineTo(7.8826f, 9.988f)
                lineTo(9.5826f, 11.2467f)
                curveTo(9.8933f, 11.418f, 10.1166f, 11.3293f, 10.1939f, 10.9587f)
                lineTo(11.2986f, 5.744f)
                curveTo(11.4206f, 5.2587f, 11.2073f, 5.064f, 10.8306f, 5.2187f)
                lineTo(4.3419f, 7.7253f)
                curveTo(3.8993f, 7.9027f, 3.9019f, 8.1507f, 4.2619f, 8.2607f)
                lineTo(5.9266f, 8.7807f)
                verticalLineTo(8.78f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null
