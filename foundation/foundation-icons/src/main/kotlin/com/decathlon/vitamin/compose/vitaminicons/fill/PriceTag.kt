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

public val FillGroup.PriceTag: ImageVector
    get() {
        if (_priceTag != null) {
            return _priceTag!!
        }
        _priceTag = Builder(name = "PriceTag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2667f, 1.4f)
                lineTo(13.8661f, 2.3433f)
                lineTo(14.8087f, 8.9433f)
                lineTo(8.6807f, 15.0713f)
                curveTo(8.5557f, 15.1963f, 8.3862f, 15.2665f, 8.2094f, 15.2665f)
                curveTo(8.0326f, 15.2665f, 7.8631f, 15.1963f, 7.7381f, 15.0713f)
                lineTo(1.1381f, 8.4713f)
                curveTo(1.0131f, 8.3463f, 0.9429f, 8.1768f, 0.9429f, 8.0f)
                curveTo(0.9429f, 7.8232f, 1.0131f, 7.6537f, 1.1381f, 7.5287f)
                lineTo(7.2667f, 1.4f)
                close()
                moveTo(9.1521f, 7.0573f)
                curveTo(9.2759f, 7.1811f, 9.4229f, 7.2793f, 9.5847f, 7.3463f)
                curveTo(9.7465f, 7.4133f, 9.9199f, 7.4477f, 10.095f, 7.4477f)
                curveTo(10.2701f, 7.4477f, 10.4434f, 7.4131f, 10.6052f, 7.3461f)
                curveTo(10.767f, 7.2791f, 10.9139f, 7.1808f, 11.0377f, 7.057f)
                curveTo(11.1615f, 6.9332f, 11.2597f, 6.7861f, 11.3267f, 6.6244f)
                curveTo(11.3937f, 6.4626f, 11.4281f, 6.2892f, 11.4281f, 6.1141f)
                curveTo(11.4281f, 5.939f, 11.3935f, 5.7656f, 11.3265f, 5.6038f)
                curveTo(11.2595f, 5.4421f, 11.1612f, 5.2951f, 11.0374f, 5.1713f)
                curveTo(10.9136f, 5.0475f, 10.7666f, 4.9493f, 10.6048f, 4.8824f)
                curveTo(10.443f, 4.8154f, 10.2696f, 4.7809f, 10.0945f, 4.781f)
                curveTo(9.7409f, 4.781f, 9.4017f, 4.9216f, 9.1517f, 5.1717f)
                curveTo(8.9017f, 5.4218f, 8.7613f, 5.7609f, 8.7614f, 6.1146f)
                curveTo(8.7614f, 6.4682f, 8.902f, 6.8073f, 9.1521f, 7.0573f)
                close()
            }
        }
        .build()
        return _priceTag!!
    }

private var _priceTag: ImageVector? = null
