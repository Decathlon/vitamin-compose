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

public val PaymentsGroup.VisaClassic: ImageVector
    get() {
        if (_visaClassic != null) {
            return _visaClassic!!
        }
        _visaClassic = Builder(name = "VisaClassic", defaultWidth = 58.0.dp, defaultHeight =
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
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.7516f, 27.4332f)
                horizontalLineTo(21.8901f)
                lineTo(24.3054f, 13.4325f)
                horizontalLineTo(28.1667f)
                lineTo(25.7516f, 27.4332f)
                close()
            }
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.7499f, 13.7748f)
                curveTo(38.9882f, 13.4915f, 37.7802f, 13.1787f, 36.2865f, 13.1787f)
                curveTo(32.4731f, 13.1787f, 29.7878f, 15.0851f, 29.7713f, 17.8106f)
                curveTo(29.7396f, 19.8215f, 31.6939f, 20.9384f, 33.1556f, 21.6089f)
                curveTo(34.6495f, 22.2941f, 35.1574f, 22.7413f, 35.1574f, 23.352f)
                curveTo(35.1422f, 24.29f, 33.9502f, 24.7223f, 32.8384f, 24.7223f)
                curveTo(31.2967f, 24.7223f, 30.4707f, 24.4994f, 29.2153f, 23.9776f)
                lineTo(28.7069f, 23.7539f)
                lineTo(28.1665f, 26.8967f)
                curveTo(29.0722f, 27.2835f, 30.7408f, 27.6268f, 32.4731f, 27.6419f)
                curveTo(36.5249f, 27.6419f, 39.1627f, 25.765f, 39.1939f, 22.8605f)
                curveTo(39.2093f, 21.2667f, 38.1774f, 20.0454f, 35.9526f, 19.0475f)
                curveTo(34.602f, 18.4069f, 33.7749f, 17.9749f, 33.7749f, 17.3195f)
                curveTo(33.7908f, 16.7236f, 34.4745f, 16.1133f, 35.9991f, 16.1133f)
                curveTo(37.2544f, 16.0834f, 38.1768f, 16.3663f, 38.8755f, 16.6494f)
                lineTo(39.2247f, 16.7981f)
                lineTo(39.7499f, 13.7748f)
                close()
            }
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(46.6618f, 13.4325f)
                horizontalLineTo(49.6486f)
                lineTo(52.7639f, 27.433f)
                horizontalLineTo(49.1885f)
                curveTo(49.1885f, 27.433f, 48.8386f, 25.8244f, 48.7278f, 25.3328f)
                horizontalLineTo(43.7699f)
                curveTo(43.6266f, 25.705f, 42.9595f, 27.433f, 42.9595f, 27.433f)
                horizontalLineTo(38.9078f)
                lineTo(44.6435f, 14.5941f)
                curveTo(45.0409f, 13.6855f, 45.7407f, 13.4325f, 46.6618f, 13.4325f)
                close()
                moveTo(46.4238f, 18.556f)
                curveTo(46.4238f, 18.556f, 45.2001f, 21.6689f, 44.8821f, 22.4732f)
                horizontalLineTo(48.0918f)
                curveTo(47.933f, 21.7733f, 47.2017f, 18.4219f, 47.2017f, 18.4219f)
                lineTo(46.9319f, 17.2156f)
                curveTo(46.8182f, 17.5262f, 46.6539f, 17.9533f, 46.543f, 18.2414f)
                curveTo(46.4679f, 18.4366f, 46.4173f, 18.568f, 46.4238f, 18.556f)
                close()
            }
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.1589f, 13.4325f)
                horizontalLineTo(11.3716f)
                curveTo(12.2138f, 13.462f, 12.8971f, 13.7152f, 13.1194f, 14.6094f)
                lineTo(14.4696f, 21.0422f)
                curveTo(14.4697f, 21.0426f, 14.4699f, 21.043f, 14.47f, 21.0434f)
                lineTo(14.8832f, 22.9796f)
                lineTo(18.6649f, 13.4325f)
                horizontalLineTo(22.7481f)
                lineTo(16.6785f, 27.4184f)
                horizontalLineTo(12.5951f)
                lineTo(9.1534f, 15.253f)
                curveTo(7.9659f, 14.6021f, 6.6106f, 14.0786f, 5.0953f, 13.7154f)
                lineTo(5.1589f, 13.4325f)
                close()
            }
        }
        .build()
        return _visaClassic!!
    }

private var _visaClassic: ImageVector? = null
