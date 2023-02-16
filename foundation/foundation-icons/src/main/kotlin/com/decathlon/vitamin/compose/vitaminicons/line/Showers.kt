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

public val LineGroup.Showers: ImageVector
    get() {
        if (_showers != null) {
            return _showers!!
        }
        _showers = Builder(name = "Showers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.3333f, 11.2867f)
                curveTo(2.5956f, 10.8602f, 1.9708f, 10.2631f, 1.5113f, 9.5454f)
                curveTo(1.0518f, 8.8278f, 0.7709f, 8.0105f, 0.6922f, 7.1619f)
                curveTo(0.6135f, 6.3134f, 0.7393f, 5.4584f, 1.059f, 4.6685f)
                curveTo(1.3788f, 3.8786f, 1.8831f, 3.1768f, 2.5299f, 2.6219f)
                curveTo(3.1766f, 2.067f, 3.9469f, 1.6751f, 4.7762f, 1.4791f)
                curveTo(5.6055f, 1.2832f, 6.4698f, 1.2888f, 7.2965f, 1.4955f)
                curveTo(8.1232f, 1.7022f, 8.8883f, 2.104f, 9.5278f, 2.6672f)
                curveTo(10.1673f, 3.2304f, 10.6625f, 3.9387f, 10.972f, 4.7327f)
                curveTo(11.9022f, 4.5488f, 12.8675f, 4.7325f, 13.6652f, 5.245f)
                curveTo(14.4629f, 5.7576f, 15.031f, 6.5593f, 15.2503f, 7.4818f)
                curveTo(15.4696f, 8.4043f, 15.323f, 9.3759f, 14.8413f, 10.1926f)
                curveTo(14.3595f, 11.0093f, 13.5801f, 11.6077f, 12.6667f, 11.8621f)
                verticalLineTo(10.4421f)
                curveTo(12.9748f, 10.2958f, 13.2471f, 10.0839f, 13.4645f, 9.8211f)
                curveTo(13.6818f, 9.5582f, 13.8389f, 9.251f, 13.9247f, 8.9209f)
                curveTo(14.0105f, 8.5908f, 14.0229f, 8.2459f, 13.961f, 7.9106f)
                curveTo(13.8991f, 7.5752f, 13.7644f, 7.2574f, 13.5665f, 6.9797f)
                curveTo(13.3685f, 6.702f, 13.1121f, 6.471f, 12.8152f, 6.3031f)
                curveTo(12.5184f, 6.1352f, 12.1884f, 6.0344f, 11.8483f, 6.0078f)
                curveTo(11.5083f, 5.9812f, 11.1666f, 6.0294f, 10.8473f, 6.1492f)
                curveTo(10.5279f, 6.2689f, 10.2387f, 6.4571f, 10.0f, 6.7007f)
                verticalLineTo(6.6667f)
                curveTo(10.0f, 5.9995f, 9.8331f, 5.3429f, 9.5145f, 4.7566f)
                curveTo(9.1959f, 4.1704f, 8.7357f, 3.6731f, 8.1758f, 3.3102f)
                curveTo(7.616f, 2.9472f, 6.9742f, 2.7301f, 6.3089f, 2.6786f)
                curveTo(5.6437f, 2.627f, 4.9762f, 2.7427f, 4.3671f, 3.0151f)
                curveTo(3.758f, 3.2875f, 3.2267f, 3.7079f, 2.8216f, 4.2381f)
                curveTo(2.4165f, 4.7683f, 2.1504f, 5.3914f, 2.0477f, 6.0507f)
                curveTo(1.945f, 6.7099f, 2.0088f, 7.3844f, 2.2333f, 8.0128f)
                curveTo(2.4579f, 8.6411f, 2.836f, 9.2032f, 3.3333f, 9.6481f)
                verticalLineTo(11.2867f)
                close()
                moveTo(4.6667f, 10.6667f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.3334f)
                horizontalLineTo(4.6667f)
                verticalLineTo(10.6667f)
                close()
                moveTo(10.0f, 10.6667f)
                horizontalLineTo(11.3333f)
                verticalLineTo(13.3334f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.6667f)
                close()
                moveTo(7.3333f, 12.6667f)
                horizontalLineTo(8.6667f)
                verticalLineTo(15.3334f)
                horizontalLineTo(7.3333f)
                verticalLineTo(12.6667f)
                close()
            }
        }
        .build()
        return _showers!!
    }

private var _showers: ImageVector? = null
