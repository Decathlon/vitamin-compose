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

public val FillGroup.Earth: ImageVector
    get() {
        if (_earth != null) {
            return _earth!!
        }
        _earth = Builder(name = "Earth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                close()
                moveTo(12.2367f, 10.6346f)
                verticalLineTo(10.5646f)
                curveTo(12.2367f, 9.95f, 12.2367f, 9.6693f, 11.802f, 9.4206f)
                curveTo(11.6623f, 9.3414f, 11.5188f, 9.2691f, 11.372f, 9.204f)
                curveTo(11.1274f, 9.0927f, 10.9654f, 9.02f, 10.7467f, 8.7f)
                curveTo(10.7206f, 8.662f, 10.6948f, 8.6238f, 10.6694f, 8.5853f)
                curveTo(10.4394f, 8.2353f, 10.2734f, 7.9833f, 9.6414f, 8.0833f)
                curveTo(8.398f, 8.2807f, 8.306f, 8.4993f, 8.2514f, 8.8687f)
                lineTo(8.2427f, 8.9293f)
                curveTo(8.162f, 9.4693f, 8.1474f, 9.6507f, 8.3727f, 9.8873f)
                curveTo(9.216f, 10.772f, 9.7214f, 11.41f, 9.8747f, 11.7833f)
                curveTo(9.9494f, 11.9653f, 10.1414f, 12.5166f, 10.0094f, 13.062f)
                curveTo(10.8186f, 12.7397f, 11.5389f, 12.2283f, 12.11f, 11.5706f)
                curveTo(12.1834f, 11.3213f, 12.2367f, 11.0106f, 12.2367f, 10.6346f)
                close()
                moveTo(8.0f, 2.5553f)
                curveTo(6.4554f, 2.5553f, 5.06f, 3.1993f, 4.0694f, 4.2326f)
                curveTo(4.1874f, 4.3147f, 4.29f, 4.43f, 4.3607f, 4.5887f)
                curveTo(4.4967f, 4.8933f, 4.4967f, 5.2073f, 4.4967f, 5.4853f)
                curveTo(4.4967f, 5.704f, 4.4967f, 5.912f, 4.5667f, 6.062f)
                curveTo(4.6627f, 6.2673f, 5.0774f, 6.3553f, 5.4434f, 6.4313f)
                curveTo(5.5747f, 6.4593f, 5.7094f, 6.4873f, 5.832f, 6.5213f)
                curveTo(6.1694f, 6.6146f, 6.4307f, 6.918f, 6.6394f, 7.1613f)
                curveTo(6.726f, 7.262f, 6.8547f, 7.4106f, 6.9194f, 7.448f)
                curveTo(6.9527f, 7.424f, 7.06f, 7.3073f, 7.1127f, 7.116f)
                curveTo(7.154f, 6.9693f, 7.142f, 6.84f, 7.0827f, 6.7693f)
                curveTo(6.7094f, 6.3293f, 6.73f, 5.4826f, 6.8454f, 5.17f)
                curveTo(7.0267f, 4.6773f, 7.5934f, 4.714f, 8.008f, 4.7407f)
                curveTo(8.1627f, 4.7506f, 8.308f, 4.7607f, 8.4174f, 4.7467f)
                curveTo(8.832f, 4.6947f, 8.96f, 4.0633f, 9.05f, 3.94f)
                curveTo(9.2447f, 3.6733f, 9.8407f, 3.2713f, 10.21f, 3.0233f)
                curveTo(9.5144f, 2.714f, 8.7614f, 2.5545f, 8.0f, 2.5553f)
                close()
            }
        }
        .build()
        return _earth!!
    }

private var _earth: ImageVector? = null
