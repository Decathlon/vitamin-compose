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

public val PaymentsGroup.Verifone: ImageVector
    get() {
        if (_verifone != null) {
            return _verifone!!
        }
        _verifone = Builder(name = "Verifone", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF1A1919)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0415f, 17.0274f)
                horizontalLineTo(26.1278f)
                lineTo(26.4632f, 15.3119f)
                horizontalLineTo(24.3766f)
                lineTo(24.0415f, 17.0274f)
                close()
                moveTo(23.8254f, 18.1307f)
                horizontalLineTo(25.9122f)
                lineTo(24.5866f, 24.9039f)
                curveTo(24.4898f, 24.9381f, 24.1911f, 25.0586f, 23.7787f, 25.0586f)
                curveTo(23.222f, 25.0586f, 22.7114f, 24.8384f, 22.7114f, 24.0577f)
                curveTo(22.7114f, 23.9108f, 22.728f, 23.7436f, 22.7653f, 23.5536f)
                curveTo(23.1799f, 21.44f, 23.8254f, 18.1307f, 23.8254f, 18.1307f)
                close()
                moveTo(44.5448f, 17.976f)
                curveTo(43.156f, 17.976f, 42.6039f, 18.8015f, 42.3448f, 19.304f)
                horizontalLineTo(42.3202f)
                lineTo(42.4002f, 18.1321f)
                horizontalLineTo(40.3382f)
                curveTo(40.3247f, 18.3898f, 40.2355f, 19.2021f, 40.1032f, 19.9027f)
                curveTo(40.1032f, 19.9027f, 39.627f, 22.3612f, 39.5369f, 22.8319f)
                curveTo(39.4683f, 23.1915f, 39.3427f, 23.7231f, 39.3427f, 24.0316f)
                curveTo(39.3427f, 24.6885f, 39.6711f, 25.0588f, 40.4037f, 25.0588f)
                curveTo(40.8146f, 25.0588f, 41.1108f, 24.9447f, 41.2186f, 24.9039f)
                lineTo(41.9082f, 21.3765f)
                curveTo(42.0994f, 20.4025f, 42.7936f, 19.7651f, 43.6189f, 19.7651f)
                curveTo(44.2848f, 19.7651f, 44.6031f, 20.258f, 44.6031f, 20.6609f)
                curveTo(44.6031f, 21.0116f, 44.5164f, 21.4002f, 44.4493f, 21.7439f)
                lineTo(44.1527f, 23.2545f)
                curveTo(44.1174f, 23.4358f, 44.0419f, 23.7841f, 44.0419f, 24.0573f)
                curveTo(44.0419f, 24.7251f, 44.413f, 25.0588f, 45.1176f, 25.0588f)
                curveTo(45.5024f, 25.0588f, 45.7463f, 24.9612f, 45.9191f, 24.9039f)
                lineTo(46.5379f, 21.7418f)
                curveTo(46.672f, 21.0271f, 46.7216f, 20.6507f, 46.7216f, 20.1959f)
                curveTo(46.7216f, 18.8864f, 45.967f, 17.976f, 44.5448f, 17.976f)
                close()
                moveTo(35.276f, 19.6138f)
                curveTo(34.1097f, 19.6138f, 33.4637f, 20.8238f, 33.4637f, 21.9026f)
                curveTo(33.4637f, 22.8123f, 33.8686f, 23.4215f, 34.7889f, 23.4215f)
                curveTo(35.8293f, 23.4215f, 36.6436f, 22.523f, 36.6436f, 20.9894f)
                curveTo(36.6436f, 20.2878f, 36.2755f, 19.6138f, 35.276f, 19.6138f)
                close()
                moveTo(34.6611f, 25.059f)
                curveTo(32.4269f, 25.059f, 31.3579f, 23.6992f, 31.3579f, 21.9659f)
                curveTo(31.3579f, 19.5877f, 32.9669f, 17.976f, 35.4534f, 17.976f)
                curveTo(37.6108f, 17.976f, 38.7564f, 19.3017f, 38.7564f, 21.0042f)
                curveTo(38.7564f, 23.5555f, 37.0378f, 25.059f, 34.6611f, 25.059f)
                close()
                moveTo(26.8472f, 23.4281f)
                curveTo(26.7997f, 23.6719f, 26.7696f, 23.8426f, 26.7696f, 24.0525f)
                curveTo(26.7696f, 24.8289f, 27.281f, 25.0588f, 27.8229f, 25.0588f)
                curveTo(28.2563f, 25.0588f, 28.5244f, 24.9385f, 28.6226f, 24.9039f)
                lineTo(29.6258f, 19.7697f)
                lineTo(31.2481f, 19.7696f)
                lineTo(31.5684f, 18.1307f)
                lineTo(29.9462f, 18.1309f)
                lineTo(30.0251f, 17.7272f)
                curveTo(30.1719f, 16.9702f, 30.5229f, 16.6374f, 31.1301f, 16.6374f)
                curveTo(31.5356f, 16.6374f, 31.8636f, 16.7106f, 31.9776f, 16.7408f)
                lineTo(32.2829f, 15.1824f)
                curveTo(32.1528f, 15.149f, 31.5533f, 15.0f, 30.666f, 15.0f)
                curveTo(29.2521f, 15.0f, 28.3258f, 15.8715f, 28.0519f, 17.2752f)
                lineTo(27.8842f, 18.1307f)
                horizontalLineTo(26.8279f)
                lineTo(26.5075f, 19.7696f)
                horizontalLineTo(27.5644f)
                curveTo(27.5644f, 19.7696f, 27.1475f, 21.8924f, 26.8472f, 23.4281f)
                close()
                moveTo(22.0439f, 17.9762f)
                curveTo(20.9966f, 17.9762f, 20.4207f, 18.7142f, 20.1954f, 19.3029f)
                horizontalLineTo(20.1713f)
                lineTo(20.2519f, 18.1307f)
                horizontalLineTo(18.189f)
                curveTo(18.1707f, 18.537f, 18.087f, 19.224f, 17.8768f, 20.3042f)
                curveTo(17.6638f, 21.3988f, 17.4562f, 22.4907f, 17.242f, 23.5534f)
                curveTo(17.2053f, 23.735f, 17.1889f, 23.9128f, 17.1889f, 24.0632f)
                curveTo(17.1889f, 24.6198f, 17.4599f, 25.0582f, 18.2606f, 25.0582f)
                curveTo(18.6573f, 25.0582f, 18.9328f, 24.9537f, 19.065f, 24.9039f)
                lineTo(19.6788f, 21.7639f)
                curveTo(19.8998f, 20.5626f, 20.3014f, 19.7683f, 21.4665f, 19.7683f)
                curveTo(21.9965f, 19.7683f, 22.4999f, 19.8831f, 22.6055f, 19.9145f)
                lineTo(22.9586f, 18.1079f)
                curveTo(22.8824f, 18.0811f, 22.5765f, 17.9762f, 22.0439f, 17.9762f)
                close()
                moveTo(52.309f, 20.8759f)
                curveTo(52.4206f, 20.2549f, 52.0647f, 19.6138f, 51.2603f, 19.6138f)
                curveTo(50.278f, 19.6138f, 49.8465f, 20.2949f, 49.6539f, 20.8759f)
                horizontalLineTo(52.309f)
                close()
                moveTo(53.2402f, 23.3963f)
                curveTo(53.2402f, 24.3384f, 52.3414f, 25.0607f, 50.75f, 25.0607f)
                curveTo(48.5504f, 25.0607f, 47.4749f, 23.6701f, 47.4749f, 21.9677f)
                curveTo(47.4749f, 20.2778f, 48.5801f, 17.9778f, 51.2778f, 17.9778f)
                curveTo(53.0565f, 17.9778f, 54.3865f, 18.8746f, 54.3865f, 20.9279f)
                curveTo(54.3865f, 21.4329f, 54.2757f, 21.9818f, 54.2281f, 22.2016f)
                horizontalLineTo(49.5001f)
                curveTo(49.4922f, 22.6943f, 49.9013f, 23.5482f, 51.5448f, 23.5482f)
                curveTo(52.2772f, 23.5482f, 53.1065f, 23.2855f, 53.2402f, 23.2186f)
                curveTo(53.2402f, 23.2698f, 53.2402f, 23.3624f, 53.2402f, 23.3963f)
                close()
                moveTo(14.6071f, 20.8759f)
                curveTo(14.7186f, 20.2549f, 14.3627f, 19.6138f, 13.5583f, 19.6138f)
                curveTo(12.576f, 19.6138f, 12.1447f, 20.2949f, 11.9519f, 20.8759f)
                horizontalLineTo(14.6071f)
                close()
                moveTo(15.5381f, 23.3963f)
                curveTo(15.5381f, 24.3384f, 14.6394f, 25.0607f, 13.0481f, 25.0607f)
                curveTo(10.8484f, 25.0607f, 9.773f, 23.6701f, 9.773f, 21.9677f)
                curveTo(9.773f, 20.2778f, 10.8781f, 17.9778f, 13.576f, 17.9778f)
                curveTo(15.3546f, 17.9778f, 16.6846f, 18.8746f, 16.6846f, 20.9279f)
                curveTo(16.6846f, 21.4329f, 16.5738f, 21.9818f, 16.5261f, 22.2016f)
                horizontalLineTo(11.7982f)
                curveTo(11.7903f, 22.6943f, 12.1993f, 23.5482f, 13.8427f, 23.5482f)
                curveTo(14.5751f, 23.5482f, 15.4045f, 23.2855f, 15.5381f, 23.2186f)
                curveTo(15.5381f, 23.2698f, 15.5381f, 23.3624f, 15.5381f, 23.3963f)
                close()
                moveTo(3.0f, 15.826f)
                horizontalLineTo(5.0991f)
                verticalLineTo(22.5605f)
                curveTo(5.0991f, 23.5732f, 5.5957f, 24.0902f, 6.3929f, 24.0902f)
                curveTo(6.4742f, 24.0902f, 6.5222f, 24.0796f, 6.538f, 24.0757f)
                curveTo(6.1885f, 24.6125f, 5.7355f, 25.0527f, 4.6952f, 25.0527f)
                curveTo(3.5946f, 25.0527f, 3.0f, 24.2772f, 3.0f, 23.1133f)
                verticalLineTo(15.826f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00A3DA)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.6838f, 21.8649f)
                verticalLineTo(22.5718f)
                curveTo(5.6838f, 23.2545f, 6.0472f, 23.4991f, 6.4438f, 23.4991f)
                curveTo(6.8493f, 23.4991f, 7.0663f, 23.2201f, 7.2655f, 22.9028f)
                curveTo(7.5991f, 22.3715f, 11.6762f, 15.826f, 11.6762f, 15.826f)
                horizontalLineTo(9.4943f)
                lineTo(5.6838f, 21.8649f)
                close()
            }
        }
        .build()
        return _verifone!!
    }

private var _verifone: ImageVector? = null
