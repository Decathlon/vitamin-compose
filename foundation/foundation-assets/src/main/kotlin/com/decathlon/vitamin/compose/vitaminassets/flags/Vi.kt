package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Vi: ImageVector
    get() {
        if (_vi != null) {
            return _vi!!
        }
        _vi = Builder(name = "Vi", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.9997f,0.0f), end = Offset(13.9997f,20.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(27.9997f, 0.0f)
                    horizontalLineTo(-3.0E-4f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(27.9997f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1583C4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.7987f, 8.6727f)
                    lineTo(17.7044f, 16.5124f)
                    curveTo(17.6192f, 16.6755f, 17.6824f, 16.8769f, 17.8456f, 16.9621f)
                    curveTo(18.0088f, 17.0473f, 18.2102f, 16.9841f, 18.2954f, 16.821f)
                    lineTo(22.3896f, 8.9813f)
                    curveTo(22.4748f, 8.8181f, 22.4116f, 8.6167f, 22.2485f, 8.5315f)
                    curveTo(22.0853f, 8.4463f, 21.8839f, 8.5095f, 21.7987f, 8.6727f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1583C4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.3744f, 10.4176f)
                    lineTo(17.7354f, 16.4638f)
                    curveTo(17.6233f, 16.6098f, 17.6509f, 16.8191f, 17.7969f, 16.9311f)
                    curveTo(17.943f, 17.0432f, 18.1523f, 17.0157f, 18.2643f, 16.8696f)
                    lineTo(22.9033f, 10.8234f)
                    curveTo(23.0154f, 10.6773f, 22.9878f, 10.4681f, 22.8418f, 10.356f)
                    curveTo(22.6957f, 10.2439f, 22.4865f, 10.2715f, 22.3744f, 10.4176f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1583C4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.2969f, 9.8786f)
                    lineTo(17.6895f, 16.5453f)
                    curveTo(17.6224f, 16.7167f, 17.7071f, 16.91f, 17.8785f, 16.9771f)
                    curveTo(18.05f, 17.0442f, 18.2433f, 16.9595f, 18.3104f, 16.7881f)
                    lineTo(20.9178f, 10.1214f)
                    curveTo(20.9848f, 9.95f, 20.9002f, 9.7566f, 20.7288f, 9.6896f)
                    curveTo(20.5573f, 9.6225f, 20.364f, 9.7071f, 20.2969f, 9.8786f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF409347)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.681f, 8.7635f)
                    curveTo(5.7189f, 8.8883f, 5.7875f, 9.1047f, 5.8805f, 9.3824f)
                    curveTo(6.0356f, 9.8451f, 6.2022f, 10.308f, 6.3745f, 10.7412f)
                    curveTo(6.5722f, 11.2385f, 6.7649f, 11.6651f, 6.9498f, 12.0013f)
                    curveTo(6.9826f, 12.061f, 7.0152f, 12.1177f, 7.0474f, 12.1715f)
                    curveTo(7.2607f, 12.5269f, 7.599f, 12.9904f, 8.0372f, 13.54f)
                    curveTo(8.12f, 13.6438f, 8.2058f, 13.7501f, 8.2944f, 13.8585f)
                    curveTo(8.6136f, 14.2488f, 8.9551f, 14.6505f, 9.2965f, 15.0416f)
                    curveTo(9.5014f, 15.2762f, 9.661f, 15.4554f, 9.7526f, 15.5568f)
                    curveTo(9.8761f, 15.6934f, 10.0869f, 15.7041f, 10.2234f, 15.5806f)
                    curveTo(10.36f, 15.4572f, 10.3707f, 15.2464f, 10.2472f, 15.1098f)
                    curveTo(10.158f, 15.0111f, 10.0009f, 14.8347f, 9.7987f, 14.6031f)
                    curveTo(9.4616f, 14.2171f, 9.1247f, 13.8206f, 8.8105f, 13.4365f)
                    curveTo(8.7236f, 13.3301f, 8.6395f, 13.226f, 8.5585f, 13.1244f)
                    curveTo(8.1372f, 12.596f, 7.8137f, 12.1529f, 7.6191f, 11.8285f)
                    curveTo(7.5913f, 11.7821f, 7.5629f, 11.7326f, 7.534f, 11.6801f)
                    curveTo(7.3645f, 11.3719f, 7.1824f, 10.9687f, 6.994f, 10.4949f)
                    curveTo(6.8268f, 10.0743f, 6.6641f, 9.6226f, 6.5127f, 9.1706f)
                    curveTo(6.4218f, 8.8994f, 6.3551f, 8.6889f, 6.3189f, 8.5698f)
                    curveTo(6.2654f, 8.3937f, 6.0792f, 8.2942f, 5.903f, 8.3477f)
                    curveTo(5.7269f, 8.4012f, 5.6275f, 8.5874f, 5.681f, 8.7635f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1583C4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(25.3332f, 8.6667f)
                    verticalLineTo(12.0f)
                    curveTo(25.3332f, 12.3682f, 25.6316f, 12.6667f, 25.9998f, 12.6667f)
                    curveTo(26.368f, 12.6667f, 26.6665f, 12.3682f, 26.6665f, 12.0f)
                    verticalLineTo(8.6667f)
                    curveTo(26.6665f, 8.2985f, 26.368f, 8.0f, 25.9998f, 8.0f)
                    curveTo(25.6316f, 8.0f, 25.3332f, 8.2985f, 25.3332f, 8.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF1583C4)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(3.3333f, 10.205f)
                    lineTo(2.619f, 8.4191f)
                    curveTo(2.4822f, 8.0772f, 2.0943f, 7.911f, 1.7524f, 8.0477f)
                    curveTo(1.4106f, 8.1844f, 1.2443f, 8.5724f, 1.381f, 8.9143f)
                    lineTo(2.7143f, 12.2476f)
                    curveTo(2.9379f, 12.8064f, 3.7288f, 12.8064f, 3.9523f, 12.2476f)
                    lineTo(5.2857f, 8.9143f)
                    curveTo(5.4224f, 8.5724f, 5.2561f, 8.1844f, 4.9143f, 8.0477f)
                    curveTo(4.5724f, 7.911f, 4.1844f, 8.0772f, 4.0477f, 8.4191f)
                    lineTo(3.3333f, 10.205f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFF8CE61), 1.0f to Color(0xFFF3C44B),
                        start = Offset(13.9992f,2.63794f), end = Offset(13.9992f,16.9858f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(19.9994f, 8.6666f)
                    curveTo(19.9994f, 8.6666f, 20.0469f, 9.5527f, 18.9286f, 10.0f)
                    curveTo(17.8104f, 10.4473f, 16.666f, 10.0f, 16.666f, 10.0f)
                    curveTo(16.666f, 10.0f, 17.4895f, 10.4836f, 17.9994f, 11.3333f)
                    curveTo(18.5092f, 12.183f, 18.2424f, 12.6443f, 18.666f, 13.0679f)
                    curveTo(19.0896f, 13.4915f, 19.8545f, 13.2026f, 20.1572f, 13.5657f)
                    curveTo(20.46f, 13.9287f, 20.4362f, 14.3441f, 19.9994f, 14.6667f)
                    curveTo(19.5625f, 14.9892f, 19.4238f, 14.8388f, 18.9286f, 14.5087f)
                    curveTo(18.4335f, 14.1786f, 18.666f, 13.8489f, 18.666f, 13.8489f)
                    curveTo(18.666f, 13.8489f, 17.8136f, 13.4075f, 17.1623f, 13.2169f)
                    curveTo(16.666f, 12.2909f, 15.9994f, 12.0f, 15.9994f, 12.0f)
                    verticalLineTo(12.6666f)
                    curveTo(15.9994f, 12.6666f, 17.3327f, 13.3504f, 17.3327f, 14.0f)
                    curveTo(17.3327f, 14.2839f, 16.7164f, 15.2219f, 15.9994f, 15.8892f)
                    curveTo(15.0761f, 16.7484f, 13.9994f, 16.9858f, 13.9994f, 16.9858f)
                    verticalLineTo(7.3333f)
                    lineTo(17.9994f, 6.6666f)
                    curveTo(17.9994f, 6.6666f, 16.1576f, 5.2176f, 20.3327f, 4.2043f)
                    curveTo(24.5078f, 3.1911f, 25.3723f, 2.9809f, 25.3723f, 2.9809f)
                    curveTo(26.0868f, 2.8073f, 26.3603f, 3.1692f, 25.9623f, 3.7885f)
                    curveTo(25.9623f, 3.7885f, 25.93f, 3.92f, 25.3327f, 4.6666f)
                    curveTo(24.7354f, 5.4133f, 24.6041f, 5.5464f, 23.9994f, 6.0f)
                    curveTo(23.3946f, 6.4535f, 23.3946f, 6.1202f, 22.666f, 6.6666f)
                    curveTo(21.9374f, 7.2131f, 21.9106f, 7.711f, 21.3327f, 8.0f)
                    curveTo(20.7548f, 8.2889f, 19.9994f, 8.0f, 19.9994f, 8.0f)
                    verticalLineTo(8.6666f)
                    close()
                    moveTo(7.999f, 8.6666f)
                    verticalLineTo(8.0f)
                    curveTo(7.999f, 8.0f, 7.2436f, 8.2889f, 6.6657f, 8.0f)
                    curveTo(6.0878f, 7.711f, 6.061f, 7.2131f, 5.3324f, 6.6666f)
                    curveTo(4.6038f, 6.1202f, 4.6038f, 6.4535f, 3.999f, 6.0f)
                    curveTo(3.3943f, 5.5464f, 3.263f, 5.4133f, 2.6657f, 4.6666f)
                    curveTo(2.0684f, 3.92f, 2.0361f, 3.7885f, 2.0361f, 3.7885f)
                    curveTo(1.6381f, 3.1692f, 1.9116f, 2.8073f, 2.6261f, 2.9809f)
                    curveTo(2.6261f, 2.9809f, 3.4906f, 3.1911f, 7.6657f, 4.2043f)
                    curveTo(11.8408f, 5.2176f, 9.999f, 6.6666f, 9.999f, 6.6666f)
                    lineTo(13.999f, 7.3333f)
                    verticalLineTo(16.9858f)
                    curveTo(13.999f, 16.9858f, 12.9223f, 16.7484f, 11.999f, 15.8892f)
                    curveTo(11.282f, 15.2219f, 10.6657f, 14.2839f, 10.6657f, 14.0f)
                    curveTo(10.6657f, 13.3504f, 11.999f, 12.6666f, 11.999f, 12.6666f)
                    verticalLineTo(12.0f)
                    curveTo(11.999f, 12.0f, 11.3324f, 12.2909f, 10.8361f, 13.2169f)
                    curveTo(10.1848f, 13.4075f, 9.3324f, 13.8489f, 9.3324f, 13.8489f)
                    curveTo(9.3324f, 13.8489f, 9.5649f, 14.1786f, 9.0698f, 14.5087f)
                    curveTo(8.5746f, 14.8388f, 8.4359f, 14.9892f, 7.999f, 14.6667f)
                    curveTo(7.5622f, 14.3441f, 7.5384f, 13.9287f, 7.8412f, 13.5657f)
                    curveTo(8.144f, 13.2026f, 8.9088f, 13.4915f, 9.3324f, 13.0679f)
                    curveTo(9.756f, 12.6443f, 9.4892f, 12.183f, 9.999f, 11.3333f)
                    curveTo(10.5089f, 10.4836f, 11.3324f, 10.0f, 11.3324f, 10.0f)
                    curveTo(11.3324f, 10.0f, 10.188f, 10.4473f, 9.0698f, 10.0f)
                    curveTo(7.9515f, 9.5527f, 7.999f, 8.6666f, 7.999f, 8.6666f)
                    close()
                    moveTo(12.3304f, 6.3018f)
                    curveTo(12.3028f, 6.1162f, 11.9058f, 5.9677f, 12.0828f, 5.9222f)
                    curveTo(12.4129f, 5.8372f, 12.5786f, 5.7322f, 12.7409f, 5.4522f)
                    curveTo(12.8122f, 5.3292f, 12.4913f, 5.4098f, 12.5959f, 5.2886f)
                    curveTo(13.1446f, 4.6523f, 13.2588f, 4.1581f, 12.9069f, 3.9922f)
                    curveTo(12.1461f, 3.6334f, 12.0521f, 4.5607f, 12.0828f, 4.1787f)
                    curveTo(12.1047f, 3.9061f, 12.1322f, 3.6873f, 12.1669f, 3.577f)
                    curveTo(12.32f, 3.0899f, 13.0969f, 3.1192f, 13.1446f, 3.0238f)
                    curveTo(13.3398f, 2.6333f, 13.5639f, 2.5965f, 13.9994f, 2.6667f)
                    curveTo(14.4348f, 2.7368f, 14.633f, 2.945f, 14.8062f, 3.2914f)
                    curveTo(14.9374f, 3.5538f, 14.8997f, 3.9617f, 15.0431f, 4.351f)
                    curveTo(15.1358f, 4.6029f, 15.271f, 4.7425f, 15.3726f, 4.9945f)
                    curveTo(15.4317f, 5.1414f, 14.9877f, 4.851f, 15.0431f, 4.9945f)
                    curveTo(15.1942f, 5.3864f, 15.5719f, 5.3695f, 15.7977f, 5.7239f)
                    curveTo(15.8903f, 5.8692f, 15.4568f, 5.6977f, 15.4852f, 5.9222f)
                    curveTo(15.5044f, 6.0738f, 15.9994f, 6.6666f, 15.9994f, 6.6666f)
                    horizontalLineTo(11.9994f)
                    curveTo(11.9994f, 6.6666f, 12.3544f, 6.4626f, 12.3304f, 6.3018f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeAlpha = 0.08f, strokeLineWidth = 0.666667f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(18.8306f, 13.5585f)
                    lineTo(19.1591f, 13.7286f)
                    lineTo(18.9476f, 14.0284f)
                    curveTo(18.9306f, 14.0734f, 18.9459f, 14.1194f, 19.1139f, 14.2313f)
                    curveTo(19.5174f, 14.5003f, 19.5208f, 14.5024f, 19.5784f, 14.5115f)
                    curveTo(19.6127f, 14.5169f, 19.6694f, 14.4962f, 19.8017f, 14.3985f)
                    curveTo(20.0699f, 14.2004f, 20.0929f, 14.0085f, 19.9016f, 13.7791f)
                    curveTo(19.8597f, 13.7289f, 19.761f, 13.7021f, 19.4642f, 13.6749f)
                    curveTo(19.381f, 13.6673f, 19.381f, 13.6673f, 19.2918f, 13.6578f)
                    curveTo(19.1152f, 13.6378f, 18.9641f, 13.6076f, 18.8306f, 13.5585f)
                    close()
                    moveTo(18.6008f, 13.4433f)
                    curveTo(18.541f, 13.4038f, 18.4847f, 13.3576f, 18.4307f, 13.3036f)
                    curveTo(18.2004f, 13.0733f, 18.1193f, 12.8658f, 18.0463f, 12.4686f)
                    curveTo(17.9612f, 12.0057f, 17.9074f, 11.8274f, 17.7139f, 11.5048f)
                    curveTo(17.5956f, 11.3077f, 17.4513f, 11.1203f, 17.2864f, 10.9436f)
                    curveTo(16.9874f, 10.6234f, 16.688f, 10.3993f, 16.4976f, 10.2874f)
                    lineTo(16.7877f, 9.6895f)
                    curveTo(16.8374f, 9.7089f, 16.9389f, 9.7415f, 17.0809f, 9.7749f)
                    curveTo(17.628f, 9.9038f, 18.2079f, 9.9095f, 18.74f, 9.7154f)
                    curveTo(18.7726f, 9.7033f, 18.7726f, 9.7033f, 18.8052f, 9.6905f)
                    curveTo(19.0927f, 9.5755f, 19.2993f, 9.4253f, 19.4413f, 9.2498f)
                    curveTo(19.6155f, 9.0343f, 19.6705f, 8.82f, 19.6666f, 8.6798f)
                    lineTo(19.6668f, 8.6845f)
                    lineTo(19.6664f, 8.6666f)
                    verticalLineTo(7.5156f)
                    lineTo(20.1188f, 7.6886f)
                    curveTo(20.1481f, 7.6999f, 20.21f, 7.7196f, 20.295f, 7.7401f)
                    curveTo(20.514f, 7.7929f, 20.7379f, 7.8117f, 20.9363f, 7.7792f)
                    curveTo(21.0277f, 7.7642f, 21.1106f, 7.7385f, 21.184f, 7.7018f)
                    curveTo(21.3524f, 7.6176f, 21.4594f, 7.5168f, 21.6169f, 7.3094f)
                    curveTo(22.0656f, 6.7187f, 22.109f, 6.668f, 22.4664f, 6.4f)
                    curveTo(22.8225f, 6.1328f, 23.0158f, 6.0452f, 23.327f, 5.968f)
                    lineTo(23.3448f, 5.9636f)
                    curveTo(23.5127f, 5.9216f, 23.6046f, 5.8797f, 23.7997f, 5.7333f)
                    curveTo(24.377f, 5.3004f, 24.4886f, 5.1885f, 25.0727f, 4.4584f)
                    curveTo(25.4882f, 3.939f, 25.6389f, 3.7093f, 25.6822f, 3.6084f)
                    curveTo(25.9141f, 3.2475f, 25.8796f, 3.2008f, 25.4514f, 3.3048f)
                    curveTo(25.3432f, 3.3311f, 25.3432f, 3.3311f, 24.4971f, 3.5366f)
                    curveTo(23.5746f, 3.7606f, 22.2383f, 4.0849f, 20.4116f, 4.5283f)
                    curveTo(19.5333f, 4.7414f, 18.8965f, 4.9814f, 18.4794f, 5.2377f)
                    curveTo(17.854f, 5.622f, 17.8147f, 5.9195f, 18.0641f, 6.2522f)
                    curveTo(18.1204f, 6.3273f, 18.1763f, 6.3814f, 18.2058f, 6.4047f)
                    lineTo(18.799f, 6.8713f)
                    lineTo(14.333f, 7.6157f)
                    verticalLineTo(16.5305f)
                    curveTo(14.3522f, 16.5232f, 14.3718f, 16.5155f, 14.3919f, 16.5075f)
                    curveTo(14.7525f, 16.3639f, 15.1134f, 16.169f, 15.4488f, 15.9162f)
                    curveTo(15.5615f, 15.8313f, 15.6696f, 15.741f, 15.7726f, 15.6452f)
                    curveTo(16.3826f, 15.0775f, 16.9997f, 14.1827f, 16.9997f, 14.0f)
                    curveTo(16.9997f, 13.9902f, 16.9987f, 13.9795f, 16.9965f, 13.9679f)
                    curveTo(16.968f, 13.8141f, 16.7734f, 13.5886f, 16.4653f, 13.3556f)
                    curveTo(16.2334f, 13.1801f, 15.9986f, 13.0407f, 15.8476f, 12.9632f)
                    lineTo(15.6664f, 12.8703f)
                    verticalLineTo(11.4908f)
                    lineTo(16.133f, 11.6945f)
                    curveTo(16.3922f, 11.8076f, 16.7542f, 12.0678f, 17.1084f, 12.5226f)
                    curveTo(17.2082f, 12.6507f, 17.3019f, 12.7891f, 17.3886f, 12.9379f)
                    curveTo(17.4776f, 12.9669f, 17.571f, 13.0f, 17.6684f, 13.0369f)
                    curveTo(17.7849f, 13.081f, 17.9059f, 13.1301f, 18.0304f, 13.1833f)
                    curveTo(18.2436f, 13.2744f, 18.44f, 13.3653f, 18.6008f, 13.4433f)
                    close()
                    moveTo(18.6008f, 13.4433f)
                    curveTo(18.6842f, 13.4839f, 18.7581f, 13.521f, 18.8196f, 13.5528f)
                    lineTo(18.8306f, 13.5585f)
                    curveTo(18.7478f, 13.5281f, 18.6719f, 13.4904f, 18.6008f, 13.4433f)
                    close()
                    moveTo(13.6661f, 7.6157f)
                    lineTo(13.9446f, 7.6621f)
                    lineTo(13.6661f, 7.3333f)
                    verticalLineTo(7.6157f)
                    close()
                    moveTo(13.6661f, 16.5305f)
                    verticalLineTo(16.9858f)
                    lineTo(14.0712f, 16.6603f)
                    curveTo(13.9928f, 16.643f, 13.8513f, 16.6016f, 13.6661f, 16.5305f)
                    close()
                    moveTo(10.6105f, 12.9379f)
                    curveTo(10.5874f, 12.9777f, 10.5648f, 13.0182f, 10.5427f, 13.0594f)
                    lineTo(10.7428f, 12.8969f)
                    curveTo(10.6999f, 12.9095f, 10.6558f, 12.9232f, 10.6105f, 12.9379f)
                    close()
                    moveTo(9.0514f, 14.0284f)
                    lineTo(9.0603f, 14.0409f)
                    curveTo(9.0492f, 14.0238f, 9.0507f, 14.0265f, 9.0506f, 14.0263f)
                    curveTo(9.0509f, 14.027f, 9.0512f, 14.0277f, 9.0514f, 14.0284f)
                    close()
                    moveTo(9.3983f, 13.4433f)
                    curveTo(9.3148f, 13.4839f, 9.241f, 13.521f, 9.1795f, 13.5528f)
                    lineTo(9.1685f, 13.5585f)
                    curveTo(9.2513f, 13.5281f, 9.3272f, 13.4904f, 9.3983f, 13.4433f)
                    close()
                    moveTo(12.6651f, 6.3333f)
                    horizontalLineTo(15.3259f)
                    curveTo(15.2227f, 6.1815f, 15.1687f, 6.0736f, 15.1548f, 5.964f)
                    curveTo(15.1381f, 5.8314f, 15.1609f, 5.7293f, 15.2114f, 5.6529f)
                    curveTo(14.9595f, 5.4928f, 14.8285f, 5.3636f, 14.7324f, 5.1145f)
                    curveTo(14.6637f, 4.9365f, 14.722f, 4.7847f, 14.8355f, 4.698f)
                    curveTo(14.7925f, 4.6183f, 14.7616f, 4.5504f, 14.7306f, 4.4661f)
                    curveTo(14.7114f, 4.4141f, 14.6945f, 4.3607f, 14.6795f, 4.3056f)
                    curveTo(14.6391f, 4.1574f, 14.6238f, 4.0658f, 14.5875f, 3.7996f)
                    curveTo(14.5594f, 3.5934f, 14.54f, 3.5036f, 14.5084f, 3.4405f)
                    curveTo(14.3615f, 3.1468f, 14.2354f, 3.0422f, 13.9467f, 2.9957f)
                    curveTo(13.5992f, 2.9397f, 13.5508f, 2.9574f, 13.4431f, 3.1728f)
                    curveTo(13.371f, 3.317f, 13.2948f, 3.3503f, 13.1263f, 3.3931f)
                    curveTo(13.182f, 3.3789f, 12.8384f, 3.4563f, 12.7498f, 3.4859f)
                    curveTo(12.6696f, 3.5127f, 12.6092f, 3.5418f, 12.5659f, 3.5737f)
                    curveTo(12.7147f, 3.5723f, 12.8769f, 3.6093f, 13.0494f, 3.6907f)
                    curveTo(13.6246f, 3.9619f, 13.5477f, 4.5754f, 13.0475f, 5.2573f)
                    curveTo(13.1037f, 5.3695f, 13.0961f, 5.5046f, 13.0296f, 5.6194f)
                    curveTo(12.9085f, 5.8284f, 12.7768f, 5.971f, 12.6013f, 6.0753f)
                    curveTo(12.6307f, 6.128f, 12.6504f, 6.1854f, 12.6604f, 6.2527f)
                    curveTo(12.6645f, 6.28f, 12.666f, 6.3069f, 12.6651f, 6.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFFFFFFF), 1.0f to Color(0xFFF0F0F0),
                        start = Offset(13.9998f,5.33334f), end = Offset(13.9998f,13.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(10.6665f, 8.6667f)
                    verticalLineTo(5.3333f)
                    curveTo(10.6665f, 5.3333f, 11.3311f, 5.9854f, 12.2169f, 5.9854f)
                    curveTo(13.1028f, 5.9854f, 13.9998f, 5.3333f, 13.9998f, 5.3333f)
                    curveTo(13.9998f, 5.3333f, 14.8353f, 5.9854f, 15.6679f, 5.9854f)
                    curveTo(16.5006f, 5.9854f, 17.3331f, 5.3333f, 17.3331f, 5.3333f)
                    verticalLineTo(8.6667f)
                    curveTo(17.3331f, 12.0f, 13.9998f, 13.3333f, 13.9998f, 13.3333f)
                    curveTo(13.9998f, 13.3333f, 10.6665f, 12.0f, 10.6665f, 8.6667f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1E357F), 1.0f to Color(0xFF162966),
                        start = Offset(13.9998f,5.33334f), end = Offset(13.9998f,8.00001f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(17.3331f, 5.3333f)
                    horizontalLineTo(10.6665f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(17.3331f)
                    verticalLineTo(5.3333f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFFBC1443), 1.0f to Color(0xFFA30B35),
                        start = Offset(13.9997f,8.00002f), end = Offset(13.9997f,13.3333f)), stroke
                        = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin =
                        Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                    moveTo(10.6664f, 8.0f)
                    horizontalLineTo(11.9997f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(10.6664f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(13.333f, 8.0f)
                    horizontalLineTo(14.6664f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(13.333f)
                    verticalLineTo(8.0f)
                    close()
                    moveTo(15.9997f, 8.0f)
                    horizontalLineTo(17.333f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(15.9997f)
                    verticalLineTo(8.0f)
                    close()
                }
            }
        }
        .build()
        return _vi!!
    }

private var _vi: ImageVector? = null
