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

public val FillGroup.Showers: ImageVector
    get() {
        if (_showers != null) {
            return _showers!!
        }
        _showers = Builder(name = "Showers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0001f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0001f)
                horizontalLineTo(4.6667f)
                verticalLineTo(11.8321f)
                curveTo(3.7825f, 11.6033f, 2.9719f, 11.1512f, 2.3125f, 10.5193f)
                curveTo(1.6531f, 9.8873f, 1.1671f, 9.0966f, 0.9009f, 8.223f)
                curveTo(0.6348f, 7.3493f, 0.5974f, 6.4219f, 0.7925f, 5.5297f)
                curveTo(0.9876f, 4.6374f, 1.4085f, 3.8102f, 2.015f, 3.1273f)
                curveTo(2.6214f, 2.4444f, 3.3931f, 1.9287f, 4.2561f, 1.6296f)
                curveTo(5.119f, 1.3305f, 6.0443f, 1.258f, 6.9433f, 1.419f)
                curveTo(7.8423f, 1.5801f, 8.6849f, 1.9693f, 9.3903f, 2.5494f)
                curveTo(10.0957f, 3.1295f, 10.6404f, 3.8811f, 10.972f, 4.732f)
                curveTo(11.4734f, 4.6361f, 11.9893f, 4.6459f, 12.4866f, 4.7609f)
                curveTo(12.984f, 4.8758f, 13.4518f, 5.0933f, 13.8603f, 5.3995f)
                curveTo(14.2687f, 5.7056f, 14.6088f, 6.0937f, 14.8586f, 6.5388f)
                curveTo(15.1084f, 6.984f, 15.2626f, 7.4764f, 15.3111f, 7.9845f)
                curveTo(15.3597f, 8.4927f, 15.3016f, 9.0054f, 15.1406f, 9.4898f)
                curveTo(14.9797f, 9.9742f, 14.7193f, 10.4196f, 14.3762f, 10.7976f)
                curveTo(14.0332f, 11.1756f, 13.615f, 11.4778f, 13.1484f, 11.6849f)
                curveTo(12.6818f, 11.8919f, 12.1771f, 11.9993f, 11.6667f, 12.0001f)
                lineTo(11.3334f, 12.0007f)
                verticalLineTo(14.0007f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0007f)
                verticalLineTo(12.0001f)
                close()
                moveTo(7.3334f, 13.3334f)
                horizontalLineTo(8.6667f)
                verticalLineTo(15.3334f)
                horizontalLineTo(7.3334f)
                verticalLineTo(13.3334f)
                close()
            }
        }
        .build()
        return _showers!!
    }

private var _showers: ImageVector? = null
