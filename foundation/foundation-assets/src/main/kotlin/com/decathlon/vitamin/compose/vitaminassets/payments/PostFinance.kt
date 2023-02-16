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

public val PaymentsGroup.PostFinance: ImageVector
    get() {
        if (_postFinance != null) {
            return _postFinance!!
        }
        _postFinance = Builder(name = "PostFinance", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFCC00)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFFFFE57F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(57.0f, 36.5137f)
                verticalLineTo(3.6982f)
                curveTo(57.0f, 2.5593f, 55.7337f, 1.0f, 54.6328f, 1.0f)
                horizontalLineTo(33.0162f)
                curveTo(31.6151f, 9.8011f, 28.6128f, 20.1553f, 22.9084f, 28.5422f)
                curveTo(19.806f, 33.0981f, 16.2032f, 36.515f, 12.0f, 39.0f)
                horizontalLineTo(13.9015f)
                curveTo(17.4042f, 36.6185f, 20.6066f, 33.4087f, 23.4088f, 29.3706f)
                curveTo(28.913f, 21.3978f, 31.9153f, 11.7684f, 33.5166f, 3.1744f)
                curveTo(32.3156f, 11.4578f, 29.6136f, 20.8801f, 24.5096f, 29.0599f)
                curveTo(22.0077f, 33.0981f, 19.1055f, 36.4114f, 15.8029f, 39.0f)
                horizontalLineTo(17.7044f)
                curveTo(20.5065f, 36.515f, 22.9084f, 33.5123f, 25.1101f, 29.9918f)
                curveTo(28.5127f, 24.5041f, 30.9146f, 18.4986f, 32.5158f, 12.5967f)
                curveTo(31.1147f, 18.2916f, 29.1132f, 24.0899f, 26.1109f, 29.3706f)
                curveTo(24.0092f, 33.0981f, 21.5073f, 36.3079f, 18.8052f, 39.0f)
                horizontalLineTo(20.8068f)
                curveTo(23.1086f, 36.515f, 25.2102f, 33.6158f, 27.0116f, 30.406f)
                curveTo(28.5127f, 27.8174f, 29.8137f, 25.0218f, 30.9146f, 21.9155f)
                curveTo(30.0139f, 24.4005f, 28.913f, 26.9891f, 27.7121f, 29.3706f)
                curveTo(25.9107f, 32.891f, 23.6831f, 36.2044f, 21.1812f, 39.0f)
                horizontalLineTo(23.4088f)
                curveTo(25.4103f, 36.515f, 27.3118f, 33.6158f, 28.8129f, 30.6131f)
                curveTo(27.3118f, 33.6158f, 25.5182f, 36.515f, 23.6167f, 39.0f)
                horizontalLineTo(54.6328f)
                curveTo(55.7337f, 39.0f, 57.0f, 37.6527f, 57.0f, 36.5137f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.4453f, 11.5012f)
                lineTo(46.9654f, 9.0244f)
                lineTo(4.5206f, 9.0244f)
                lineTo(4.0f, 11.5012f)
                lineTo(46.4453f, 11.5012f)
                close()
            }
            path(fill = SolidColor(Color(0xFFED1C24)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.5576f, 5.6487f)
                curveTo(51.5576f, 5.6487f, 52.1268f, 3.0246f, 52.1347f, 3.0f)
                horizontalLineTo(48.5179f)
                curveTo(48.5179f, 3.0166f, 47.7701f, 6.4823f, 47.7701f, 6.4988f)
                curveTo(47.778f, 6.4988f, 48.6969f, 6.4988f, 48.6969f, 6.4988f)
                curveTo(48.7047f, 6.4988f, 49.2657f, 3.8828f, 49.2657f, 3.8828f)
                lineTo(51.0211f, 3.8828f)
                curveTo(51.0211f, 3.8828f, 50.4684f, 6.5068f, 50.4523f, 6.5234f)
                curveTo(50.4684f, 6.5234f, 53.1262f, 6.5234f, 53.1262f, 6.5234f)
                lineTo(52.7768f, 8.1417f)
                curveTo(52.7768f, 8.1417f, 50.1273f, 8.1417f, 50.1187f, 8.1417f)
                curveTo(50.1187f, 8.1581f, 49.5824f, 10.6103f, 49.5824f, 10.6103f)
                curveTo(49.5824f, 10.6103f, 47.5911f, 10.6103f, 47.575f, 10.6103f)
                curveTo(47.575f, 10.6184f, 47.3961f, 11.4931f, 47.3882f, 11.5012f)
                horizontalLineTo(50.3463f)
                curveTo(50.3463f, 11.4931f, 50.875f, 9.0244f, 50.875f, 9.0244f)
                curveTo(50.875f, 9.0244f, 53.5164f, 9.0244f, 53.5328f, 9.0244f)
                curveTo(53.5328f, 9.0162f, 54.2319f, 5.6649f, 54.2319f, 5.6487f)
                horizontalLineTo(51.5576f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.6646f, 9.8502f)
                curveTo(12.9408f, 9.8502f, 13.8022f, 8.9182f, 13.9973f, 7.7003f)
                curveTo(14.2006f, 6.4822f, 13.5261f, 5.5502f, 12.2498f, 5.5502f)
                curveTo(10.9738f, 5.5502f, 10.1122f, 6.4822f, 9.9171f, 7.7003f)
                curveTo(9.714f, 8.9182f, 10.3886f, 9.8502f, 11.6646f, 9.8502f)
                close()
                moveTo(46.0451f, 8.7058f)
                lineTo(45.8336f, 9.6786f)
                curveTo(45.5247f, 9.7764f, 45.151f, 9.8502f, 44.6795f, 9.8502f)
                curveTo(43.5173f, 9.8502f, 42.7695f, 9.1879f, 42.7695f, 8.0601f)
                curveTo(42.7695f, 6.7441f, 43.6472f, 5.5502f, 45.0941f, 5.5502f)
                curveTo(46.2076f, 5.5502f, 46.7278f, 6.2861f, 46.7278f, 7.1854f)
                curveTo(46.7278f, 7.4796f, 46.6708f, 7.7981f, 46.5735f, 8.117f)
                horizontalLineTo(43.8913f)
                curveTo(43.9157f, 8.7466f, 44.3706f, 8.9262f, 44.8911f, 8.9262f)
                curveTo(45.3378f, 8.9262f, 45.6875f, 8.8282f, 46.0451f, 8.7058f)
                close()
                moveTo(45.655f, 7.12f)
                curveTo(45.655f, 6.6867f, 45.3947f, 6.4253f, 45.0128f, 6.4253f)
                curveTo(44.5249f, 6.4253f, 44.1594f, 6.7849f, 43.9887f, 7.3323f)
                horizontalLineTo(45.6389f)
                lineTo(45.6417f, 7.3062f)
                verticalLineTo(7.3061f)
                curveTo(45.6486f, 7.2429f, 45.655f, 7.1846f, 45.655f, 7.12f)
                close()
                moveTo(41.4204f, 8.8528f)
                curveTo(40.892f, 8.8528f, 40.5344f, 8.624f, 40.5344f, 7.9619f)
                curveTo(40.5344f, 7.1854f, 41.022f, 6.5395f, 41.7944f, 6.5395f)
                curveTo(42.0382f, 6.5395f, 42.3145f, 6.613f, 42.5909f, 6.7195f)
                lineTo(42.786f, 5.7876f)
                curveTo(42.4688f, 5.6733f, 42.0947f, 5.5914f, 41.721f, 5.5914f)
                curveTo(40.4449f, 5.5914f, 39.3557f, 6.5476f, 39.3557f, 8.0193f)
                curveTo(39.3557f, 9.2289f, 40.0956f, 9.8009f, 41.1601f, 9.8009f)
                curveTo(41.5177f, 9.8009f, 41.8184f, 9.7356f, 42.0382f, 9.6459f)
                lineTo(42.2494f, 8.6892f)
                curveTo(42.0056f, 8.7792f, 41.7372f, 8.8528f, 41.4204f, 8.8528f)
                close()
                moveTo(36.2511f, 7.6593f)
                lineTo(35.8041f, 9.7275f)
                horizontalLineTo(34.6417f)
                lineTo(35.5115f, 5.6733f)
                horizontalLineTo(36.5923f)
                lineTo(36.4867f, 6.1553f)
                curveTo(36.877f, 5.7383f, 37.332f, 5.5502f, 37.8036f, 5.5502f)
                curveTo(38.657f, 5.5502f, 39.2014f, 6.1717f, 38.9494f, 7.3569f)
                lineTo(38.4375f, 9.7275f)
                horizontalLineTo(37.2751f)
                lineTo(37.7628f, 7.4142f)
                curveTo(37.8687f, 6.9484f, 37.8036f, 6.5395f, 37.259f, 6.5395f)
                curveTo(36.8365f, 6.5395f, 36.4298f, 6.8256f, 36.2511f, 7.6593f)
                close()
                moveTo(31.6265f, 8.5586f)
                curveTo(31.6265f, 8.1501f, 31.9841f, 7.9208f, 32.5772f, 7.9208f)
                curveTo(32.6913f, 7.9208f, 32.9429f, 7.9293f, 33.1708f, 7.9619f)
                lineTo(33.1218f, 8.1908f)
                curveTo(32.9834f, 8.6728f, 32.5937f, 9.0001f, 32.1306f, 9.0001f)
                curveTo(31.7971f, 9.0001f, 31.6265f, 8.8366f, 31.6265f, 8.5586f)
                close()
                moveTo(31.4884f, 5.7548f)
                curveTo(31.6671f, 5.6976f, 32.2117f, 5.5748f, 32.7482f, 5.5748f)
                curveTo(34.0892f, 5.5748f, 34.4709f, 6.1879f, 34.4709f, 6.883f)
                curveTo(34.4709f, 7.0546f, 34.4548f, 7.2342f, 34.4143f, 7.4062f)
                lineTo(33.9102f, 9.7275f)
                horizontalLineTo(32.878f)
                lineTo(32.9675f, 9.3025f)
                curveTo(32.6913f, 9.6294f, 32.2686f, 9.8256f, 31.7727f, 9.8256f)
                curveTo(31.0738f, 9.8256f, 30.5376f, 9.4086f, 30.5376f, 8.714f)
                curveTo(30.5376f, 7.6511f, 31.4639f, 7.2018f, 32.6178f, 7.2018f)
                curveTo(32.7482f, 7.2018f, 33.0244f, 7.2262f, 33.3169f, 7.2588f)
                lineTo(33.3334f, 7.1769f)
                curveTo(33.3495f, 7.1118f, 33.3495f, 7.0462f, 33.3495f, 6.9892f)
                curveTo(33.3495f, 6.6703f, 33.13f, 6.4822f, 32.5206f, 6.4822f)
                curveTo(32.0652f, 6.4822f, 31.553f, 6.6215f, 31.2933f, 6.6949f)
                lineTo(31.4884f, 5.7548f)
                close()
                moveTo(27.1156f, 9.7275f)
                lineTo(27.5625f, 7.6593f)
                curveTo(27.7415f, 6.8256f, 28.1475f, 6.5395f, 28.5707f, 6.5395f)
                curveTo(29.1153f, 6.5395f, 29.1801f, 6.9484f, 29.0747f, 7.4142f)
                lineTo(28.5867f, 9.7275f)
                horizontalLineTo(29.749f)
                lineTo(30.2607f, 7.3569f)
                curveTo(30.5128f, 6.1717f, 29.9685f, 5.5502f, 29.1153f, 5.5502f)
                curveTo(28.6432f, 5.5502f, 28.1881f, 5.7383f, 27.7981f, 6.1553f)
                lineTo(27.9037f, 5.6733f)
                horizontalLineTo(26.8228f)
                lineTo(25.9531f, 9.7275f)
                lineTo(27.1156f, 9.7275f)
                close()
                moveTo(25.6363f, 5.2071f)
                curveTo(25.2787f, 5.2071f, 25.0103f, 4.9209f, 25.035f, 4.5532f)
                curveTo(25.0592f, 4.1854f, 25.3437f, 3.8992f, 25.7418f, 3.8992f)
                curveTo(26.0995f, 3.8992f, 26.3677f, 4.1854f, 26.3431f, 4.5532f)
                curveTo(26.319f, 4.9209f, 26.0345f, 5.2071f, 25.6363f, 5.2071f)
                close()
                moveTo(24.8721f, 5.6733f)
                lineTo(24.0025f, 9.7275f)
                horizontalLineTo(25.1568f)
                lineTo(26.0265f, 5.6733f)
                horizontalLineTo(24.8721f)
                close()
                moveTo(22.0434f, 7.6103f)
                lineTo(21.5883f, 9.7275f)
                horizontalLineTo(20.402f)
                lineTo(21.5563f, 4.2342f)
                lineTo(24.6041f, 4.2342f)
                lineTo(24.3766f, 5.2725f)
                lineTo(22.5316f, 5.2725f)
                lineTo(22.2631f, 6.5722f)
                horizontalLineTo(24.0109f)
                lineTo(23.7994f, 7.6103f)
                horizontalLineTo(22.0434f)
                close()
                moveTo(20.4424f, 6.5641f)
                lineTo(20.6295f, 5.6733f)
                horizontalLineTo(19.3862f)
                lineTo(19.6297f, 4.5451f)
                lineTo(18.4186f, 4.8147f)
                lineTo(17.6627f, 8.2804f)
                curveTo(17.4517f, 9.2617f, 17.9878f, 9.8009f, 18.963f, 9.8009f)
                curveTo(19.1667f, 9.8009f, 19.5077f, 9.7602f, 19.7518f, 9.6786f)
                lineTo(19.9469f, 8.7874f)
                curveTo(19.7518f, 8.8366f, 19.5077f, 8.8855f, 19.2967f, 8.8855f)
                curveTo(18.963f, 8.8855f, 18.7274f, 8.7712f, 18.809f, 8.3623f)
                lineTo(19.1911f, 6.5641f)
                horizontalLineTo(20.4424f)
                close()
                moveTo(15.3059f, 8.9182f)
                curveTo(15.6391f, 8.9182f, 16.0372f, 8.8612f, 16.0372f, 8.534f)
                curveTo(16.0372f, 8.3065f, 15.7913f, 8.2041f, 15.4979f, 8.0817f)
                curveTo(15.0639f, 7.9008f, 14.5258f, 7.6765f, 14.5258f, 6.9403f)
                curveTo(14.5258f, 6.0983f, 15.2085f, 5.5914f, 16.338f, 5.5914f)
                curveTo(16.712f, 5.5914f, 17.1266f, 5.6486f, 17.476f, 5.7468f)
                lineTo(17.2809f, 6.6703f)
                lineTo(17.2778f, 6.6694f)
                curveTo(17.1043f, 6.6197f, 16.5957f, 6.4741f, 16.2322f, 6.4741f)
                curveTo(15.8505f, 6.4741f, 15.6067f, 6.5641f, 15.6067f, 6.8176f)
                curveTo(15.6067f, 7.0433f, 15.8488f, 7.1433f, 16.1392f, 7.2633f)
                curveTo(16.5745f, 7.4431f, 17.1185f, 7.6678f, 17.1185f, 8.4278f)
                curveTo(17.1185f, 9.4086f, 16.2728f, 9.8009f, 15.2327f, 9.8009f)
                curveTo(14.7939f, 9.8009f, 14.3306f, 9.7275f, 13.9647f, 9.6375f)
                lineTo(14.1602f, 8.722f)
                curveTo(14.4119f, 8.804f, 14.8831f, 8.9182f, 15.3059f, 8.9182f)
                close()
                moveTo(11.1118f, 7.7003f)
                curveTo(10.9414f, 8.5423f, 11.307f, 8.9101f, 11.7706f, 8.9101f)
                curveTo(12.2336f, 8.9101f, 12.6317f, 8.534f, 12.8025f, 7.7003f)
                curveTo(12.9815f, 6.8664f, 12.6157f, 6.4907f, 12.1523f, 6.4907f)
                curveTo(11.689f, 6.4907f, 11.2824f, 6.8584f, 11.1118f, 7.7003f)
                close()
                moveTo(6.8692f, 8.0516f)
                horizontalLineTo(7.3814f)
                curveTo(9.0151f, 8.0516f, 9.9256f, 7.2426f, 9.9256f, 5.8938f)
                curveTo(9.9256f, 4.8883f, 9.2179f, 4.2342f, 8.007f, 4.2342f)
                horizontalLineTo(6.4956f)
                lineTo(5.3414f, 9.7275f)
                horizontalLineTo(6.5117f)
                lineTo(6.8692f, 8.0516f)
                close()
                moveTo(7.4544f, 5.2398f)
                lineTo(7.0724f, 7.0462f)
                horizontalLineTo(7.5604f)
                curveTo(8.3241f, 7.0462f, 8.7384f, 6.6377f, 8.7384f, 5.9756f)
                curveTo(8.7384f, 5.4606f, 8.4786f, 5.2398f, 7.9421f, 5.2398f)
                horizontalLineTo(7.4544f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDBB931)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4915f, 16.0f)
                lineTo(14.2436f, 16.0f)
                arcTo(1.1715f, 1.1715f, 0.0f, false, true, 15.4151f, 17.1715f)
                lineTo(15.4151f, 23.2819f)
                arcTo(1.1715f, 1.1715f, 0.0f, false, true, 14.2436f, 24.4534f)
                lineTo(5.4915f, 24.4534f)
                arcTo(1.1715f, 1.1715f, 0.0f, false, true, 4.32f, 23.2819f)
                lineTo(4.32f, 17.1715f)
                arcTo(1.1715f, 1.1715f, 0.0f, false, true, 5.4915f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF646464)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.4151f, 17.1715f)
                curveTo(15.4151f, 16.5245f, 14.8906f, 16.0f, 14.2436f, 16.0f)
                horizontalLineTo(5.4915f)
                curveTo(4.8445f, 16.0f, 4.32f, 16.5245f, 4.32f, 17.1715f)
                verticalLineTo(23.2819f)
                curveTo(4.32f, 23.9289f, 4.8445f, 24.4534f, 5.4915f, 24.4534f)
                horizontalLineTo(14.2436f)
                curveTo(14.8906f, 24.4534f, 15.4151f, 23.9289f, 15.4151f, 23.2819f)
                verticalLineTo(17.1715f)
                close()
                moveTo(5.4915f, 16.1895f)
                horizontalLineTo(14.2436f)
                lineTo(14.3013f, 16.1912f)
                curveTo(14.8168f, 16.221f, 15.2256f, 16.6485f, 15.2256f, 17.1715f)
                verticalLineTo(23.2819f)
                lineTo(15.2239f, 23.3396f)
                curveTo(15.194f, 23.8551f, 14.7665f, 24.2639f, 14.2436f, 24.2639f)
                horizontalLineTo(5.4915f)
                lineTo(5.4338f, 24.2622f)
                curveTo(4.9183f, 24.2324f, 4.5095f, 23.8049f, 4.5095f, 23.2819f)
                verticalLineTo(17.1715f)
                lineTo(4.5112f, 17.1138f)
                curveTo(4.541f, 16.5983f, 4.9685f, 16.1895f, 5.4915f, 16.1895f)
                close()
            }
            path(fill = SolidColor(Color(0xFF646464)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.8675f, 23.6565f)
                curveTo(10.0008f, 23.6565f, 10.1087f, 23.548f, 10.1087f, 23.414f)
                curveTo(10.1087f, 23.2801f, 10.0008f, 23.1715f, 9.8675f, 23.1715f)
                curveTo(9.7343f, 23.1715f, 9.6263f, 23.2801f, 9.6263f, 23.414f)
                curveTo(9.6263f, 23.548f, 9.7343f, 23.6565f, 9.8675f, 23.6565f)
                close()
            }
            path(fill = SolidColor(Color(0xFF646464)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.093f, 18.9527f)
                verticalLineTo(19.1422f)
                horizontalLineTo(4.3975f)
                verticalLineTo(18.9527f)
                horizontalLineTo(8.093f)
                close()
            }
            path(fill = SolidColor(Color(0xFF646464)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2859f, 21.4299f)
                verticalLineTo(21.6194f)
                horizontalLineTo(11.5559f)
                verticalLineTo(21.4299f)
                horizontalLineTo(15.2859f)
                close()
            }
            path(fill = SolidColor(Color(0xFF646464)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2859f, 18.9527f)
                verticalLineTo(19.1422f)
                horizontalLineTo(11.6248f)
                verticalLineTo(18.9527f)
                horizontalLineTo(15.2859f)
                close()
            }
            path(fill = SolidColor(Color(0xFF646464)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9166f, 16.2919f)
                curveTo(10.8342f, 16.6189f, 11.4258f, 17.5006f, 11.6953f, 18.9231f)
                lineTo(11.7182f, 19.05f)
                lineTo(11.709f, 19.1096f)
                curveTo(11.4235f, 19.6624f, 11.3911f, 20.4149f, 11.6168f, 21.3683f)
                lineTo(11.6477f, 21.4938f)
                lineTo(11.6481f, 21.5393f)
                curveTo(11.3426f, 22.8192f, 10.7974f, 23.6798f, 10.0097f, 24.1136f)
                lineTo(9.9273f, 24.157f)
                lineTo(9.8637f, 24.1647f)
                curveTo(9.3984f, 24.0584f, 8.9649f, 23.6214f, 8.5454f, 22.9078f)
                curveTo(8.5189f, 22.8627f, 8.534f, 22.8046f, 8.5791f, 22.7781f)
                curveTo(8.6242f, 22.7516f, 8.6823f, 22.7666f, 8.7088f, 22.8117f)
                curveTo(9.0862f, 23.4538f, 9.4685f, 23.8511f, 9.8512f, 23.9655f)
                lineTo(9.8729f, 23.9712f)
                lineTo(9.919f, 23.9472f)
                curveTo(10.6285f, 23.556f, 11.1339f, 22.7828f, 11.4325f, 21.6212f)
                lineTo(11.4582f, 21.5172f)
                lineTo(11.4332f, 21.4153f)
                curveTo(11.2069f, 20.4613f, 11.2288f, 19.6887f, 11.5034f, 19.0986f)
                lineTo(11.5258f, 19.0522f)
                lineTo(11.5088f, 18.957f)
                curveTo(11.2586f, 17.6369f, 10.7307f, 16.8218f, 9.9289f, 16.4992f)
                lineTo(9.8857f, 16.4826f)
                lineTo(9.8468f, 16.4985f)
                curveTo(9.1146f, 16.8116f, 8.5698f, 17.6287f, 8.2184f, 18.9587f)
                lineTo(8.1917f, 19.0618f)
                lineTo(8.2199f, 19.1429f)
                curveTo(8.5091f, 20.0109f, 8.4816f, 20.7909f, 8.1349f, 21.4776f)
                lineTo(8.0899f, 21.5629f)
                curveTo(8.0766f, 21.5871f, 8.0535f, 21.604f, 8.0272f, 21.6098f)
                lineTo(8.0069f, 21.612f)
                horizontalLineTo(4.3975f)
                curveTo(4.3452f, 21.612f, 4.3028f, 21.5696f, 4.3028f, 21.5173f)
                curveTo(4.3028f, 21.4724f, 4.3339f, 21.4348f, 4.3758f, 21.425f)
                lineTo(4.3975f, 21.4225f)
                lineTo(7.9497f, 21.4224f)
                lineTo(7.9674f, 21.3889f)
                curveTo(8.2882f, 20.7511f, 8.3136f, 20.0251f, 8.0411f, 19.2057f)
                lineTo(8.0039f, 19.0983f)
                lineTo(8.0011f, 19.0433f)
                curveTo(8.364f, 17.5835f, 8.9526f, 16.6737f, 9.7737f, 16.3236f)
                lineTo(9.8513f, 16.2925f)
                lineTo(9.9166f, 16.2919f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 33.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 30.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-12.0f)
                close()
            }
        }
        .build()
        return _postFinance!!
    }

private var _postFinance: ImageVector? = null
