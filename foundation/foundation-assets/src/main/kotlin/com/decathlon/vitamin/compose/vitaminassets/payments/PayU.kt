package com.decathlon.vitamin.compose.vitaminassets.payments

import androidx.compose.ui.geometry.Offset
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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.PayU: ImageVector
    get() {
        if (_payU != null) {
            return _payU!!
        }
        _payU = Builder(name = "PayU", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFFBCCF00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.6819f, 12.2421f)
                horizontalLineTo(51.4655f)
                curveTo(51.2229f, 12.2421f, 51.027f, 12.0463f, 51.027f, 11.8037f)
                verticalLineTo(9.5595f)
                curveTo(51.027f, 9.3169f, 51.2229f, 9.1211f, 51.4655f, 9.1211f)
                horizontalLineTo(53.6819f)
                curveTo(53.9245f, 9.1211f, 54.1204f, 9.3169f, 54.1204f, 9.5595f)
                verticalLineTo(11.8037f)
                curveTo(54.1204f, 12.0463f, 53.9228f, 12.2421f, 53.6819f, 12.2421f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBCCF00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.7272f, 9.1211f)
                horizontalLineTo(49.2213f)
                curveTo(49.0567f, 9.1211f, 48.9232f, 8.9877f, 48.9232f, 8.8231f)
                verticalLineTo(7.2981f)
                curveTo(48.9232f, 7.1334f, 49.0567f, 7.0f, 49.2213f, 7.0f)
                horizontalLineTo(50.7272f)
                curveTo(50.8918f, 7.0f, 51.0253f, 7.1334f, 51.0253f, 7.2981f)
                verticalLineTo(8.8231f)
                curveTo(51.0253f, 8.9877f, 50.8918f, 9.1211f, 50.7272f, 9.1211f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFFBCCF00), 1.0f to Color(0xFF438F29), start =
                    Offset(3.61235f,17.203f), end = Offset(3.61235f,36.2951f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.492f, 13.2421f)
                horizontalLineTo(9.717f)
                curveTo(13.0373f, 13.2421f, 14.5831f, 14.7133f, 14.5814f, 17.869f)
                curveTo(14.5814f, 21.0265f, 13.0356f, 22.496f, 9.7153f, 22.496f)
                horizontalLineTo(5.9756f)
                verticalLineTo(26.8024f)
                curveTo(5.9756f, 27.4678f, 5.7624f, 27.681f, 5.097f, 27.681f)
                horizontalLineTo(4.8786f)
                curveTo(4.2132f, 27.681f, 4.0f, 27.4678f, 4.0f, 26.8024f)
                verticalLineTo(15.734f)
                curveTo(4.0f, 14.0098f, 4.7694f, 13.2421f, 6.492f, 13.2421f)
                close()
                moveTo(9.7153f, 20.6504f)
                curveTo(12.1449f, 20.6504f, 12.6058f, 19.673f, 12.6058f, 17.869f)
                curveTo(12.6058f, 15.5608f, 11.547f, 15.1102f, 9.717f, 15.1102f)
                horizontalLineTo(6.8628f)
                curveTo(6.2164f, 15.1102f, 5.9773f, 15.3511f, 5.9773f, 15.9957f)
                verticalLineTo(20.6504f)
                horizontalLineTo(9.7153f)
                close()
                moveTo(18.737f, 16.4168f)
                curveTo(17.4598f, 16.4168f, 16.6575f, 16.5763f, 16.3542f, 16.6386f)
                curveTo(15.817f, 16.7548f, 15.5917f, 16.9038f, 15.5917f, 17.5155f)
                verticalLineTo(17.6905f)
                curveTo(15.5917f, 17.9297f, 15.6264f, 18.0961f, 15.7026f, 18.2122f)
                curveTo(15.791f, 18.3491f, 15.9348f, 18.4167f, 16.1272f, 18.4167f)
                curveTo(16.2208f, 18.4167f, 16.3299f, 18.4011f, 16.4599f, 18.3681f)
                curveTo(16.7666f, 18.2919f, 17.7492f, 18.1324f, 18.8219f, 18.1324f)
                curveTo(20.7507f, 18.1324f, 21.5374f, 18.6662f, 21.5374f, 19.9763f)
                verticalLineTo(21.1443f)
                horizontalLineTo(19.1044f)
                curveTo(15.9781f, 21.1443f, 14.5207f, 22.1997f, 14.5207f, 24.4629f)
                curveTo(14.5207f, 26.6603f, 16.0249f, 27.8699f, 18.7543f, 27.8699f)
                curveTo(21.9984f, 27.8699f, 23.4454f, 26.766f, 23.4454f, 24.2896f)
                verticalLineTo(19.9763f)
                curveTo(23.4506f, 17.5796f, 21.9083f, 16.4168f, 18.737f, 16.4168f)
                close()
                moveTo(21.5392f, 24.2238f)
                verticalLineTo(22.7057f)
                horizontalLineTo(19.1286f)
                curveTo(17.1912f, 22.7057f, 16.4356f, 23.1979f, 16.4356f, 24.4629f)
                curveTo(16.4356f, 25.6171f, 17.1877f, 26.1768f, 18.737f, 26.1768f)
                curveTo(21.0799f, 26.1768f, 21.5392f, 25.4611f, 21.5392f, 24.2238f)
                close()
                moveTo(34.1862f, 17.6247f)
                lineTo(31.6804f, 27.6481f)
                curveTo(30.9456f, 30.5872f, 29.691f, 31.8487f, 27.348f, 32.0012f)
                curveTo(27.2874f, 32.0064f, 27.2302f, 32.0099f, 27.1765f, 32.0099f)
                curveTo(26.6722f, 32.0099f, 26.5127f, 31.7309f, 26.4192f, 31.2821f)
                lineTo(26.3758f, 31.088f)
                curveTo(26.3325f, 30.8835f, 26.3065f, 30.653f, 26.4261f, 30.4936f)
                curveTo(26.5422f, 30.3393f, 26.7484f, 30.2943f, 27.0673f, 30.2666f)
                curveTo(28.6356f, 30.1054f, 29.1676f, 29.3793f, 29.691f, 27.7347f)
                curveTo(29.4432f, 27.8179f, 29.1451f, 27.863f, 28.8245f, 27.863f)
                curveTo(27.1002f, 27.863f, 26.6392f, 26.662f, 26.2511f, 25.2115f)
                lineTo(24.1819f, 17.6299f)
                curveTo(24.1126f, 17.3734f, 24.0676f, 17.11f, 24.201f, 16.935f)
                curveTo(24.3344f, 16.76f, 24.5961f, 16.7357f, 24.8595f, 16.7357f)
                horizontalLineTo(25.0345f)
                curveTo(25.6861f, 16.7357f, 25.9357f, 16.928f, 26.1055f, 17.5571f)
                lineTo(28.1538f, 25.0729f)
                curveTo(28.419f, 26.0104f, 28.6841f, 26.1699f, 29.3496f, 26.1699f)
                curveTo(29.892f, 26.1699f, 30.2091f, 26.0018f, 30.4344f, 25.0781f)
                lineTo(32.2419f, 17.5623f)
                curveTo(32.3857f, 16.9384f, 32.6404f, 16.7374f, 33.292f, 16.7374f)
                horizontalLineTo(33.4879f)
                curveTo(33.7495f, 16.7374f, 34.0095f, 16.7617f, 34.1464f, 16.935f)
                curveTo(34.2816f, 17.1048f, 34.2452f, 17.3665f, 34.1862f, 17.6247f)
                close()
                moveTo(48.918f, 17.5866f)
                verticalLineTo(14.696f)
                curveTo(48.918f, 13.4673f, 48.4172f, 13.2455f, 47.0672f, 13.2455f)
                horizontalLineTo(46.6427f)
                curveTo(45.2944f, 13.2455f, 44.7936f, 13.4691f, 44.7936f, 14.696f)
                verticalLineTo(17.571f)
                curveTo(44.7919f, 17.5779f, 44.7919f, 17.5831f, 44.7919f, 17.59f)
                verticalLineTo(18.2191f)
                curveTo(44.7919f, 18.2293f, 44.7915f, 18.2395f, 44.791f, 18.2499f)
                curveTo(44.7906f, 18.2607f, 44.7902f, 18.2717f, 44.7902f, 18.2832f)
                verticalLineTo(22.2967f)
                curveTo(44.7902f, 22.7871f, 44.6966f, 23.1771f, 44.5008f, 23.4803f)
                curveTo(44.1334f, 24.047f, 43.4055f, 24.3035f, 42.241f, 24.3052f)
                curveTo(41.0782f, 24.3035f, 40.3503f, 24.0453f, 39.983f, 23.4803f)
                curveTo(39.7889f, 23.1771f, 39.6936f, 22.7854f, 39.6936f, 22.295f)
                verticalLineTo(18.2815f)
                curveTo(39.6936f, 18.2702f, 39.6931f, 18.2598f, 39.6927f, 18.2494f)
                curveTo(39.6922f, 18.239f, 39.6918f, 18.2286f, 39.6918f, 18.2174f)
                verticalLineTo(17.5883f)
                curveTo(39.6918f, 17.5848f, 39.6914f, 17.5818f, 39.6909f, 17.5788f)
                curveTo(39.6905f, 17.5757f, 39.6901f, 17.5727f, 39.6901f, 17.5692f)
                verticalLineTo(14.696f)
                curveTo(39.6901f, 13.4673f, 39.1893f, 13.2455f, 37.841f, 13.2455f)
                horizontalLineTo(37.4165f)
                curveTo(36.0682f, 13.2455f, 35.5674f, 13.4691f, 35.5674f, 14.696f)
                verticalLineTo(17.5866f)
                verticalLineTo(20.6279f)
                verticalLineTo(22.295f)
                curveTo(35.5674f, 23.5167f, 35.8447f, 24.553f, 36.3767f, 25.3866f)
                curveTo(37.4061f, 27.0034f, 39.3989f, 27.8647f, 42.2323f, 27.8647f)
                horizontalLineTo(42.2427f)
                horizontalLineTo(42.2531f)
                curveTo(45.0865f, 27.8647f, 47.0794f, 27.0034f, 48.1088f, 25.3866f)
                curveTo(48.6425f, 24.553f, 48.918f, 23.5167f, 48.918f, 22.295f)
                verticalLineTo(20.6279f)
                verticalLineTo(17.5866f)
                close()
            }
            path(fill = SolidColor(Color(0xFFBCCF00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.4344f, 16.441f)
                lineTo(47.4485f, 16.4393f)
                curveTo(47.1227f, 16.4393f, 46.8593f, 16.1759f, 46.8593f, 15.8501f)
                lineTo(46.861f, 12.8279f)
                curveTo(46.861f, 12.5021f, 47.1245f, 12.2386f, 47.4502f, 12.2386f)
                lineTo(50.4361f, 12.2404f)
                curveTo(50.7619f, 12.2404f, 51.0253f, 12.5038f, 51.0253f, 12.8296f)
                lineTo(51.0236f, 15.8518f)
                curveTo(51.0253f, 16.1776f, 50.7602f, 16.441f, 50.4344f, 16.441f)
                close()
            }
        }
        .build()
        return _payU!!
    }

private var _payU: ImageVector? = null
