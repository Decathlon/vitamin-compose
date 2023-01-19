package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.CloseCircle: ImageVector
    get() {
        if (_closeCircle != null) {
            return _closeCircle!!
        }
        _closeCircle = Builder(name = "CloseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                close()
                moveTo(8.0f, 13.3333f)
                curveTo(10.9456f, 13.3333f, 13.3334f, 10.9455f, 13.3334f, 8.0f)
                curveTo(13.3334f, 5.0545f, 10.9456f, 2.6667f, 8.0f, 2.6667f)
                curveTo(5.0545f, 2.6667f, 2.6667f, 5.0545f, 2.6667f, 8.0f)
                curveTo(2.6667f, 10.9455f, 5.0545f, 13.3333f, 8.0f, 13.3333f)
                close()
                moveTo(9.8854f, 5.1713f)
                lineTo(8.0f, 7.0573f)
                lineTo(6.1147f, 5.1713f)
                lineTo(5.1714f, 6.1146f)
                lineTo(7.0574f, 7.9999f)
                lineTo(5.1714f, 9.8853f)
                lineTo(6.1147f, 10.8286f)
                lineTo(8.0f, 8.9426f)
                lineTo(9.8854f, 10.8286f)
                lineTo(10.8287f, 9.8853f)
                lineTo(8.9427f, 7.9999f)
                lineTo(10.8287f, 6.1146f)
                lineTo(9.8854f, 5.1713f)
                close()
            }
        }
        .build()
        return _closeCircle!!
    }

private var _closeCircle: ImageVector? = null
