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

public val PaymentsGroup.Skrill: ImageVector
    get() {
        if (_skrill != null) {
            return _skrill!!
        }
        _skrill = Builder(name = "Skrill", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF862165)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(48.6494f, 12.7211f)
                verticalLineTo(27.2361f)
                horizontalLineTo(52.6426f)
                verticalLineTo(12.0115f)
                lineTo(48.6494f, 12.7211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF862165)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(42.8205f, 12.7211f)
                lineTo(46.8111f, 12.0115f)
                verticalLineTo(27.2361f)
                horizontalLineTo(42.8205f)
                verticalLineTo(12.7211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF862165)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(37.136f, 27.2361f)
                verticalLineTo(16.1005f)
                horizontalLineTo(41.1286f)
                verticalLineTo(27.2361f)
                horizontalLineTo(37.136f)
                close()
            }
            path(fill = SolidColor(Color(0xFF862165)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(37.1636f, 13.0775f)
                curveTo(37.1636f, 11.9975f, 38.0453f, 11.1213f, 39.1311f, 11.1213f)
                curveTo(40.2187f, 11.1213f, 41.0998f, 11.9975f, 41.0998f, 13.0775f)
                curveTo(41.0998f, 14.1583f, 40.2187f, 15.0325f, 39.1311f, 15.0325f)
                curveTo(38.0453f, 15.0325f, 37.1636f, 14.1583f, 37.1636f, 13.0775f)
                close()
            }
            path(fill = SolidColor(Color(0xFF862165)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.884f, 15.9372f)
                curveTo(31.1952f, 16.0554f, 29.3211f, 17.7009f, 29.3211f, 20.9717f)
                verticalLineTo(27.2361f)
                horizontalLineTo(33.3469f)
                verticalLineTo(22.1267f)
                curveTo(33.3469f, 20.1692f, 33.6052f, 19.33f, 35.9435f, 19.2499f)
                verticalLineTo(15.9951f)
                curveTo(35.5503f, 15.9118f, 34.884f, 15.9372f, 34.884f, 15.9372f)
                close()
            }
            path(fill = SolidColor(Color(0xFF862165)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0524f, 16.0878f)
                curveTo(23.9641f, 16.3102f, 23.326f, 18.105f, 21.7786f, 19.9647f)
                verticalLineTo(12.0115f)
                lineTo(17.6582f, 12.8215f)
                verticalLineTo(27.2361f)
                horizontalLineTo(21.7786f)
                verticalLineTo(22.7798f)
                curveTo(22.9717f, 24.5588f, 23.5613f, 27.2361f, 23.5613f, 27.2361f)
                horizontalLineTo(28.4957f)
                curveTo(28.0078f, 25.2195f, 25.8728f, 21.5022f, 25.8728f, 21.5022f)
                curveTo(27.7897f, 19.0866f, 28.6306f, 16.5141f, 28.7649f, 16.0878f)
                horizontalLineTo(24.0524f)
                close()
            }
            path(fill = SolidColor(Color(0xFF862165)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.7487f, 17.6755f)
                curveTo(10.2442f, 17.6431f, 9.0753f, 17.5675f, 9.0753f, 16.5224f)
                curveTo(9.0753f, 15.2612f, 10.757f, 15.2612f, 11.3881f, 15.2612f)
                curveTo(12.4981f, 15.2612f, 13.9342f, 15.5865f, 14.9611f, 15.8921f)
                curveTo(14.9611f, 15.8921f, 15.5328f, 16.0929f, 16.0194f, 16.2975f)
                lineTo(16.0648f, 16.3102f)
                verticalLineTo(12.8558f)
                lineTo(16.004f, 12.8374f)
                curveTo(14.7917f, 12.4162f, 13.3843f, 12.0115f, 10.7736f, 12.0115f)
                curveTo(6.2727f, 12.0115f, 4.678f, 14.6157f, 4.678f, 16.8489f)
                curveTo(4.678f, 18.1349f, 5.233f, 21.1642f, 10.3861f, 21.513f)
                curveTo(10.8241f, 21.5397f, 11.984f, 21.6064f, 11.984f, 22.6864f)
                curveTo(11.984f, 23.5785f, 11.0345f, 24.1033f, 9.4378f, 24.1033f)
                curveTo(7.6884f, 24.1033f, 5.9901f, 23.6611f, 4.9594f, 23.2398f)
                verticalLineTo(26.7965f)
                curveTo(6.5029f, 27.1999f, 8.2434f, 27.3994f, 10.2832f, 27.3994f)
                curveTo(14.6823f, 27.3994f, 16.6543f, 24.9349f, 16.6543f, 22.4914f)
                curveTo(16.6543f, 19.722f, 14.449f, 17.922f, 10.7487f, 17.6755f)
                close()
            }
        }
        .build()
        return _skrill!!
    }

private var _skrill: ImageVector? = null
