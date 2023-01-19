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

public val FillGroup.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9333f, 1.5333f)
                lineTo(14.47f, 5.712f)
                curveTo(14.5349f, 5.7335f, 14.5916f, 5.7744f, 14.6324f, 5.8293f)
                curveTo(14.6733f, 5.8841f, 14.6963f, 5.9501f, 14.6983f, 6.0185f)
                curveTo(14.7003f, 6.0868f, 14.6813f, 6.1541f, 14.6438f, 6.2112f)
                curveTo(14.6063f, 6.2684f, 14.5521f, 6.3127f, 14.4887f, 6.338f)
                lineTo(8.6666f, 8.6667f)
                lineTo(5.7167f, 14.5667f)
                curveTo(5.6866f, 14.6267f, 5.6392f, 14.6763f, 5.5805f, 14.709f)
                curveTo(5.5218f, 14.7416f, 5.4546f, 14.7558f, 5.3877f, 14.7496f)
                curveTo(5.3208f, 14.7434f, 5.2574f, 14.7171f, 5.2057f, 14.6743f)
                curveTo(5.154f, 14.6314f, 5.1164f, 14.5739f, 5.098f, 14.5093f)
                lineTo(1.5066f, 1.9407f)
                curveTo(1.49f, 1.8823f, 1.4897f, 1.8204f, 1.5056f, 1.7619f)
                curveTo(1.5215f, 1.7033f, 1.5531f, 1.6501f, 1.597f, 1.6082f)
                curveTo(1.641f, 1.5663f, 1.6955f, 1.5372f, 1.7548f, 1.524f)
                curveTo(1.814f, 1.5108f, 1.8758f, 1.514f, 1.9333f, 1.5333f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
