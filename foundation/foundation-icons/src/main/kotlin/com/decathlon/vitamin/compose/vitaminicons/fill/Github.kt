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

public val FillGroup.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9999f, 1.3333f)
                curveTo(4.3166f, 1.3333f, 1.3333f, 4.3167f, 1.3333f, 8.0f)
                curveTo(1.3325f, 9.3995f, 1.7725f, 10.7637f, 2.5907f, 11.8991f)
                curveTo(3.409f, 13.0345f, 4.564f, 13.8834f, 5.8919f, 14.3253f)
                curveTo(6.2252f, 14.3833f, 6.3499f, 14.1833f, 6.3499f, 14.008f)
                curveTo(6.3499f, 13.85f, 6.3412f, 13.3253f, 6.3412f, 12.7667f)
                curveTo(4.6666f, 13.0753f, 4.2333f, 12.3587f, 4.0999f, 11.9833f)
                curveTo(4.0246f, 11.7913f, 3.6999f, 11.2f, 3.4166f, 11.0413f)
                curveTo(3.1832f, 10.9167f, 2.8499f, 10.608f, 3.4079f, 10.6f)
                curveTo(3.9332f, 10.5913f, 4.3079f, 11.0833f, 4.4332f, 11.2833f)
                curveTo(5.0332f, 12.2913f, 5.9919f, 12.008f, 6.3746f, 11.8333f)
                curveTo(6.4332f, 11.4f, 6.6079f, 11.1087f, 6.7999f, 10.942f)
                curveTo(5.3166f, 10.7753f, 3.7666f, 10.2f, 3.7666f, 7.65f)
                curveTo(3.7666f, 6.9247f, 4.0246f, 6.3253f, 4.4499f, 5.858f)
                curveTo(4.3833f, 5.6913f, 4.1499f, 5.008f, 4.5166f, 4.0913f)
                curveTo(4.5166f, 4.0913f, 5.0746f, 3.9167f, 6.3499f, 4.7753f)
                curveTo(6.8926f, 4.6247f, 7.4534f, 4.5489f, 8.0166f, 4.55f)
                curveTo(8.5833f, 4.55f, 9.1499f, 4.6247f, 9.6833f, 4.7747f)
                curveTo(10.9579f, 3.908f, 11.5166f, 4.092f, 11.5166f, 4.092f)
                curveTo(11.8833f, 5.0087f, 11.6499f, 5.692f, 11.5833f, 5.8587f)
                curveTo(12.0079f, 6.3253f, 12.2666f, 6.9167f, 12.2666f, 7.65f)
                curveTo(12.2666f, 10.2087f, 10.7086f, 10.7753f, 9.2253f, 10.942f)
                curveTo(9.4666f, 11.15f, 9.6753f, 11.55f, 9.6753f, 12.1753f)
                curveTo(9.6753f, 13.0667f, 9.6666f, 13.7833f, 9.6666f, 14.0087f)
                curveTo(9.6666f, 14.1833f, 9.7919f, 14.3913f, 10.1253f, 14.3247f)
                curveTo(11.4486f, 13.8779f, 12.5985f, 13.0273f, 13.4132f, 11.8928f)
                curveTo(14.2278f, 10.7582f, 14.6662f, 9.3968f, 14.6666f, 8.0f)
                curveTo(14.6666f, 4.3167f, 11.6833f, 1.3333f, 7.9999f, 1.3333f)
                close()
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
