package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.graphics.Color
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

public val PaymentsGroup.Oney3x: ImageVector
    get() {
        if (_oney3x != null) {
            return _oney3x!!
        }
        _oney3x = Builder(name = "Oney3x", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF87BC2B)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.4404f, 13.5309f)
                curveTo(43.1427f, 13.5309f, 45.3508f, 15.7556f, 45.3674f, 18.491f)
                curveTo(45.3674f, 18.7537f, 45.3457f, 19.1342f, 45.3281f, 19.3239f)
                horizontalLineTo(37.3559f)
                curveTo(37.7613f, 21.1639f, 39.2435f, 21.9782f, 40.4791f, 21.9782f)
                curveTo(41.4521f, 21.9782f, 42.4737f, 21.5413f, 43.015f, 20.8935f)
                lineTo(43.0269f, 20.8796f)
                horizontalLineTo(45.0422f)
                curveTo(45.0422f, 20.8796f, 45.0375f, 20.9013f, 45.0163f, 20.9447f)
                curveTo(44.0149f, 22.992f, 41.9092f, 23.7138f, 40.4062f, 23.7138f)
                curveTo(39.09f, 23.7138f, 37.8523f, 23.173f, 36.9144f, 22.1912f)
                curveTo(35.9931f, 21.2218f, 35.4803f, 19.951f, 35.4803f, 18.613f)
                curveTo(35.4803f, 15.7633f, 37.6605f, 13.5309f, 40.4404f, 13.5309f)
                close()
                moveTo(40.4243f, 15.2639f)
                curveTo(38.8392f, 15.2639f, 37.6605f, 16.468f, 37.4149f, 17.7f)
                horizontalLineTo(43.4291f)
                curveTo(43.1872f, 16.468f, 42.0084f, 15.2639f, 40.4243f, 15.2639f)
                close()
                moveTo(27.1803f, 18.0748f)
                curveTo(27.1803f, 16.1692f, 28.0934f, 15.206f, 29.8899f, 15.206f)
                curveTo(31.6855f, 15.206f, 32.5933f, 16.1692f, 32.5933f, 18.0748f)
                verticalLineTo(23.7179f)
                horizontalLineTo(34.4364f)
                verticalLineTo(17.9425f)
                curveTo(34.4256f, 16.9297f, 34.2405f, 16.2136f, 33.831f, 15.5415f)
                curveTo(33.3425f, 14.7867f, 32.1787f, 13.517f, 29.8899f, 13.517f)
                curveTo(27.595f, 13.517f, 26.4348f, 14.7867f, 25.9458f, 15.5415f)
                curveTo(25.5327f, 16.2136f, 25.3533f, 16.9297f, 25.3357f, 17.9425f)
                verticalLineTo(23.7179f)
                horizontalLineTo(27.1803f)
                verticalLineTo(18.0748f)
                close()
                moveTo(51.0689f, 23.006f)
                lineTo(54.9572f, 13.519f)
                horizontalLineTo(53.0247f)
                lineTo(50.1088f, 20.6526f)
                lineTo(47.1996f, 13.519f)
                horizontalLineTo(45.1735f)
                lineTo(49.1477f, 23.0081f)
                lineTo(47.6603f, 26.6519f)
                horizontalLineTo(49.5773f)
                lineTo(50.1077f, 25.3537f)
                lineTo(51.0689f, 23.006f)
                close()
                moveTo(15.901f, 18.626f)
                curveTo(15.901f, 20.5078f, 17.3775f, 21.9839f, 19.1922f, 21.9839f)
                curveTo(20.9939f, 21.9839f, 22.4782f, 20.5078f, 22.4782f, 18.626f)
                curveTo(22.4782f, 16.743f, 20.9939f, 15.2639f, 19.1922f, 15.2639f)
                curveTo(17.3775f, 15.2639f, 15.901f, 16.743f, 15.901f, 18.626f)
                close()
                moveTo(14.1028f, 18.6254f)
                curveTo(14.1028f, 15.7607f, 16.3378f, 13.519f, 19.1917f, 13.519f)
                curveTo(22.0388f, 13.519f, 24.2727f, 15.7607f, 24.2727f, 18.6254f)
                curveTo(24.2727f, 21.4876f, 22.0388f, 23.7324f, 19.1917f, 23.7324f)
                curveTo(16.3378f, 23.7324f, 14.1028f, 21.4876f, 14.1028f, 18.6254f)
                close()
                moveTo(9.7748f, 19.5708f)
                lineTo(10.2225f, 20.3644f)
                horizontalLineTo(11.2255f)
                lineTo(10.2907f, 18.9871f)
                lineTo(11.2089f, 17.6331f)
                horizontalLineTo(10.2054f)
                lineTo(9.7748f, 18.4039f)
                lineTo(9.3441f, 17.6331f)
                horizontalLineTo(8.3416f)
                lineTo(9.265f, 18.9871f)
                lineTo(8.3246f, 20.3644f)
                horizontalLineTo(9.3276f)
                lineTo(9.7748f, 19.5708f)
                close()
                moveTo(5.0944f, 19.0326f)
                curveTo(5.0944f, 19.8712f, 5.6382f, 20.4492f, 6.6185f, 20.4492f)
                curveTo(7.3723f, 20.4492f, 8.047f, 20.0128f, 8.047f, 19.259f)
                curveTo(8.047f, 18.755f, 7.7574f, 18.4318f, 7.4007f, 18.3015f)
                curveTo(7.7181f, 18.194f, 7.9844f, 17.8709f, 7.9844f, 17.4237f)
                curveTo(7.9844f, 16.6807f, 7.3325f, 16.3126f, 6.6014f, 16.3126f)
                curveTo(5.6212f, 16.3126f, 5.2019f, 16.9077f, 5.2019f, 17.5819f)
                horizontalLineTo(6.1196f)
                curveTo(6.1196f, 17.2365f, 6.2333f, 17.0039f, 6.6242f, 17.0039f)
                curveTo(6.8904f, 17.0039f, 7.0776f, 17.1455f, 7.0776f, 17.4459f)
                curveTo(7.0776f, 17.7349f, 6.9587f, 17.9334f, 6.5508f, 17.9334f)
                horizontalLineTo(6.1935f)
                verticalLineTo(18.6417f)
                horizontalLineTo(6.5508f)
                curveTo(6.9809f, 18.6417f, 7.1344f, 18.8625f, 7.1344f, 19.1913f)
                curveTo(7.1344f, 19.4632f, 6.9473f, 19.713f, 6.6071f, 19.713f)
                curveTo(6.2561f, 19.713f, 6.012f, 19.4632f, 6.012f, 19.0326f)
                horizontalLineTo(5.0944f)
                close()
                moveTo(3.0f, 18.6097f)
                curveTo(3.0f, 15.7527f, 5.2293f, 13.5172f, 8.0759f, 13.5172f)
                curveTo(10.9158f, 13.5172f, 13.1441f, 15.7527f, 13.1441f, 18.6097f)
                curveTo(13.1441f, 21.4651f, 10.9158f, 23.7037f, 8.0759f, 23.7037f)
                curveTo(5.2293f, 23.7037f, 3.0f, 21.4651f, 3.0f, 18.6097f)
                close()
            }
        }
        .build()
        return _oney3x!!
    }

private var _oney3x: ImageVector? = null
