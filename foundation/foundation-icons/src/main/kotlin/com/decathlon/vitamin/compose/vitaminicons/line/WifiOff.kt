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

public val LineGroup.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) {
            return _wifiOff!!
        }
        _wifiOff = Builder(name = "WifiOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(12.714f, 18.0f, 13.37f, 18.25f, 13.886f, 18.666f)
                lineTo(12.0f, 21.0f)
                lineTo(10.114f, 18.666f)
                curveTo(10.6474f, 18.2339f, 11.3134f, 17.9987f, 12.0f, 18.0f)
                close()
                moveTo(2.808f, 1.393f)
                lineTo(20.485f, 19.071f)
                lineTo(19.071f, 20.485f)
                lineTo(13.891f, 15.305f)
                curveTo(13.2811f, 15.1026f, 12.6426f, 14.9996f, 12.0f, 15.0f)
                curveTo(10.572f, 15.0f, 9.26f, 15.499f, 8.23f, 16.332f)
                lineTo(6.974f, 14.776f)
                curveTo(8.288f, 13.7115f, 9.9069f, 13.0929f, 11.596f, 13.01f)
                lineTo(9.0f, 10.414f)
                curveTo(7.5721f, 10.8187f, 6.2413f, 11.509f, 5.088f, 12.443f)
                lineTo(3.83f, 10.887f)
                curveTo(4.9078f, 10.0142f, 6.1184f, 9.3197f, 7.416f, 8.83f)
                lineTo(5.132f, 6.545f)
                curveTo(3.9951f, 7.0864f, 2.926f, 7.7601f, 1.947f, 8.552f)
                lineTo(0.689f, 6.997f)
                curveTo(1.604f, 6.257f, 2.592f, 5.606f, 3.641f, 5.055f)
                lineTo(1.393f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(14.5f, 10.285f)
                lineTo(12.216f, 8.002f)
                lineTo(12.0f, 8.0f)
                curveTo(15.095f, 8.0f, 17.937f, 9.081f, 20.17f, 10.887f)
                lineTo(18.912f, 12.443f)
                curveTo(17.6235f, 11.3992f, 16.1149f, 10.6613f, 14.5f, 10.285f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.31f, 6.997f)
                lineTo(22.053f, 8.552f)
                curveTo(19.2093f, 6.2487f, 15.6594f, 4.9944f, 12.0f, 5.0f)
                curveTo(11.122f, 5.0f, 10.26f, 5.07f, 9.42f, 5.207f)
                lineTo(7.725f, 3.51f)
                curveTo(9.094f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
