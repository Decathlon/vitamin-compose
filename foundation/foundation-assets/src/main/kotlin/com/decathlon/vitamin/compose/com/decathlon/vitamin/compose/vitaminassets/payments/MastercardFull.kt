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

public val PaymentsGroup.MastercardFull: ImageVector
    get() {
        if (_mastercardFull != null) {
            return _mastercardFull!!
        }
        _mastercardFull = Builder(name = "MastercardFull", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
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
            path(fill = SolidColor(Color(0xFF231F20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.2489f, 30.8906f)
                verticalLineTo(32.3674f)
                verticalLineTo(33.8443f)
                horizontalLineTo(20.6016f)
                verticalLineTo(33.4857f)
                curveTo(20.3963f, 33.7517f, 20.0848f, 33.9186f, 19.6614f, 33.9186f)
                curveTo(18.8266f, 33.9186f, 18.1722f, 33.27f, 18.1722f, 32.3674f)
                curveTo(18.1722f, 31.4656f, 18.8266f, 30.8163f, 19.6614f, 30.8163f)
                curveTo(20.0848f, 30.8163f, 20.3963f, 30.9832f, 20.6016f, 31.2492f)
                verticalLineTo(30.8906f)
                horizontalLineTo(21.2489f)
                close()
                moveTo(19.7419f, 31.4218f)
                curveTo(19.1816f, 31.4218f, 18.8387f, 31.8483f, 18.8387f, 32.3674f)
                curveTo(18.8387f, 32.8866f, 19.1816f, 33.3131f, 19.7419f, 33.3131f)
                curveTo(20.2773f, 33.3131f, 20.6387f, 32.905f, 20.6387f, 32.3674f)
                curveTo(20.6387f, 31.8299f, 20.2773f, 31.4218f, 19.7419f, 31.4218f)
                close()
                moveTo(43.1228f, 32.3674f)
                curveTo(43.1228f, 31.8483f, 43.4657f, 31.4218f, 44.026f, 31.4218f)
                curveTo(44.5621f, 31.4218f, 44.9228f, 31.8299f, 44.9228f, 32.3674f)
                curveTo(44.9228f, 32.905f, 44.5621f, 33.3131f, 44.026f, 33.3131f)
                curveTo(43.4657f, 33.3131f, 43.1228f, 32.8866f, 43.1228f, 32.3674f)
                close()
                moveTo(45.5338f, 29.7044f)
                verticalLineTo(32.3674f)
                verticalLineTo(33.8443f)
                horizontalLineTo(44.8858f)
                verticalLineTo(33.4857f)
                curveTo(44.6804f, 33.7517f, 44.3689f, 33.9186f, 43.9455f, 33.9186f)
                curveTo(43.1107f, 33.9186f, 42.4563f, 33.27f, 42.4563f, 32.3674f)
                curveTo(42.4563f, 31.4656f, 43.1107f, 30.8163f, 43.9455f, 30.8163f)
                curveTo(44.3689f, 30.8163f, 44.6804f, 30.9832f, 44.8858f, 31.2492f)
                verticalLineTo(29.7044f)
                horizontalLineTo(45.5338f)
                close()
                moveTo(29.2838f, 31.3914f)
                curveTo(29.7008f, 31.3914f, 29.9688f, 31.6509f, 30.0373f, 32.1079f)
                horizontalLineTo(28.4925f)
                curveTo(28.5616f, 31.6814f, 28.8225f, 31.3914f, 29.2838f, 31.3914f)
                close()
                moveTo(27.8138f, 32.3674f)
                curveTo(27.8138f, 31.4465f, 28.424f, 30.8163f, 29.2966f, 30.8163f)
                curveTo(30.1307f, 30.8163f, 30.7038f, 31.4465f, 30.7102f, 32.3674f)
                curveTo(30.7102f, 32.4537f, 30.7038f, 32.5344f, 30.6974f, 32.6143f)
                horizontalLineTo(28.4868f)
                curveTo(28.5802f, 33.1462f, 28.9601f, 33.3379f, 29.3771f, 33.3379f)
                curveTo(29.6758f, 33.3379f, 29.9938f, 33.2261f, 30.2433f, 33.0288f)
                lineTo(30.5605f, 33.5048f)
                curveTo(30.1991f, 33.8075f, 29.7885f, 33.9186f, 29.3401f, 33.9186f)
                curveTo(28.449f, 33.9186f, 27.8138f, 33.3068f, 27.8138f, 32.3674f)
                close()
                moveTo(37.1126f, 32.3674f)
                curveTo(37.1126f, 31.8483f, 37.4555f, 31.4218f, 38.0158f, 31.4218f)
                curveTo(38.5511f, 31.4218f, 38.9126f, 31.8299f, 38.9126f, 32.3674f)
                curveTo(38.9126f, 32.905f, 38.5511f, 33.3131f, 38.0158f, 33.3131f)
                curveTo(37.4555f, 33.3131f, 37.1126f, 32.8866f, 37.1126f, 32.3674f)
                close()
                moveTo(39.5228f, 30.8906f)
                verticalLineTo(32.3674f)
                verticalLineTo(33.8443f)
                horizontalLineTo(38.8755f)
                verticalLineTo(33.4857f)
                curveTo(38.6695f, 33.7517f, 38.3587f, 33.9186f, 37.9352f, 33.9186f)
                curveTo(37.1004f, 33.9186f, 36.446f, 33.27f, 36.446f, 32.3674f)
                curveTo(36.446f, 31.4656f, 37.1004f, 30.8163f, 37.9352f, 30.8163f)
                curveTo(38.3587f, 30.8163f, 38.6695f, 30.9832f, 38.8755f, 31.2492f)
                verticalLineTo(30.8906f)
                horizontalLineTo(39.5228f)
                close()
                moveTo(33.4569f, 32.3674f)
                curveTo(33.4569f, 33.2636f, 34.0857f, 33.9186f, 35.0452f, 33.9186f)
                curveTo(35.4936f, 33.9186f, 35.7923f, 33.8196f, 36.116f, 33.5663f)
                lineTo(35.8051f, 33.0472f)
                curveTo(35.5621f, 33.2205f, 35.3068f, 33.3131f, 35.026f, 33.3131f)
                curveTo(34.5091f, 33.3068f, 34.1292f, 32.9361f, 34.1292f, 32.3674f)
                curveTo(34.1292f, 31.7988f, 34.5091f, 31.4281f, 35.026f, 31.4218f)
                curveTo(35.3068f, 31.4218f, 35.5621f, 31.5144f, 35.8051f, 31.6877f)
                lineTo(36.116f, 31.1685f)
                curveTo(35.7923f, 30.9153f, 35.4936f, 30.8163f, 35.0452f, 30.8163f)
                curveTo(34.0857f, 30.8163f, 33.4569f, 31.4713f, 33.4569f, 32.3674f)
                close()
                moveTo(41.0177f, 31.2492f)
                curveTo(41.1859f, 30.9896f, 41.429f, 30.8163f, 41.8026f, 30.8163f)
                curveTo(41.9337f, 30.8163f, 42.1205f, 30.8411f, 42.2638f, 30.8969f)
                lineTo(42.0642f, 31.5024f)
                curveTo(41.9273f, 31.4465f, 41.7904f, 31.4281f, 41.6593f, 31.4281f)
                curveTo(41.2358f, 31.4281f, 41.0241f, 31.6997f, 41.0241f, 32.1885f)
                verticalLineTo(33.8443f)
                horizontalLineTo(40.3761f)
                verticalLineTo(30.8906f)
                horizontalLineTo(41.0177f)
                verticalLineTo(31.2492f)
                close()
                moveTo(24.4505f, 31.1254f)
                curveTo(24.1389f, 30.9217f, 23.7098f, 30.8163f, 23.2364f, 30.8163f)
                curveTo(22.4822f, 30.8163f, 21.9967f, 31.1749f, 21.9967f, 31.762f)
                curveTo(21.9967f, 32.2437f, 22.3582f, 32.5407f, 23.024f, 32.6334f)
                lineTo(23.3298f, 32.6765f)
                curveTo(23.6848f, 32.7261f, 23.8524f, 32.8187f, 23.8524f, 32.9856f)
                curveTo(23.8524f, 33.2141f, 23.6157f, 33.3442f, 23.1737f, 33.3442f)
                curveTo(22.7253f, 33.3442f, 22.4017f, 33.2021f, 22.1835f, 33.0351f)
                lineTo(21.8784f, 33.5352f)
                curveTo(22.2334f, 33.7948f, 22.6818f, 33.9186f, 23.1673f, 33.9186f)
                curveTo(24.027f, 33.9186f, 24.5253f, 33.5168f, 24.5253f, 32.9545f)
                curveTo(24.5253f, 32.4353f, 24.1332f, 32.1637f, 23.4852f, 32.0711f)
                lineTo(23.1801f, 32.0272f)
                curveTo(22.9f, 31.9904f, 22.6754f, 31.9353f, 22.6754f, 31.7372f)
                curveTo(22.6754f, 31.5208f, 22.8871f, 31.3914f, 23.2421f, 31.3914f)
                curveTo(23.6221f, 31.3914f, 23.9899f, 31.5335f, 24.1703f, 31.6446f)
                lineTo(24.4505f, 31.1254f)
                close()
                moveTo(32.0184f, 31.2492f)
                curveTo(32.1859f, 30.9896f, 32.429f, 30.8163f, 32.8025f, 30.8163f)
                curveTo(32.9337f, 30.8163f, 33.1205f, 30.8411f, 33.2637f, 30.8969f)
                lineTo(33.0641f, 31.5024f)
                curveTo(32.9273f, 31.4465f, 32.7904f, 31.4281f, 32.6592f, 31.4281f)
                curveTo(32.2358f, 31.4281f, 32.0241f, 31.6997f, 32.0241f, 32.1885f)
                verticalLineTo(33.8443f)
                horizontalLineTo(31.3768f)
                verticalLineTo(30.8906f)
                horizontalLineTo(32.0184f)
                verticalLineTo(31.2492f)
                close()
                moveTo(27.2784f, 30.8906f)
                horizontalLineTo(26.2198f)
                verticalLineTo(29.9944f)
                horizontalLineTo(25.5654f)
                verticalLineTo(30.8906f)
                horizontalLineTo(24.9616f)
                verticalLineTo(31.4776f)
                horizontalLineTo(25.5654f)
                verticalLineTo(32.8251f)
                curveTo(25.5654f, 33.5105f, 25.8334f, 33.9186f, 26.5991f, 33.9186f)
                curveTo(26.8799f, 33.9186f, 27.2036f, 33.8323f, 27.4089f, 33.6901f)
                lineTo(27.2221f, 33.1398f)
                curveTo(27.0289f, 33.2509f, 26.8172f, 33.3068f, 26.649f, 33.3068f)
                curveTo(26.3253f, 33.3068f, 26.2198f, 33.1087f, 26.2198f, 32.8123f)
                verticalLineTo(31.4776f)
                horizontalLineTo(27.2784f)
                verticalLineTo(30.8906f)
                close()
                moveTo(17.5997f, 31.9904f)
                verticalLineTo(33.8443f)
                horizontalLineTo(16.9453f)
                verticalLineTo(32.2005f)
                curveTo(16.9453f, 31.6997f, 16.7336f, 31.4218f, 16.2916f, 31.4218f)
                curveTo(15.8617f, 31.4218f, 15.563f, 31.6941f, 15.563f, 32.2069f)
                verticalLineTo(33.8443f)
                horizontalLineTo(14.9086f)
                verticalLineTo(32.2005f)
                curveTo(14.9086f, 31.6997f, 14.6912f, 31.4218f, 14.2613f, 31.4218f)
                curveTo(13.8186f, 31.4218f, 13.5321f, 31.6941f, 13.5321f, 32.2069f)
                verticalLineTo(33.8443f)
                horizontalLineTo(12.8784f)
                verticalLineTo(30.8906f)
                horizontalLineTo(13.5264f)
                verticalLineTo(31.2548f)
                curveTo(13.7695f, 30.909f, 14.0803f, 30.8163f, 14.3982f, 30.8163f)
                curveTo(14.853f, 30.8163f, 15.1767f, 31.0144f, 15.382f, 31.3418f)
                curveTo(15.6564f, 30.9274f, 16.0485f, 30.8099f, 16.4285f, 30.8163f)
                curveTo(17.1513f, 30.8227f, 17.5997f, 31.2923f, 17.5997f, 31.9904f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF5F00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.0465f, 25.8715f)
                horizontalLineTo(24.2359f)
                verticalLineTo(8.3783f)
                horizontalLineTo(34.0465f)
                verticalLineTo(25.8715f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEB001B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.8583f, 17.1253f)
                curveTo(24.8583f, 13.5767f, 26.5328f, 10.4157f, 29.1405f, 8.3787f)
                curveTo(27.2336f, 6.8891f, 24.8269f, 6.0f, 22.2114f, 6.0f)
                curveTo(16.0194f, 6.0f, 11.0f, 10.9809f, 11.0f, 17.1253f)
                curveTo(11.0f, 23.2697f, 16.0194f, 28.2506f, 22.2114f, 28.2506f)
                curveTo(24.8269f, 28.2506f, 27.2336f, 27.3615f, 29.1405f, 25.8719f)
                curveTo(26.5328f, 23.8349f, 24.8583f, 20.6739f, 24.8583f, 17.1253f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF79E1B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.2818f, 17.1253f)
                curveTo(47.2818f, 23.2697f, 42.2624f, 28.2506f, 36.0704f, 28.2506f)
                curveTo(33.4548f, 28.2506f, 31.0482f, 27.3615f, 29.1405f, 25.8719f)
                curveTo(31.7489f, 23.8349f, 33.4235f, 20.6739f, 33.4235f, 17.1253f)
                curveTo(33.4235f, 13.5767f, 31.7489f, 10.4157f, 29.1405f, 8.3787f)
                curveTo(31.0482f, 6.8891f, 33.4548f, 6.0f, 36.0704f, 6.0f)
                curveTo(42.2624f, 6.0f, 47.2818f, 10.9809f, 47.2818f, 17.1253f)
                close()
            }
        }
        .build()
        return _mastercardFull!!
    }

private var _mastercardFull: ImageVector? = null
