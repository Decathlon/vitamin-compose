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

public val PaymentsGroup.Paylib: ImageVector
    get() {
        if (_paylib != null) {
            return _paylib!!
        }
        _paylib = Builder(name = "Paylib", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF16D6FF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.7611f, 15.8008f)
                lineTo(20.7465f, 15.21f)
                lineTo(22.3716f, 15.225f)
                lineTo(22.385f, 23.5544f)
                horizontalLineTo(20.4215f)
                lineTo(20.4245f, 23.1005f)
                curveTo(19.9553f, 23.4066f, 19.3381f, 23.5513f, 18.5167f, 23.5513f)
                curveTo(17.3836f, 23.5513f, 16.564f, 23.2847f, 16.0109f, 22.7361f)
                curveTo(15.3795f, 22.1102f, 15.0888f, 21.1155f, 15.0953f, 19.6047f)
                lineTo(15.0983f, 18.8863f)
                curveTo(15.1106f, 16.1863f, 16.0668f, 15.085f, 18.3981f, 15.085f)
                curveTo(19.4429f, 15.085f, 20.1962f, 15.3102f, 20.7611f, 15.8008f)
                close()
                moveTo(17.511f, 21.633f)
                curveTo(17.7508f, 21.8711f, 18.1321f, 21.9816f, 18.7101f, 21.9816f)
                curveTo(19.9145f, 21.9816f, 20.4301f, 21.5144f, 20.4338f, 20.4194f)
                lineTo(20.441f, 18.2483f)
                curveTo(20.443f, 17.6586f, 20.3323f, 17.2733f, 20.0922f, 17.0361f)
                curveTo(19.8437f, 16.7902f, 19.4144f, 16.6711f, 18.7808f, 16.6711f)
                curveTo(17.433f, 16.6711f, 17.0616f, 17.1852f, 17.0537f, 19.0636f)
                lineTo(17.0512f, 19.5902f)
                curveTo(17.0467f, 20.6983f, 17.184f, 21.3091f, 17.511f, 21.633f)
                close()
            }
            path(fill = SolidColor(Color(0xFF16D6FF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.3039f, 15.2234f)
                horizontalLineTo(28.3764f)
                lineTo(28.3697f, 20.6117f)
                curveTo(28.3683f, 21.1792f, 28.287f, 21.4564f, 28.0687f, 21.6359f)
                curveTo(27.8174f, 21.8442f, 27.4364f, 21.9417f, 26.8685f, 21.9417f)
                curveTo(26.3089f, 21.9417f, 25.9375f, 21.8556f, 25.7002f, 21.6723f)
                curveTo(25.4785f, 21.4998f, 25.3888f, 21.2014f, 25.3902f, 20.6431f)
                lineTo(25.405f, 15.2234f)
                horizontalLineTo(23.4586f)
                lineTo(23.4678f, 20.8509f)
                curveTo(23.4653f, 21.8253f, 23.7741f, 22.5145f, 24.4119f, 22.9562f)
                curveTo(25.0064f, 23.377f, 25.7273f, 23.5487f, 26.8984f, 23.5487f)
                curveTo(27.4739f, 23.5487f, 27.9574f, 23.4995f, 28.3677f, 23.3998f)
                lineTo(28.377f, 24.1192f)
                curveTo(28.3756f, 24.7006f, 28.2864f, 24.8187f, 27.8437f, 24.8187f)
                horizontalLineTo(26.9649f)
                verticalLineTo(26.4206f)
                horizontalLineTo(28.1615f)
                curveTo(29.6764f, 26.4206f, 30.2955f, 25.8276f, 30.2986f, 24.3737f)
                lineTo(30.3039f, 15.2234f)
                close()
            }
            path(fill = SolidColor(Color(0xFF16D6FF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.6924f, 21.9312f)
                lineTo(9.6955f, 23.5573f)
                curveTo(9.6955f, 23.5573f, 10.832f, 23.5595f, 10.8778f, 23.5595f)
                curveTo(13.2642f, 23.5595f, 14.2875f, 22.3895f, 14.2998f, 19.6462f)
                lineTo(14.3031f, 18.9281f)
                curveTo(14.3104f, 17.4414f, 14.0278f, 16.4664f, 13.4143f, 15.8592f)
                curveTo(12.8858f, 15.337f, 12.1205f, 15.0934f, 11.0064f, 15.0934f)
                curveTo(9.97f, 15.0934f, 9.1877f, 15.3284f, 8.6256f, 15.8098f)
                lineTo(8.6208f, 15.2353f)
                lineTo(7.0f, 15.2248f)
                lineTo(7.0196f, 26.4203f)
                horizontalLineTo(8.9831f)
                lineTo(8.9842f, 18.2898f)
                curveTo(8.9915f, 17.1009f, 9.4211f, 16.6792f, 10.676f, 16.6792f)
                curveTo(11.2719f, 16.6792f, 11.6604f, 16.7895f, 11.9005f, 17.0267f)
                curveTo(12.2189f, 17.3417f, 12.3525f, 17.9437f, 12.3469f, 19.0381f)
                lineTo(12.3447f, 19.5648f)
                curveTo(12.336f, 21.4431f, 11.945f, 21.9262f, 10.6305f, 21.9289f)
                lineTo(9.6924f, 21.9312f)
                close()
            }
            path(fill = SolidColor(Color(0xFF16D6FF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(44.2547f, 20.4841f)
                verticalLineTo(10.2977f)
                curveTo(48.6557f, 11.3213f, 51.9346f, 15.2441f, 51.9343f, 19.9305f)
                curveTo(51.9343f, 25.3958f, 47.4768f, 29.8261f, 41.9781f, 29.8261f)
                curveTo(41.6581f, 29.8261f, 41.3417f, 29.8094f, 41.0295f, 29.7802f)
                verticalLineTo(18.1647f)
                horizontalLineTo(38.9738f)
                verticalLineTo(29.3666f)
                curveTo(34.9425f, 28.1005f, 32.0197f, 24.3547f, 32.0197f, 19.9305f)
                curveTo(32.0197f, 17.5061f, 32.8985f, 15.2861f, 34.3552f, 13.5652f)
                verticalLineTo(21.358f)
                curveTo(34.3533f, 22.1402f, 34.5129f, 22.6699f, 34.8617f, 23.0241f)
                curveTo(35.2183f, 23.3858f, 35.7645f, 23.5547f, 36.5806f, 23.5547f)
                lineTo(37.785f, 23.5549f)
                curveTo(37.785f, 23.5549f, 37.785f, 23.3986f, 37.7861f, 23.0772f)
                lineTo(37.7878f, 22.3519f)
                verticalLineTo(21.8602f)
                horizontalLineTo(36.8509f)
                curveTo(36.6483f, 21.8602f, 36.5186f, 21.828f, 36.4535f, 21.7624f)
                curveTo(36.3721f, 21.6799f, 36.3383f, 21.4924f, 36.3392f, 21.1533f)
                verticalLineTo(11.7749f)
                curveTo(37.9427f, 10.678f, 39.8847f, 10.0347f, 41.9781f, 10.0347f)
                curveTo(42.0618f, 10.0347f, 42.1444f, 10.0375f, 42.2272f, 10.0403f)
                curveTo(42.2518f, 10.0411f, 42.2763f, 10.042f, 42.301f, 10.0427f)
                verticalLineTo(20.583f)
                curveTo(42.299f, 21.5783f, 42.5299f, 22.2966f, 43.017f, 22.7788f)
                curveTo(43.5744f, 23.3308f, 44.4389f, 23.5772f, 45.8199f, 23.5772f)
                curveTo(48.4648f, 23.5772f, 49.594f, 22.3972f, 49.5977f, 19.6308f)
                lineTo(49.5991f, 18.9874f)
                curveTo(49.6005f, 17.5199f, 49.3098f, 16.6466f, 48.682f, 16.0269f)
                curveTo(48.1565f, 15.5083f, 47.3879f, 15.2438f, 46.335f, 15.2269f)
                lineTo(46.3347f, 15.228f)
                lineTo(45.0197f, 15.2269f)
                verticalLineTo(16.8749f)
                horizontalLineTo(46.1953f)
                curveTo(46.6855f, 16.9066f, 46.9997f, 17.0194f, 47.2068f, 17.2336f)
                curveTo(47.5045f, 17.5416f, 47.6305f, 18.0122f, 47.6286f, 19.0397f)
                lineTo(47.628f, 19.5547f)
                curveTo(47.6255f, 21.7541f, 47.0547f, 21.9947f, 45.8445f, 21.9947f)
                curveTo(45.1723f, 21.9947f, 44.8036f, 21.8977f, 44.5736f, 21.6694f)
                curveTo(44.3522f, 21.4502f, 44.2533f, 21.0733f, 44.2547f, 20.4841f)
                close()
                moveTo(40.068f, 17.4722f)
                curveTo(40.7651f, 17.4722f, 41.1653f, 17.0877f, 41.1681f, 16.4166f)
                horizontalLineTo(41.1679f)
                verticalLineTo(16.3083f)
                curveTo(41.1684f, 15.9747f, 41.0714f, 15.7088f, 40.8791f, 15.5191f)
                curveTo(40.6838f, 15.3263f, 40.3953f, 15.2241f, 40.0451f, 15.2241f)
                horizontalLineTo(39.9632f)
                curveTo(39.2658f, 15.2241f, 38.8485f, 15.6183f, 38.8469f, 16.2794f)
                lineTo(38.8463f, 16.3877f)
                curveTo(38.8455f, 16.7136f, 38.9436f, 16.9752f, 39.1378f, 17.1666f)
                curveTo(39.3396f, 17.3666f, 39.6323f, 17.4722f, 39.9858f, 17.4722f)
                horizontalLineTo(40.068f)
                close()
            }
        }
        .build()
        return _paylib!!
    }

private var _paylib: ImageVector? = null
