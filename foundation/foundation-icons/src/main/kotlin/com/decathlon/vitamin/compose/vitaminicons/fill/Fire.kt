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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(10.4971f, 22.9999f, 9.029f, 22.5483f, 7.7859f, 21.7037f)
                curveTo(6.5428f, 20.8592f, 5.5821f, 19.6606f, 5.0283f, 18.2635f)
                curveTo(4.4746f, 16.8664f, 4.3533f, 15.3352f, 4.6803f, 13.8683f)
                curveTo(5.0072f, 12.4015f, 5.7673f, 11.0667f, 6.862f, 10.037f)
                curveTo(8.204f, 8.774f, 11.5f, 6.5f, 11.0f, 1.5f)
                curveTo(17.0f, 5.5f, 20.0f, 9.5f, 14.0f, 15.5f)
                curveTo(15.0f, 15.5f, 16.5f, 15.5f, 19.0f, 13.03f)
                curveTo(19.27f, 13.803f, 19.5f, 14.634f, 19.5f, 15.5f)
                curveTo(19.5f, 17.4891f, 18.7098f, 19.3968f, 17.3033f, 20.8033f)
                curveTo(15.8968f, 22.2098f, 13.9891f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
