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

public val PaymentsGroup.PowerPay: ImageVector
    get() {
        if (_powerPay != null) {
            return _powerPay!!
        }
        _powerPay = Builder(name = "PowerPay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFFDCA126)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.449f, 16.1125f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.6741f)
                horizontalLineTo(4.0914f)
                verticalLineTo(20.5653f)
                horizontalLineTo(5.325f)
                curveTo(6.6914f, 20.5653f, 7.8094f, 19.7966f, 7.8094f, 18.3247f)
                verticalLineTo(18.3061f)
                curveTo(7.8094f, 16.9842f, 6.9044f, 16.1125f, 5.449f, 16.1125f)
                close()
                moveTo(6.7001f, 18.3528f)
                curveTo(6.7001f, 19.0371f, 6.1855f, 19.5246f, 5.3604f, 19.5246f)
                horizontalLineTo(4.0914f)
                verticalLineTo(17.1625f)
                horizontalLineTo(5.3604f)
                curveTo(6.1767f, 17.1625f, 6.7001f, 17.5656f, 6.7001f, 18.3339f)
                verticalLineTo(18.3528f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDCA126)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6448f, 16.1125f)
                horizontalLineTo(16.8251f)
                lineTo(18.3068f, 20.9775f)
                lineTo(19.833f, 16.0936f)
                horizontalLineTo(20.7558f)
                lineTo(22.2823f, 20.9775f)
                lineTo(23.7643f, 16.1125f)
                horizontalLineTo(24.9089f)
                lineTo(22.7525f, 22.7211f)
                horizontalLineTo(21.803f)
                lineTo(20.2768f, 18.006f)
                lineTo(18.7504f, 22.7211f)
                horizontalLineTo(17.81f)
                lineTo(15.6448f, 16.1125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDCA126)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0269f, 16.1125f)
                horizontalLineTo(30.6324f)
                verticalLineTo(17.1437f)
                horizontalLineTo(27.1183f)
                verticalLineTo(18.8495f)
                horizontalLineTo(30.233f)
                verticalLineTo(19.8806f)
                horizontalLineTo(27.1183f)
                verticalLineTo(21.643f)
                horizontalLineTo(30.6765f)
                verticalLineTo(22.6741f)
                horizontalLineTo(26.0269f)
                verticalLineTo(16.1125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDCA126)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.7407f, 16.1125f)
                horizontalLineTo(31.9721f)
                verticalLineTo(22.6741f)
                horizontalLineTo(33.0635f)
                verticalLineTo(20.3872f)
                horizontalLineTo(34.4299f)
                lineTo(35.9564f, 22.6741f)
                horizontalLineTo(37.252f)
                lineTo(35.5745f, 20.1903f)
                curveTo(36.4354f, 19.9279f, 37.0478f, 19.281f, 37.0478f, 18.2029f)
                verticalLineTo(18.1844f)
                curveTo(37.0478f, 17.6126f, 36.8614f, 17.1248f, 36.5331f, 16.7687f)
                curveTo(36.1337f, 16.3564f, 35.5216f, 16.1125f, 34.7407f, 16.1125f)
                close()
                moveTo(35.9385f, 18.2688f)
                curveTo(35.9385f, 18.9342f, 35.4417f, 19.3654f, 34.6608f, 19.3654f)
                horizontalLineTo(33.0635f)
                verticalLineTo(17.1625f)
                horizontalLineTo(34.652f)
                curveTo(35.4593f, 17.1625f, 35.9385f, 17.547f, 35.9385f, 18.2499f)
                verticalLineTo(18.2688f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDCA126)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9457f, 16.7155f)
                lineTo(13.354f, 17.5583f)
                curveTo(13.7822f, 17.9878f, 14.1371f, 18.7065f, 14.1371f, 19.3935f)
                verticalLineTo(19.412f)
                curveTo(14.1371f, 20.687f, 13.1425f, 21.8154f, 11.9089f, 21.8154f)
                curveTo(10.6756f, 21.8154f, 9.6657f, 20.6685f, 9.6657f, 19.3935f)
                verticalLineTo(19.375f)
                curveTo(9.6657f, 18.6863f, 9.9668f, 18.0282f, 10.3918f, 17.6033f)
                lineTo(9.8615f, 16.726f)
                curveTo(9.1075f, 17.3518f, 8.6523f, 18.3214f, 8.6523f, 19.3935f)
                verticalLineTo(19.412f)
                curveTo(8.6523f, 21.2588f, 9.9834f, 22.787f, 11.8914f, 22.787f)
                curveTo(13.7991f, 22.787f, 15.148f, 21.24f, 15.148f, 19.3935f)
                verticalLineTo(19.375f)
                curveTo(15.148f, 18.3012f, 14.6975f, 17.3359f, 13.9457f, 16.7155f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDCA126)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3872f, 19.0007f)
                curveTo(12.3872f, 19.2849f, 12.1692f, 19.5156f, 11.8998f, 19.5156f)
                curveTo(11.6311f, 19.5156f, 11.4127f, 19.2849f, 11.4127f, 19.0007f)
                verticalLineTo(16.5146f)
                curveTo(11.4127f, 16.2303f, 11.6311f, 16.0f, 11.8998f, 16.0f)
                curveTo(12.1692f, 16.0f, 12.3872f, 16.2303f, 12.3872f, 16.5146f)
                verticalLineTo(19.0007f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDCA126)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8615f, 16.7257f)
                curveTo(10.0391f, 16.538f, 10.326f, 16.6145f, 10.5309f, 16.8309f)
                curveTo(10.7358f, 17.0473f, 10.5697f, 17.4156f, 10.3918f, 17.6032f)
                curveTo(10.2142f, 17.7908f, 10.0845f, 17.7194f, 9.8797f, 17.503f)
                curveTo(9.6748f, 17.2865f, 9.6839f, 16.9133f, 9.8615f, 16.7257f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDCA126)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9457f, 16.7154f)
                curveTo(13.7681f, 16.5278f, 13.4699f, 16.6148f, 13.265f, 16.8313f)
                curveTo(13.0598f, 17.0477f, 13.176f, 17.3703f, 13.354f, 17.5583f)
                curveTo(13.5316f, 17.7462f, 13.7111f, 17.7197f, 13.9159f, 17.5027f)
                curveTo(14.1208f, 17.2869f, 14.1233f, 16.9027f, 13.9457f, 16.7154f)
                close()
            }
            path(fill = SolidColor(Color(0xFF467BA8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(40.5609f, 16.047f)
                horizontalLineTo(38.1122f)
                verticalLineTo(22.6069f)
                horizontalLineTo(39.2036f)
                verticalLineTo(20.4984f)
                horizontalLineTo(40.4366f)
                curveTo(41.803f, 20.4984f, 42.9206f, 19.73f, 42.9206f, 18.2588f)
                verticalLineTo(18.2399f)
                curveTo(42.9206f, 16.9186f, 42.0157f, 16.047f, 40.5609f, 16.047f)
                close()
                moveTo(41.8117f, 18.2866f)
                curveTo(41.8117f, 18.9709f, 41.2971f, 19.458f, 40.4719f, 19.458f)
                horizontalLineTo(39.2036f)
                verticalLineTo(17.0966f)
                horizontalLineTo(40.4719f)
                curveTo(41.2883f, 17.0966f, 41.8117f, 17.4997f, 41.8117f, 18.2681f)
                verticalLineTo(18.2866f)
                close()
            }
            path(fill = SolidColor(Color(0xFF467BA8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(46.6302f, 16.0f)
                horizontalLineTo(45.6187f)
                lineTo(42.8865f, 22.6069f)
                horizontalLineTo(44.0042f)
                lineTo(44.6429f, 21.0232f)
                horizontalLineTo(47.5793f)
                lineTo(48.2093f, 22.6069f)
                horizontalLineTo(49.3624f)
                lineTo(46.6302f, 16.0f)
                close()
                moveTo(46.1067f, 17.3776f)
                lineTo(47.1803f, 20.0017f)
                horizontalLineTo(45.042f)
                lineTo(46.1067f, 17.3776f)
                close()
            }
            path(fill = SolidColor(Color(0xFF467BA8)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.2892f, 20.0206f)
                lineTo(48.823f, 16.047f)
                horizontalLineTo(50.118f)
                lineTo(51.8481f, 18.9428f)
                lineTo(53.6045f, 16.047f)
                horizontalLineTo(54.8556f)
                lineTo(52.389f, 19.9924f)
                verticalLineTo(22.6069f)
                horizontalLineTo(51.2892f)
                verticalLineTo(20.0206f)
                close()
            }
        }
        .build()
        return _powerPay!!
    }

private var _powerPay: ImageVector? = null
