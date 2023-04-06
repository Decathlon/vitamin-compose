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

public val PaymentsGroup.Eway: ImageVector
    get() {
        if (_eway != null) {
            return _eway!!
        }
        _eway = Builder(name = "Eway", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFFFCB922)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.8113f, 8.0073f)
                curveTo(16.0628f, 8.0911f, 16.3318f, 8.0948f, 16.5904f, 8.1422f)
                curveTo(18.0857f, 8.4338f, 19.4203f, 9.0864f, 20.5767f, 10.1181f)
                curveTo(22.0056f, 11.3904f, 22.9663f, 12.9798f, 23.3646f, 14.8974f)
                curveTo(23.9795f, 17.8503f, 23.3402f, 20.497f, 21.4396f, 22.7828f)
                curveTo(20.1819f, 24.2957f, 18.5888f, 25.2472f, 16.7022f, 25.6227f)
                curveTo(14.316f, 26.0966f, 12.108f, 25.6081f, 10.1236f, 24.1426f)
                curveTo(8.3628f, 22.8411f, 7.2238f, 21.0767f, 6.7487f, 18.8784f)
                curveTo(6.2247f, 16.4614f, 6.6125f, 14.1865f, 7.8842f, 12.0903f)
                curveTo(8.7121f, 10.7269f, 9.8336f, 9.6879f, 11.2101f, 8.9515f)
                curveTo(12.1499f, 8.4484f, 13.1526f, 8.1458f, 14.2042f, 8.0365f)
                curveTo(14.2426f, 8.0328f, 14.288f, 8.051f, 14.309f, 8.0f)
                curveTo(14.8086f, 8.0073f, 15.3117f, 8.0073f, 15.8113f, 8.0073f)
                close()
                moveTo(15.0636f, 9.6806f)
                curveTo(11.3813f, 9.6405f, 8.1951f, 12.7684f, 8.1322f, 16.7712f)
                curveTo(8.0658f, 20.8689f, 11.252f, 24.1134f, 15.0287f, 24.128f)
                curveTo(18.8019f, 24.1426f, 21.9601f, 20.9709f, 21.9881f, 16.9681f)
                curveTo(22.0091f, 12.9215f, 18.9102f, 9.6806f, 15.0636f, 9.6806f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFCB922)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.2007f, 30.9744f)
                curveTo(26.8268f, 30.9234f, 26.446f, 30.9489f, 26.0722f, 30.9343f)
                curveTo(24.8983f, 30.8833f, 23.7245f, 30.8286f, 22.5541f, 30.7338f)
                curveTo(21.6213f, 30.6609f, 20.6885f, 30.5734f, 19.7591f, 30.4677f)
                curveTo(18.7075f, 30.3474f, 17.6594f, 30.2052f, 16.6113f, 30.0412f)
                curveTo(15.3536f, 29.8443f, 14.0994f, 29.611f, 12.8556f, 29.3376f)
                curveTo(9.4982f, 28.5975f, 6.2177f, 27.6059f, 3.0838f, 26.1185f)
                curveTo(3.0594f, 26.1076f, 3.0349f, 26.0894f, 3.0f, 26.0711f)
                curveTo(3.0908f, 26.031f, 3.1642f, 26.0602f, 3.2411f, 26.0821f)
                curveTo(5.5434f, 26.7237f, 7.8702f, 27.2596f, 10.2179f, 27.6898f)
                curveTo(11.9822f, 28.0142f, 13.7535f, 28.2877f, 15.5318f, 28.5064f)
                curveTo(16.779f, 28.6595f, 18.0263f, 28.7944f, 19.2805f, 28.9074f)
                curveTo(20.7409f, 29.0386f, 22.2012f, 29.1371f, 23.6651f, 29.2063f)
                curveTo(24.8844f, 29.2647f, 26.1071f, 29.2938f, 27.3264f, 29.3193f)
                curveTo(28.2767f, 29.3376f, 29.2235f, 29.3412f, 30.1738f, 29.3303f)
                curveTo(31.7145f, 29.3121f, 33.2552f, 29.2683f, 34.7959f, 29.1845f)
                curveTo(36.2877f, 29.1043f, 37.7795f, 28.9985f, 39.2678f, 28.8564f)
                curveTo(40.7771f, 28.7105f, 42.2863f, 28.5356f, 43.7921f, 28.3241f)
                curveTo(46.4438f, 27.9523f, 49.0745f, 27.471f, 51.6843f, 26.8549f)
                curveTo(52.7569f, 26.6034f, 53.8224f, 26.3263f, 54.881f, 26.0238f)
                curveTo(54.902f, 26.0165f, 54.9264f, 26.0201f, 54.9998f, 26.0128f)
                curveTo(54.9125f, 26.0639f, 54.8705f, 26.093f, 54.8216f, 26.1149f)
                curveTo(52.9071f, 27.0336f, 50.9227f, 27.7554f, 48.8964f, 28.3569f)
                curveTo(47.2578f, 28.8418f, 45.5983f, 29.2428f, 43.9249f, 29.5782f)
                curveTo(42.5833f, 29.848f, 41.2347f, 30.0667f, 39.8792f, 30.2526f)
                curveTo(38.335f, 30.4677f, 36.7838f, 30.6281f, 35.2291f, 30.7484f)
                curveTo(34.209f, 30.8286f, 33.1853f, 30.8833f, 32.1652f, 30.9234f)
                curveTo(31.9206f, 30.9343f, 31.6726f, 30.8979f, 31.4315f, 30.9781f)
                curveTo(30.0201f, 30.9744f, 28.6086f, 30.9744f, 27.2007f, 30.9744f)
                close()
            }
            path(fill = SolidColor(Color(0xFF424143)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.6785f, 13.946f)
                curveTo(28.413f, 14.8428f, 28.151f, 15.7359f, 27.8854f, 16.6327f)
                curveTo(27.5046f, 17.9306f, 27.1203f, 19.2284f, 26.7465f, 20.5262f)
                curveTo(26.7011f, 20.683f, 26.6102f, 20.6502f, 26.5124f, 20.6574f)
                curveTo(26.4041f, 20.6684f, 26.3517f, 20.6392f, 26.3168f, 20.5153f)
                curveTo(25.8102f, 18.6013f, 25.2966f, 16.6911f, 24.7865f, 14.7771f)
                curveTo(24.6678f, 14.3251f, 24.5455f, 13.8767f, 24.4197f, 13.4283f)
                curveTo(24.3848f, 13.308f, 24.4127f, 13.2825f, 24.528f, 13.2825f)
                curveTo(24.8739f, 13.2788f, 24.8704f, 13.2752f, 24.9647f, 13.6434f)
                curveTo(25.4713f, 15.6594f, 25.9779f, 17.6754f, 26.4845f, 19.695f)
                curveTo(26.495f, 19.7315f, 26.5054f, 19.7679f, 26.5334f, 19.8591f)
                curveTo(26.6242f, 19.5419f, 26.7046f, 19.2721f, 26.7814f, 19.0024f)
                curveTo(27.3195f, 17.1577f, 27.854f, 15.313f, 28.385f, 13.4684f)
                curveTo(28.427f, 13.3262f, 28.4794f, 13.2788f, 28.6191f, 13.2825f)
                curveTo(28.9475f, 13.2934f, 28.951f, 13.2861f, 29.0453f, 13.6142f)
                curveTo(29.6288f, 15.6302f, 30.2157f, 17.6499f, 30.7992f, 19.6659f)
                curveTo(30.8131f, 19.7169f, 30.8306f, 19.7643f, 30.862f, 19.8591f)
                curveTo(30.9738f, 19.4216f, 31.0752f, 19.0242f, 31.1765f, 18.6269f)
                curveTo(31.6132f, 16.8916f, 32.0499f, 15.1563f, 32.4831f, 13.421f)
                curveTo(32.5111f, 13.308f, 32.5565f, 13.2752f, 32.6613f, 13.2825f)
                curveTo(32.7696f, 13.2898f, 32.8814f, 13.2861f, 33.0072f, 13.2861f)
                curveTo(32.8464f, 13.8949f, 32.6892f, 14.4819f, 32.532f, 15.0724f)
                curveTo(32.0499f, 16.8806f, 31.5643f, 18.6888f, 31.0786f, 20.497f)
                curveTo(31.0542f, 20.5955f, 31.0332f, 20.6793f, 30.904f, 20.6574f)
                curveTo(30.7957f, 20.6429f, 30.6943f, 20.6866f, 30.6454f, 20.508f)
                curveTo(30.0271f, 18.3826f, 29.3982f, 16.2609f, 28.7728f, 14.1355f)
                curveTo(28.7554f, 14.0735f, 28.7309f, 14.0116f, 28.7134f, 13.9496f)
                curveTo(28.6995f, 13.9496f, 28.689f, 13.946f, 28.6785f, 13.946f)
                close()
            }
            path(fill = SolidColor(Color(0xFF424143)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.6177f, 13.9095f)
                curveTo(34.6003f, 13.421f, 34.5409f, 13.5194f, 34.9322f, 13.421f)
                curveTo(35.9104f, 13.184f, 36.8991f, 13.0965f, 37.8843f, 13.3663f)
                curveTo(38.6494f, 13.5741f, 39.0582f, 14.0954f, 39.149f, 14.9157f)
                curveTo(39.1735f, 15.1381f, 39.184f, 15.3641f, 39.184f, 15.5865f)
                curveTo(39.184f, 17.1905f, 39.184f, 18.7946f, 39.1805f, 20.395f)
                curveTo(39.1805f, 20.4569f, 39.2468f, 20.559f, 39.1176f, 20.5809f)
                curveTo(38.9918f, 20.6064f, 38.9429f, 20.5408f, 38.908f, 20.4278f)
                curveTo(38.873f, 20.3002f, 38.8521f, 20.1179f, 38.7682f, 20.0705f)
                curveTo(38.6774f, 20.0158f, 38.5551f, 20.1689f, 38.4363f, 20.22f)
                curveTo(37.4616f, 20.6356f, 36.4554f, 20.8069f, 35.4213f, 20.5189f)
                curveTo(34.5444f, 20.2747f, 34.0238f, 19.5711f, 33.9784f, 18.6232f)
                curveTo(33.9504f, 18.0144f, 34.0308f, 17.4348f, 34.45f, 16.9645f)
                curveTo(34.8134f, 16.5598f, 35.285f, 16.3775f, 35.7881f, 16.2864f)
                curveTo(36.5323f, 16.1515f, 37.2834f, 16.1625f, 38.031f, 16.1005f)
                curveTo(38.2267f, 16.0823f, 38.4258f, 16.075f, 38.6215f, 16.064f)
                curveTo(38.6739f, 16.0604f, 38.7298f, 16.064f, 38.7298f, 15.9838f)
                curveTo(38.7298f, 15.488f, 38.7612f, 14.9849f, 38.5865f, 14.5074f)
                curveTo(38.4014f, 13.997f, 37.9996f, 13.7746f, 37.514f, 13.6944f)
                curveTo(36.5707f, 13.534f, 35.6379f, 13.6215f, 34.719f, 13.884f)
                curveTo(34.6841f, 13.8949f, 34.6527f, 13.9022f, 34.6177f, 13.9095f)
                close()
                moveTo(38.7298f, 18.0363f)
                curveTo(38.7298f, 17.5514f, 38.7263f, 17.0666f, 38.7298f, 16.5781f)
                curveTo(38.7298f, 16.4796f, 38.7158f, 16.4432f, 38.6075f, 16.4541f)
                curveTo(38.1848f, 16.4906f, 37.762f, 16.5051f, 37.3393f, 16.5416f)
                curveTo(36.8257f, 16.5853f, 36.3052f, 16.5817f, 35.7951f, 16.6838f)
                curveTo(35.2361f, 16.7968f, 34.7749f, 17.0593f, 34.5479f, 17.6389f)
                curveTo(34.4221f, 17.9597f, 34.4081f, 18.2988f, 34.4291f, 18.6414f)
                curveTo(34.471f, 19.4216f, 34.8693f, 19.9648f, 35.596f, 20.1471f)
                curveTo(36.6825f, 20.4205f, 37.7026f, 20.1835f, 38.6669f, 19.6294f)
                curveTo(38.7403f, 19.5856f, 38.7298f, 19.5237f, 38.7298f, 19.4581f)
                curveTo(38.7298f, 18.9841f, 38.7298f, 18.5102f, 38.7298f, 18.0363f)
                close()
            }
            path(fill = SolidColor(Color(0xFF424143)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(41.4793f, 24.2301f)
                curveTo(41.8496f, 23.3151f, 42.206f, 22.4292f, 42.5623f, 21.5397f)
                curveTo(42.6846f, 21.2371f, 42.7999f, 20.9345f, 42.9257f, 20.6356f)
                curveTo(42.9641f, 20.5444f, 42.9641f, 20.4679f, 42.9292f, 20.3767f)
                curveTo(42.3108f, 18.7253f, 41.6959f, 17.0702f, 41.081f, 15.4151f)
                curveTo(40.8225f, 14.7152f, 40.5639f, 14.0152f, 40.2914f, 13.2861f)
                curveTo(40.4556f, 13.2861f, 40.6024f, 13.2825f, 40.7491f, 13.2861f)
                curveTo(40.8365f, 13.2898f, 40.833f, 13.3736f, 40.8539f, 13.4319f)
                curveTo(41.1753f, 14.3178f, 41.4898f, 15.2037f, 41.8042f, 16.0896f)
                curveTo(42.2479f, 17.34f, 42.6916f, 18.5868f, 43.1353f, 19.8372f)
                curveTo(43.1458f, 19.8664f, 43.1632f, 19.8882f, 43.1842f, 19.9283f)
                curveTo(43.4916f, 19.0716f, 43.7956f, 18.2259f, 44.0961f, 17.3837f)
                curveTo(44.5642f, 16.075f, 45.0358f, 14.7626f, 45.497f, 13.4502f)
                curveTo(45.5459f, 13.3153f, 45.6018f, 13.2788f, 45.7311f, 13.2825f)
                curveTo(46.0595f, 13.2898f, 46.0595f, 13.2861f, 45.9407f, 13.6069f)
                curveTo(44.7843f, 16.702f, 43.6279f, 19.8007f, 42.468f, 22.8958f)
                curveTo(42.3213f, 23.2896f, 42.1675f, 23.6833f, 42.0278f, 24.0806f)
                curveTo(41.9859f, 24.1937f, 41.9405f, 24.2483f, 41.8182f, 24.2338f)
                curveTo(41.7134f, 24.2192f, 41.6086f, 24.2301f, 41.4793f, 24.2301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF424143)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(48.1242f, 15.528f)
                curveTo(48.0194f, 15.5208f, 47.9146f, 15.528f, 47.8098f, 15.5098f)
                curveTo(47.1006f, 15.3932f, 46.8875f, 14.8974f, 46.9189f, 14.1318f)
                curveTo(46.9224f, 14.0297f, 46.9434f, 13.9276f, 46.9643f, 13.8292f)
                curveTo(47.0482f, 13.4173f, 47.2997f, 13.173f, 47.684f, 13.0855f)
                curveTo(48.0055f, 13.0126f, 48.3304f, 13.0162f, 48.6518f, 13.111f)
                curveTo(48.9802f, 13.2095f, 49.1898f, 13.4355f, 49.2772f, 13.7782f)
                curveTo(49.361f, 14.1099f, 49.361f, 14.449f, 49.2806f, 14.7844f)
                curveTo(49.1758f, 15.2145f, 48.8439f, 15.4807f, 48.3688f, 15.5208f)
                curveTo(48.2884f, 15.528f, 48.2046f, 15.5208f, 48.1242f, 15.5208f)
                curveTo(48.1242f, 15.5208f, 48.1242f, 15.5244f, 48.1242f, 15.528f)
                close()
                moveTo(48.1242f, 15.2911f)
                curveTo(48.2011f, 15.2911f, 48.2745f, 15.2984f, 48.3513f, 15.2911f)
                curveTo(48.7461f, 15.2546f, 48.9557f, 15.0869f, 49.0466f, 14.7224f)
                curveTo(49.1234f, 14.4198f, 49.1199f, 14.1099f, 49.0361f, 13.8073f)
                curveTo(48.9557f, 13.523f, 48.7706f, 13.3589f, 48.4981f, 13.3042f)
                curveTo(48.3339f, 13.2714f, 48.1627f, 13.2605f, 47.995f, 13.2714f)
                curveTo(47.422f, 13.3079f, 47.174f, 13.5777f, 47.153f, 14.1792f)
                curveTo(47.153f, 14.2156f, 47.153f, 14.2521f, 47.153f, 14.2886f)
                curveTo(47.153f, 15.0177f, 47.422f, 15.2984f, 48.1242f, 15.2911f)
                close()
            }
            path(fill = SolidColor(Color(0xFF424143)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.3617f, 19.2867f)
                curveTo(18.3617f, 19.8773f, 18.3582f, 20.4715f, 18.3652f, 21.0658f)
                curveTo(18.3652f, 21.1715f, 18.2988f, 21.1788f, 18.2359f, 21.2043f)
                curveTo(17.3939f, 21.5834f, 16.51f, 21.7621f, 15.5947f, 21.7949f)
                curveTo(14.9169f, 21.8204f, 14.2461f, 21.7949f, 13.5963f, 21.5907f)
                curveTo(12.3735f, 21.2079f, 11.6468f, 20.3221f, 11.308f, 19.068f)
                curveTo(11.004f, 17.9488f, 10.9865f, 16.8041f, 11.0809f, 15.6557f)
                curveTo(11.1333f, 15.0068f, 11.259f, 14.3725f, 11.5106f, 13.771f)
                curveTo(11.9752f, 12.6591f, 12.7893f, 11.9992f, 13.9212f, 11.7513f)
                curveTo(14.7108f, 11.5764f, 15.5039f, 11.5618f, 16.2934f, 11.7331f)
                curveTo(17.4813f, 11.9883f, 18.2254f, 12.7539f, 18.5713f, 13.9533f)
                curveTo(18.7809f, 14.686f, 18.8473f, 15.4407f, 18.8613f, 16.1989f)
                curveTo(18.8683f, 16.6255f, 18.8613f, 17.0484f, 18.8718f, 17.4749f)
                curveTo(18.8752f, 17.6061f, 18.8438f, 17.6499f, 18.7076f, 17.6499f)
                curveTo(16.8664f, 17.6462f, 15.0252f, 17.6499f, 13.1806f, 17.6462f)
                curveTo(13.0338f, 17.6462f, 12.9989f, 17.6863f, 13.0268f, 17.8285f)
                curveTo(13.0723f, 18.0582f, 13.1142f, 18.2915f, 13.1876f, 18.5175f)
                curveTo(13.488f, 19.4508f, 14.1273f, 19.9393f, 15.0637f, 19.9575f)
                curveTo(16.1607f, 19.9794f, 17.2158f, 19.7862f, 18.2219f, 19.3195f)
                curveTo(18.2604f, 19.3013f, 18.2988f, 19.2685f, 18.3617f, 19.2867f)
                close()
                moveTo(14.9204f, 15.9182f)
                curveTo(15.5318f, 15.9182f, 16.1432f, 15.9146f, 16.7546f, 15.9219f)
                curveTo(16.8594f, 15.9219f, 16.8943f, 15.8964f, 16.8908f, 15.7833f)
                curveTo(16.8769f, 15.3933f, 16.8524f, 15.0068f, 16.7511f, 14.6313f)
                curveTo(16.6323f, 14.2012f, 16.4227f, 13.8475f, 16.0174f, 13.647f)
                curveTo(15.6157f, 13.4465f, 15.1929f, 13.4465f, 14.7702f, 13.4976f)
                curveTo(14.2322f, 13.5632f, 13.778f, 13.7929f, 13.467f, 14.2741f)
                curveTo(13.1841f, 14.7152f, 13.0827f, 15.2146f, 13.0094f, 15.7287f)
                curveTo(12.9849f, 15.9036f, 13.0268f, 15.9255f, 13.1771f, 15.9255f)
                curveTo(13.757f, 15.9146f, 14.337f, 15.9182f, 14.9204f, 15.9182f)
                close()
            }
            path(fill = SolidColor(Color(0xFF424143)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(48.7217f, 14.9594f)
                curveTo(48.5295f, 15.025f, 48.4247f, 14.9485f, 48.3653f, 14.7698f)
                curveTo(48.3444f, 14.7078f, 48.2989f, 14.6532f, 48.2815f, 14.5912f)
                curveTo(48.2291f, 14.3797f, 48.0718f, 14.4308f, 47.9321f, 14.4271f)
                curveTo(47.8727f, 14.4271f, 47.8727f, 14.4709f, 47.8727f, 14.5146f)
                curveTo(47.8727f, 14.6167f, 47.8692f, 14.7188f, 47.8727f, 14.8245f)
                curveTo(47.8762f, 14.9193f, 47.8727f, 14.9813f, 47.7504f, 14.9813f)
                curveTo(47.6351f, 14.9776f, 47.6351f, 14.9229f, 47.6351f, 14.8354f)
                curveTo(47.6386f, 14.4672f, 47.6421f, 14.0954f, 47.6351f, 13.7272f)
                curveTo(47.6316f, 13.6105f, 47.6701f, 13.5814f, 47.7749f, 13.585f)
                curveTo(47.9531f, 13.5959f, 48.1347f, 13.5887f, 48.3129f, 13.6032f)
                curveTo(48.4561f, 13.6142f, 48.5714f, 13.6944f, 48.6029f, 13.8475f)
                curveTo(48.6378f, 14.0152f, 48.6658f, 14.2011f, 48.5225f, 14.3214f)
                curveTo(48.4247f, 14.4053f, 48.4527f, 14.4563f, 48.4981f, 14.5402f)
                curveTo(48.5784f, 14.6787f, 48.6518f, 14.8209f, 48.7217f, 14.9594f)
                close()
                moveTo(48.1242f, 13.8147f)
                curveTo(47.8832f, 13.8147f, 47.8168f, 13.9204f, 47.8762f, 14.1391f)
                curveTo(47.8902f, 14.1865f, 47.9111f, 14.1938f, 47.9496f, 14.1938f)
                curveTo(48.0544f, 14.1902f, 48.1557f, 14.1902f, 48.2605f, 14.1829f)
                curveTo(48.3548f, 14.1756f, 48.4037f, 14.1173f, 48.4072f, 14.0188f)
                curveTo(48.4107f, 13.9131f, 48.3653f, 13.8438f, 48.264f, 13.8293f)
                curveTo(48.2046f, 13.8183f, 48.1487f, 13.8183f, 48.1242f, 13.8147f)
                close()
            }
        }
        .build()
        return _eway!!
    }

private var _eway: ImageVector? = null
