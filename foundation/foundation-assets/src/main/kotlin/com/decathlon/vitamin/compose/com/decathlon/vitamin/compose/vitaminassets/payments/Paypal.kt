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

public val PaymentsGroup.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF28356A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.4388f, 20.2562f)
                lineTo(26.6913f, 18.6477f)
                lineTo(26.1288f, 18.6346f)
                horizontalLineTo(23.4429f)
                lineTo(25.3095f, 6.765f)
                curveTo(25.3153f, 6.7291f, 25.3341f, 6.6958f, 25.3616f, 6.672f)
                curveTo(25.3892f, 6.6483f, 25.4243f, 6.6353f, 25.4611f, 6.6353f)
                horizontalLineTo(29.9901f)
                curveTo(31.4937f, 6.6353f, 32.5313f, 6.949f, 33.073f, 7.5683f)
                curveTo(33.327f, 7.8588f, 33.4887f, 8.1625f, 33.567f, 8.4965f)
                curveTo(33.6491f, 8.8471f, 33.6505f, 9.266f, 33.5704f, 9.7769f)
                lineTo(33.5646f, 9.814f)
                verticalLineTo(10.1415f)
                lineTo(33.8186f, 10.2858f)
                curveTo(34.0324f, 10.3996f, 34.2024f, 10.5298f, 34.3328f, 10.6788f)
                curveTo(34.55f, 10.9273f, 34.6905f, 11.2431f, 34.7499f, 11.6173f)
                curveTo(34.8113f, 12.0022f, 34.791f, 12.4604f, 34.6905f, 12.979f)
                curveTo(34.5746f, 13.5755f, 34.3873f, 14.0951f, 34.1343f, 14.5202f)
                curveTo(33.9016f, 14.9119f, 33.6052f, 15.2369f, 33.2531f, 15.4886f)
                curveTo(32.9171f, 15.7279f, 32.5178f, 15.9095f, 32.0664f, 16.0257f)
                curveTo(31.6288f, 16.1399f, 31.1301f, 16.1975f, 30.583f, 16.1975f)
                horizontalLineTo(30.2305f)
                curveTo(29.9786f, 16.1975f, 29.7338f, 16.2886f, 29.5416f, 16.4517f)
                curveTo(29.3489f, 16.6183f, 29.2215f, 16.8459f, 29.1824f, 17.0947f)
                lineTo(29.1558f, 17.2396f)
                lineTo(28.7096f, 20.0747f)
                lineTo(28.6894f, 20.1787f)
                curveTo(28.684f, 20.2117f, 28.6748f, 20.2281f, 28.6613f, 20.2392f)
                curveTo(28.6493f, 20.2494f, 28.632f, 20.2562f, 28.615f, 20.2562f)
                horizontalLineTo(26.4388f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298FC2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.0589f, 9.8518f)
                curveTo(34.0455f, 9.9385f, 34.03f, 10.027f, 34.0126f, 10.1181f)
                curveTo(33.4154f, 13.1934f, 31.372f, 14.2558f, 28.7623f, 14.2558f)
                horizontalLineTo(27.4335f)
                curveTo(27.1143f, 14.2558f, 26.8453f, 14.4881f, 26.7957f, 14.8038f)
                lineTo(25.9227f, 20.3573f)
                curveTo(25.8904f, 20.5647f, 26.0497f, 20.7514f, 26.2582f, 20.7514f)
                horizontalLineTo(28.615f)
                curveTo(28.894f, 20.7514f, 29.1311f, 20.5481f, 29.1751f, 20.2721f)
                lineTo(29.1982f, 20.1521f)
                lineTo(29.6419f, 17.3281f)
                lineTo(29.6705f, 17.1732f)
                curveTo(29.7139f, 16.8962f, 29.9515f, 16.6928f, 30.2305f, 16.6928f)
                horizontalLineTo(30.583f)
                curveTo(32.8663f, 16.6928f, 34.6538f, 15.7632f, 35.1763f, 13.0728f)
                curveTo(35.3944f, 11.9489f, 35.2815f, 11.0105f, 34.704f, 10.3505f)
                curveTo(34.5293f, 10.1516f, 34.3125f, 9.9864f, 34.0589f, 9.8518f)
                close()
            }
            path(fill = SolidColor(Color(0xFF22284F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.4342f, 9.6021f)
                curveTo(33.3429f, 9.5753f, 33.2488f, 9.5512f, 33.1522f, 9.5294f)
                curveTo(33.0551f, 9.5081f, 32.9557f, 9.4892f, 32.8533f, 9.4727f)
                curveTo(32.4951f, 9.4146f, 32.1025f, 9.3871f, 31.682f, 9.3871f)
                horizontalLineTo(28.1322f)
                curveTo(28.0447f, 9.3871f, 27.9617f, 9.4069f, 27.8874f, 9.4427f)
                curveTo(27.7236f, 9.5216f, 27.602f, 9.6771f, 27.5726f, 9.8674f)
                lineTo(26.8174f, 14.6641f)
                lineTo(26.7957f, 14.8039f)
                curveTo(26.8454f, 14.4882f, 27.1144f, 14.2558f, 27.4335f, 14.2558f)
                horizontalLineTo(28.7623f)
                curveTo(31.372f, 14.2558f, 33.4154f, 13.1929f, 34.0127f, 10.1181f)
                curveTo(34.0305f, 10.0271f, 34.0455f, 9.9386f, 34.0589f, 9.8519f)
                curveTo(33.9078f, 9.7715f, 33.7442f, 9.7027f, 33.568f, 9.6441f)
                curveTo(33.5244f, 9.6296f, 33.4795f, 9.6156f, 33.4342f, 9.6021f)
                close()
            }
            path(fill = SolidColor(Color(0xFF28356A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.5726f, 9.8674f)
                curveTo(27.6021f, 9.6771f, 27.7236f, 9.5217f, 27.8874f, 9.4432f)
                curveTo(27.9622f, 9.4073f, 28.0447f, 9.3875f, 28.1322f, 9.3875f)
                horizontalLineTo(31.682f)
                curveTo(32.1025f, 9.3875f, 32.4951f, 9.4152f, 32.8534f, 9.4732f)
                curveTo(32.9557f, 9.4896f, 33.0551f, 9.5086f, 33.1522f, 9.5299f)
                curveTo(33.2488f, 9.5516f, 33.3429f, 9.5759f, 33.4342f, 9.6025f)
                curveTo(33.4795f, 9.616f, 33.5244f, 9.6301f, 33.5684f, 9.6441f)
                curveTo(33.7446f, 9.7027f, 33.9084f, 9.772f, 34.0595f, 9.8519f)
                curveTo(34.2372f, 8.7155f, 34.058f, 7.9417f, 33.4453f, 7.241f)
                curveTo(32.7698f, 6.4695f, 31.5507f, 6.1394f, 29.9906f, 6.1394f)
                horizontalLineTo(25.4615f)
                curveTo(25.1429f, 6.1394f, 24.8711f, 6.3717f, 24.8218f, 6.688f)
                lineTo(22.9354f, 18.6796f)
                curveTo(22.8982f, 18.9168f, 23.0807f, 19.1309f, 23.3193f, 19.1309f)
                horizontalLineTo(26.1153f)
                lineTo(27.5726f, 9.8674f)
                close()
            }
            path(fill = SolidColor(Color(0xFF28356A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0946f, 23.5209f)
                horizontalLineTo(9.7925f)
                curveTo(9.5665f, 23.5209f, 9.3743f, 23.6855f, 9.339f, 23.9093f)
                lineTo(8.0035f, 32.4009f)
                curveTo(7.977f, 32.5686f, 8.1064f, 32.7195f, 8.2758f, 32.7195f)
                horizontalLineTo(9.8523f)
                curveTo(10.0782f, 32.7195f, 10.2704f, 32.555f, 10.3057f, 32.3308f)
                lineTo(10.6659f, 30.0404f)
                curveTo(10.7006f, 29.8162f, 10.8932f, 29.6516f, 11.1188f, 29.6516f)
                horizontalLineTo(12.1641f)
                curveTo(14.3393f, 29.6516f, 15.5946f, 28.5959f, 15.9226f, 26.5042f)
                curveTo(16.0703f, 25.589f, 15.9288f, 24.87f, 15.5014f, 24.3664f)
                curveTo(15.0321f, 23.8134f, 14.1997f, 23.5209f, 13.0946f, 23.5209f)
                close()
                moveTo(13.4755f, 26.6224f)
                curveTo(13.2949f, 27.8106f, 12.3896f, 27.8106f, 11.5143f, 27.8106f)
                horizontalLineTo(11.0159f)
                lineTo(11.3655f, 25.5914f)
                curveTo(11.3863f, 25.4573f, 11.5021f, 25.3585f, 11.6374f, 25.3585f)
                horizontalLineTo(11.8658f)
                curveTo(12.4621f, 25.3585f, 13.0246f, 25.3585f, 13.3152f, 25.6994f)
                curveTo(13.4886f, 25.9027f, 13.5416f, 26.2049f, 13.4755f, 26.6224f)
                close()
            }
            path(fill = SolidColor(Color(0xFF28356A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0496f, 26.5199f)
                horizontalLineTo(21.4683f)
                curveTo(21.3336f, 26.5199f, 21.2171f, 26.6187f, 21.1964f, 26.7528f)
                lineTo(21.1264f, 27.1963f)
                lineTo(21.0159f, 27.0356f)
                curveTo(20.6736f, 26.5373f, 19.9101f, 26.3707f, 19.1483f, 26.3707f)
                curveTo(17.4008f, 26.3707f, 15.9084f, 27.698f, 15.6177f, 29.5598f)
                curveTo(15.4666f, 30.4885f, 15.6814f, 31.3766f, 16.2068f, 31.9959f)
                curveTo(16.6887f, 32.5653f, 17.3782f, 32.8026f, 18.1985f, 32.8026f)
                curveTo(19.6065f, 32.8026f, 20.3871f, 31.8947f, 20.3871f, 31.8947f)
                lineTo(20.3167f, 32.3354f)
                curveTo(20.2902f, 32.5038f, 20.4196f, 32.6549f, 20.5881f, 32.6549f)
                horizontalLineTo(22.0124f)
                curveTo(22.2389f, 32.6549f, 22.4301f, 32.4903f, 22.4659f, 32.2661f)
                lineTo(23.3205f, 26.8385f)
                curveTo(23.3475f, 26.6714f, 23.2185f, 26.5199f, 23.0496f, 26.5199f)
                close()
                moveTo(20.8453f, 29.6064f)
                curveTo(20.6928f, 30.5122f, 19.9759f, 31.1204f, 19.0613f, 31.1204f)
                curveTo(18.6022f, 31.1204f, 18.2353f, 30.9727f, 17.9995f, 30.6929f)
                curveTo(17.7658f, 30.415f, 17.6771f, 30.0194f, 17.7513f, 29.5787f)
                curveTo(17.8939f, 28.6805f, 18.6229f, 28.0524f, 19.5235f, 28.0524f)
                curveTo(19.9725f, 28.0524f, 20.3375f, 28.2022f, 20.578f, 28.4843f)
                curveTo(20.8188f, 28.7695f, 20.9145f, 29.1676f, 20.8453f, 29.6064f)
                close()
            }
            path(fill = SolidColor(Color(0xFF28356A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.3495f, 26.6556f)
                horizontalLineTo(29.7604f)
                curveTo(29.6088f, 26.6556f, 29.4664f, 26.7312f, 29.3805f, 26.8576f)
                lineTo(27.1888f, 30.095f)
                lineTo(26.2598f, 26.9839f)
                curveTo(26.2014f, 26.7892f, 26.0223f, 26.6556f, 25.8195f, 26.6556f)
                horizontalLineTo(24.2581f)
                curveTo(24.0682f, 26.6556f, 23.9365f, 26.8416f, 23.9968f, 27.0208f)
                lineTo(25.7471f, 32.1718f)
                lineTo(24.1016f, 34.5014f)
                curveTo(23.9722f, 34.6849f, 24.1025f, 34.9372f, 24.3261f, 34.9372f)
                horizontalLineTo(25.9132f)
                curveTo(26.0639f, 34.9372f, 26.2048f, 34.8635f, 26.2903f, 34.7397f)
                lineTo(31.5754f, 27.089f)
                curveTo(31.702f, 26.906f, 31.572f, 26.6556f, 31.3495f, 26.6556f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298FC2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(36.6469f, 23.5209f)
                horizontalLineTo(33.3444f)
                curveTo(33.1189f, 23.5209f, 32.9267f, 23.6855f, 32.8914f, 23.9093f)
                lineTo(31.5559f, 32.4009f)
                curveTo(31.5294f, 32.5686f, 31.6588f, 32.7195f, 31.8273f, 32.7195f)
                horizontalLineTo(33.5221f)
                curveTo(33.6794f, 32.7195f, 33.8141f, 32.6044f, 33.8387f, 32.4475f)
                lineTo(34.2178f, 30.0404f)
                curveTo(34.2525f, 29.8162f, 34.4453f, 29.6516f, 34.6707f, 29.6516f)
                horizontalLineTo(35.7156f)
                curveTo(37.8912f, 29.6516f, 39.1461f, 28.5959f, 39.4745f, 26.5042f)
                curveTo(39.6227f, 25.589f, 39.4803f, 24.87f, 39.0529f, 24.3664f)
                curveTo(38.584f, 23.8134f, 37.7521f, 23.5209f, 36.6469f, 23.5209f)
                close()
                moveTo(37.0279f, 26.6224f)
                curveTo(36.8478f, 27.8106f, 35.9424f, 27.8106f, 35.0666f, 27.8106f)
                horizontalLineTo(34.5689f)
                lineTo(34.9189f, 25.5914f)
                curveTo(34.9396f, 25.4573f, 35.0545f, 25.3585f, 35.1902f, 25.3585f)
                horizontalLineTo(35.4186f)
                curveTo(36.0144f, 25.3585f, 36.5774f, 25.3585f, 36.868f, 25.6994f)
                curveTo(37.0414f, 25.9027f, 37.094f, 26.2049f, 37.0279f, 26.6224f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298FC2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(46.5999f, 26.5199f)
                horizontalLineTo(45.0195f)
                curveTo(44.8839f, 26.5199f, 44.7685f, 26.6187f, 44.7482f, 26.7528f)
                lineTo(44.6782f, 27.1963f)
                lineTo(44.5671f, 27.0356f)
                curveTo(44.2248f, 26.5373f, 43.4619f, 26.3707f, 42.6999f, 26.3707f)
                curveTo(40.9526f, 26.3707f, 39.4607f, 27.698f, 39.1701f, 29.5598f)
                curveTo(39.0194f, 30.4885f, 39.2332f, 31.3766f, 39.7585f, 31.9959f)
                curveTo(40.2415f, 32.5653f, 40.9299f, 32.8026f, 41.7503f, 32.8026f)
                curveTo(43.1582f, 32.8026f, 43.9389f, 31.8947f, 43.9389f, 31.8947f)
                lineTo(43.8685f, 32.3354f)
                curveTo(43.842f, 32.5038f, 43.9713f, 32.6549f, 44.1408f, 32.6549f)
                horizontalLineTo(45.5647f)
                curveTo(45.7902f, 32.6549f, 45.9823f, 32.4903f, 46.0176f, 32.2661f)
                lineTo(46.8727f, 26.8385f)
                curveTo(46.8988f, 26.6714f, 46.7693f, 26.5199f, 46.5999f, 26.5199f)
                close()
                moveTo(44.3958f, 29.6064f)
                curveTo(44.2442f, 30.5122f, 43.5262f, 31.1204f, 42.6116f, 31.1204f)
                curveTo(42.1534f, 31.1204f, 41.7856f, 30.9727f, 41.5498f, 30.6929f)
                curveTo(41.3163f, 30.415f, 41.2283f, 30.0194f, 41.3016f, 29.5787f)
                curveTo(41.4451f, 28.6805f, 42.1732f, 28.0524f, 43.0738f, 28.0524f)
                curveTo(43.5228f, 28.0524f, 43.8878f, 28.2022f, 44.1283f, 28.4843f)
                curveTo(44.3701f, 28.7695f, 44.4657f, 29.1676f, 44.3958f, 29.6064f)
                close()
            }
            path(fill = SolidColor(Color(0xFF298FC2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(48.3324f, 23.7543f)
                lineTo(46.9771f, 32.4013f)
                curveTo(46.9506f, 32.569f, 47.0799f, 32.7199f, 47.2484f, 32.7199f)
                horizontalLineTo(48.611f)
                curveTo(48.8375f, 32.7199f, 49.0296f, 32.5554f, 49.0643f, 32.3312f)
                lineTo(50.4008f, 23.84f)
                curveTo(50.4275f, 23.6724f, 50.298f, 23.5209f, 50.1295f, 23.5209f)
                horizontalLineTo(48.6038f)
                curveTo(48.4691f, 23.5213f, 48.3532f, 23.6202f, 48.3324f, 23.7543f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null
