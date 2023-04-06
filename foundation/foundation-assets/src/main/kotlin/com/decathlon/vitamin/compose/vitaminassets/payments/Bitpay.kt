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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.Bitpay: ImageVector
    get() {
        if (_bitpay != null) {
            return _bitpay!!
        }
        _bitpay = Builder(name = "Bitpay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = SolidColor(Color(0xFFF3F3F3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                lineTo(54.0f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 57.5f, 4.0f)
                lineTo(57.5f, 36.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 54.0f, 39.5f)
                lineTo(4.0f, 39.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.5f, 36.0f)
                lineTo(0.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF002855)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(53.6901f, 15.202f)
                horizontalLineTo(51.1632f)
                lineTo(49.6933f, 21.4483f)
                horizontalLineTo(49.6959f)
                lineTo(49.494f, 22.3076f)
                curveTo(49.3529f, 22.3476f, 49.2126f, 22.3835f, 49.0732f, 22.4117f)
                curveTo(48.8116f, 22.4645f, 48.5413f, 22.491f, 48.2622f, 22.491f)
                curveTo(47.9365f, 22.491f, 47.6807f, 22.4442f, 47.4948f, 22.35f)
                curveTo(47.3086f, 22.2561f, 47.1779f, 22.1241f, 47.1023f, 21.9536f)
                curveTo(47.0266f, 21.7835f, 46.9977f, 21.5809f, 47.0152f, 21.3458f)
                curveTo(47.0326f, 21.111f, 47.0762f, 20.8586f, 47.146f, 20.5882f)
                lineTo(47.9133f, 17.3465f)
                lineTo(48.4192f, 15.1971f)
                lineTo(48.4193f, 15.1964f)
                horizontalLineTo(45.8378f)
                lineTo(44.6693f, 20.1831f)
                curveTo(44.5298f, 20.7821f, 44.4483f, 21.3519f, 44.4252f, 21.892f)
                curveTo(44.4016f, 22.4323f, 44.4831f, 22.9111f, 44.6693f, 23.3278f)
                curveTo(44.8552f, 23.7449f, 45.1691f, 24.0739f, 45.6111f, 24.3145f)
                curveTo(46.0528f, 24.555f, 46.675f, 24.6756f, 47.4773f, 24.6756f)
                curveTo(48.0354f, 24.6756f, 48.5179f, 24.6286f, 48.925f, 24.5346f)
                curveTo(48.9415f, 24.5309f, 48.9573f, 24.5268f, 48.9733f, 24.5228f)
                lineTo(48.9722f, 24.5275f)
                curveTo(48.8591f, 25.042f, 48.63f, 25.4592f, 48.2623f, 25.7848f)
                curveTo(47.8943f, 26.1108f, 47.3482f, 26.2737f, 46.6241f, 26.2737f)
                curveTo(46.315f, 26.2737f, 46.0341f, 26.2551f, 45.7795f, 26.2196f)
                lineTo(45.2822f, 28.3333f)
                curveTo(45.6186f, 28.3773f, 45.9915f, 28.4f, 46.4034f, 28.4f)
                curveTo(47.1729f, 28.4f, 47.8465f, 28.3112f, 48.4237f, 28.1341f)
                curveTo(49.0009f, 27.9568f, 49.4958f, 27.6883f, 49.9089f, 27.3281f)
                curveTo(50.3219f, 26.968f, 50.6671f, 26.5163f, 50.9445f, 25.9736f)
                curveTo(51.2217f, 25.4305f, 51.4452f, 24.7877f, 51.615f, 24.0444f)
                lineTo(53.3635f, 16.6194f)
                curveTo(53.3614f, 16.6184f, 53.3593f, 16.6176f, 53.3572f, 16.6167f)
                lineTo(53.6901f, 15.202f)
                close()
            }
            path(fill = SolidColor(Color(0xFF002855)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(41.2956f, 17.3485f)
                curveTo(40.1173f, 17.3485f, 39.8924f, 17.3485f, 39.4095f, 17.6014f)
                curveTo(39.0668f, 17.7809f, 38.7831f, 18.0507f, 38.534f, 18.3655f)
                curveTo(38.2846f, 18.6803f, 38.0892f, 19.0437f, 37.9477f, 19.4557f)
                curveTo(37.8058f, 19.868f, 37.7351f, 20.2971f, 37.7351f, 20.7435f)
                curveTo(37.7351f, 21.2929f, 37.8257f, 21.7282f, 38.0072f, 22.0485f)
                curveTo(38.1882f, 22.3691f, 38.5227f, 22.5292f, 39.01f, 22.5292f)
                curveTo(39.2706f, 22.5292f, 39.5057f, 22.4778f, 39.7155f, 22.3747f)
                curveTo(39.925f, 22.2718f, 40.149f, 22.1f, 40.3869f, 21.8596f)
                curveTo(40.4095f, 21.5737f, 40.4464f, 21.2732f, 40.4974f, 20.9582f)
                curveTo(40.5484f, 20.6436f, 40.613f, 20.3518f, 40.6698f, 20.0882f)
                lineTo(41.2956f, 17.3485f)
                close()
                moveTo(43.0898f, 20.5375f)
                curveTo(42.9309f, 21.1901f, 42.8856f, 21.8453f, 42.9536f, 22.5035f)
                curveTo(43.0218f, 23.162f, 43.271f, 24.1707f, 43.5141f, 24.6757f)
                horizontalLineTo(41.0687f)
                curveTo(40.77f, 24.1652f, 40.7835f, 23.926f, 40.7269f, 23.7656f)
                curveTo(40.4095f, 24.029f, 40.0582f, 24.2464f, 39.6731f, 24.4181f)
                curveTo(39.2877f, 24.5897f, 38.857f, 24.6757f, 38.381f, 24.6757f)
                curveTo(37.8144f, 24.6757f, 37.3299f, 24.5753f, 36.9278f, 24.3752f)
                curveTo(36.5253f, 24.175f, 36.1967f, 23.9059f, 35.9418f, 23.5682f)
                curveTo(35.6868f, 23.2307f, 35.5024f, 22.8357f, 35.3894f, 22.3834f)
                curveTo(35.2759f, 21.9313f, 35.2194f, 21.4476f, 35.2194f, 20.9325f)
                curveTo(35.2194f, 20.1426f, 35.3579f, 19.3985f, 35.6359f, 18.7003f)
                curveTo(35.9134f, 18.0021f, 36.2988f, 17.3925f, 36.7918f, 16.8715f)
                curveTo(37.2846f, 16.3507f, 38.4743f, 15.2022f, 40.4266f, 15.2022f)
                curveTo(41.2703f, 15.2022f, 42.4042f, 15.202f, 44.347f, 15.202f)
                lineTo(43.0898f, 20.5375f)
                close()
            }
            path(fill = SolidColor(Color(0xFF002855)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.3046f, 22.4969f)
                curveTo(28.4986f, 22.5431f, 28.7381f, 22.5661f, 29.0234f, 22.5661f)
                curveTo(29.4684f, 22.5661f, 29.8732f, 22.4826f, 30.2385f, 22.3155f)
                curveTo(30.6034f, 22.1485f, 30.9144f, 21.9152f, 31.1711f, 21.6153f)
                curveTo(31.4278f, 21.3158f, 31.6272f, 20.9558f, 31.77f, 20.535f)
                curveTo(31.9125f, 20.1144f, 31.9839f, 19.6507f, 31.9839f, 19.1435f)
                curveTo(31.9839f, 18.6481f, 31.8754f, 18.2273f, 31.6588f, 17.8816f)
                curveTo(31.442f, 17.5358f, 31.0618f, 17.3521f, 30.5257f, 17.3499f)
                curveTo(30.1508f, 17.3484f, 29.5283f, 17.3484f, 29.5283f, 17.3484f)
                lineTo(28.3046f, 22.4969f)
                close()
                moveTo(34.5166f, 18.9533f)
                curveTo(34.5166f, 19.7947f, 34.3797f, 20.5639f, 34.1059f, 21.261f)
                curveTo(33.8322f, 21.9584f, 33.4527f, 22.5605f, 32.968f, 23.0673f)
                curveTo(32.4828f, 23.5747f, 31.901f, 23.9693f, 31.2224f, 24.2516f)
                curveTo(30.5435f, 24.5337f, 29.8048f, 24.675f, 29.0062f, 24.675f)
                curveTo(28.6183f, 24.675f, 28.2303f, 24.6405f, 27.8426f, 24.5713f)
                lineTo(27.0725f, 27.7f)
                horizontalLineTo(24.5398f)
                lineTo(27.4797f, 15.2023f)
                curveTo(27.9074f, 15.202f, 30.17f, 15.2023f, 30.8545f, 15.2023f)
                curveTo(31.4933f, 15.2023f, 32.0438f, 15.3003f, 32.5058f, 15.4961f)
                curveTo(32.968f, 15.6922f, 33.3471f, 15.9601f, 33.6439f, 16.2999f)
                curveTo(33.9403f, 16.64f, 34.1599f, 17.0376f, 34.3027f, 17.4926f)
                curveTo(34.4451f, 17.9481f, 34.5166f, 18.4348f, 34.5166f, 18.9533f)
                close()
            }
            path(fill = SolidColor(Color(0xFF002855)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.9855f, 22.4929f)
                curveTo(22.6599f, 22.4929f, 22.404f, 22.4461f, 22.2182f, 22.352f)
                curveTo(22.032f, 22.2581f, 21.9012f, 22.1259f, 21.8258f, 21.9556f)
                curveTo(21.7499f, 21.7855f, 21.7211f, 21.5828f, 21.7385f, 21.3477f)
                curveTo(21.756f, 21.113f, 21.7995f, 20.8605f, 21.8693f, 20.5902f)
                lineTo(22.6368f, 17.3485f)
                horizontalLineTo(25.5146f)
                lineTo(26.0378f, 15.199f)
                horizontalLineTo(23.1425f)
                lineTo(23.8053f, 12.4681f)
                lineTo(21.1019f, 12.8911f)
                lineTo(19.3926f, 20.1849f)
                curveTo(19.2531f, 20.7839f, 19.1716f, 21.3538f, 19.1485f, 21.8939f)
                curveTo(19.125f, 22.4343f, 19.2065f, 22.9129f, 19.3926f, 23.3298f)
                curveTo(19.5785f, 23.7468f, 19.8924f, 24.0758f, 20.3345f, 24.3164f)
                curveTo(20.7762f, 24.557f, 21.3983f, 24.6775f, 22.2007f, 24.6775f)
                curveTo(22.7588f, 24.6775f, 23.2412f, 24.6305f, 23.6483f, 24.5366f)
                curveTo(23.6904f, 24.5269f, 23.7543f, 24.5113f, 23.7957f, 24.5011f)
                lineTo(24.3219f, 22.2775f)
                curveTo(24.1452f, 22.3384f, 23.9677f, 22.3791f, 23.7966f, 22.4137f)
                curveTo(23.535f, 22.4665f, 23.2646f, 22.4929f, 22.9855f, 22.4929f)
                close()
            }
            path(fill = SolidColor(Color(0xFF002855)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5402f, 15.1965f)
                lineTo(14.3094f, 24.6775f)
                horizontalLineTo(16.8364f)
                lineTo(19.0672f, 15.1965f)
                horizontalLineTo(16.5402f)
                close()
            }
            path(fill = SolidColor(Color(0xFF002855)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.329f, 14.1003f)
                lineTo(19.7165f, 12.4534f)
                horizontalLineTo(17.1895f)
                lineTo(16.8019f, 14.1003f)
                horizontalLineTo(19.329f)
                close()
            }
            path(fill = SolidColor(Color(0xFF002855)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.727f, 22.5612f)
                curveTo(9.124f, 22.5612f, 9.4984f, 22.4639f, 9.8502f, 22.269f)
                curveTo(10.2017f, 22.0742f, 10.5055f, 21.8134f, 10.7608f, 21.4868f)
                curveTo(11.016f, 21.1601f, 11.2173f, 20.7905f, 11.3648f, 20.378f)
                curveTo(11.5122f, 19.9655f, 11.5861f, 19.5357f, 11.5861f, 19.0886f)
                curveTo(11.5861f, 18.5385f, 11.4952f, 18.1087f, 11.3138f, 17.7994f)
                curveTo(11.1322f, 17.4899f, 10.7549f, 17.3485f, 10.2673f, 17.3485f)
                curveTo(10.1083f, 17.3485f, 9.9439f, 17.3639f, 9.6886f, 17.4212f)
                curveTo(9.4333f, 17.4787f, 9.2131f, 17.5976f, 9.0089f, 17.7809f)
                lineTo(7.8993f, 22.4965f)
                curveTo(8.2275f, 22.5546f, 8.3411f, 22.5612f, 8.4207f, 22.5612f)
                curveTo(8.4999f, 22.5612f, 8.6021f, 22.5612f, 8.727f, 22.5612f)
                close()
                moveTo(10.9393f, 15.2036f)
                curveTo(11.484f, 15.2036f, 11.9546f, 15.3011f, 12.352f, 15.4959f)
                curveTo(12.7489f, 15.6908f, 13.0779f, 15.9542f, 13.339f, 16.2865f)
                curveTo(13.5998f, 16.6191f, 13.7926f, 17.0085f, 13.9176f, 17.4556f)
                curveTo(14.0423f, 17.9025f, 14.1049f, 18.3839f, 14.1049f, 18.8995f)
                curveTo(14.1049f, 19.6903f, 13.9602f, 20.4381f, 13.6709f, 21.143f)
                curveTo(13.3815f, 21.8478f, 12.9873f, 22.4609f, 12.4881f, 22.9824f)
                curveTo(11.9887f, 23.504f, 11.3989f, 23.9166f, 10.7181f, 24.22f)
                curveTo(10.0374f, 24.5236f, 9.2998f, 24.6757f, 8.5058f, 24.6757f)
                curveTo(8.4037f, 24.6757f, 8.225f, 24.6727f, 7.9697f, 24.6671f)
                curveTo(7.7144f, 24.6611f, 7.4221f, 24.6354f, 7.0932f, 24.5897f)
                curveTo(6.7641f, 24.5437f, 6.4152f, 24.4751f, 6.0466f, 24.3834f)
                curveTo(5.6777f, 24.2918f, 5.329f, 24.1659f, 5.0f, 24.0053f)
                lineTo(7.9441f, 11.5075f)
                lineTo(10.5821f, 11.095f)
                lineTo(9.5398f, 15.5243f)
                curveTo(9.7666f, 15.4212f, 9.9805f, 15.3471f, 10.2076f, 15.2895f)
                curveTo(10.4344f, 15.2323f, 10.6783f, 15.2036f, 10.9393f, 15.2036f)
                close()
            }
        }
        .build()
        return _bitpay!!
    }

private var _bitpay: ImageVector? = null
