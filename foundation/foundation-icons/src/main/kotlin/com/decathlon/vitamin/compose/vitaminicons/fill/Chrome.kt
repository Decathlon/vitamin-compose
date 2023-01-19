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

public val FillGroup.Chrome: ImageVector
    get() {
        if (_chrome != null) {
            return _chrome!!
        }
        _chrome = Builder(name = "Chrome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0001f, 1.3333f)
                curveTo(6.1321f, 1.3312f, 4.3494f, 2.1149f, 3.0881f, 3.4927f)
                lineTo(4.9341f, 6.69f)
                curveTo(5.4589f, 5.4626f, 6.6652f, 4.6665f, 8.0001f, 4.6666f)
                horizontalLineTo(13.7748f)
                curveTo(12.5841f, 2.6032f, 10.3824f, 1.3324f, 8.0001f, 1.3333f)
                close()
                moveTo(1.3334f, 8.0f)
                curveTo(1.3334f, 11.1847f, 3.5667f, 13.8473f, 6.5514f, 14.5087f)
                lineTo(8.3987f, 11.31f)
                curveTo(7.0501f, 11.4728f, 5.7376f, 10.8007f, 5.0814f, 9.6113f)
                lineTo(2.226f, 4.6653f)
                curveTo(1.658f, 5.6467f, 1.3334f, 6.7853f, 1.3334f, 8.0f)
                close()
                moveTo(10.858f, 9.7167f)
                lineTo(8.0f, 14.6667f)
                curveTo(11.682f, 14.6667f, 14.6667f, 11.682f, 14.6667f, 8.0f)
                curveTo(14.6667f, 7.3033f, 14.56f, 6.6313f, 14.3614f, 6.0f)
                horizontalLineTo(10.6667f)
                curveTo(11.1004f, 6.5765f, 11.3344f, 7.2786f, 11.3334f, 8.0f)
                curveTo(11.3344f, 8.6048f, 11.17f, 9.1985f, 10.858f, 9.7167f)
                close()
                moveTo(9.7147f, 9.03f)
                curveTo(9.3502f, 9.6376f, 8.6913f, 10.0069f, 7.9828f, 10.0008f)
                curveTo(7.2742f, 9.9946f, 6.6219f, 9.6139f, 6.268f, 9.0f)
                lineTo(6.2487f, 8.9667f)
                curveTo(5.7821f, 8.1212f, 5.9863f, 7.0631f, 6.7339f, 6.4519f)
                curveTo(7.4816f, 5.8407f, 8.5592f, 5.851f, 9.295f, 6.4764f)
                curveTo(10.0308f, 7.1018f, 10.2147f, 8.1636f, 9.732f, 9.0f)
                lineTo(9.7147f, 9.03f)
                close()
            }
        }
        .build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null
