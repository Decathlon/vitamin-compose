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

public val FillGroup.CustomerService: ImageVector
    get() {
        if (_customerService != null) {
            return _customerService!!
        }
        _customerService = Builder(name = "CustomerService", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                curveTo(21.5304f, 8.0f, 22.0391f, 8.2107f, 22.4142f, 8.5858f)
                curveTo(22.7893f, 8.9609f, 23.0f, 9.4696f, 23.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(23.0f, 14.5305f, 22.7893f, 15.0392f, 22.4142f, 15.4142f)
                curveTo(22.0391f, 15.7893f, 21.5304f, 16.0f, 21.0f, 16.0f)
                horizontalLineTo(19.938f)
                curveTo(19.6942f, 17.9333f, 18.7533f, 19.7112f, 17.2917f, 21.0f)
                curveTo(15.8302f, 22.2888f, 13.9486f, 23.0f, 12.0f, 23.0f)
                verticalLineTo(21.0f)
                curveTo(13.5913f, 21.0f, 15.1174f, 20.3679f, 16.2426f, 19.2427f)
                curveTo(17.3679f, 18.1174f, 18.0f, 16.5913f, 18.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 7.4087f, 17.3679f, 5.8826f, 16.2426f, 4.7574f)
                curveTo(15.1174f, 3.6322f, 13.5913f, 3.0f, 12.0f, 3.0f)
                curveTo(10.4087f, 3.0f, 8.8826f, 3.6322f, 7.7574f, 4.7574f)
                curveTo(6.6321f, 5.8826f, 6.0f, 7.4087f, 6.0f, 9.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4696f, 16.0f, 1.9609f, 15.7893f, 1.5858f, 15.4142f)
                curveTo(1.2107f, 15.0392f, 1.0f, 14.5305f, 1.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 9.4696f, 1.2107f, 8.9609f, 1.5858f, 8.5858f)
                curveTo(1.9609f, 8.2107f, 2.4696f, 8.0f, 3.0f, 8.0f)
                horizontalLineTo(4.062f)
                curveTo(4.306f, 6.0669f, 5.2471f, 4.2893f, 6.7086f, 3.0007f)
                curveTo(8.1701f, 1.7121f, 10.0516f, 1.0011f, 12.0f, 1.0011f)
                curveTo(13.9484f, 1.0011f, 15.8299f, 1.7121f, 17.2914f, 3.0007f)
                curveTo(18.7529f, 4.2893f, 19.694f, 6.0669f, 19.938f, 8.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(7.76f, 15.785f)
                lineTo(8.82f, 14.089f)
                curveTo(9.7731f, 14.6861f, 10.8754f, 15.0018f, 12.0f, 15.0f)
                curveTo(13.1246f, 15.0018f, 14.2269f, 14.6861f, 15.18f, 14.089f)
                lineTo(16.24f, 15.785f)
                curveTo(14.9693f, 16.5812f, 13.4995f, 17.0023f, 12.0f, 17.0f)
                curveTo(10.5005f, 17.0023f, 9.0307f, 16.5812f, 7.76f, 15.785f)
                close()
            }
        }
        .build()
        return _customerService!!
    }

private var _customerService: ImageVector? = null
