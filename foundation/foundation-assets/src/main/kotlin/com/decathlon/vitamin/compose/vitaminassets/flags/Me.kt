package com.decathlon.vitamin.compose.vitaminassets.flags

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

public val FlagsGroup.Me: ImageVector
    get() {
        if (_me != null) {
            return _me!!
        }
        _me = Builder(name = "Me", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 0.0f)
                    lineTo(26.0f, 0.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 28.0f, 2.0f)
                    lineTo(28.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 26.0f, 20.0f)
                    lineTo(2.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 0.0f, 18.0f)
                    lineTo(0.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE6BE53)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(0.0f, 0.0f)
                    horizontalLineToRelative(28.0f)
                    verticalLineToRelative(20.0f)
                    horizontalLineToRelative(-28.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE01826)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(1.3335f, 17.6666f)
                    curveTo(1.3335f, 18.2189f, 1.7812f, 18.6666f, 2.3335f, 18.6666f)
                    horizontalLineTo(25.6668f)
                    curveTo(26.2191f, 18.6666f, 26.6668f, 18.2189f, 26.6668f, 17.6666f)
                    verticalLineTo(2.3333f)
                    curveTo(26.6668f, 1.781f, 26.2191f, 1.3333f, 25.6668f, 1.3333f)
                    horizontalLineTo(2.3335f)
                    curveTo(1.7812f, 1.3333f, 1.3335f, 1.781f, 1.3335f, 2.3333f)
                    verticalLineTo(17.6666f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE6BE53)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(13.0233f, 3.6589f)
                    curveTo(12.5532f, 3.8156f, 12.4123f, 4.4123f, 12.7627f, 4.7627f)
                    lineTo(13.1381f, 5.1381f)
                    curveTo(13.2631f, 5.2631f, 13.4327f, 5.3333f, 13.6095f, 5.3333f)
                    horizontalLineTo(14.3905f)
                    curveTo(14.5673f, 5.3333f, 14.7369f, 5.2631f, 14.8619f, 5.1381f)
                    lineTo(15.2373f, 4.7627f)
                    curveTo(15.5877f, 4.4123f, 15.4468f, 3.8156f, 14.9767f, 3.6589f)
                    lineTo(14.2108f, 3.4036f)
                    curveTo(14.074f, 3.358f, 13.926f, 3.358f, 13.7892f, 3.4036f)
                    lineTo(13.0233f, 3.6589f)
                    close()
                    moveTo(14.4716f, 6.8619f)
                    curveTo(14.2112f, 7.1223f, 13.7891f, 7.1223f, 13.5288f, 6.8619f)
                    lineTo(13.3335f, 6.6667f)
                    lineTo(12.3399f, 5.6731f)
                    curveTo(12.137f, 5.4702f, 11.827f, 5.4199f, 11.5704f, 5.5482f)
                    lineTo(11.4941f, 5.5863f)
                    curveTo(11.0871f, 5.7899f, 10.9991f, 6.3323f, 11.3209f, 6.654f)
                    lineTo(11.3335f, 6.6667f)
                    lineTo(12.3271f, 7.6602f)
                    curveTo(12.53f, 7.8631f, 12.5803f, 8.1731f, 12.4519f, 8.4298f)
                    lineTo(12.0381f, 9.2574f)
                    curveTo(12.0132f, 9.3073f, 12.0002f, 9.3624f, 12.0002f, 9.4182f)
                    curveTo(12.0002f, 9.6855f, 11.7189f, 9.8594f, 11.4798f, 9.7398f)
                    lineTo(11.1569f, 9.5784f)
                    curveTo(10.9158f, 9.4578f, 10.8637f, 9.1365f, 11.0543f, 8.9459f)
                    curveTo(11.2085f, 8.7917f, 11.2085f, 8.5416f, 11.0543f, 8.3874f)
                    lineTo(10.7433f, 8.0765f)
                    curveTo(10.6927f, 8.0258f, 10.6505f, 7.9673f, 10.6184f, 7.9032f)
                    lineTo(10.0329f, 6.7321f)
                    curveTo(10.0111f, 6.6886f, 9.9942f, 6.6429f, 9.9824f, 6.5957f)
                    lineTo(9.6732f, 5.3588f)
                    curveTo(9.5371f, 4.8142f, 8.8299f, 4.6714f, 8.4931f, 5.1205f)
                    lineTo(7.4668f, 6.4889f)
                    curveTo(7.3803f, 6.6043f, 7.3335f, 6.7446f, 7.3335f, 6.8889f)
                    verticalLineTo(9.176f)
                    curveTo(7.3335f, 9.2795f, 7.3576f, 9.3815f, 7.4039f, 9.4741f)
                    lineTo(7.9518f, 10.5699f)
                    curveTo(7.9838f, 10.634f, 8.026f, 10.6925f, 8.0767f, 10.7432f)
                    lineTo(9.257f, 11.9235f)
                    curveTo(9.3077f, 11.9742f, 9.3662f, 12.0163f, 9.4303f, 12.0484f)
                    lineTo(10.6039f, 12.6352f)
                    curveTo(10.6453f, 12.6559f, 10.6909f, 12.6667f, 10.7372f, 12.6667f)
                    curveTo(11.0518f, 12.6667f, 11.1519f, 13.0908f, 10.8705f, 13.2315f)
                    lineTo(10.716f, 13.3087f)
                    curveTo(10.6834f, 13.325f, 10.6537f, 13.3465f, 10.6279f, 13.3722f)
                    lineTo(10.3335f, 13.6667f)
                    curveTo(10.1494f, 13.8508f, 9.8509f, 13.8508f, 9.6668f, 13.6667f)
                    curveTo(9.4827f, 13.4826f, 9.1843f, 13.4826f, 9.0002f, 13.6667f)
                    lineTo(8.9461f, 13.7208f)
                    curveTo(8.7793f, 13.8875f, 8.738f, 14.1423f, 8.8434f, 14.3532f)
                    lineTo(9.1492f, 14.9648f)
                    curveTo(9.2622f, 15.1907f, 9.493f, 15.3333f, 9.7455f, 15.3333f)
                    horizontalLineTo(10.5095f)
                    curveTo(10.6129f, 15.3333f, 10.715f, 15.3092f, 10.8076f, 15.263f)
                    lineTo(11.8014f, 14.766f)
                    curveTo(11.9304f, 14.7015f, 12.035f, 14.5969f, 12.0995f, 14.4679f)
                    lineTo(12.4018f, 13.8634f)
                    curveTo(12.5322f, 13.6026f, 12.8797f, 13.5462f, 13.0859f, 13.7524f)
                    curveTo(13.2299f, 13.8964f, 13.2522f, 14.1219f, 13.1393f, 14.2914f)
                    lineTo(12.37f, 15.4453f)
                    curveTo(12.1657f, 15.7517f, 12.2485f, 16.1656f, 12.5549f, 16.3698f)
                    lineTo(13.6304f, 17.0868f)
                    curveTo(13.8543f, 17.2361f, 14.146f, 17.2361f, 14.37f, 17.0868f)
                    lineTo(15.4455f, 16.3698f)
                    curveTo(15.7518f, 16.1656f, 15.8346f, 15.7517f, 15.6304f, 15.4453f)
                    lineTo(14.8611f, 14.2914f)
                    curveTo(14.7481f, 14.1219f, 14.7705f, 13.8964f, 14.9144f, 13.7524f)
                    curveTo(15.1206f, 13.5462f, 15.4681f, 13.6026f, 15.5985f, 13.8634f)
                    lineTo(15.9008f, 14.4679f)
                    curveTo(15.9653f, 14.5969f, 16.0699f, 14.7015f, 16.1989f, 14.766f)
                    lineTo(17.1927f, 15.263f)
                    curveTo(17.2853f, 15.3092f, 17.3874f, 15.3333f, 17.4909f, 15.3333f)
                    horizontalLineTo(18.2548f)
                    curveTo(18.5073f, 15.3333f, 18.7382f, 15.1907f, 18.8511f, 14.9648f)
                    lineTo(19.1569f, 14.3532f)
                    curveTo(19.2624f, 14.1423f, 19.221f, 13.8875f, 19.0543f, 13.7208f)
                    lineTo(19.0002f, 13.6667f)
                    curveTo(18.8161f, 13.4826f, 18.5176f, 13.4826f, 18.3335f, 13.6667f)
                    curveTo(18.1494f, 13.8508f, 17.8509f, 13.8508f, 17.6668f, 13.6667f)
                    lineTo(17.3724f, 13.3722f)
                    curveTo(17.3466f, 13.3465f, 17.3169f, 13.325f, 17.2843f, 13.3087f)
                    lineTo(17.1298f, 13.2315f)
                    curveTo(16.8484f, 13.0908f, 16.9485f, 12.6667f, 17.2631f, 12.6667f)
                    curveTo(17.3094f, 12.6667f, 17.355f, 12.6559f, 17.3964f, 12.6352f)
                    lineTo(18.5701f, 12.0484f)
                    curveTo(18.6342f, 12.0163f, 18.6927f, 11.9742f, 18.7433f, 11.9235f)
                    lineTo(19.9237f, 10.7432f)
                    curveTo(19.9743f, 10.6925f, 20.0165f, 10.634f, 20.0485f, 10.5699f)
                    lineTo(20.5964f, 9.4741f)
                    curveTo(20.6427f, 9.3815f, 20.6668f, 9.2795f, 20.6668f, 9.176f)
                    verticalLineTo(6.8889f)
                    curveTo(20.6668f, 6.7446f, 20.62f, 6.6043f, 20.5335f, 6.4889f)
                    lineTo(19.5072f, 5.1205f)
                    curveTo(19.1704f, 4.6714f, 18.4633f, 4.8142f, 18.3271f, 5.3588f)
                    lineTo(18.0179f, 6.5957f)
                    curveTo(18.0061f, 6.6429f, 17.9892f, 6.6886f, 17.9674f, 6.7321f)
                    lineTo(17.3819f, 7.9032f)
                    curveTo(17.3498f, 7.9673f, 17.3077f, 8.0258f, 17.257f, 8.0765f)
                    lineTo(16.9461f, 8.3874f)
                    curveTo(16.7919f, 8.5416f, 16.7918f, 8.7917f, 16.9461f, 8.9459f)
                    curveTo(17.1367f, 9.1365f, 17.0845f, 9.4578f, 16.8434f, 9.5784f)
                    lineTo(16.5205f, 9.7398f)
                    curveTo(16.2815f, 9.8594f, 16.0002f, 9.6855f, 16.0002f, 9.4182f)
                    curveTo(16.0002f, 9.3624f, 15.9872f, 9.3073f, 15.9622f, 9.2574f)
                    lineTo(15.5484f, 8.4298f)
                    curveTo(15.4201f, 8.1731f, 15.4704f, 7.8631f, 15.6733f, 7.6602f)
                    lineTo(16.6668f, 6.6667f)
                    lineTo(16.6795f, 6.654f)
                    curveTo(17.0012f, 6.3323f, 16.9132f, 5.7899f, 16.5062f, 5.5863f)
                    lineTo(16.4299f, 5.5482f)
                    curveTo(16.1733f, 5.4199f, 15.8633f, 5.4702f, 15.6604f, 5.6731f)
                    lineTo(14.6668f, 6.6667f)
                    lineTo(14.4716f, 6.8619f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF215F90)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(12.6665f, 11.3333f)
                    curveTo(12.6665f, 11.5788f, 13.0799f, 11.6604f, 13.1995f, 11.4461f)
                    curveTo(13.4319f, 11.0295f, 13.7159f, 10.6666f, 13.9998f, 10.6666f)
                    curveTo(14.2838f, 10.6666f, 14.5678f, 11.0295f, 14.8002f, 11.4461f)
                    curveTo(14.9198f, 11.6604f, 15.3332f, 11.5788f, 15.3332f, 11.3333f)
                    curveTo(15.3332f, 10.2287f, 14.7362f, 9.3333f, 13.9998f, 9.3333f)
                    curveTo(13.2635f, 9.3333f, 12.6665f, 10.2287f, 12.6665f, 11.3333f)
                    close()
                }
            }
        }
        .build()
        return _me!!
    }

private var _me: ImageVector? = null
