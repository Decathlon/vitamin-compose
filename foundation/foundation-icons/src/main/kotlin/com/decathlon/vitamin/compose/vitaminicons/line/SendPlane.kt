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

public val LineGroup.SendPlane: ImageVector
    get() {
        if (_sendPlane != null) {
            return _sendPlane!!
        }
        _sendPlane = Builder(name = "SendPlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.282f, 6.2467f)
                curveTo(0.942f, 6.11f, 0.946f, 5.9067f, 1.3047f, 5.7873f)
                lineTo(14.0287f, 1.546f)
                curveTo(14.3813f, 1.4287f, 14.5833f, 1.626f, 14.4847f, 1.9713f)
                lineTo(10.8487f, 14.6953f)
                curveTo(10.7487f, 15.048f, 10.532f, 15.064f, 10.3707f, 14.742f)
                lineTo(7.3334f, 8.6667f)
                lineTo(1.282f, 6.2467f)
                close()
                moveTo(4.542f, 6.1133f)
                lineTo(8.2993f, 7.6167f)
                lineTo(10.326f, 11.6713f)
                lineTo(12.69f, 3.398f)
                lineTo(4.5413f, 6.1133f)
                horizontalLineTo(4.542f)
                close()
            }
        }
        .build()
        return _sendPlane!!
    }

private var _sendPlane: ImageVector? = null
