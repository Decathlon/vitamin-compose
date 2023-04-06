package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.ChequePayment: ImageVector
    get() {
        if (_chequePayment != null) {
            return _chequePayment!!
        }
        _chequePayment = Builder(name = "ChequePayment", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            group {
            }
            group {
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(3.5614f, 0.0f)
                    horizontalLineTo(54.4386f)
                    curveTo(56.4055f, 0.0f, 58.0f, 1.6072f, 58.0f, 3.5897f)
                    verticalLineTo(36.4103f)
                    curveTo(58.0f, 38.3928f, 56.4055f, 40.0f, 54.4386f, 40.0f)
                    horizontalLineTo(3.5614f)
                    curveTo(1.5945f, 40.0f, 0.0f, 38.3928f, 0.0f, 36.4103f)
                    verticalLineTo(3.5897f)
                    curveTo(0.0f, 1.6072f, 1.5945f, 0.0f, 3.5614f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFF3F3F3)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(54.4386f, 1.0f)
                    horizontalLineTo(3.5614f)
                    curveTo(2.1542f, 1.0f, 1.0f, 2.152f, 1.0f, 3.5897f)
                    verticalLineTo(36.4103f)
                    curveTo(1.0f, 37.848f, 2.1542f, 39.0f, 3.5614f, 39.0f)
                    horizontalLineTo(54.4386f)
                    curveTo(55.8458f, 39.0f, 57.0f, 37.848f, 57.0f, 36.4103f)
                    verticalLineTo(3.5897f)
                    curveTo(57.0f, 2.152f, 55.8458f, 1.0f, 54.4386f, 1.0f)
                    close()
                    moveTo(3.5614f, 0.0f)
                    horizontalLineTo(54.4386f)
                    curveTo(56.4055f, 0.0f, 58.0f, 1.6072f, 58.0f, 3.5897f)
                    verticalLineTo(36.4103f)
                    curveTo(58.0f, 38.3928f, 56.4055f, 40.0f, 54.4386f, 40.0f)
                    horizontalLineTo(3.5614f)
                    curveTo(1.5945f, 40.0f, 0.0f, 38.3928f, 0.0f, 36.4103f)
                    verticalLineTo(3.5897f)
                    curveTo(0.0f, 1.6072f, 1.5945f, 0.0f, 3.5614f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFD9DDE1)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(49.5f, 8.5f)
                    horizontalLineTo(8.5f)
                    verticalLineTo(31.5f)
                    horizontalLineTo(49.5f)
                    verticalLineTo(8.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(46.0f, 16.0f)
                    horizontalLineTo(36.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(46.0f)
                    verticalLineTo(16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF001018)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(32.0f, 16.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(32.0f)
                    verticalLineTo(16.0f)
                    close()
                    moveTo(24.0f, 27.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(28.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(27.0f)
                    close()
                    moveTo(12.0f, 24.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(25.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(28.0f, 19.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(19.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(50.0f, 8.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(50.0f)
                    verticalLineTo(8.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF001018)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(36.7051f, 24.5019f)
                    curveTo(36.7041f, 24.5028f, 36.7032f, 24.5037f, 36.7022f, 24.5047f)
                    curveTo(36.6753f, 24.5317f, 36.6403f, 24.5774f, 36.6049f, 24.6407f)
                    curveTo(36.5702f, 24.7027f, 36.5419f, 24.7697f, 36.523f, 24.8304f)
                    curveTo(36.5137f, 24.8603f, 36.5076f, 24.8859f, 36.5039f, 24.9061f)
                    curveTo(36.5021f, 24.9161f, 36.5011f, 24.9239f, 36.5006f, 24.9296f)
                    curveTo(36.5f, 24.9348f, 36.5f, 24.9374f, 36.5f, 24.9374f)
                    curveTo(36.5f, 25.2136f, 36.2761f, 25.4373f, 36.0f, 25.4373f)
                    curveTo(35.7239f, 25.4373f, 35.5f, 25.2135f, 35.5f, 24.9373f)
                    curveTo(35.5f, 24.6778f, 35.6043f, 24.3812f, 35.7321f, 24.1527f)
                    curveTo(35.7998f, 24.0316f, 35.8869f, 23.9061f, 35.9941f, 23.7986f)
                    curveTo(36.0979f, 23.6945f, 36.2475f, 23.5803f, 36.4425f, 23.5316f)
                    curveTo(37.1017f, 23.3668f, 37.5808f, 23.8553f, 37.8258f, 24.176f)
                    curveTo(38.0855f, 24.516f, 38.2812f, 24.9256f, 38.3881f, 25.1494f)
                    curveTo(38.3944f, 25.1625f, 38.4003f, 25.1749f, 38.406f, 25.1867f)
                    curveTo(38.4856f, 25.3527f, 38.5367f, 25.5599f, 38.5756f, 25.7292f)
                    curveTo(38.5901f, 25.7925f, 38.6036f, 25.8534f, 38.6167f, 25.913f)
                    curveTo(38.6434f, 26.0343f, 38.6689f, 26.15f, 38.7001f, 26.2688f)
                    curveTo(38.7458f, 26.4431f, 38.7924f, 26.5761f, 38.8422f, 26.6679f)
                    curveTo(38.8718f, 26.7225f, 38.8925f, 26.7438f, 38.8995f, 26.7501f)
                    curveTo(38.9607f, 26.7725f, 38.9804f, 26.7621f, 38.9881f, 26.7581f)
                    curveTo(38.9886f, 26.7578f, 38.989f, 26.7576f, 38.9894f, 26.7574f)
                    curveTo(39.0157f, 26.7445f, 39.0705f, 26.7027f, 39.138f, 26.5943f)
                    curveTo(39.2755f, 26.3734f, 39.3637f, 26.0409f, 39.3935f, 25.8055f)
                    curveTo(39.3982f, 25.7687f, 39.3956f, 25.7f, 39.3777f, 25.5681f)
                    curveTo(39.3742f, 25.5425f, 39.37f, 25.5131f, 39.3653f, 25.4812f)
                    curveTo(39.3505f, 25.3794f, 39.3319f, 25.2516f, 39.3237f, 25.1368f)
                    curveTo(39.3129f, 24.9843f, 39.3117f, 24.7717f, 39.3933f, 24.5653f)
                    curveTo(39.4865f, 24.3293f, 39.6705f, 24.1447f, 39.9364f, 24.0516f)
                    curveTo(40.6483f, 23.8025f, 41.1902f, 24.2474f, 41.5063f, 24.5797f)
                    curveTo(41.6474f, 24.7281f, 41.7816f, 24.8944f, 41.8957f, 25.036f)
                    curveTo(41.9167f, 25.0621f, 41.9371f, 25.0873f, 41.9567f, 25.1115f)
                    curveTo(42.0952f, 25.2821f, 42.1935f, 25.3942f, 42.2743f, 25.46f)
                    curveTo(42.3875f, 25.5523f, 42.4453f, 25.5537f, 42.4639f, 25.5535f)
                    curveTo(42.4964f, 25.553f, 42.5564f, 25.5401f, 42.6687f, 25.4724f)
                    curveTo(42.7553f, 25.4202f, 42.8349f, 25.3607f, 42.9359f, 25.2852f)
                    curveTo(42.9765f, 25.2549f, 43.0206f, 25.2219f, 43.07f, 25.1858f)
                    curveTo(43.2227f, 25.0742f, 43.4204f, 24.938f, 43.6501f, 24.8519f)
                    curveTo(43.9092f, 24.7548f, 44.3436f, 24.6412f, 44.7726f, 24.6191f)
                    curveTo(44.9875f, 24.608f, 45.2274f, 24.6182f, 45.4531f, 24.6814f)
                    curveTo(45.6803f, 24.7449f, 45.9306f, 24.8736f, 46.0985f, 25.1255f)
                    curveTo(46.2517f, 25.3552f, 46.1896f, 25.6657f, 45.9598f, 25.8189f)
                    curveTo(45.7305f, 25.9717f, 45.4208f, 25.9102f, 45.2674f, 25.6815f)
                    curveTo(45.2673f, 25.6815f, 45.2674f, 25.6816f, 45.2674f, 25.6815f)
                    curveTo(45.2627f, 25.6771f, 45.2421f, 25.6607f, 45.1837f, 25.6444f)
                    curveTo(45.0998f, 25.6209f, 44.9782f, 25.6098f, 44.8242f, 25.6177f)
                    curveTo(44.5153f, 25.6337f, 44.1823f, 25.7203f, 44.0012f, 25.7882f)
                    curveTo(43.9076f, 25.8233f, 43.8026f, 25.889f, 43.6601f, 25.9932f)
                    curveTo(43.6322f, 26.0135f, 43.6014f, 26.0366f, 43.5685f, 26.0612f)
                    curveTo(43.4559f, 26.1455f, 43.318f, 26.2487f, 43.1848f, 26.3289f)
                    curveTo(43.0035f, 26.4381f, 42.7642f, 26.5493f, 42.4783f, 26.5534f)
                    curveTo(42.1786f, 26.5577f, 41.899f, 26.4441f, 41.6426f, 26.2353f)
                    curveTo(41.47f, 26.0946f, 41.3108f, 25.9025f, 41.1803f, 25.7417f)
                    curveTo(41.1566f, 25.7126f, 41.1335f, 25.6839f, 41.1108f, 25.6558f)
                    curveTo(40.9962f, 25.5139f, 40.8921f, 25.385f, 40.7817f, 25.2689f)
                    curveTo(40.5452f, 25.0203f, 40.4135f, 24.9721f, 40.3188f, 24.9831f)
                    curveTo(40.3196f, 24.9516f, 40.3226f, 24.9368f, 40.3233f, 24.9332f)
                    curveTo(40.3236f, 24.9322f, 40.3236f, 24.9325f, 40.3233f, 24.9332f)
                    curveTo(40.32f, 24.9416f, 40.3108f, 24.9588f, 40.2928f, 24.9761f)
                    curveTo(40.2802f, 24.9882f, 40.2699f, 24.9937f, 40.2667f, 24.9953f)
                    curveTo(40.2829f, 24.9896f, 40.3002f, 24.9853f, 40.3188f, 24.9831f)
                    curveTo(40.3183f, 25.0034f, 40.3187f, 25.0305f, 40.3212f, 25.066f)
                    curveTo(40.3265f, 25.1411f, 40.337f, 25.213f, 40.35f, 25.3023f)
                    curveTo(40.3558f, 25.3421f, 40.3621f, 25.3854f, 40.3687f, 25.4339f)
                    curveTo(40.3866f, 25.5665f, 40.4084f, 25.7515f, 40.3856f, 25.9312f)
                    curveTo(40.3459f, 26.2441f, 40.2292f, 26.7336f, 39.9869f, 27.1228f)
                    curveTo(39.8644f, 27.3196f, 39.6856f, 27.5298f, 39.4295f, 27.6554f)
                    curveTo(39.154f, 27.7904f, 38.8423f, 27.8009f, 38.529f, 27.6791f)
                    curveTo(38.2435f, 27.5681f, 38.0698f, 27.341f, 37.9634f, 27.145f)
                    curveTo(37.8556f, 26.9465f, 37.7849f, 26.7212f, 37.7328f, 26.5226f)
                    curveTo(37.6966f, 26.3843f, 37.6637f, 26.2352f, 37.6348f, 26.1044f)
                    curveTo(37.6228f, 26.0501f, 37.6115f, 25.999f, 37.601f, 25.9531f)
                    curveTo(37.5598f, 25.7736f, 37.5291f, 25.6709f, 37.5043f, 25.619f)
                    curveTo(37.5009f, 25.612f, 37.4975f, 25.605f, 37.4941f, 25.5978f)
                    curveTo(37.3822f, 25.3643f, 37.2259f, 25.038f, 37.0311f, 24.783f)
                    curveTo(36.8523f, 24.549f, 36.7465f, 24.5078f, 36.7051f, 24.5019f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFEFF1F3)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(8.0f, 8.0f)
                    horizontalLineTo(50.0f)
                    verticalLineTo(32.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(9.0f, 9.0f)
                    verticalLineTo(31.0f)
                    horizontalLineTo(49.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(9.0f)
                    close()
                }
            }
        }
        .build()
        return _chequePayment!!
    }

private var _chequePayment: ImageVector? = null
