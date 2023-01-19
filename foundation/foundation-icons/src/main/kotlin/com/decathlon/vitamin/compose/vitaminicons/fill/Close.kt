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

public val FillGroup.Close: ImageVector
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = Builder(name = "Close", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.0573f)
                lineTo(11.3f, 3.7573f)
                lineTo(12.2427f, 4.7f)
                lineTo(8.9427f, 8.0f)
                lineTo(12.2427f, 11.3f)
                lineTo(11.3f, 12.2427f)
                lineTo(8.0f, 8.9427f)
                lineTo(4.7f, 12.2427f)
                lineTo(3.7573f, 11.3f)
                lineTo(7.0573f, 8.0f)
                lineTo(3.7573f, 4.7f)
                lineTo(4.7f, 3.7573f)
                lineTo(8.0f, 7.0573f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: ImageVector? = null
