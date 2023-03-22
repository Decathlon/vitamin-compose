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

public val PaymentsGroup.ClickAndBuy: ImageVector
    get() {
        if (_clickAndBuy != null) {
            return _clickAndBuy!!
        }
        _clickAndBuy = Builder(name = "ClickAndBuy", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
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
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.2197f, 11.7751f)
                lineTo(34.1904f, 5.7778f)
                curveTo(34.1904f, 5.7778f, 33.4093f, 5.0f, 32.3062f, 5.0f)
                curveTo(32.3062f, 5.0f, 31.2032f, 5.0f, 30.4221f, 5.7778f)
                curveTo(30.4221f, 5.7778f, 29.641f, 6.5556f, 29.641f, 7.6541f)
                curveTo(29.641f, 7.6541f, 29.641f, 8.7526f, 30.4221f, 9.5303f)
                lineTo(31.8883f, 10.9837f)
                horizontalLineTo(26.2631f)
                curveTo(26.2631f, 10.9837f, 25.1464f, 10.9837f, 24.3654f, 11.7682f)
                curveTo(24.3654f, 11.7682f, 23.5775f, 12.546f, 23.5775f, 13.6514f)
                curveTo(23.5775f, 13.6514f, 23.5775f, 14.7566f, 24.3654f, 15.5413f)
                curveTo(24.3654f, 15.5413f, 25.1464f, 16.319f, 26.2631f, 16.319f)
                horizontalLineTo(31.8883f)
                lineTo(30.4221f, 17.7791f)
                curveTo(30.4221f, 17.7791f, 29.641f, 18.5569f, 29.641f, 19.6554f)
                curveTo(29.641f, 19.6554f, 29.641f, 20.7539f, 30.4221f, 21.5318f)
                curveTo(30.4221f, 21.5318f, 31.2031f, 22.3027f, 32.3062f, 22.3027f)
                curveTo(32.3062f, 22.3027f, 33.4092f, 22.3027f, 34.1904f, 21.5318f)
                lineTo(40.2129f, 15.5276f)
                curveTo(40.2129f, 15.5276f, 40.994f, 14.7499f, 40.994f, 13.6514f)
                curveTo(40.994f, 13.6514f, 40.994f, 12.5529f, 40.2197f, 11.7751f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5208f, 9.9534f)
                curveTo(18.5208f, 9.9534f, 19.994f, 9.9534f, 21.0354f, 10.9904f)
                curveTo(21.0354f, 10.9904f, 22.0769f, 12.0274f, 22.0769f, 13.4944f)
                curveTo(22.0769f, 13.4944f, 22.0769f, 14.9613f, 21.0354f, 15.9984f)
                curveTo(21.0354f, 15.9984f, 19.994f, 17.0355f, 18.5208f, 17.0355f)
                curveTo(18.5208f, 17.0355f, 17.0478f, 17.0355f, 16.0063f, 15.9984f)
                curveTo(16.0063f, 15.9984f, 14.9649f, 14.9614f, 14.9649f, 13.4944f)
                curveTo(14.9649f, 13.4944f, 14.9649f, 12.0274f, 16.0063f, 10.9904f)
                curveTo(16.0064f, 10.9904f, 17.0478f, 9.9534f, 18.5208f, 9.9534f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.9689f, 32.4378f)
                curveTo(8.9689f, 32.4378f, 8.4739f, 32.5343f, 8.0331f, 32.5343f)
                curveTo(6.7314f, 32.5343f, 6.0f, 31.8273f, 6.0f, 30.499f)
                verticalLineTo(28.9994f)
                curveTo(6.0f, 27.6713f, 6.7207f, 26.9644f, 8.0331f, 26.9644f)
                curveTo(8.517f, 26.9644f, 8.9689f, 27.0608f, 8.9689f, 27.0608f)
                curveTo(9.1085f, 27.0823f, 9.1732f, 27.1573f, 9.1732f, 27.2751f)
                verticalLineTo(27.9284f)
                curveTo(9.1732f, 28.0464f, 9.0979f, 28.1107f, 8.9689f, 28.0998f)
                curveTo(8.9689f, 28.0998f, 8.5062f, 28.0354f, 8.1084f, 28.0354f)
                curveTo(7.4091f, 28.0354f, 7.1833f, 28.4424f, 7.1833f, 29.0209f)
                verticalLineTo(30.4668f)
                curveTo(7.1833f, 31.067f, 7.4308f, 31.4632f, 8.1191f, 31.4632f)
                curveTo(8.5387f, 31.4632f, 8.9797f, 31.3989f, 8.9797f, 31.3989f)
                curveTo(9.098f, 31.3882f, 9.1733f, 31.4419f, 9.1733f, 31.5597f)
                verticalLineTo(32.213f)
                curveTo(9.1732f, 32.3307f, 9.1195f, 32.4057f, 8.9689f, 32.4378f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.9053f, 32.4272f)
                horizontalLineTo(10.1307f)
                curveTo(10.0122f, 32.4272f, 9.9263f, 32.3415f, 9.9263f, 32.2237f)
                verticalLineTo(25.0257f)
                curveTo(9.9263f, 24.9075f, 10.0122f, 24.822f, 10.1307f, 24.822f)
                horizontalLineTo(10.9053f)
                curveTo(11.0235f, 24.822f, 11.1096f, 24.9075f, 11.1096f, 25.0257f)
                verticalLineTo(32.2237f)
                curveTo(11.1095f, 32.3415f, 11.0235f, 32.4272f, 10.9053f, 32.4272f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0025f, 32.4272f)
                horizontalLineTo(12.2282f)
                curveTo(12.1098f, 32.4272f, 12.0237f, 32.3415f, 12.0237f, 32.2237f)
                verticalLineTo(27.2751f)
                curveTo(12.0237f, 27.1572f, 12.1098f, 27.0714f, 12.2282f, 27.0714f)
                horizontalLineTo(13.0025f)
                curveTo(13.121f, 27.0714f, 13.2071f, 27.1572f, 13.2071f, 27.2751f)
                verticalLineTo(32.2237f)
                curveTo(13.2072f, 32.3415f, 13.1211f, 32.4272f, 13.0025f, 32.4272f)
                close()
                moveTo(13.0025f, 26.0005f)
                horizontalLineTo(12.2282f)
                curveTo(12.1098f, 26.0005f, 12.0237f, 25.9148f, 12.0237f, 25.7971f)
                verticalLineTo(25.0257f)
                curveTo(12.0237f, 24.9075f, 12.1098f, 24.822f, 12.2282f, 24.822f)
                horizontalLineTo(13.0025f)
                curveTo(13.121f, 24.822f, 13.2071f, 24.9075f, 13.2071f, 25.0257f)
                verticalLineTo(25.7971f)
                curveTo(13.2072f, 25.9148f, 13.1211f, 26.0005f, 13.0025f, 26.0005f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.09f, 32.4378f)
                curveTo(17.09f, 32.4378f, 16.5952f, 32.5343f, 16.1545f, 32.5343f)
                curveTo(14.8527f, 32.5343f, 14.1214f, 31.8273f, 14.1214f, 30.499f)
                verticalLineTo(28.9994f)
                curveTo(14.1214f, 27.6713f, 14.842f, 26.9644f, 16.1545f, 26.9644f)
                curveTo(16.6384f, 26.9644f, 17.09f, 27.0608f, 17.09f, 27.0608f)
                curveTo(17.2298f, 27.0823f, 17.2945f, 27.1573f, 17.2945f, 27.2751f)
                verticalLineTo(27.9284f)
                curveTo(17.2945f, 28.0464f, 17.2192f, 28.1107f, 17.09f, 28.0998f)
                curveTo(17.09f, 28.0998f, 16.6275f, 28.0354f, 16.2295f, 28.0354f)
                curveTo(15.5304f, 28.0354f, 15.3044f, 28.4424f, 15.3044f, 29.0209f)
                verticalLineTo(30.4668f)
                curveTo(15.3044f, 31.067f, 15.552f, 31.4632f, 16.2403f, 31.4632f)
                curveTo(16.6597f, 31.4632f, 17.1009f, 31.3989f, 17.1009f, 31.3989f)
                curveTo(17.2191f, 31.3882f, 17.2944f, 31.4419f, 17.2944f, 31.5597f)
                verticalLineTo(32.213f)
                curveTo(17.2945f, 32.3307f, 17.2406f, 32.4057f, 17.09f, 32.4378f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.8984f, 32.4272f)
                horizontalLineTo(21.027f)
                curveTo(20.9088f, 32.4272f, 20.8121f, 32.3308f, 20.7582f, 32.2237f)
                lineTo(19.2953f, 29.4281f)
                lineTo(20.629f, 27.2751f)
                curveTo(20.6935f, 27.1784f, 20.7902f, 27.0714f, 20.9088f, 27.0714f)
                horizontalLineTo(21.7802f)
                curveTo(21.8984f, 27.0714f, 21.9628f, 27.1784f, 21.8984f, 27.2751f)
                lineTo(20.5645f, 29.4065f)
                lineTo(22.0381f, 32.2237f)
                curveTo(22.092f, 32.3201f, 22.0167f, 32.4272f, 21.8984f, 32.4272f)
                close()
                moveTo(19.0265f, 32.4272f)
                horizontalLineTo(18.2519f)
                curveTo(18.1337f, 32.4272f, 18.0474f, 32.3415f, 18.0474f, 32.2237f)
                verticalLineTo(25.0257f)
                curveTo(18.0474f, 24.9075f, 18.1337f, 24.822f, 18.2519f, 24.822f)
                horizontalLineTo(19.0265f)
                curveTo(19.1447f, 24.822f, 19.231f, 24.9075f, 19.231f, 25.0257f)
                verticalLineTo(32.2237f)
                curveTo(19.2309f, 32.3415f, 19.1447f, 32.4272f, 19.0265f, 32.4272f)
                close()
            }
            path(fill = SolidColor(Color(0xFF808080)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.0932f, 30.1883f)
                horizontalLineTo(24.1897f)
                curveTo(23.6089f, 30.1883f, 23.3721f, 30.4348f, 23.3721f, 30.8954f)
                curveTo(23.3721f, 31.3023f, 23.6089f, 31.5381f, 24.082f, 31.5381f)
                curveTo(24.4155f, 31.5381f, 24.7813f, 31.4095f, 25.0932f, 31.2489f)
                verticalLineTo(30.1883f)
                close()
                moveTo(26.0719f, 32.4271f)
                horizontalLineTo(25.3513f)
                curveTo(25.2331f, 32.4271f, 25.147f, 32.3414f, 25.147f, 32.2236f)
                verticalLineTo(32.1273f)
                curveTo(24.8027f, 32.3414f, 24.3511f, 32.5344f, 23.8453f, 32.5344f)
                curveTo(22.8021f, 32.5344f, 22.1888f, 32.0093f, 22.1888f, 30.9276f)
                curveTo(22.1888f, 29.8242f, 22.8664f, 29.2781f, 24.0604f, 29.2781f)
                curveTo(24.4264f, 29.2781f, 24.9534f, 29.3206f, 25.093f, 29.3424f)
                verticalLineTo(28.9139f)
                curveTo(25.093f, 28.3568f, 24.8456f, 28.0569f, 24.2111f, 28.0569f)
                curveTo(23.5765f, 28.0569f, 22.7695f, 28.239f, 22.7695f, 28.239f)
                curveTo(22.6406f, 28.2711f, 22.5653f, 28.1856f, 22.5653f, 28.0676f)
                verticalLineTo(27.4144f)
                curveTo(22.5653f, 27.2963f, 22.6406f, 27.2216f, 22.7695f, 27.1893f)
                curveTo(22.7695f, 27.1893f, 23.4688f, 26.9645f, 24.3724f, 26.9645f)
                curveTo(25.803f, 26.9645f, 26.2762f, 27.6286f, 26.2762f, 28.914f)
                verticalLineTo(32.2237f)
                curveTo(26.2763f, 32.3414f, 26.1902f, 32.4271f, 26.0719f, 32.4271f)
                close()
            }
            path(fill = SolidColor(Color(0xFF808080)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.0739f, 32.4271f)
                horizontalLineTo(30.2996f)
                curveTo(30.1813f, 32.4271f, 30.0952f, 32.3414f, 30.0952f, 32.2236f)
                verticalLineTo(28.8923f)
                curveTo(30.0952f, 28.3892f, 29.9445f, 28.0674f, 29.3746f, 28.0674f)
                curveTo(29.0411f, 28.0674f, 28.6753f, 28.2175f, 28.3741f, 28.3783f)
                verticalLineTo(32.2236f)
                curveTo(28.3741f, 32.3414f, 28.2882f, 32.4271f, 28.1698f, 32.4271f)
                horizontalLineTo(27.3954f)
                curveTo(27.2769f, 32.4271f, 27.1909f, 32.3414f, 27.1909f, 32.2236f)
                verticalLineTo(27.275f)
                curveTo(27.1909f, 27.1572f, 27.2769f, 27.0714f, 27.3954f, 27.0714f)
                horizontalLineTo(28.116f)
                curveTo(28.2343f, 27.0714f, 28.3205f, 27.1572f, 28.3205f, 27.275f)
                verticalLineTo(27.4358f)
                curveTo(28.6322f, 27.2f, 29.0947f, 26.9644f, 29.7076f, 26.9644f)
                curveTo(30.8803f, 26.9644f, 31.2782f, 27.6713f, 31.2782f, 28.7853f)
                verticalLineTo(32.2236f)
                curveTo(31.2782f, 32.3414f, 31.1922f, 32.4271f, 31.0739f, 32.4271f)
                close()
            }
            path(fill = SolidColor(Color(0xFF808080)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.8819f, 28.207f)
                curveTo(34.5916f, 28.0891f, 34.2689f, 28.0033f, 33.9785f, 28.0033f)
                curveTo(33.3868f, 28.0033f, 33.161f, 28.3783f, 33.161f, 28.9139f)
                verticalLineTo(30.5742f)
                curveTo(33.161f, 31.1098f, 33.3868f, 31.4846f, 33.9785f, 31.4846f)
                curveTo(34.2689f, 31.4846f, 34.5916f, 31.3775f, 34.8819f, 31.2382f)
                verticalLineTo(28.207f)
                close()
                moveTo(35.8608f, 32.4272f)
                horizontalLineTo(35.14f)
                curveTo(35.0217f, 32.4272f, 34.9357f, 32.3415f, 34.9357f, 32.2237f)
                verticalLineTo(32.1596f)
                curveTo(34.6023f, 32.3629f, 34.1936f, 32.5344f, 33.7311f, 32.5344f)
                curveTo(32.537f, 32.5344f, 31.9778f, 31.8058f, 31.9778f, 30.6598f)
                verticalLineTo(28.8387f)
                curveTo(31.9778f, 27.6926f, 32.537f, 26.9644f, 33.7311f, 26.9644f)
                curveTo(34.1721f, 26.9644f, 34.5594f, 27.0929f, 34.882f, 27.2537f)
                verticalLineTo(25.0257f)
                curveTo(34.882f, 24.9075f, 34.9682f, 24.822f, 35.0865f, 24.822f)
                horizontalLineTo(35.8609f)
                curveTo(35.9792f, 24.822f, 36.0654f, 24.9075f, 36.0654f, 25.0257f)
                verticalLineTo(32.2237f)
                curveTo(36.0653f, 32.3415f, 35.9791f, 32.4272f, 35.8608f, 32.4272f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(39.8839f, 28.9139f)
                curveTo(39.8839f, 28.3784f, 39.6686f, 28.0033f, 39.077f, 28.0033f)
                curveTo(38.7865f, 28.0033f, 38.4531f, 28.1107f, 38.1627f, 28.2498f)
                verticalLineTo(31.4096f)
                horizontalLineTo(38.9908f)
                curveTo(39.6364f, 31.4096f, 39.8839f, 31.0563f, 39.8839f, 30.5206f)
                verticalLineTo(28.9139f)
                close()
                moveTo(39.0986f, 32.4272f)
                horizontalLineTo(37.184f)
                curveTo(37.0655f, 32.4272f, 36.9796f, 32.3415f, 36.9796f, 32.2237f)
                verticalLineTo(25.0257f)
                curveTo(36.9796f, 24.9075f, 37.0655f, 24.822f, 37.184f, 24.822f)
                horizontalLineTo(37.9584f)
                curveTo(38.0768f, 24.822f, 38.1628f, 24.9075f, 38.1628f, 25.0257f)
                verticalLineTo(27.2963f)
                curveTo(38.4855f, 27.1036f, 38.8835f, 26.9644f, 39.3245f, 26.9644f)
                curveTo(40.5183f, 26.9644f, 41.0672f, 27.6927f, 41.0672f, 28.8387f)
                verticalLineTo(30.5526f)
                curveTo(41.0671f, 31.72f, 40.4322f, 32.4272f, 39.0986f, 32.4272f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(45.8647f, 32.4272f)
                horizontalLineTo(45.144f)
                curveTo(45.0257f, 32.4272f, 44.9396f, 32.3415f, 44.9396f, 32.2236f)
                verticalLineTo(32.0629f)
                curveTo(44.6278f, 32.2988f, 44.1651f, 32.5344f, 43.552f, 32.5344f)
                curveTo(42.3796f, 32.5344f, 41.9816f, 31.8273f, 41.9816f, 30.7133f)
                verticalLineTo(27.275f)
                curveTo(41.9816f, 27.1572f, 42.0675f, 27.0714f, 42.186f, 27.0714f)
                horizontalLineTo(42.9606f)
                curveTo(43.0788f, 27.0714f, 43.165f, 27.1572f, 43.165f, 27.275f)
                verticalLineTo(30.6063f)
                curveTo(43.165f, 31.1097f, 43.3155f, 31.4309f, 43.8855f, 31.4309f)
                curveTo(44.2188f, 31.4309f, 44.5846f, 31.2812f, 44.8859f, 31.1204f)
                verticalLineTo(27.275f)
                curveTo(44.8859f, 27.1572f, 44.972f, 27.0714f, 45.0902f, 27.0714f)
                horizontalLineTo(45.8647f)
                curveTo(45.983f, 27.0714f, 46.0691f, 27.1572f, 46.0691f, 27.275f)
                verticalLineTo(32.2236f)
                curveTo(46.0691f, 32.3415f, 45.9829f, 32.4272f, 45.8647f, 32.4272f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF8000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(48.9519f, 34.2696f)
                curveTo(48.9089f, 34.3767f, 48.8443f, 34.4624f, 48.7261f, 34.4624f)
                horizontalLineTo(47.8546f)
                curveTo(47.7364f, 34.4624f, 47.6505f, 34.366f, 47.6934f, 34.2591f)
                lineTo(48.3064f, 32.4701f)
                lineTo(46.596f, 27.2752f)
                curveTo(46.564f, 27.1682f, 46.6286f, 27.0715f, 46.7576f, 27.0715f)
                horizontalLineTo(47.6074f)
                curveTo(47.7257f, 27.0715f, 47.8116f, 27.1467f, 47.844f, 27.2643f)
                lineTo(48.9413f, 30.6599f)
                lineTo(50.0922f, 27.2643f)
                curveTo(50.1352f, 27.1574f, 50.2105f, 27.0715f, 50.3288f, 27.0715f)
                horizontalLineTo(51.1787f)
                curveTo(51.3077f, 27.0715f, 51.3829f, 27.1785f, 51.34f, 27.286f)
                lineTo(48.9519f, 34.2696f)
                close()
            }
        }
        .build()
        return _clickAndBuy!!
    }

private var _clickAndBuy: ImageVector? = null
