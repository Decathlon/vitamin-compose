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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9461f, 9.315f)
                curveTo(1.4241f, 9.141f, 1.4191f, 8.86f, 1.9561f, 8.681f)
                lineTo(21.0431f, 2.319f)
                curveTo(21.5721f, 2.143f, 21.8751f, 2.439f, 21.7271f, 2.957f)
                lineTo(16.2731f, 22.043f)
                curveTo(16.1231f, 22.572f, 15.8181f, 22.59f, 15.5941f, 22.088f)
                lineTo(12.0001f, 14.0f)
                lineTo(18.0001f, 6.0f)
                lineTo(10.0001f, 12.0f)
                lineTo(1.9461f, 9.315f)
                close()
            }
        }
        .build()
        return _sendPlane!!
    }

private var _sendPlane: ImageVector? = null
