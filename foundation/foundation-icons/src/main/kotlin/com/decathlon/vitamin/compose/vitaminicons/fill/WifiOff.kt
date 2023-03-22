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

public val FillGroup.WifiOff: ImageVector
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
                lineTo(15.389f, 16.805f)
                lineTo(15.142f, 17.111f)
                curveTo(14.2533f, 16.3908f, 13.1438f, 15.9985f, 12.0f, 16.0f)
                curveTo(10.8566f, 15.9984f, 9.7475f, 16.3904f, 8.859f, 17.11f)
                lineTo(6.974f, 14.776f)
                curveTo(8.288f, 13.7115f, 9.9069f, 13.0929f, 11.596f, 13.01f)
                lineTo(9.823f, 11.238f)
                curveTo(8.3195f, 11.5724f, 6.914f, 12.2508f, 5.717f, 13.22f)
                lineTo(3.83f, 10.887f)
                curveTo(4.9078f, 10.0142f, 6.1184f, 9.3197f, 7.416f, 8.83f)
                lineTo(5.885f, 7.3f)
                curveTo(4.6983f, 7.8307f, 3.5856f, 8.5134f, 2.575f, 9.331f)
                lineTo(0.689f, 6.997f)
                curveTo(1.604f, 6.257f, 2.592f, 5.606f, 3.641f, 5.055f)
                lineTo(1.393f, 2.808f)
                lineTo(2.808f, 1.393f)
                close()
                moveTo(16.084f, 11.87f)
                lineTo(12.216f, 8.003f)
                lineTo(12.0f, 8.0f)
                curveTo(15.095f, 8.0f, 17.937f, 9.081f, 20.17f, 10.887f)
                lineTo(18.284f, 13.221f)
                curveTo(17.6121f, 12.6771f, 16.8726f, 12.2237f, 16.084f, 11.87f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(16.285f, 3.0f, 20.22f, 4.497f, 23.31f, 6.997f)
                lineTo(21.426f, 9.33f)
                curveTo(18.7597f, 7.1703f, 15.4312f, 5.9944f, 12.0f, 6.0f)
                curveTo(11.428f, 6.0f, 10.864f, 6.032f, 10.31f, 6.094f)
                lineTo(7.723f, 3.511f)
                curveTo(9.094f, 3.177f, 10.527f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
