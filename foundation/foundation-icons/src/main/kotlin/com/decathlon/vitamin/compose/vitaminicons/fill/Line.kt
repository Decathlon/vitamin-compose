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

public val FillGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4419f, 6.8453f)
                curveTo(12.4417f, 6.9382f, 12.4047f, 7.0272f, 12.339f, 7.0929f)
                curveTo(12.2732f, 7.1585f, 12.1841f, 7.1953f, 12.0913f, 7.1953f)
                horizontalLineTo(11.1166f)
                verticalLineTo(7.8207f)
                horizontalLineTo(12.0913f)
                curveTo(12.1385f, 7.8186f, 12.1856f, 7.8261f, 12.2298f, 7.8428f)
                curveTo(12.274f, 7.8594f, 12.3144f, 7.8848f, 12.3486f, 7.9175f)
                curveTo(12.3827f, 7.9502f, 12.4098f, 7.9894f, 12.4284f, 8.0329f)
                curveTo(12.447f, 8.0763f, 12.4565f, 8.1231f, 12.4565f, 8.1703f)
                curveTo(12.4565f, 8.2176f, 12.447f, 8.2643f, 12.4284f, 8.3078f)
                curveTo(12.4098f, 8.3512f, 12.3827f, 8.3905f, 12.3486f, 8.4232f)
                curveTo(12.3144f, 8.4558f, 12.274f, 8.4813f, 12.2298f, 8.4979f)
                curveTo(12.1856f, 8.5146f, 12.1385f, 8.5221f, 12.0913f, 8.52f)
                horizontalLineTo(10.7666f)
                curveTo(10.6743f, 8.5193f, 10.586f, 8.4822f, 10.5208f, 8.4168f)
                curveTo(10.4557f, 8.3514f, 10.4189f, 8.263f, 10.4186f, 8.1707f)
                verticalLineTo(5.52f)
                curveTo(10.4186f, 5.3287f, 10.5753f, 5.17f, 10.7686f, 5.17f)
                horizontalLineTo(12.0939f)
                curveTo(12.1867f, 5.1703f, 12.2757f, 5.2074f, 12.3411f, 5.2732f)
                curveTo(12.4066f, 5.3391f, 12.4432f, 5.4282f, 12.4429f, 5.521f)
                curveTo(12.4427f, 5.6138f, 12.4055f, 5.7028f, 12.3397f, 5.7682f)
                curveTo(12.2739f, 5.8337f, 12.1847f, 5.8703f, 12.0919f, 5.87f)
                horizontalLineTo(11.1173f)
                verticalLineTo(6.4953f)
                horizontalLineTo(12.0919f)
                curveTo(12.2859f, 6.4953f, 12.4426f, 6.6533f, 12.4426f, 6.8453f)
                horizontalLineTo(12.4419f)
                close()
                moveTo(9.7099f, 8.502f)
                curveTo(9.6741f, 8.5133f, 9.6368f, 8.519f, 9.5992f, 8.5187f)
                curveTo(9.5444f, 8.5199f, 9.49f, 8.5079f, 9.4407f, 8.4838f)
                curveTo(9.3914f, 8.4597f, 9.3486f, 8.4241f, 9.3159f, 8.38f)
                lineTo(7.9586f, 6.5373f)
                verticalLineTo(8.1707f)
                curveTo(7.9519f, 8.2587f, 7.9123f, 8.3409f, 7.8475f, 8.4009f)
                curveTo(7.7828f, 8.4609f, 7.6978f, 8.4942f, 7.6096f, 8.4942f)
                curveTo(7.5213f, 8.4942f, 7.4363f, 8.4609f, 7.3716f, 8.4009f)
                curveTo(7.3069f, 8.3409f, 7.2673f, 8.2587f, 7.2606f, 8.1707f)
                verticalLineTo(5.52f)
                curveTo(7.2604f, 5.4278f, 7.2968f, 5.3393f, 7.3618f, 5.274f)
                curveTo(7.4268f, 5.2086f, 7.5151f, 5.1717f, 7.6073f, 5.1713f)
                curveTo(7.7153f, 5.1713f, 7.8152f, 5.2287f, 7.8819f, 5.312f)
                lineTo(9.2499f, 7.162f)
                verticalLineTo(5.52f)
                curveTo(9.2499f, 5.3287f, 9.4066f, 5.17f, 9.5999f, 5.17f)
                curveTo(9.7913f, 5.17f, 9.9499f, 5.3287f, 9.9499f, 5.52f)
                verticalLineTo(8.1707f)
                curveTo(9.9498f, 8.2441f, 9.9266f, 8.3157f, 9.8835f, 8.3751f)
                curveTo(9.8404f, 8.4346f, 9.7797f, 8.479f, 9.7099f, 8.502f)
                close()
                moveTo(6.4099f, 8.52f)
                curveTo(6.3175f, 8.5195f, 6.229f, 8.4825f, 6.1637f, 8.4171f)
                curveTo(6.0984f, 8.3517f, 6.0616f, 8.2631f, 6.0613f, 8.1707f)
                verticalLineTo(5.52f)
                curveTo(6.0613f, 5.3287f, 6.2186f, 5.17f, 6.4113f, 5.17f)
                curveTo(6.6039f, 5.17f, 6.7606f, 5.3287f, 6.7606f, 5.52f)
                verticalLineTo(8.1707f)
                curveTo(6.7601f, 8.2634f, 6.7229f, 8.3521f, 6.6572f, 8.4176f)
                curveTo(6.5915f, 8.483f, 6.5026f, 8.5198f, 6.4099f, 8.52f)
                close()
                moveTo(5.3899f, 8.52f)
                horizontalLineTo(4.0652f)
                curveTo(3.9727f, 8.5195f, 3.8841f, 8.4825f, 3.8186f, 8.4171f)
                curveTo(3.7531f, 8.3518f, 3.716f, 8.2632f, 3.7153f, 8.1707f)
                verticalLineTo(5.52f)
                curveTo(3.7229f, 5.4325f, 3.7631f, 5.3509f, 3.8279f, 5.2916f)
                curveTo(3.8927f, 5.2322f, 3.9774f, 5.1993f, 4.0652f, 5.1993f)
                curveTo(4.1531f, 5.1993f, 4.2378f, 5.2322f, 4.3026f, 5.2916f)
                curveTo(4.3674f, 5.3509f, 4.4076f, 5.4325f, 4.4152f, 5.52f)
                verticalLineTo(7.82f)
                horizontalLineTo(5.3913f)
                curveTo(5.4841f, 7.82f, 5.5731f, 7.8569f, 5.6387f, 7.9225f)
                curveTo(5.7044f, 7.9882f, 5.7413f, 8.0772f, 5.7413f, 8.17f)
                curveTo(5.7413f, 8.2628f, 5.7044f, 8.3519f, 5.6387f, 8.4175f)
                curveTo(5.5731f, 8.4831f, 5.4841f, 8.52f, 5.3913f, 8.52f)
                horizontalLineTo(5.3899f)
                close()
                moveTo(7.9999f, 1.3333f)
                curveTo(4.3246f, 1.3333f, 1.3333f, 3.762f, 1.3333f, 6.7453f)
                curveTo(1.3333f, 9.4187f, 3.7053f, 11.658f, 6.9086f, 12.0833f)
                curveTo(7.1252f, 12.1287f, 7.4212f, 12.2267f, 7.4959f, 12.4113f)
                curveTo(7.5626f, 12.578f, 7.5399f, 12.8367f, 7.5173f, 13.0113f)
                lineTo(7.4259f, 13.578f)
                curveTo(7.4012f, 13.7447f, 7.2926f, 14.2367f, 8.0086f, 13.936f)
                curveTo(8.7259f, 13.6367f, 11.8513f, 11.6707f, 13.2513f, 10.0613f)
                curveTo(14.2086f, 9.0113f, 14.6666f, 7.9367f, 14.6666f, 6.7453f)
                curveTo(14.6666f, 3.762f, 11.6746f, 1.3333f, 7.9999f, 1.3333f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
