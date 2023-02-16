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

public val LineGroup.Fire: ImageVector
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
                curveTo(9.3261f, 15.3333f, 10.5979f, 14.8065f, 11.5356f, 13.8689f)
                curveTo(12.4733f, 12.9312f, 13.0001f, 11.6594f, 13.0001f, 10.3333f)
                curveTo(13.0001f, 9.756f, 12.8467f, 9.202f, 12.6667f, 8.6867f)
                curveTo(11.5554f, 9.7847f, 10.7114f, 10.3333f, 10.1334f, 10.3333f)
                curveTo(12.7967f, 5.6667f, 11.3334f, 3.6667f, 7.3334f, 1.0f)
                curveTo(7.6667f, 4.3333f, 5.4694f, 5.8493f, 4.5747f, 6.6913f)
                curveTo(3.8449f, 7.3778f, 3.3382f, 8.2676f, 3.1202f, 9.2456f)
                curveTo(2.9023f, 10.2235f, 2.9831f, 11.2443f, 3.3523f, 12.1757f)
                curveTo(3.7215f, 13.1071f, 4.3619f, 13.9061f, 5.1907f, 14.4691f)
                curveTo(6.0194f, 15.0322f, 6.9982f, 15.3332f, 8.0001f, 15.3333f)
                close()
                moveTo(8.4734f, 3.49f)
                curveTo(10.6341f, 5.3233f, 10.6447f, 6.748f, 8.9754f, 9.6727f)
                curveTo(8.4681f, 10.5613f, 9.1101f, 11.6667f, 10.1334f, 11.6667f)
                curveTo(10.5921f, 11.6667f, 11.0561f, 11.5333f, 11.5461f, 11.27f)
                curveTo(11.4008f, 11.8187f, 11.1302f, 12.3261f, 10.7555f, 12.7524f)
                curveTo(10.3808f, 13.1787f, 9.9123f, 13.5122f, 9.3868f, 13.7266f)
                curveTo(8.8613f, 13.941f, 8.2932f, 14.0305f, 7.7272f, 13.9881f)
                curveTo(7.1613f, 13.9456f, 6.6129f, 13.7724f, 6.1253f, 13.4819f)
                curveTo(5.6376f, 13.1915f, 5.2241f, 12.7919f, 4.9172f, 12.3145f)
                curveTo(4.6103f, 11.8371f, 4.4184f, 11.2949f, 4.3566f, 10.7307f)
                curveTo(4.2948f, 10.1665f, 4.3649f, 9.5957f, 4.5612f, 9.0632f)
                curveTo(4.7576f, 8.5307f, 5.0748f, 8.0511f, 5.4881f, 7.662f)
                curveTo(5.5721f, 7.5833f, 5.9981f, 7.2053f, 6.0167f, 7.1887f)
                curveTo(6.2994f, 6.9353f, 6.5321f, 6.7107f, 6.7621f, 6.4647f)
                curveTo(7.5821f, 5.586f, 8.1714f, 4.6113f, 8.4727f, 3.49f)
                horizontalLineTo(8.4734f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
