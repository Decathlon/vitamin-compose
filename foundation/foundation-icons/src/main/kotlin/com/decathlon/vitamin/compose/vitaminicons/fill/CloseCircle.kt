package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.CloseCircle: ImageVector
    get() {
        if (_closeCircle != null) {
            return _closeCircle!!
        }
        _closeCircle = Builder(name = "CloseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.3333f, 8.0f)
                curveTo(1.3333f, 11.682f, 4.3179f, 14.6666f, 7.9999f, 14.6666f)
                curveTo(11.6819f, 14.6666f, 14.6666f, 11.682f, 14.6666f, 8.0f)
                curveTo(14.6666f, 4.318f, 11.6819f, 1.3333f, 7.9999f, 1.3333f)
                curveTo(4.3179f, 1.3333f, 1.3333f, 4.318f, 1.3333f, 8.0f)
                close()
                moveTo(6.1146f, 5.1713f)
                lineTo(7.9999f, 7.0573f)
                lineTo(9.8853f, 5.1713f)
                lineTo(10.8286f, 6.1146f)
                lineTo(8.9426f, 7.9999f)
                lineTo(10.8286f, 9.8853f)
                lineTo(9.8853f, 10.8286f)
                lineTo(7.9999f, 8.9426f)
                lineTo(6.1146f, 10.8286f)
                lineTo(5.1713f, 9.8853f)
                lineTo(7.0573f, 7.9999f)
                lineTo(5.1713f, 6.1146f)
                lineTo(6.1146f, 5.1713f)
                close()
            }
        }
        .build()
        return _closeCircle!!
    }

private var _closeCircle: ImageVector? = null
