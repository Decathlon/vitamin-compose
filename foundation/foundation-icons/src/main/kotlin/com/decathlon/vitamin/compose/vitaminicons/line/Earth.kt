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

public val LineGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.1567f, 4.302f)
                curveTo(3.3067f, 5.1842f, 2.7863f, 6.3321f, 2.683f, 7.5528f)
                curveTo(2.5797f, 8.7734f, 2.8998f, 9.9924f, 3.5895f, 11.0049f)
                curveTo(4.2791f, 12.0174f, 5.2963f, 12.7616f, 6.47f, 13.1124f)
                curveTo(7.6438f, 13.4632f, 8.9025f, 13.3993f, 10.0346f, 12.9313f)
                curveTo(10.1113f, 12.4313f, 9.9433f, 11.9513f, 9.8747f, 11.7833f)
                curveTo(9.7213f, 11.41f, 9.216f, 10.772f, 8.3727f, 9.8873f)
                curveTo(8.1473f, 9.6507f, 8.162f, 9.4686f, 8.2427f, 8.9293f)
                lineTo(8.2513f, 8.8687f)
                curveTo(8.306f, 8.4993f, 8.398f, 8.2807f, 9.6413f, 8.0833f)
                curveTo(10.2733f, 7.9833f, 10.4393f, 8.2353f, 10.6693f, 8.5853f)
                lineTo(10.7466f, 8.7f)
                curveTo(10.9653f, 9.02f, 11.1273f, 9.0933f, 11.372f, 9.204f)
                curveTo(11.482f, 9.254f, 11.6186f, 9.3173f, 11.802f, 9.4206f)
                curveTo(12.2366f, 9.6693f, 12.2366f, 9.95f, 12.2366f, 10.5646f)
                verticalLineTo(10.6346f)
                curveTo(12.2366f, 10.8953f, 12.2113f, 11.1246f, 12.1713f, 11.324f)
                curveTo(12.6829f, 10.6819f, 13.0394f, 9.9305f, 13.213f, 9.1281f)
                curveTo(13.3867f, 8.3257f, 13.3728f, 7.4941f, 13.1725f, 6.698f)
                curveTo(12.9722f, 5.9019f, 12.5909f, 5.1627f, 12.0582f, 4.5381f)
                curveTo(11.5255f, 3.9134f, 10.8558f, 3.4202f, 10.1013f, 3.0966f)
                curveTo(9.7326f, 3.3453f, 9.2267f, 3.698f, 9.05f, 3.94f)
                curveTo(8.96f, 4.0633f, 8.832f, 4.6947f, 8.4166f, 4.7467f)
                curveTo(8.3087f, 4.76f, 8.1627f, 4.7506f, 8.008f, 4.7407f)
                curveTo(7.5933f, 4.714f, 7.0266f, 4.6773f, 6.8453f, 5.17f)
                curveTo(6.73f, 5.482f, 6.71f, 6.33f, 7.0827f, 6.77f)
                curveTo(7.1427f, 6.84f, 7.154f, 6.97f, 7.1133f, 7.116f)
                curveTo(7.06f, 7.3073f, 6.9527f, 7.424f, 6.9187f, 7.448f)
                curveTo(6.8547f, 7.4106f, 6.7267f, 7.262f, 6.6393f, 7.1613f)
                curveTo(6.4307f, 6.918f, 6.1693f, 6.6146f, 5.832f, 6.5213f)
                curveTo(5.7093f, 6.4873f, 5.5746f, 6.4593f, 5.4433f, 6.4313f)
                curveTo(5.0773f, 6.3547f, 4.6633f, 6.2673f, 4.5666f, 6.062f)
                curveTo(4.496f, 5.9113f, 4.4967f, 5.704f, 4.4967f, 5.4853f)
                curveTo(4.4967f, 5.2073f, 4.4967f, 4.8933f, 4.3607f, 4.5887f)
                curveTo(4.3134f, 4.4799f, 4.2439f, 4.3823f, 4.1567f, 4.302f)
                close()
                moveTo(8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                close()
            }
        }
        .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
