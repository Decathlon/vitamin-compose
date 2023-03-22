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

public val PaymentsGroup.Payoneer: ImageVector
    get() {
        if (_payoneer != null) {
            return _payoneer!!
        }
        _payoneer = Builder(name = "Payoneer", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFFF78223)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.1717f, 11.0f)
                curveTo(33.3349f, 11.0371f, 33.4982f, 11.0928f, 33.6614f, 11.1175f)
                curveTo(34.3386f, 11.2289f, 34.8827f, 11.6f, 35.3482f, 12.0887f)
                curveTo(35.4631f, 12.2062f, 35.578f, 12.4412f, 35.5296f, 12.5649f)
                curveTo(35.4752f, 12.701f, 35.2576f, 12.8309f, 35.0943f, 12.8557f)
                curveTo(33.5707f, 13.0845f, 32.0895f, 13.4928f, 30.6687f, 14.0928f)
                curveTo(29.8464f, 14.4392f, 29.0423f, 14.8598f, 28.2563f, 15.2866f)
                curveTo(26.5453f, 16.2268f, 25.1548f, 17.5814f, 23.7944f, 18.9732f)
                curveTo(22.3555f, 20.4454f, 21.0133f, 22.0041f, 19.8404f, 23.7052f)
                curveTo(19.1088f, 24.7629f, 18.4256f, 25.8577f, 17.7727f, 26.9711f)
                curveTo(17.4462f, 27.5278f, 17.2346f, 28.1526f, 16.9686f, 28.7464f)
                curveTo(16.9262f, 28.833f, 16.8355f, 28.9876f, 16.8053f, 28.9753f)
                curveTo(16.6904f, 28.9381f, 16.5212f, 28.8701f, 16.4909f, 28.7773f)
                curveTo(16.4184f, 28.5485f, 16.3458f, 28.2825f, 16.3881f, 28.0536f)
                curveTo(16.6179f, 26.8103f, 17.1258f, 25.666f, 17.688f, 24.5464f)
                curveTo(18.7823f, 22.3814f, 20.1548f, 20.4082f, 21.7569f, 18.6144f)
                curveTo(22.6699f, 17.5938f, 23.6131f, 16.5979f, 24.5865f, 15.6454f)
                curveTo(26.0496f, 14.2041f, 27.682f, 12.9856f, 29.5018f, 12.0454f)
                curveTo(30.3422f, 11.6124f, 31.2128f, 11.2845f, 32.1378f, 11.1052f)
                curveTo(32.295f, 11.0742f, 32.4462f, 11.0371f, 32.5973f, 11.0062f)
                curveTo(32.7969f, 11.0f, 32.9843f, 11.0f, 33.1717f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF616161)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 24.8186f)
                curveTo(4.0846f, 24.3547f, 4.1512f, 23.9279f, 4.2358f, 23.5011f)
                curveTo(4.6711f, 21.1567f, 5.1125f, 18.8186f, 5.5478f, 16.4742f)
                curveTo(5.578f, 16.3258f, 5.6203f, 16.2268f, 5.7654f, 16.2021f)
                curveTo(6.896f, 16.0289f, 8.0326f, 15.9052f, 9.1632f, 16.1959f)
                curveTo(10.1487f, 16.4433f, 10.838f, 17.1547f, 10.9528f, 17.9897f)
                curveTo(11.1886f, 19.6536f, 10.2394f, 20.9835f, 8.8307f, 21.4598f)
                curveTo(8.0871f, 21.7072f, 7.3313f, 21.7691f, 6.5635f, 21.6949f)
                curveTo(6.3821f, 21.6763f, 6.3277f, 21.7258f, 6.2975f, 21.9052f)
                curveTo(6.1342f, 22.8145f, 5.9649f, 23.7175f, 5.7896f, 24.6206f)
                curveTo(5.7775f, 24.6949f, 5.711f, 24.8124f, 5.6687f, 24.8124f)
                curveTo(5.1185f, 24.8248f, 4.5804f, 24.8186f, 4.0f, 24.8186f)
                close()
                moveTo(6.5998f, 20.2227f)
                curveTo(6.9686f, 20.2227f, 7.3011f, 20.2536f, 7.6215f, 20.2165f)
                curveTo(8.2503f, 20.1485f, 8.7521f, 19.8578f, 9.0363f, 19.2454f)
                curveTo(9.3567f, 18.5526f, 9.127f, 17.8165f, 8.5224f, 17.6f)
                curveTo(8.0931f, 17.4454f, 7.6518f, 17.4763f, 7.2104f, 17.5382f)
                curveTo(7.156f, 17.5444f, 7.0834f, 17.631f, 7.0713f, 17.6866f)
                curveTo(6.9202f, 18.4969f, 6.769f, 19.3134f, 6.5998f, 20.2227f)
                close()
            }
            path(fill = SolidColor(Color(0xFF616161)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.7195f, 23.6309f)
                curveTo(14.4172f, 23.9525f, 14.1753f, 24.2804f, 13.867f, 24.5216f)
                curveTo(13.2322f, 25.0226f, 12.5066f, 25.134f, 11.7751f, 24.7876f)
                curveTo(11.0496f, 24.4474f, 10.7533f, 23.7855f, 10.7231f, 23.0061f)
                curveTo(10.6566f, 21.367f, 11.2189f, 20.0123f, 12.5671f, 19.0721f)
                curveTo(13.4135f, 18.4783f, 14.3869f, 18.2989f, 15.3966f, 18.3546f)
                curveTo(15.9105f, 18.3855f, 16.4184f, 18.5092f, 16.9323f, 18.5834f)
                curveTo(17.1378f, 18.6144f, 17.1681f, 18.7319f, 17.1318f, 18.9113f)
                curveTo(16.902f, 20.136f, 16.6602f, 21.3546f, 16.4667f, 22.5793f)
                curveTo(16.364f, 23.2288f, 16.3337f, 23.8968f, 16.2914f, 24.5525f)
                curveTo(16.2793f, 24.7505f, 16.2309f, 24.8309f, 16.0314f, 24.8247f)
                curveTo(15.6566f, 24.8123f, 15.2817f, 24.8123f, 14.9069f, 24.8247f)
                curveTo(14.7134f, 24.8309f, 14.6469f, 24.7566f, 14.665f, 24.5649f)
                curveTo(14.6892f, 24.268f, 14.7013f, 23.9587f, 14.7195f, 23.6309f)
                close()
                moveTo(15.1427f, 19.8082f)
                curveTo(14.5562f, 19.6412f, 14.0665f, 19.7587f, 13.6554f, 20.1113f)
                curveTo(12.8815f, 20.7793f, 12.5308f, 21.6453f, 12.5973f, 22.6783f)
                curveTo(12.6155f, 22.9938f, 12.7364f, 23.2968f, 13.0629f, 23.4329f)
                curveTo(13.3894f, 23.569f, 13.6856f, 23.47f, 13.9395f, 23.2474f)
                curveTo(14.0907f, 23.1113f, 14.2358f, 22.9566f, 14.3446f, 22.7834f)
                curveTo(14.919f, 21.8865f, 14.9311f, 20.835f, 15.1427f, 19.8082f)
                close()
            }
            path(fill = SolidColor(Color(0xFF616161)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.5574f, 24.967f)
                curveTo(24.9553f, 24.967f, 24.0423f, 24.3608f, 23.7098f, 23.2722f)
                curveTo(23.1596f, 21.4783f, 24.2177f, 18.6763f, 26.8053f, 18.3794f)
                curveTo(27.5792f, 18.2928f, 28.3047f, 18.3917f, 28.9395f, 18.8742f)
                curveTo(29.5441f, 19.3319f, 29.8404f, 19.9752f, 29.8827f, 20.7361f)
                curveTo(29.9311f, 21.5278f, 29.7981f, 22.2825f, 29.4353f, 22.9876f)
                curveTo(28.7521f, 24.299f, 27.6578f, 24.9361f, 26.5574f, 24.967f)
                close()
                moveTo(25.4329f, 22.2701f)
                curveTo(25.4329f, 22.3629f, 25.4268f, 22.4618f, 25.4329f, 22.5546f)
                curveTo(25.4813f, 23.2041f, 25.9347f, 23.6185f, 26.5333f, 23.5629f)
                curveTo(26.8658f, 23.5319f, 27.1258f, 23.3526f, 27.3313f, 23.0928f)
                curveTo(27.8694f, 22.3938f, 28.075f, 21.5897f, 28.0024f, 20.7175f)
                curveTo(27.942f, 20.0062f, 27.416f, 19.6289f, 26.7751f, 19.7773f)
                curveTo(26.4607f, 19.8515f, 26.2249f, 20.0495f, 26.0375f, 20.3093f)
                curveTo(25.6203f, 20.8969f, 25.451f, 21.5588f, 25.4329f, 22.2701f)
                close()
            }
            path(fill = SolidColor(Color(0xFF616161)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.3216f, 18.5092f)
                curveTo(31.8355f, 18.5092f, 32.3253f, 18.5092f, 32.8573f, 18.5092f)
                curveTo(32.8331f, 18.8433f, 32.8089f, 19.1649f, 32.7787f, 19.4927f)
                curveTo(32.954f, 19.3257f, 33.1112f, 19.1649f, 33.2745f, 19.0226f)
                curveTo(33.873f, 18.4907f, 34.5562f, 18.2556f, 35.3482f, 18.3855f)
                curveTo(36.0012f, 18.4969f, 36.4547f, 18.9855f, 36.5272f, 19.6721f)
                curveTo(36.6118f, 20.4391f, 36.4547f, 21.1814f, 36.3156f, 21.9237f)
                curveTo(36.1463f, 22.8206f, 35.9831f, 23.7175f, 35.8077f, 24.6082f)
                curveTo(35.7896f, 24.6886f, 35.6989f, 24.8062f, 35.6385f, 24.8123f)
                curveTo(35.1185f, 24.8247f, 34.5985f, 24.8185f, 34.0786f, 24.8123f)
                curveTo(34.0544f, 24.8123f, 34.0302f, 24.7938f, 33.9819f, 24.769f)
                curveTo(34.0786f, 24.2556f, 34.1753f, 23.736f, 34.266f, 23.2165f)
                curveTo(34.4051f, 22.4185f, 34.5381f, 21.6268f, 34.659f, 20.8288f)
                curveTo(34.6832f, 20.6927f, 34.6711f, 20.5505f, 34.653f, 20.4144f)
                curveTo(34.6046f, 19.9381f, 34.26f, 19.7216f, 33.8126f, 19.8639f)
                curveTo(33.3773f, 20.0062f, 33.1173f, 20.3525f, 32.9057f, 20.736f)
                curveTo(32.5913f, 21.2989f, 32.4825f, 21.9237f, 32.3736f, 22.5484f)
                curveTo(32.2527f, 23.235f, 32.1378f, 23.9154f, 32.0048f, 24.602f)
                curveTo(31.9867f, 24.6824f, 31.896f, 24.8062f, 31.8355f, 24.8123f)
                curveTo(31.3035f, 24.8309f, 30.7654f, 24.8247f, 30.1729f, 24.8247f)
                curveTo(30.5719f, 22.6969f, 30.9468f, 20.6123f, 31.3216f, 18.5092f)
                close()
            }
            path(fill = SolidColor(Color(0xFF616161)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(39.0121f, 22.3444f)
                curveTo(38.9698f, 22.9877f, 39.3991f, 23.4454f, 40.0399f, 23.5258f)
                curveTo(40.6627f, 23.6001f, 41.2612f, 23.5011f, 41.8416f, 23.2722f)
                curveTo(41.9021f, 23.2475f, 41.9686f, 23.2227f, 42.0351f, 23.198f)
                curveTo(42.0472f, 23.1918f, 42.0653f, 23.198f, 42.1137f, 23.198f)
                curveTo(42.15f, 23.5753f, 42.1923f, 23.9526f, 42.2104f, 24.3299f)
                curveTo(42.2165f, 24.4042f, 42.1318f, 24.5217f, 42.0593f, 24.5526f)
                curveTo(41.0496f, 24.9732f, 40.0037f, 25.1217f, 38.9396f, 24.8434f)
                curveTo(37.948f, 24.5836f, 37.4039f, 23.8537f, 37.2951f, 22.833f)
                curveTo(37.1379f, 21.3918f, 37.549f, 20.1299f, 38.6433f, 19.1774f)
                curveTo(39.5442f, 18.3918f, 40.6022f, 18.1444f, 41.7509f, 18.497f)
                curveTo(42.5188f, 18.732f, 42.948f, 19.3196f, 43.0024f, 20.1299f)
                curveTo(43.0569f, 20.9279f, 42.7183f, 21.5403f, 41.9928f, 21.9114f)
                curveTo(41.4245f, 22.2021f, 40.8138f, 22.3073f, 40.1911f, 22.3444f)
                curveTo(39.8041f, 22.3629f, 39.4112f, 22.3444f, 39.0121f, 22.3444f)
                close()
                moveTo(39.1875f, 21.0021f)
                curveTo(39.653f, 21.1011f, 40.6082f, 20.9836f, 40.9771f, 20.7856f)
                curveTo(41.231f, 20.6495f, 41.3579f, 20.433f, 41.3156f, 20.1732f)
                curveTo(41.2733f, 19.9073f, 41.098f, 19.7774f, 40.8561f, 19.7155f)
                curveTo(40.1367f, 19.5361f, 39.2842f, 20.1794f, 39.1875f, 21.0021f)
                close()
            }
            path(fill = SolidColor(Color(0xFF616161)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(45.052f, 22.3691f)
                curveTo(44.9976f, 22.9752f, 45.4208f, 23.4392f, 46.0677f, 23.5258f)
                curveTo(46.6723f, 23.6f, 47.2527f, 23.5072f, 47.821f, 23.2969f)
                curveTo(47.9178f, 23.2598f, 48.0085f, 23.2227f, 48.1354f, 23.1732f)
                curveTo(48.1717f, 23.5752f, 48.2201f, 23.9526f, 48.2382f, 24.3299f)
                curveTo(48.2442f, 24.4041f, 48.1596f, 24.5216f, 48.0931f, 24.5526f)
                curveTo(47.0653f, 24.9855f, 46.0072f, 25.134f, 44.925f, 24.8309f)
                curveTo(43.9516f, 24.5587f, 43.4438f, 23.835f, 43.3228f, 22.8453f)
                curveTo(43.1717f, 21.5773f, 43.4921f, 20.433f, 44.3567f, 19.4928f)
                curveTo(45.2878f, 18.4845f, 46.4305f, 18.1258f, 47.7485f, 18.4969f)
                curveTo(48.5526f, 18.7258f, 48.9819f, 19.3196f, 49.0302f, 20.1546f)
                curveTo(49.0786f, 20.9711f, 48.7158f, 21.5835f, 47.9601f, 21.9422f)
                curveTo(47.1983f, 22.301f, 46.3881f, 22.3567f, 45.5659f, 22.3752f)
                curveTo(45.4027f, 22.3691f, 45.2334f, 22.3691f, 45.052f, 22.3691f)
                close()
                moveTo(45.2273f, 21.0515f)
                curveTo(45.6143f, 21.0268f, 45.977f, 21.0206f, 46.3337f, 20.9711f)
                curveTo(46.5756f, 20.9402f, 46.8174f, 20.866f, 47.0351f, 20.7608f)
                curveTo(47.2708f, 20.6557f, 47.3857f, 20.433f, 47.3494f, 20.1608f)
                curveTo(47.3132f, 19.901f, 47.1439f, 19.7773f, 46.9081f, 19.7154f)
                curveTo(46.1947f, 19.5175f, 45.3059f, 20.1855f, 45.2273f, 21.0515f)
                close()
            }
            path(fill = SolidColor(Color(0xFF616161)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(49.133f, 24.8185f)
                curveTo(49.2116f, 24.3608f, 49.2841f, 23.9463f, 49.3627f, 23.5257f)
                curveTo(49.6771f, 21.9237f, 49.9976f, 20.3216f, 50.1306f, 18.6824f)
                curveTo(50.1366f, 18.6144f, 50.2273f, 18.503f, 50.2757f, 18.4969f)
                curveTo(50.7352f, 18.4845f, 51.1947f, 18.4907f, 51.6904f, 18.4907f)
                curveTo(51.6542f, 18.9298f, 51.6239f, 19.3443f, 51.5937f, 19.7525f)
                curveTo(52.1499f, 18.9175f, 52.7908f, 18.2371f, 53.9395f, 18.3608f)
                curveTo(53.8247f, 18.9484f, 53.7279f, 19.4927f, 53.613f, 20.0309f)
                curveTo(53.601f, 20.0742f, 53.5224f, 20.1298f, 53.474f, 20.136f)
                curveTo(52.2829f, 20.2969f, 51.7811f, 20.7298f, 51.4849f, 21.9793f)
                curveTo(51.2793f, 22.8453f, 51.1403f, 23.736f, 50.9649f, 24.6144f)
                curveTo(50.9528f, 24.6886f, 50.8863f, 24.8061f, 50.844f, 24.8061f)
                curveTo(50.2878f, 24.8247f, 49.7315f, 24.8185f, 49.133f, 24.8185f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF78223)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.9674f, 16.9814f)
                curveTo(19.9492f, 17.8474f, 19.8041f, 18.6825f, 19.5139f, 19.4866f)
                curveTo(19.4837f, 19.5732f, 19.4232f, 19.6474f, 19.3628f, 19.7216f)
                curveTo(19.2297f, 19.901f, 19.0846f, 19.9196f, 18.9819f, 19.7216f)
                curveTo(18.8489f, 19.4618f, 18.74f, 19.1835f, 18.6735f, 18.9051f)
                curveTo(18.48f, 18.033f, 18.2987f, 17.1546f, 18.1354f, 16.2701f)
                curveTo(17.9238f, 15.1443f, 17.7364f, 14.0124f, 17.5429f, 12.8866f)
                curveTo(17.5127f, 12.7258f, 17.5006f, 12.5588f, 17.4885f, 12.3979f)
                curveTo(17.4764f, 12.2124f, 17.5792f, 12.1196f, 17.7364f, 12.1814f)
                curveTo(17.8936f, 12.2371f, 18.0508f, 12.3299f, 18.1657f, 12.4474f)
                curveTo(19.127f, 13.4928f, 19.7316f, 14.7113f, 19.8948f, 16.1464f)
                curveTo(19.9311f, 16.4247f, 19.9432f, 16.7031f, 19.9674f, 16.9814f)
                close()
            }
        }
        .build()
        return _payoneer!!
    }

private var _payoneer: ImageVector? = null
