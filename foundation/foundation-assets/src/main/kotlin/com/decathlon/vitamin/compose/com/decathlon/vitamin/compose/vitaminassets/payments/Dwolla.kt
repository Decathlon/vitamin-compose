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

public val PaymentsGroup.Dwolla: ImageVector
    get() {
        if (_dwolla != null) {
            return _dwolla!!
        }
        _dwolla = Builder(name = "Dwolla", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFF2D2D48)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.7151f, 26.9033f)
                curveTo(24.3869f, 27.3056f, 24.1412f, 27.7682f, 23.9773f, 28.2912f)
                curveTo(23.8131f, 28.8145f, 23.7314f, 29.3648f, 23.7314f, 29.9424f)
                curveTo(23.7314f, 30.5203f, 23.8133f, 31.0709f, 23.9773f, 31.5938f)
                curveTo(24.1412f, 32.1168f, 24.3871f, 32.5773f, 24.7151f, 32.9756f)
                curveTo(25.043f, 33.3739f, 25.4548f, 33.6922f, 25.9509f, 33.9301f)
                curveTo(26.4462f, 34.1683f, 27.0222f, 34.2872f, 27.6781f, 34.2872f)
                curveTo(28.334f, 34.2872f, 28.9079f, 34.1683f, 29.3997f, 33.9301f)
                curveTo(29.8916f, 33.6922f, 30.3014f, 33.3739f, 30.6293f, 32.9756f)
                curveTo(30.9573f, 32.5775f, 31.2032f, 32.1168f, 31.3673f, 31.5938f)
                curveTo(31.5311f, 31.0711f, 31.6132f, 30.5203f, 31.6132f, 29.9424f)
                curveTo(31.6132f, 29.3648f, 31.5311f, 28.8145f, 31.3673f, 28.2912f)
                curveTo(31.2032f, 27.7682f, 30.9575f, 27.3056f, 30.6293f, 26.9033f)
                curveTo(30.3016f, 26.5013f, 29.8918f, 26.1813f, 29.3997f, 25.9428f)
                curveTo(28.9079f, 25.7049f, 28.334f, 25.5857f, 27.6781f, 25.5857f)
                curveTo(27.0222f, 25.5857f, 26.4464f, 25.7049f, 25.9509f, 25.9428f)
                curveTo(25.4548f, 26.1813f, 25.043f, 26.5013f, 24.7151f, 26.9033f)
                close()
                moveTo(24.7093f, 31.2834f)
                curveTo(24.8302f, 31.7247f, 25.0176f, 32.1189f, 25.2715f, 32.4663f)
                curveTo(25.525f, 32.8139f, 25.851f, 33.093f, 26.2493f, 33.304f)
                curveTo(26.6476f, 33.5145f, 27.1237f, 33.6201f, 27.6781f, 33.6201f)
                curveTo(28.2326f, 33.6201f, 28.7069f, 33.5145f, 29.1011f, 33.304f)
                curveTo(29.4952f, 33.0932f, 29.8194f, 32.8141f, 30.0729f, 32.4663f)
                curveTo(30.327f, 32.1189f, 30.5142f, 31.7247f, 30.6355f, 31.2834f)
                curveTo(30.7558f, 30.8465f, 30.8168f, 30.3955f, 30.8167f, 29.9424f)
                curveTo(30.8167f, 29.4817f, 30.7565f, 29.033f, 30.6355f, 28.5958f)
                curveTo(30.5144f, 28.1586f, 30.327f, 27.7663f, 30.0729f, 27.4187f)
                curveTo(29.8194f, 27.0715f, 29.4952f, 26.7921f, 29.1011f, 26.5814f)
                curveTo(28.7069f, 26.3705f, 28.2326f, 26.2653f, 27.6781f, 26.2653f)
                curveTo(27.1237f, 26.2653f, 26.6476f, 26.3705f, 26.2493f, 26.5814f)
                curveTo(25.851f, 26.7921f, 25.525f, 27.0715f, 25.2715f, 27.4187f)
                curveTo(25.0176f, 27.7663f, 24.8302f, 28.1586f, 24.7093f, 28.5958f)
                curveTo(24.5879f, 29.0343f, 24.5268f, 29.4874f, 24.5277f, 29.9424f)
                curveTo(24.5277f, 30.3953f, 24.5879f, 30.8425f, 24.7093f, 31.2834f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2D2D48)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.768f, 26.833f)
                curveTo(11.1238f, 26.1498f, 10.1654f, 25.7927f, 8.8927f, 25.7616f)
                horizontalLineTo(6.0f)
                verticalLineTo(34.1235f)
                horizontalLineTo(8.8927f)
                curveTo(10.1654f, 34.0922f, 11.1238f, 33.7351f, 11.768f, 33.0518f)
                curveTo(12.4123f, 32.3689f, 12.7342f, 31.3324f, 12.7342f, 29.9424f)
                curveTo(12.7342f, 28.5528f, 12.4123f, 27.5165f, 11.768f, 26.833f)
                close()
                moveTo(10.0464f, 33.2509f)
                curveTo(9.6129f, 33.3798f, 9.0956f, 33.4441f, 8.4947f, 33.4441f)
                horizontalLineTo(6.7963f)
                verticalLineTo(26.4407f)
                horizontalLineTo(8.4947f)
                curveTo(9.0956f, 26.4407f, 9.6129f, 26.5052f, 10.0464f, 26.6339f)
                curveTo(10.4796f, 26.7628f, 10.8371f, 26.9675f, 11.118f, 27.2486f)
                curveTo(11.3989f, 27.5299f, 11.6057f, 27.8928f, 11.7387f, 28.338f)
                curveTo(11.8713f, 28.783f, 11.9376f, 29.318f, 11.9376f, 29.9424f)
                curveTo(11.9376f, 30.5672f, 11.8713f, 31.102f, 11.7387f, 31.547f)
                curveTo(11.6057f, 31.992f, 11.3991f, 32.3551f, 11.118f, 32.6362f)
                curveTo(10.8371f, 32.9173f, 10.4796f, 33.1222f, 10.0464f, 33.2509f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2D2D48)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7997f, 25.7616f)
                lineTo(15.6971f, 33.0814f)
                horizontalLineTo(15.7206f)
                lineTo(17.7583f, 25.7616f)
                horizontalLineTo(18.7536f)
                lineTo(20.8032f, 33.0814f)
                horizontalLineTo(20.8267f)
                lineTo(22.7357f, 25.7616f)
                horizontalLineTo(23.532f)
                lineTo(21.2248f, 34.1235f)
                horizontalLineTo(20.3815f)
                lineTo(18.2618f, 26.6399f)
                horizontalLineTo(18.2383f)
                lineTo(16.1302f, 34.1235f)
                horizontalLineTo(15.2635f)
                lineTo(12.9447f, 25.7616f)
                horizontalLineTo(13.7997f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2D2D48)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(33.4164f, 33.4441f)
                verticalLineTo(25.7616f)
                horizontalLineTo(32.6202f)
                verticalLineTo(34.1235f)
                horizontalLineTo(38.1011f)
                verticalLineTo(33.4441f)
                horizontalLineTo(33.4164f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2D2D48)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(39.7055f, 25.7616f)
                verticalLineTo(33.4441f)
                horizontalLineTo(44.3236f)
                lineTo(47.4117f, 25.7616f)
                horizontalLineTo(48.302f)
                lineTo(51.581f, 34.1235f)
                horizontalLineTo(50.726f)
                lineTo(49.707f, 31.5236f)
                horizontalLineTo(45.9008f)
                lineTo(44.8936f, 34.1235f)
                horizontalLineTo(38.9092f)
                verticalLineTo(25.7616f)
                horizontalLineTo(39.7055f)
                close()
                moveTo(49.4377f, 30.8442f)
                lineTo(47.8217f, 26.5579f)
                lineTo(46.1469f, 30.8442f)
                horizontalLineTo(49.4377f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF3904A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.3509f, 5.1304f)
                lineTo(35.6899f, 8.7901f)
                curveTo(35.9911f, 8.964f, 36.1765f, 9.2853f, 36.1763f, 9.633f)
                verticalLineTo(16.9526f)
                curveTo(36.1764f, 17.3003f, 35.9909f, 17.6216f, 35.6897f, 17.7955f)
                lineTo(29.3507f, 21.4553f)
                curveTo(29.0496f, 21.6291f, 28.6787f, 21.6291f, 28.3776f, 21.4553f)
                lineTo(22.0386f, 17.7955f)
                curveTo(21.7375f, 17.6217f, 21.552f, 17.3004f, 21.552f, 16.9526f)
                verticalLineTo(9.633f)
                curveTo(21.552f, 9.2853f, 21.7374f, 8.964f, 22.0386f, 8.7901f)
                lineTo(28.3778f, 5.1304f)
                curveTo(28.6789f, 4.9566f, 29.0498f, 4.9566f, 29.3509f, 5.1304f)
                close()
                moveTo(24.7087f, 15.6921f)
                verticalLineTo(11.4629f)
                curveTo(24.7087f, 11.1152f, 24.8943f, 10.7939f, 25.1954f, 10.62f)
                lineTo(28.8644f, 8.5018f)
                verticalLineTo(5.9733f)
                lineTo(22.5254f, 9.633f)
                verticalLineTo(16.9526f)
                lineTo(24.7087f, 15.6921f)
                close()
                moveTo(28.3776f, 12.4499f)
                curveTo(28.0764f, 12.6238f, 27.8909f, 12.9451f, 27.891f, 13.2928f)
                verticalLineTo(17.5072f)
                lineTo(25.682f, 18.7825f)
                verticalLineTo(11.4629f)
                lineTo(32.021f, 7.8032f)
                verticalLineTo(10.3465f)
                lineTo(28.3776f, 12.4499f)
                close()
                moveTo(28.8644f, 20.6124f)
                lineTo(35.2032f, 16.9526f)
                lineTo(35.2034f, 9.633f)
                lineTo(28.8644f, 13.2928f)
                verticalLineTo(20.6124f)
                close()
            }
        }
        .build()
        return _dwolla!!
    }

private var _dwolla: ImageVector? = null
