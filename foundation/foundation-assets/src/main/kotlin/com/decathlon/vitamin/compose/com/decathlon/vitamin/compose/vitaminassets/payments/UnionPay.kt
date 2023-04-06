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

public val PaymentsGroup.UnionPay: ImageVector
    get() {
        if (_unionPay != null) {
            return _unionPay!!
        }
        _unionPay = Builder(name = "UnionPay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF01798A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(49.6704f, 6.0083f)
                lineTo(38.6172f, 6.0055f)
                curveTo(38.6159f, 6.0055f, 38.6143f, 6.0055f, 38.6143f, 6.0055f)
                curveTo(38.6058f, 6.0055f, 38.5974f, 6.007f, 38.5891f, 6.007f)
                curveTo(37.0706f, 6.0529f, 35.1794f, 7.2561f, 34.835f, 8.7396f)
                lineTo(29.6078f, 31.5886f)
                curveTo(29.2634f, 33.086f, 30.2004f, 34.3045f, 31.7079f, 34.3269f)
                horizontalLineTo(43.3197f)
                curveTo(44.8042f, 34.2543f, 46.2467f, 33.065f, 46.5853f, 31.5983f)
                lineTo(51.8126f, 8.7492f)
                curveTo(52.1626f, 7.2366f, 51.2029f, 6.0083f, 49.6704f, 6.0083f)
                close()
            }
            path(fill = SolidColor(Color(0xFF024381)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.6079f, 31.5885f)
                lineTo(34.835f, 8.7395f)
                curveTo(35.1795f, 7.256f, 37.0707f, 6.0528f, 38.5891f, 6.0069f)
                lineTo(34.1944f, 6.0041f)
                lineTo(26.2764f, 6.0026f)
                curveTo(24.7537f, 6.0333f, 22.8379f, 7.2449f, 22.4936f, 8.7395f)
                lineTo(17.2649f, 31.5885f)
                curveTo(16.9192f, 33.0859f, 17.8576f, 34.3043f, 19.3641f, 34.3268f)
                horizontalLineTo(31.7079f)
                curveTo(30.2005f, 34.3043f, 29.2634f, 33.0859f, 29.6079f, 31.5885f)
            }
            path(fill = SolidColor(Color(0xFFDD0228)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.2649f, 31.5885f)
                lineTo(22.4936f, 8.7396f)
                curveTo(22.8379f, 7.245f, 24.7537f, 6.0334f, 26.2764f, 6.0026f)
                lineTo(16.133f, 6.0f)
                curveTo(14.6018f, 6.0f, 12.6386f, 7.2255f, 12.2887f, 8.7396f)
                lineTo(7.06f, 31.5885f)
                curveTo(7.0282f, 31.728f, 7.0105f, 31.8646f, 7.0f, 31.9983f)
                verticalLineTo(32.4222f)
                curveTo(7.1024f, 33.5138f, 7.9462f, 34.3086f, 9.1592f, 34.3268f)
                horizontalLineTo(19.3641f)
                curveTo(17.8576f, 34.3044f, 16.9192f, 33.0859f, 17.2649f, 31.5885f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.4902f, 22.6519f)
                horizontalLineTo(26.6822f)
                curveTo(26.8586f, 22.6519f, 26.9773f, 22.5934f, 27.0329f, 22.4776f)
                lineTo(27.5317f, 21.7401f)
                horizontalLineTo(28.8675f)
                lineTo(28.5889f, 22.2252f)
                horizontalLineTo(30.1906f)
                lineTo(29.9874f, 22.9684f)
                horizontalLineTo(28.0816f)
                curveTo(27.8621f, 23.2946f, 27.5919f, 23.448f, 27.267f, 23.4298f)
                horizontalLineTo(26.2743f)
                lineTo(26.4902f, 22.6519f)
                horizontalLineTo(26.4902f)
                close()
                moveTo(26.2709f, 23.717f)
                horizontalLineTo(29.7799f)
                lineTo(29.5562f, 24.5244f)
                horizontalLineTo(28.145f)
                lineTo(27.9297f, 25.3036f)
                horizontalLineTo(29.3029f)
                lineTo(29.0792f, 26.1109f)
                horizontalLineTo(27.706f)
                lineTo(27.387f, 27.2624f)
                curveTo(27.308f, 27.4548f, 27.4119f, 27.5414f, 27.6969f, 27.5217f)
                horizontalLineTo(28.816f)
                lineTo(28.6087f, 28.2719f)
                horizontalLineTo(26.46f)
                curveTo(26.0527f, 28.2719f, 25.913f, 28.0418f, 26.0408f, 27.5804f)
                lineTo(26.4486f, 26.1109f)
                horizontalLineTo(25.5709f)
                lineTo(25.7938f, 25.3036f)
                horizontalLineTo(26.6717f)
                lineTo(26.8869f, 24.5244f)
                horizontalLineTo(26.0478f)
                lineTo(26.2709f, 23.717f)
                horizontalLineTo(26.2709f)
                close()
                moveTo(31.8716f, 21.7346f)
                lineTo(31.8163f, 22.2072f)
                curveTo(31.8163f, 22.2072f, 32.4782f, 21.7163f, 33.0794f, 21.7163f)
                horizontalLineTo(35.3008f)
                lineTo(34.4513f, 24.7542f)
                curveTo(34.3808f, 25.1015f, 34.0787f, 25.2742f, 33.5452f, 25.2742f)
                horizontalLineTo(31.0274f)
                lineTo(30.4376f, 27.4074f)
                curveTo(30.4036f, 27.5217f, 30.4517f, 27.5804f, 30.5787f, 27.5804f)
                horizontalLineTo(31.0741f)
                lineTo(30.892f, 28.2425f)
                horizontalLineTo(29.6325f)
                curveTo(29.1491f, 28.2425f, 28.948f, 28.0989f, 29.0278f, 27.8104f)
                lineTo(30.6943f, 21.7346f)
                horizontalLineTo(31.8716f)
                horizontalLineTo(31.8716f)
                close()
                moveTo(33.7527f, 22.5934f)
                horizontalLineTo(31.77f)
                lineTo(31.5328f, 23.4131f)
                curveTo(31.5328f, 23.4131f, 31.863f, 23.1776f, 32.4148f, 23.1692f)
                curveTo(32.9651f, 23.1607f, 33.5932f, 23.1692f, 33.5932f, 23.1692f)
                lineTo(33.7527f, 22.5934f)
                close()
                moveTo(33.0344f, 24.495f)
                curveTo(33.181f, 24.5146f, 33.263f, 24.4573f, 33.2729f, 24.3221f)
                lineTo(33.3942f, 23.89f)
                horizontalLineTo(31.4085f)
                lineTo(31.2419f, 24.495f)
                horizontalLineTo(33.0344f)
                close()
                moveTo(31.695f, 25.4765f)
                horizontalLineTo(32.8396f)
                lineTo(32.8183f, 25.9658f)
                horizontalLineTo(33.1231f)
                curveTo(33.277f, 25.9658f, 33.3534f, 25.9171f, 33.3534f, 25.8209f)
                lineTo(33.4436f, 25.5044f)
                horizontalLineTo(34.3949f)
                lineTo(34.2678f, 25.9658f)
                curveTo(34.1604f, 26.3506f, 33.8755f, 26.5514f, 33.4126f, 26.571f)
                horizontalLineTo(32.8029f)
                lineTo(32.8001f, 27.4074f)
                curveTo(32.7889f, 27.5414f, 32.9115f, 27.6097f, 33.1641f, 27.6097f)
                horizontalLineTo(33.7371f)
                lineTo(33.5522f, 28.2719f)
                horizontalLineTo(32.1777f)
                curveTo(31.7924f, 28.29f, 31.6035f, 28.1087f, 31.6074f, 27.724f)
                lineTo(31.695f, 25.4765f)
                verticalLineTo(25.4765f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.8252f, 17.6873f)
                curveTo(17.6699f, 18.4388f, 17.31f, 19.016f, 16.7518f, 19.4258f)
                curveTo(16.1987f, 19.8288f, 15.4852f, 20.0309f, 14.6117f, 20.0309f)
                curveTo(13.7897f, 20.0309f, 13.187f, 19.8245f, 12.8024f, 19.4105f)
                curveTo(12.5357f, 19.1163f, 12.403f, 18.7426f, 12.403f, 18.2909f)
                curveTo(12.403f, 18.1041f, 12.4256f, 17.9034f, 12.4708f, 17.6873f)
                lineTo(13.4015f, 13.2539f)
                horizontalLineTo(14.8071f)
                lineTo(13.8891f, 17.6371f)
                curveTo(13.8609f, 17.7584f, 13.8496f, 17.8714f, 13.8511f, 17.9731f)
                curveTo(13.8496f, 18.1976f, 13.906f, 18.3816f, 14.0203f, 18.5252f)
                curveTo(14.1868f, 18.7385f, 14.4571f, 18.8444f, 14.8332f, 18.8444f)
                curveTo(15.2657f, 18.8444f, 15.6221f, 18.7399f, 15.8987f, 18.5293f)
                curveTo(16.1754f, 18.3202f, 16.356f, 18.0233f, 16.4371f, 17.6371f)
                lineTo(17.358f, 13.2539f)
                horizontalLineTo(18.7565f)
                lineTo(17.8252f, 17.6873f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.7284f, 15.9431f)
                horizontalLineTo(24.8292f)
                lineTo(23.9669f, 19.8998f)
                horizontalLineTo(22.8682f)
                lineTo(23.7284f, 15.9431f)
                close()
                moveTo(24.0749f, 14.5016f)
                horizontalLineTo(25.1856f)
                lineTo(24.9781f, 15.462f)
                horizontalLineTo(23.8675f)
                lineTo(24.0749f, 14.5016f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.8037f, 19.5987f)
                curveTo(25.5157f, 19.3268f, 25.3704f, 18.9602f, 25.369f, 18.4945f)
                curveTo(25.369f, 18.415f, 25.3739f, 18.3244f, 25.3845f, 18.2254f)
                curveTo(25.3951f, 18.125f, 25.4086f, 18.0274f, 25.4276f, 17.9368f)
                curveTo(25.5581f, 17.2941f, 25.8362f, 16.7839f, 26.2644f, 16.4074f)
                curveTo(26.692f, 16.0296f, 27.2079f, 15.84f, 27.8119f, 15.84f)
                curveTo(28.3066f, 15.84f, 28.6989f, 15.9766f, 28.9861f, 16.2499f)
                curveTo(29.2732f, 16.5246f, 29.4172f, 16.8953f, 29.4172f, 17.3667f)
                curveTo(29.4172f, 17.4474f, 29.4109f, 17.5409f, 29.4003f, 17.6412f)
                curveTo(29.3875f, 17.743f, 29.3722f, 17.8406f, 29.3543f, 17.9368f)
                curveTo(29.2267f, 18.5697f, 28.9495f, 19.0745f, 28.5211f, 19.444f)
                curveTo(28.0928f, 19.8162f, 27.5784f, 20.0015f, 26.9786f, 20.0015f)
                curveTo(26.4818f, 20.0015f, 26.0909f, 19.8677f, 25.8037f, 19.5987f)
                moveTo(27.9016f, 18.8151f)
                curveTo(28.0956f, 18.6074f, 28.2346f, 18.2923f, 28.3193f, 17.8727f)
                curveTo(28.332f, 17.8072f, 28.3432f, 17.7388f, 28.3502f, 17.6705f)
                curveTo(28.3573f, 17.6036f, 28.3601f, 17.5409f, 28.3601f, 17.4837f)
                curveTo(28.3601f, 17.2397f, 28.2973f, 17.0501f, 28.171f, 16.9163f)
                curveTo(28.0455f, 16.781f, 27.867f, 16.7142f, 27.6363f, 16.7142f)
                curveTo(27.3314f, 16.7142f, 27.083f, 16.82f, 26.8884f, 17.032f)
                curveTo(26.692f, 17.244f, 26.553f, 17.5646f, 26.4655f, 17.9912f)
                curveTo(26.4535f, 18.0567f, 26.4437f, 18.1223f, 26.4346f, 18.1864f)
                curveTo(26.4275f, 18.2519f, 26.4254f, 18.3132f, 26.4268f, 18.369f)
                curveTo(26.4268f, 18.6116f, 26.4896f, 18.7984f, 26.6159f, 18.9308f)
                curveTo(26.7414f, 19.0633f, 26.9191f, 19.1288f, 27.1529f, 19.1288f)
                curveTo(27.4591f, 19.1288f, 27.7075f, 19.0243f, 27.9016f, 18.8151f)
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(36.5597f, 22.6853f)
                lineTo(36.8251f, 21.7625f)
                horizontalLineTo(38.1672f)
                lineTo(38.1093f, 22.1011f)
                curveTo(38.1093f, 22.1011f, 38.7951f, 21.7625f, 39.289f, 21.7625f)
                curveTo(39.7831f, 21.7625f, 40.9485f, 21.7625f, 40.9485f, 21.7625f)
                lineTo(40.6848f, 22.6853f)
                horizontalLineTo(40.4237f)
                lineTo(39.1718f, 27.038f)
                horizontalLineTo(39.4329f)
                lineTo(39.1846f, 27.9024f)
                horizontalLineTo(38.9235f)
                lineTo(38.8149f, 28.2774f)
                horizontalLineTo(37.5151f)
                lineTo(37.6236f, 27.9024f)
                horizontalLineTo(35.0594f)
                lineTo(35.3093f, 27.038f)
                horizontalLineTo(35.5662f)
                lineTo(36.8192f, 22.6853f)
                horizontalLineTo(36.5597f)
                horizontalLineTo(36.5597f)
                close()
                moveTo(38.0077f, 22.6853f)
                lineTo(37.6661f, 23.8633f)
                curveTo(37.6661f, 23.8633f, 38.2506f, 23.6418f, 38.7543f, 23.579f)
                curveTo(38.8656f, 23.1677f, 39.011f, 22.6853f, 39.011f, 22.6853f)
                horizontalLineTo(38.0077f)
                lineTo(38.0077f, 22.6853f)
                close()
                moveTo(37.5079f, 24.4155f)
                lineTo(37.1652f, 25.6494f)
                curveTo(37.1652f, 25.6494f, 37.8129f, 25.3343f, 38.2574f, 25.3078f)
                curveTo(38.3857f, 24.8309f, 38.5143f, 24.4155f, 38.5143f, 24.4155f)
                horizontalLineTo(37.5079f)
                verticalLineTo(24.4155f)
                close()
                moveTo(37.7591f, 27.038f)
                lineTo(38.016f, 26.143f)
                horizontalLineTo(37.0143f)
                lineTo(36.756f, 27.038f)
                horizontalLineTo(37.7591f)
                close()
                moveTo(41.0051f, 21.7053f)
                horizontalLineTo(42.2669f)
                lineTo(42.3204f, 22.1652f)
                curveTo(42.3121f, 22.2823f, 42.3825f, 22.3383f, 42.5321f, 22.3383f)
                horizontalLineTo(42.755f)
                lineTo(42.5295f, 23.1175f)
                horizontalLineTo(41.6021f)
                curveTo(41.248f, 23.1356f, 41.0659f, 23.0019f, 41.049f, 22.7132f)
                lineTo(41.0051f, 21.7053f)
                close()
                moveTo(40.6354f, 23.3769f)
                horizontalLineTo(44.7224f)
                lineTo(44.4826f, 24.2134f)
                horizontalLineTo(43.1813f)
                lineTo(42.9582f, 24.9912f)
                horizontalLineTo(44.2581f)
                lineTo(44.0168f, 25.8264f)
                horizontalLineTo(42.569f)
                lineTo(42.2414f, 26.3159f)
                horizontalLineTo(42.95f)
                lineTo(43.1137f, 27.2959f)
                curveTo(43.1333f, 27.3935f, 43.2208f, 27.4409f, 43.3704f, 27.4409f)
                horizontalLineTo(43.5905f)
                lineTo(43.3592f, 28.248f)
                horizontalLineTo(42.5802f)
                curveTo(42.1765f, 28.2676f, 41.9678f, 28.1338f, 41.9507f, 27.8452f)
                lineTo(41.7629f, 26.9502f)
                lineTo(41.1181f, 27.9024f)
                curveTo(40.9656f, 28.1714f, 40.7313f, 28.297f, 40.4154f, 28.2774f)
                horizontalLineTo(39.2256f)
                lineTo(39.457f, 27.4701f)
                horizontalLineTo(39.8283f)
                curveTo(39.9807f, 27.4701f, 40.1076f, 27.4032f, 40.2219f, 27.268f)
                lineTo(41.2311f, 25.8264f)
                horizontalLineTo(39.9298f)
                lineTo(40.171f, 24.9912f)
                horizontalLineTo(41.5823f)
                lineTo(41.8068f, 24.2134f)
                horizontalLineTo(40.3941f)
                lineTo(40.6354f, 23.3769f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.12f, 15.9417f)
                horizontalLineTo(20.1128f)
                lineTo(19.9992f, 16.5133f)
                lineTo(20.1417f, 16.3502f)
                curveTo(20.4635f, 16.0101f, 20.8544f, 15.8413f, 21.3159f, 15.8413f)
                curveTo(21.7336f, 15.8413f, 22.0349f, 15.9613f, 22.2241f, 16.2024f)
                curveTo(22.4103f, 16.4436f, 22.4611f, 16.7769f, 22.373f, 17.2049f)
                lineTo(21.8261f, 19.9012f)
                horizontalLineTo(20.8057f)
                lineTo(21.2997f, 17.4572f)
                curveTo(21.3505f, 17.2049f, 21.3365f, 17.0166f, 21.258f, 16.8953f)
                curveTo(21.1805f, 16.774f, 21.0322f, 16.7141f, 20.8184f, 16.7141f)
                curveTo(20.5559f, 16.7141f, 20.3351f, 16.7949f, 20.1551f, 16.9553f)
                curveTo(19.9744f, 17.117f, 19.8552f, 17.3415f, 19.7967f, 17.6273f)
                lineTo(19.3415f, 19.9012f)
                horizontalLineTo(18.3191f)
                lineTo(19.12f, 15.9417f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.5052f, 15.9417f)
                horizontalLineTo(31.4988f)
                lineTo(31.386f, 16.5133f)
                lineTo(31.5269f, 16.3502f)
                curveTo(31.849f, 16.0101f, 32.2412f, 15.8413f, 32.7013f, 15.8413f)
                curveTo(33.1191f, 15.8413f, 33.421f, 15.9613f, 33.6086f, 16.2024f)
                curveTo(33.7937f, 16.4436f, 33.8472f, 16.7769f, 33.7569f, 17.2049f)
                lineTo(33.2121f, 19.9012f)
                horizontalLineTo(32.1904f)
                lineTo(32.6844f, 17.4572f)
                curveTo(32.7351f, 17.2049f, 32.7211f, 17.0166f, 32.6434f, 16.8953f)
                curveTo(32.5629f, 16.774f, 32.4175f, 16.7141f, 32.2046f, 16.7141f)
                curveTo(31.942f, 16.7141f, 31.7219f, 16.7949f, 31.5398f, 16.9553f)
                curveTo(31.3591f, 17.117f, 31.2393f, 17.3415f, 31.1829f, 17.6273f)
                lineTo(30.7256f, 19.9012f)
                horizontalLineTo(29.7045f)
                lineTo(30.5052f, 15.9417f)
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(35.4166f, 13.4879f)
                horizontalLineTo(38.3012f)
                curveTo(38.8559f, 13.4879f, 39.2848f, 13.6121f, 39.5797f, 13.8559f)
                curveTo(39.8732f, 14.1028f, 40.0202f, 14.4569f, 40.0202f, 14.9184f)
                verticalLineTo(14.9323f)
                curveTo(40.0202f, 15.0201f, 40.0143f, 15.1191f, 40.006f, 15.2264f)
                curveTo(39.9917f, 15.3324f, 39.9733f, 15.4397f, 39.9496f, 15.5513f)
                curveTo(39.8226f, 16.1619f, 39.5275f, 16.6527f, 39.0718f, 17.025f)
                curveTo(38.6144f, 17.3958f, 38.0726f, 17.5826f, 37.4489f, 17.5826f)
                horizontalLineTo(35.9019f)
                lineTo(35.4236f, 19.9011f)
                horizontalLineTo(34.0842f)
                lineTo(35.4166f, 13.4879f)
                moveTo(36.1376f, 16.4673f)
                horizontalLineTo(37.4206f)
                curveTo(37.755f, 16.4673f, 38.0202f, 16.3905f, 38.2137f, 16.2387f)
                curveTo(38.4057f, 16.0853f, 38.5327f, 15.8511f, 38.6032f, 15.5333f)
                curveTo(38.6144f, 15.4746f, 38.6214f, 15.4217f, 38.6299f, 15.3729f)
                curveTo(38.6343f, 15.3269f, 38.6398f, 15.2808f, 38.6398f, 15.2363f)
                curveTo(38.6398f, 15.009f, 38.5581f, 14.8445f, 38.3943f, 14.7413f)
                curveTo(38.2306f, 14.6366f, 37.9739f, 14.5866f, 37.6181f, 14.5866f)
                horizontalLineTo(36.5285f)
                lineTo(36.1376f, 16.4673f)
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(46.015f, 20.6667f)
                curveTo(45.5916f, 21.5561f, 45.1881f, 22.0746f, 44.9512f, 22.3158f)
                curveTo(44.7138f, 22.5543f, 44.244f, 23.1092f, 43.1122f, 23.0673f)
                lineTo(43.2096f, 22.3884f)
                curveTo(44.162f, 22.0984f, 44.6772f, 20.792f, 44.9707f, 20.2135f)
                lineTo(44.6208f, 15.9529f)
                lineTo(45.3575f, 15.9431f)
                horizontalLineTo(45.9756f)
                lineTo(46.042f, 18.6158f)
                lineTo(47.2005f, 15.9431f)
                horizontalLineTo(48.3733f)
                lineTo(46.015f, 20.6667f)
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(42.7355f, 16.2652f)
                lineTo(42.2695f, 16.5817f)
                curveTo(41.7827f, 16.2053f, 41.3381f, 15.9725f, 40.4803f, 16.3656f)
                curveTo(39.3116f, 16.9009f, 38.335f, 21.0068f, 41.5527f, 19.6545f)
                lineTo(41.7361f, 19.8691f)
                lineTo(43.0021f, 19.9012f)
                lineTo(43.8333f, 16.1704f)
                lineTo(42.7355f, 16.2652f)
                moveTo(42.0156f, 18.3049f)
                curveTo(41.8123f, 18.8975f, 41.3581f, 19.2892f, 41.0024f, 19.1777f)
                curveTo(40.6468f, 19.0689f, 40.5198f, 18.4972f, 40.7258f, 17.9034f)
                curveTo(40.929f, 17.3094f, 41.3862f, 16.9191f, 41.739f, 17.0306f)
                curveTo(42.0946f, 17.1394f, 42.223f, 17.7109f, 42.0156f, 18.3049f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE02F41)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(38.6143f, 6.0129f)
                lineTo(34.1943f, 6.0041f)
                lineTo(38.5891f, 6.0229f)
                curveTo(38.5974f, 6.0229f, 38.6058f, 6.0129f, 38.6143f, 6.0129f)
            }
            path(fill = SolidColor(Color(0xFF2E4F7D)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.1944f, 6.0275f)
                lineTo(26.3372f, 6.0f)
                curveTo(26.3174f, 6.0f, 26.2969f, 6.0087f, 26.2764f, 6.0175f)
                lineTo(34.1944f, 6.0275f)
            }
        }
        .build()
        return _unionPay!!
    }

private var _unionPay: ImageVector? = null
