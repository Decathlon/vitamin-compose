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

public val FillGroup.SendPlane: ImageVector
    get() {
        if (_sendPlane != null) {
            return _sendPlane!!
        }
        _sendPlane = Builder(name = "SendPlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.2973f, 6.21f)
                curveTo(0.9493f, 6.094f, 0.946f, 5.9067f, 1.304f, 5.7873f)
                lineTo(14.0286f, 1.546f)
                curveTo(14.3813f, 1.4287f, 14.5833f, 1.626f, 14.4846f, 1.9713f)
                lineTo(10.8486f, 14.6953f)
                curveTo(10.7486f, 15.048f, 10.5453f, 15.06f, 10.396f, 14.7253f)
                lineTo(8.0f, 9.3333f)
                lineTo(12.0f, 4.0f)
                lineTo(6.6666f, 8.0f)
                lineTo(1.2973f, 6.21f)
                close()
            }
        }
        .build()
        return _sendPlane!!
    }

private var _sendPlane: ImageVector? = null
