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

public val PaymentsGroup.Bancontact: ImageVector
    get() {
        if (_bancontact != null) {
            return _bancontact!!
        }
        _bancontact = Builder(name = "Bancontact", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF005697)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.1733f, 10.7543f)
                horizontalLineTo(32.5633f)
                lineTo(31.1792f, 12.3127f)
                lineTo(26.6875f, 17.3695f)
                verticalLineTo(17.3697f)
                lineTo(25.3034f, 18.928f)
                horizontalLineTo(11.8733f)
                lineTo(13.2361f, 17.3499f)
                lineTo(13.8811f, 16.6029f)
                lineTo(15.2438f, 15.0248f)
                horizontalLineTo(9.0556f)
                curveTo(7.9251f, 15.0248f, 7.0f, 15.9734f, 7.0f, 17.1326f)
                verticalLineTo(21.5801f)
                curveTo(7.0f, 22.7395f, 7.9251f, 23.6881f, 9.0556f, 23.6881f)
                horizontalLineTo(32.7469f)
                curveTo(33.8774f, 23.6881f, 35.4217f, 22.9836f, 36.1788f, 22.1225f)
                lineTo(39.7624f, 18.0464f)
                lineTo(46.1733f, 10.7543f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFBD500)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.9078f, 6.0f)
                curveTo(50.0383f, 6.0f, 50.9634f, 6.9486f, 50.9634f, 8.108f)
                verticalLineTo(12.5553f)
                curveTo(50.9634f, 13.7145f, 50.0383f, 14.6632f, 48.9078f, 14.6632f)
                horizontalLineTo(42.7398f)
                lineTo(44.1154f, 13.097f)
                horizontalLineTo(44.1156f)
                lineTo(44.7976f, 12.3204f)
                lineTo(46.1733f, 10.7543f)
                horizontalLineTo(32.5635f)
                lineTo(25.3035f, 18.934f)
                horizontalLineTo(11.7901f)
                lineTo(21.4813f, 7.9761f)
                lineTo(21.8479f, 7.5614f)
                curveTo(22.6076f, 6.7026f, 24.154f, 6.0f, 25.2846f, 6.0f)
                horizontalLineTo(48.9078f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF005697)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.6326f, 31.2485f)
                curveTo(11.6326f, 30.9581f, 11.5641f, 30.7068f, 11.4274f, 30.4945f)
                curveTo(11.2905f, 30.2823f, 11.1104f, 30.1204f, 10.8871f, 30.0087f)
                curveTo(11.1104f, 29.897f, 11.2835f, 29.7321f, 11.4065f, 29.5143f)
                curveTo(11.5293f, 29.2965f, 11.5907f, 29.0509f, 11.5907f, 28.7773f)
                verticalLineTo(28.6265f)
                curveTo(11.5907f, 28.2912f, 11.5265f, 28.0122f, 11.3982f, 27.7887f)
                curveTo(11.2696f, 27.5653f, 11.0894f, 27.3865f, 10.8577f, 27.2526f)
                curveTo(10.626f, 27.1184f, 10.348f, 27.0223f, 10.0243f, 26.9635f)
                curveTo(9.7002f, 26.9048f, 9.3401f, 26.8756f, 8.9435f, 26.8756f)
                curveTo(8.8096f, 26.8756f, 8.6699f, 26.8784f, 8.5248f, 26.884f)
                curveTo(8.3794f, 26.8895f, 8.2385f, 26.8965f, 8.1017f, 26.9048f)
                curveTo(7.9648f, 26.9132f, 7.8391f, 26.9231f, 7.7248f, 26.9342f)
                curveTo(7.6101f, 26.9455f, 7.5166f, 26.9567f, 7.444f, 26.9676f)
                curveTo(7.2821f, 26.9958f, 7.1676f, 27.0459f, 7.1006f, 27.1184f)
                curveTo(7.0337f, 27.1912f, 7.0001f, 27.3225f, 7.0001f, 27.5123f)
                verticalLineTo(32.6056f)
                curveTo(7.0001f, 32.7956f, 7.0349f, 32.9268f, 7.1048f, 32.9993f)
                curveTo(7.1746f, 33.072f, 7.2932f, 33.1221f, 7.4609f, 33.1501f)
                curveTo(7.5446f, 33.1668f, 7.6451f, 33.1807f, 7.7624f, 33.192f)
                curveTo(7.8796f, 33.2032f, 8.0066f, 33.2129f, 8.1435f, 33.2213f)
                curveTo(8.2804f, 33.2296f, 8.4213f, 33.2366f, 8.5665f, 33.2423f)
                curveTo(8.7118f, 33.2477f, 8.8541f, 33.2507f, 8.9938f, 33.2507f)
                curveTo(9.3568f, 33.2507f, 9.6988f, 33.2227f, 10.0201f, 33.1668f)
                curveTo(10.341f, 33.1111f, 10.6202f, 33.0118f, 10.8577f, 32.8694f)
                curveTo(11.0951f, 32.7271f, 11.2835f, 32.5343f, 11.4232f, 32.2915f)
                curveTo(11.5627f, 32.0485f, 11.6326f, 31.7427f, 11.6326f, 31.374f)
                verticalLineTo(31.2485f)
                close()
                moveTo(10.2085f, 28.8442f)
                curveTo(10.2085f, 28.9337f, 10.1946f, 29.0189f, 10.1666f, 29.0998f)
                curveTo(10.1386f, 29.1807f, 10.0926f, 29.2504f, 10.0284f, 29.3094f)
                curveTo(9.9641f, 29.3678f, 9.8776f, 29.4153f, 9.7687f, 29.4515f)
                curveTo(9.6598f, 29.4879f, 9.5216f, 29.506f, 9.354f, 29.506f)
                horizontalLineTo(8.4159f)
                verticalLineTo(28.0568f)
                curveTo(8.4437f, 28.0568f, 8.4871f, 28.0555f, 8.5457f, 28.0526f)
                curveTo(8.6043f, 28.0498f, 8.6657f, 28.0484f, 8.7299f, 28.0484f)
                horizontalLineTo(9.0524f)
                curveTo(9.4824f, 28.0484f, 9.7826f, 28.1029f, 9.9529f, 28.2117f)
                curveTo(10.1233f, 28.3206f, 10.2085f, 28.4896f, 10.2085f, 28.7185f)
                verticalLineTo(28.8442f)
                close()
                moveTo(9.9949f, 31.8851f)
                curveTo(10.1596f, 31.7567f, 10.2421f, 31.5751f, 10.2421f, 31.3406f)
                verticalLineTo(31.2485f)
                curveTo(10.2421f, 31.0474f, 10.1777f, 30.8729f, 10.0493f, 30.7249f)
                curveTo(9.9208f, 30.577f, 9.6891f, 30.5029f, 9.354f, 30.5029f)
                horizontalLineTo(8.4159f)
                verticalLineTo(32.0693f)
                horizontalLineTo(8.5624f)
                curveTo(8.6266f, 32.0693f, 8.6935f, 32.0711f, 8.7635f, 32.0737f)
                curveTo(8.8332f, 32.0765f, 8.9002f, 32.078f, 8.9646f, 32.078f)
                horizontalLineTo(9.1027f)
                curveTo(9.5327f, 32.078f, 9.8301f, 32.0137f, 9.9949f, 31.8851f)
                close()
                moveTo(16.2233f, 30.017f)
                curveTo(16.2233f, 29.71f, 16.1772f, 29.4487f, 16.085f, 29.2337f)
                curveTo(15.993f, 29.0189f, 15.863f, 28.8429f, 15.6955f, 28.7059f)
                curveTo(15.528f, 28.5692f, 15.3227f, 28.4689f, 15.0797f, 28.4045f)
                curveTo(14.8369f, 28.3403f, 14.5646f, 28.3081f, 14.263f, 28.3081f)
                curveTo(13.9836f, 28.3081f, 13.7114f, 28.3278f, 13.4463f, 28.3669f)
                curveTo(13.1808f, 28.4059f, 12.97f, 28.445f, 12.8138f, 28.484f)
                curveTo(12.7077f, 28.5122f, 12.6546f, 28.5734f, 12.6546f, 28.6682f)
                verticalLineTo(29.3468f)
                curveTo(12.6546f, 29.4028f, 12.6685f, 29.4419f, 12.6965f, 29.464f)
                curveTo(12.7244f, 29.4865f, 12.7606f, 29.4978f, 12.8054f, 29.4978f)
                horizontalLineTo(12.8472f)
                curveTo(12.9143f, 29.492f, 12.998f, 29.4851f, 13.0986f, 29.4767f)
                curveTo(13.1991f, 29.4684f, 13.3122f, 29.4616f, 13.4379f, 29.4557f)
                curveTo(13.5635f, 29.4503f, 13.6947f, 29.4461f, 13.8316f, 29.4432f)
                curveTo(13.9683f, 29.4404f, 14.1038f, 29.439f, 14.2379f, 29.439f)
                curveTo(14.4333f, 29.439f, 14.5869f, 29.4753f, 14.6986f, 29.5479f)
                curveTo(14.8103f, 29.6206f, 14.8661f, 29.777f, 14.8661f, 30.017f)
                verticalLineTo(30.3187f)
                horizontalLineTo(14.4138f)
                curveTo(13.6933f, 30.3187f, 13.1697f, 30.4317f, 12.843f, 30.6579f)
                curveTo(12.5163f, 30.884f, 12.353f, 31.2429f, 12.353f, 31.7343f)
                verticalLineTo(31.81f)
                curveTo(12.353f, 32.0834f, 12.3935f, 32.3124f, 12.4744f, 32.4966f)
                curveTo(12.5553f, 32.681f, 12.663f, 32.829f, 12.7969f, 32.9408f)
                curveTo(12.931f, 33.0524f, 13.0831f, 33.132f, 13.2535f, 33.1793f)
                curveTo(13.4238f, 33.2268f, 13.6013f, 33.2507f, 13.7855f, 33.2507f)
                curveTo(14.0369f, 33.2507f, 14.2533f, 33.2171f, 14.4347f, 33.1501f)
                curveTo(14.6161f, 33.0831f, 14.7878f, 32.9909f, 14.9499f, 32.8737f)
                verticalLineTo(33.0076f)
                curveTo(14.9499f, 33.0524f, 14.9666f, 33.0915f, 15.0002f, 33.1249f)
                curveTo(15.0338f, 33.1585f, 15.0728f, 33.1752f, 15.1175f, 33.1752f)
                horizontalLineTo(16.0558f)
                curveTo(16.1003f, 33.1752f, 16.1394f, 33.1585f, 16.173f, 33.1249f)
                curveTo(16.2066f, 33.0915f, 16.2233f, 33.0524f, 16.2233f, 33.0076f)
                verticalLineTo(30.017f)
                close()
                moveTo(14.5688f, 32.1741f)
                curveTo(14.6831f, 32.1379f, 14.7908f, 32.0946f, 14.8913f, 32.0443f)
                verticalLineTo(31.1229f)
                horizontalLineTo(14.4138f)
                curveTo(14.2686f, 31.1229f, 14.1485f, 31.1354f, 14.0536f, 31.1604f)
                curveTo(13.9586f, 31.1857f, 13.8831f, 31.2234f, 13.8274f, 31.2737f)
                curveTo(13.7716f, 31.3238f, 13.7324f, 31.3881f, 13.7102f, 31.4662f)
                curveTo(13.6877f, 31.5445f, 13.6766f, 31.6338f, 13.6766f, 31.7343f)
                verticalLineTo(31.81f)
                curveTo(13.6766f, 31.9885f, 13.7197f, 32.1029f, 13.8064f, 32.1532f)
                curveTo(13.893f, 32.2035f, 14.0256f, 32.2285f, 14.2044f, 32.2285f)
                curveTo(14.3328f, 32.2285f, 14.4542f, 32.2106f, 14.5688f, 32.1741f)
                close()
                moveTo(21.35f, 32.9993f)
                verticalLineTo(30.2096f)
                curveTo(21.35f, 29.9475f, 21.3292f, 29.7001f, 21.2872f, 29.4684f)
                curveTo(21.2453f, 29.2369f, 21.17f, 29.0356f, 21.0611f, 28.8651f)
                curveTo(20.9522f, 28.6948f, 20.8014f, 28.5593f, 20.6086f, 28.4589f)
                curveTo(20.4161f, 28.3584f, 20.1689f, 28.3081f, 19.8673f, 28.3081f)
                curveTo(19.5992f, 28.3081f, 19.3617f, 28.3405f, 19.1553f, 28.4052f)
                curveTo(18.9486f, 28.4699f, 18.7308f, 28.5838f, 18.5019f, 28.747f)
                verticalLineTo(28.544f)
                curveTo(18.5019f, 28.4991f, 18.485f, 28.4596f, 18.4516f, 28.4259f)
                curveTo(18.4181f, 28.3921f, 18.3789f, 28.3751f, 18.3342f, 28.3751f)
                horizontalLineTo(17.3961f)
                curveTo(17.3512f, 28.3751f, 17.3122f, 28.3918f, 17.2788f, 28.4254f)
                curveTo(17.2453f, 28.4589f, 17.2286f, 28.4981f, 17.2286f, 28.5426f)
                verticalLineTo(32.9993f)
                curveTo(17.2286f, 33.044f, 17.2465f, 33.0845f, 17.283f, 33.1207f)
                curveTo(17.3192f, 33.1571f, 17.3597f, 33.1752f, 17.4044f, 33.1752f)
                horizontalLineTo(18.4181f)
                curveTo(18.4628f, 33.1752f, 18.5019f, 33.1571f, 18.5353f, 33.1209f)
                curveTo(18.5689f, 33.0847f, 18.5856f, 33.0443f, 18.5856f, 32.9996f)
                verticalLineTo(29.7064f)
                curveTo(18.7308f, 29.6284f, 18.8675f, 29.5644f, 18.9961f, 29.5143f)
                curveTo(19.1245f, 29.464f, 19.2501f, 29.439f, 19.3731f, 29.439f)
                curveTo(19.5014f, 29.439f, 19.6062f, 29.4515f, 19.6872f, 29.4767f)
                curveTo(19.7681f, 29.5018f, 19.8309f, 29.5449f, 19.8756f, 29.6065f)
                curveTo(19.9203f, 29.6676f, 19.9511f, 29.7483f, 19.9678f, 29.8485f)
                curveTo(19.9845f, 29.9488f, 19.993f, 30.0715f, 19.993f, 30.2164f)
                verticalLineTo(32.9996f)
                curveTo(19.993f, 33.0443f, 20.0097f, 33.0847f, 20.0433f, 33.1209f)
                curveTo(20.0767f, 33.1571f, 20.1157f, 33.1752f, 20.1605f, 33.1752f)
                horizontalLineTo(21.1742f)
                curveTo(21.2187f, 33.1752f, 21.2592f, 33.1571f, 21.2956f, 33.1207f)
                curveTo(21.3319f, 33.0845f, 21.35f, 33.044f, 21.35f, 32.9993f)
                close()
                moveTo(25.4717f, 32.1869f)
                verticalLineTo(32.9323f)
                curveTo(25.4717f, 32.9937f, 25.4576f, 33.037f, 25.4298f, 33.0621f)
                curveTo(25.4018f, 33.0873f, 25.3571f, 33.1082f, 25.2957f, 33.1249f)
                curveTo(25.1784f, 33.1529f, 25.0262f, 33.1807f, 24.8392f, 33.2089f)
                curveTo(24.652f, 33.2366f, 24.4328f, 33.2507f, 24.1815f, 33.2507f)
                curveTo(23.5895f, 33.2507f, 23.1162f, 33.0692f, 22.7617f, 32.706f)
                curveTo(22.407f, 32.3431f, 22.2297f, 31.8182f, 22.2297f, 31.1312f)
                verticalLineTo(30.4276f)
                curveTo(22.2297f, 29.7406f, 22.407f, 29.2156f, 22.7617f, 28.8528f)
                curveTo(23.1162f, 28.4896f, 23.5895f, 28.3081f, 24.1815f, 28.3081f)
                curveTo(24.4328f, 28.3081f, 24.652f, 28.322f, 24.8392f, 28.3499f)
                curveTo(25.0262f, 28.378f, 25.1784f, 28.4059f, 25.2957f, 28.4337f)
                curveTo(25.3571f, 28.4504f, 25.4018f, 28.4715f, 25.4298f, 28.4965f)
                curveTo(25.4576f, 28.5217f, 25.4717f, 28.565f, 25.4717f, 28.6265f)
                verticalLineTo(29.372f)
                curveTo(25.4717f, 29.4167f, 25.4562f, 29.4515f, 25.4256f, 29.4767f)
                curveTo(25.3948f, 29.5018f, 25.3571f, 29.5143f, 25.3125f, 29.5143f)
                horizontalLineTo(25.2957f)
                curveTo(25.1393f, 29.4978f, 24.99f, 29.4837f, 24.8475f, 29.4726f)
                curveTo(24.7051f, 29.4616f, 24.5137f, 29.4557f, 24.2737f, 29.4557f)
                curveTo(24.1787f, 29.4557f, 24.0895f, 29.4712f, 24.0056f, 29.5018f)
                curveTo(23.9218f, 29.5326f, 23.8492f, 29.5856f, 23.7878f, 29.661f)
                curveTo(23.7262f, 29.7364f, 23.6775f, 29.8368f, 23.6412f, 29.9626f)
                curveTo(23.6048f, 30.0882f, 23.5867f, 30.2432f, 23.5867f, 30.4276f)
                verticalLineTo(31.1312f)
                curveTo(23.5867f, 31.3154f, 23.6048f, 31.4704f, 23.6412f, 31.5962f)
                curveTo(23.6775f, 31.7218f, 23.7262f, 31.8223f, 23.7878f, 31.8976f)
                curveTo(23.8492f, 31.9731f, 23.9218f, 32.0262f, 24.0056f, 32.0568f)
                curveTo(24.0895f, 32.0876f, 24.1787f, 32.1029f, 24.2737f, 32.1029f)
                curveTo(24.5137f, 32.1029f, 24.7051f, 32.0973f, 24.8475f, 32.0862f)
                curveTo(24.99f, 32.0751f, 25.1393f, 32.061f, 25.2957f, 32.0443f)
                horizontalLineTo(25.3125f)
                curveTo(25.3571f, 32.0443f, 25.3948f, 32.0568f, 25.4256f, 32.082f)
                curveTo(25.4562f, 32.1073f, 25.4717f, 32.1421f, 25.4717f, 32.1869f)
                close()
                moveTo(30.1211f, 30.4862f)
                curveTo(30.1211f, 30.151f, 30.0748f, 29.8495f, 29.9825f, 29.5815f)
                curveTo(29.8901f, 29.3134f, 29.7558f, 29.0859f, 29.5796f, 28.8987f)
                curveTo(29.4034f, 28.7117f, 29.1851f, 28.5664f, 28.925f, 28.4631f)
                curveTo(28.6648f, 28.36f, 28.3638f, 28.3081f, 28.0225f, 28.3081f)
                curveTo(27.6812f, 28.3081f, 27.3805f, 28.36f, 27.1202f, 28.4631f)
                curveTo(26.86f, 28.5664f, 26.6403f, 28.7117f, 26.4613f, 28.8987f)
                curveTo(26.2821f, 29.0859f, 26.1465f, 29.3134f, 26.0543f, 29.5815f)
                curveTo(25.9617f, 29.8495f, 25.9156f, 30.151f, 25.9156f, 30.4862f)
                verticalLineTo(31.0726f)
                curveTo(25.9156f, 31.4076f, 25.9617f, 31.7093f, 26.0543f, 31.9773f)
                curveTo(26.1465f, 32.2454f, 26.2821f, 32.4729f, 26.4613f, 32.6601f)
                curveTo(26.6403f, 32.8473f, 26.86f, 32.9923f, 27.1202f, 33.0957f)
                curveTo(27.3805f, 33.1988f, 27.6812f, 33.2507f, 28.0225f, 33.2507f)
                curveTo(28.3638f, 33.2507f, 28.6648f, 33.1988f, 28.925f, 33.0957f)
                curveTo(29.1851f, 32.9923f, 29.4034f, 32.8473f, 29.5796f, 32.6601f)
                curveTo(29.7558f, 32.4729f, 29.8901f, 32.2454f, 29.9825f, 31.9773f)
                curveTo(30.0748f, 31.7093f, 30.1211f, 31.4076f, 30.1211f, 31.0726f)
                verticalLineTo(30.4862f)
                close()
                moveTo(28.0225f, 32.1029f)
                curveTo(28.5167f, 32.1029f, 28.7639f, 31.7595f, 28.7639f, 31.0726f)
                verticalLineTo(30.4862f)
                curveTo(28.7639f, 29.8048f, 28.5167f, 29.464f, 28.0225f, 29.464f)
                curveTo(27.7781f, 29.464f, 27.5922f, 29.5493f, 27.4645f, 29.7196f)
                curveTo(27.3366f, 29.8901f, 27.2728f, 30.1456f, 27.2728f, 30.4862f)
                verticalLineTo(31.0726f)
                curveTo(27.2728f, 31.4132f, 27.3366f, 31.6701f, 27.4645f, 31.8432f)
                curveTo(27.5922f, 32.0165f, 27.7781f, 32.1029f, 28.0225f, 32.1029f)
                close()
                moveTo(35.1054f, 32.9993f)
                verticalLineTo(30.2096f)
                curveTo(35.1054f, 29.9475f, 35.0842f, 29.7001f, 35.0426f, 29.4684f)
                curveTo(35.0007f, 29.2369f, 34.9252f, 29.0356f, 34.8161f, 28.8651f)
                curveTo(34.7072f, 28.6948f, 34.5566f, 28.5593f, 34.364f, 28.4589f)
                curveTo(34.1713f, 28.3584f, 33.9241f, 28.3081f, 33.6226f, 28.3081f)
                curveTo(33.3546f, 28.3081f, 33.1171f, 28.3405f, 32.9105f, 28.4052f)
                curveTo(32.7038f, 28.4699f, 32.486f, 28.5838f, 32.2571f, 28.747f)
                verticalLineTo(28.544f)
                curveTo(32.2571f, 28.4991f, 32.2404f, 28.4596f, 32.2066f, 28.4259f)
                curveTo(32.1734f, 28.3921f, 32.1341f, 28.3751f, 32.0896f, 28.3751f)
                horizontalLineTo(31.1513f)
                curveTo(31.1066f, 28.3751f, 31.0676f, 28.3918f, 31.034f, 28.4254f)
                curveTo(31.0006f, 28.4589f, 30.9838f, 28.4981f, 30.9838f, 28.5426f)
                verticalLineTo(32.9993f)
                curveTo(30.9838f, 33.044f, 31.0018f, 33.0845f, 31.0382f, 33.1207f)
                curveTo(31.0746f, 33.1571f, 31.1149f, 33.1752f, 31.1598f, 33.1752f)
                horizontalLineTo(32.1734f)
                curveTo(32.218f, 33.1752f, 32.2571f, 33.1571f, 32.2907f, 33.1209f)
                curveTo(32.3241f, 33.0847f, 32.3409f, 33.0443f, 32.3409f, 32.9996f)
                verticalLineTo(29.7064f)
                curveTo(32.486f, 29.6284f, 32.6229f, 29.5644f, 32.7513f, 29.5143f)
                curveTo(32.8798f, 29.464f, 33.0054f, 29.439f, 33.1284f, 29.439f)
                curveTo(33.2568f, 29.439f, 33.3615f, 29.4515f, 33.4424f, 29.4767f)
                curveTo(33.5233f, 29.5018f, 33.5863f, 29.5449f, 33.631f, 29.6065f)
                curveTo(33.6757f, 29.6676f, 33.7063f, 29.7483f, 33.7232f, 29.8485f)
                curveTo(33.7399f, 29.9488f, 33.7482f, 30.0715f, 33.7482f, 30.2164f)
                verticalLineTo(32.9996f)
                curveTo(33.7482f, 33.0443f, 33.7649f, 33.0847f, 33.7985f, 33.1209f)
                curveTo(33.8321f, 33.1571f, 33.871f, 33.1752f, 33.9157f, 33.1752f)
                horizontalLineTo(34.9294f)
                curveTo(34.9741f, 33.1752f, 35.0146f, 33.1571f, 35.051f, 33.1207f)
                curveTo(35.0871f, 33.0845f, 35.1054f, 33.044f, 35.1054f, 32.9993f)
                close()
                moveTo(38.7579f, 32.3698f)
                verticalLineTo(33.0181f)
                curveTo(38.7579f, 33.1122f, 38.7049f, 33.1677f, 38.5987f, 33.184f)
                curveTo(38.4702f, 33.2063f, 38.3585f, 33.2228f, 38.2637f, 33.234f)
                curveTo(38.1687f, 33.2451f, 38.0597f, 33.2507f, 37.937f, 33.2507f)
                curveTo(37.7091f, 33.2507f, 37.5079f, 33.2324f, 37.3331f, 33.1962f)
                curveTo(37.1582f, 33.1599f, 37.0123f, 33.0887f, 36.8957f, 32.9826f)
                curveTo(36.7794f, 32.8765f, 36.6905f, 32.7298f, 36.6294f, 32.5427f)
                curveTo(36.5685f, 32.3557f, 36.5379f, 32.1144f, 36.5379f, 31.8182f)
                verticalLineTo(29.3889f)
                lineTo(35.8678f, 29.2798f)
                curveTo(35.823f, 29.2687f, 35.7826f, 29.2478f, 35.7463f, 29.217f)
                curveTo(35.7099f, 29.1864f, 35.6918f, 29.1487f, 35.6918f, 29.104f)
                verticalLineTo(28.551f)
                curveTo(35.6918f, 28.5064f, 35.7099f, 28.4659f, 35.7463f, 28.4295f)
                curveTo(35.7826f, 28.3934f, 35.823f, 28.3751f, 35.8678f, 28.3751f)
                horizontalLineTo(36.5379f)
                verticalLineTo(27.6881f)
                curveTo(36.5379f, 27.6434f, 36.5546f, 27.6073f, 36.5878f, 27.5793f)
                curveTo(36.6209f, 27.5514f, 36.66f, 27.5319f, 36.7046f, 27.5206f)
                lineTo(37.7203f, 27.3449f)
                horizontalLineTo(37.7452f)
                curveTo(37.7895f, 27.3449f, 37.8257f, 27.3573f, 37.8535f, 27.3823f)
                curveTo(37.8812f, 27.4076f, 37.8951f, 27.4425f, 37.8951f, 27.4871f)
                verticalLineTo(28.3751f)
                horizontalLineTo(38.582f)
                curveTo(38.6266f, 28.3751f, 38.6657f, 28.392f, 38.6993f, 28.4257f)
                curveTo(38.7329f, 28.4595f, 38.7496f, 28.4991f, 38.7496f, 28.544f)
                verticalLineTo(29.2282f)
                curveTo(38.7496f, 29.2734f, 38.7329f, 29.3127f, 38.6993f, 29.3464f)
                curveTo(38.6657f, 29.3802f, 38.6266f, 29.3971f, 38.582f, 29.3971f)
                horizontalLineTo(37.8951f)
                verticalLineTo(31.8349f)
                curveTo(37.8951f, 32.0024f, 37.909f, 32.11f, 37.937f, 32.1574f)
                curveTo(37.9649f, 32.2048f, 38.043f, 32.2285f, 38.1713f, 32.2285f)
                horizontalLineTo(38.582f)
                curveTo(38.6993f, 32.2285f, 38.7579f, 32.2756f, 38.7579f, 32.3698f)
                close()
                moveTo(43.2311f, 30.017f)
                curveTo(43.2311f, 29.71f, 43.1852f, 29.4487f, 43.0928f, 29.2337f)
                curveTo(43.0008f, 29.0189f, 42.871f, 28.8429f, 42.7035f, 28.7059f)
                curveTo(42.536f, 28.5692f, 42.3307f, 28.4689f, 42.0877f, 28.4045f)
                curveTo(41.8449f, 28.3403f, 41.5727f, 28.3081f, 41.271f, 28.3081f)
                curveTo(40.9915f, 28.3081f, 40.7194f, 28.3278f, 40.4543f, 28.3669f)
                curveTo(40.1889f, 28.4059f, 39.978f, 28.445f, 39.8218f, 28.484f)
                curveTo(39.7154f, 28.5122f, 39.6626f, 28.5734f, 39.6626f, 28.6682f)
                verticalLineTo(29.3468f)
                curveTo(39.6626f, 29.4028f, 39.6764f, 29.4419f, 39.7044f, 29.464f)
                curveTo(39.7324f, 29.4865f, 39.7686f, 29.4978f, 39.8133f, 29.4978f)
                horizontalLineTo(39.8552f)
                curveTo(39.9224f, 29.492f, 40.006f, 29.4851f, 40.1066f, 29.4767f)
                curveTo(40.2071f, 29.4684f, 40.3202f, 29.4616f, 40.4458f, 29.4557f)
                curveTo(40.5715f, 29.4503f, 40.7027f, 29.4461f, 40.8396f, 29.4432f)
                curveTo(40.9763f, 29.4404f, 41.1119f, 29.439f, 41.2458f, 29.439f)
                curveTo(41.4413f, 29.439f, 41.5949f, 29.4753f, 41.7066f, 29.5479f)
                curveTo(41.8183f, 29.6206f, 41.8741f, 29.777f, 41.8741f, 30.017f)
                verticalLineTo(30.3187f)
                horizontalLineTo(41.4218f)
                curveTo(40.7011f, 30.3187f, 40.1777f, 30.4317f, 39.851f, 30.6579f)
                curveTo(39.5243f, 30.884f, 39.361f, 31.2429f, 39.361f, 31.7343f)
                verticalLineTo(31.81f)
                curveTo(39.361f, 32.0834f, 39.4014f, 32.3124f, 39.4824f, 32.4966f)
                curveTo(39.5631f, 32.681f, 39.671f, 32.829f, 39.8049f, 32.9408f)
                curveTo(39.9391f, 33.0524f, 40.0911f, 33.132f, 40.2616f, 33.1793f)
                curveTo(40.4319f, 33.2268f, 40.6091f, 33.2507f, 40.7935f, 33.2507f)
                curveTo(41.0449f, 33.2507f, 41.2611f, 33.2171f, 41.4427f, 33.1501f)
                curveTo(41.6241f, 33.0831f, 41.7957f, 32.9909f, 41.958f, 32.8737f)
                verticalLineTo(33.0076f)
                curveTo(41.958f, 33.0524f, 41.9747f, 33.0915f, 42.0082f, 33.1249f)
                curveTo(42.0416f, 33.1585f, 42.0808f, 33.1752f, 42.1255f, 33.1752f)
                horizontalLineTo(43.0638f)
                curveTo(43.1083f, 33.1752f, 43.1475f, 33.1585f, 43.181f, 33.1249f)
                curveTo(43.2144f, 33.0915f, 43.2311f, 33.0524f, 43.2311f, 33.0076f)
                verticalLineTo(30.017f)
                close()
                moveTo(41.5768f, 32.1741f)
                curveTo(41.6911f, 32.1379f, 41.7988f, 32.0946f, 41.8993f, 32.0443f)
                verticalLineTo(31.1229f)
                horizontalLineTo(41.4218f)
                curveTo(41.2766f, 31.1229f, 41.1566f, 31.1354f, 41.0616f, 31.1604f)
                curveTo(40.9666f, 31.1857f, 40.8911f, 31.2234f, 40.8354f, 31.2737f)
                curveTo(40.7794f, 31.3238f, 40.7403f, 31.3881f, 40.7182f, 31.4662f)
                curveTo(40.6958f, 31.5445f, 40.6846f, 31.6338f, 40.6846f, 31.7343f)
                verticalLineTo(31.81f)
                curveTo(40.6846f, 31.9885f, 40.7278f, 32.1029f, 40.8144f, 32.1532f)
                curveTo(40.901f, 32.2035f, 41.0336f, 32.2285f, 41.2124f, 32.2285f)
                curveTo(41.3408f, 32.2285f, 41.462f, 32.2106f, 41.5768f, 32.1741f)
                close()
                moveTo(47.3528f, 32.9323f)
                verticalLineTo(32.1869f)
                curveTo(47.3528f, 32.1421f, 47.3373f, 32.1073f, 47.3067f, 32.082f)
                curveTo(47.2759f, 32.0568f, 47.2383f, 32.0443f, 47.1936f, 32.0443f)
                horizontalLineTo(47.1769f)
                curveTo(47.0205f, 32.061f, 46.8711f, 32.0751f, 46.7286f, 32.0862f)
                curveTo(46.5863f, 32.0973f, 46.395f, 32.1029f, 46.1549f, 32.1029f)
                curveTo(46.0598f, 32.1029f, 45.9704f, 32.0876f, 45.8869f, 32.0568f)
                curveTo(45.803f, 32.0262f, 45.7303f, 31.9731f, 45.6689f, 31.8976f)
                curveTo(45.6075f, 31.8223f, 45.5586f, 31.7218f, 45.5224f, 31.5962f)
                curveTo(45.4859f, 31.4704f, 45.468f, 31.3154f, 45.468f, 31.1312f)
                verticalLineTo(30.4276f)
                curveTo(45.468f, 30.2432f, 45.4859f, 30.0882f, 45.5224f, 29.9626f)
                curveTo(45.5586f, 29.8368f, 45.6075f, 29.7364f, 45.6689f, 29.661f)
                curveTo(45.7303f, 29.5856f, 45.803f, 29.5326f, 45.8869f, 29.5018f)
                curveTo(45.9704f, 29.4712f, 46.0598f, 29.4557f, 46.1549f, 29.4557f)
                curveTo(46.395f, 29.4557f, 46.5863f, 29.4616f, 46.7286f, 29.4726f)
                curveTo(46.8711f, 29.4837f, 47.0205f, 29.4978f, 47.1769f, 29.5143f)
                horizontalLineTo(47.1936f)
                curveTo(47.2383f, 29.5143f, 47.2759f, 29.5018f, 47.3067f, 29.4767f)
                curveTo(47.3373f, 29.4515f, 47.3528f, 29.4167f, 47.3528f, 29.372f)
                verticalLineTo(28.6265f)
                curveTo(47.3528f, 28.565f, 47.3389f, 28.5217f, 47.3109f, 28.4965f)
                curveTo(47.2827f, 28.4715f, 47.2383f, 28.4504f, 47.1769f, 28.4337f)
                curveTo(47.0597f, 28.4059f, 46.9073f, 28.378f, 46.7203f, 28.3499f)
                curveTo(46.5331f, 28.322f, 46.3141f, 28.3081f, 46.0627f, 28.3081f)
                curveTo(45.4704f, 28.3081f, 44.9974f, 28.4896f, 44.6428f, 28.8528f)
                curveTo(44.2881f, 29.2156f, 44.1108f, 29.7406f, 44.1108f, 30.4276f)
                verticalLineTo(31.1312f)
                curveTo(44.1108f, 31.8182f, 44.2881f, 32.3431f, 44.6428f, 32.706f)
                curveTo(44.9974f, 33.0692f, 45.4704f, 33.2507f, 46.0627f, 33.2507f)
                curveTo(46.3141f, 33.2507f, 46.5331f, 33.2366f, 46.7203f, 33.2089f)
                curveTo(46.9073f, 33.1807f, 47.0597f, 33.1529f, 47.1769f, 33.1249f)
                curveTo(47.2383f, 33.1082f, 47.2827f, 33.0873f, 47.3109f, 33.0621f)
                curveTo(47.3389f, 33.037f, 47.3528f, 32.9937f, 47.3528f, 32.9323f)
                close()
                moveTo(50.9634f, 32.3698f)
                verticalLineTo(33.0181f)
                curveTo(50.9634f, 33.1122f, 50.9101f, 33.1677f, 50.8042f, 33.184f)
                curveTo(50.6756f, 33.2063f, 50.564f, 33.2228f, 50.4692f, 33.234f)
                curveTo(50.374f, 33.2451f, 50.2651f, 33.2507f, 50.1425f, 33.2507f)
                curveTo(49.9146f, 33.2507f, 49.7133f, 33.2324f, 49.5385f, 33.1962f)
                curveTo(49.3635f, 33.1599f, 49.2177f, 33.0887f, 49.1014f, 32.9826f)
                curveTo(48.9848f, 32.8765f, 48.8959f, 32.7298f, 48.8349f, 32.5427f)
                curveTo(48.774f, 32.3557f, 48.7434f, 32.1144f, 48.7434f, 31.8182f)
                verticalLineTo(29.3889f)
                lineTo(48.0733f, 29.2798f)
                curveTo(48.0284f, 29.2687f, 47.9881f, 29.2478f, 47.9517f, 29.217f)
                curveTo(47.9153f, 29.1864f, 47.8973f, 29.1487f, 47.8973f, 29.104f)
                verticalLineTo(28.551f)
                curveTo(47.8973f, 28.5064f, 47.9153f, 28.4659f, 47.9517f, 28.4295f)
                curveTo(47.9881f, 28.3934f, 48.0284f, 28.3751f, 48.0733f, 28.3751f)
                horizontalLineTo(48.7434f)
                verticalLineTo(27.6881f)
                curveTo(48.7434f, 27.6434f, 48.7601f, 27.6073f, 48.7933f, 27.5793f)
                curveTo(48.8263f, 27.5514f, 48.8653f, 27.5319f, 48.9098f, 27.5206f)
                lineTo(49.9255f, 27.3449f)
                horizontalLineTo(49.9506f)
                curveTo(49.995f, 27.3449f, 50.0311f, 27.3573f, 50.0586f, 27.3823f)
                curveTo(50.0866f, 27.4076f, 50.1005f, 27.4425f, 50.1005f, 27.4871f)
                verticalLineTo(28.3751f)
                horizontalLineTo(50.7875f)
                curveTo(50.832f, 28.3751f, 50.8712f, 28.392f, 50.9047f, 28.4257f)
                curveTo(50.9381f, 28.4595f, 50.955f, 28.4991f, 50.955f, 28.544f)
                verticalLineTo(29.2282f)
                curveTo(50.955f, 29.2734f, 50.9381f, 29.3127f, 50.9047f, 29.3464f)
                curveTo(50.8712f, 29.3802f, 50.832f, 29.3971f, 50.7875f, 29.3971f)
                horizontalLineTo(50.1005f)
                verticalLineTo(31.8349f)
                curveTo(50.1005f, 32.0024f, 50.1145f, 32.11f, 50.1425f, 32.1574f)
                curveTo(50.1703f, 32.2048f, 50.2484f, 32.2285f, 50.377f, 32.2285f)
                horizontalLineTo(50.7875f)
                curveTo(50.9047f, 32.2285f, 50.9634f, 32.2756f, 50.9634f, 32.3698f)
                close()
            }
        }
        .build()
        return _bancontact!!
    }

private var _bancontact: ImageVector? = null
