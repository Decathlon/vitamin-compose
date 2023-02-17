package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.882f, 19.297f)
                curveTo(16.1232f, 20.4126f, 14.0828f, 21.0033f, 12.0f, 21.0f)
                curveTo(6.608f, 21.0f, 2.122f, 17.12f, 1.181f, 12.0f)
                curveTo(1.6111f, 9.6707f, 2.7827f, 7.5429f, 4.521f, 5.934f)
                lineTo(1.392f, 2.808f)
                lineTo(2.807f, 1.393f)
                lineTo(22.606f, 21.193f)
                lineTo(21.191f, 22.607f)
                lineTo(17.881f, 19.297f)
                horizontalLineTo(17.882f)
                close()
                moveTo(5.935f, 7.35f)
                curveTo(4.576f, 8.5856f, 3.6293f, 10.2088f, 3.223f, 12.0f)
                curveTo(3.5353f, 13.3665f, 4.1623f, 14.6411f, 5.054f, 15.7226f)
                curveTo(5.9458f, 16.804f, 7.0777f, 17.6624f, 8.3596f, 18.2293f)
                curveTo(9.6415f, 18.7962f, 11.0381f, 19.0561f, 12.4381f, 18.9881f)
                curveTo(13.8382f, 18.9202f, 15.203f, 18.5264f, 16.424f, 17.838f)
                lineTo(14.396f, 15.81f)
                curveTo(13.5327f, 16.3538f, 12.5102f, 16.5881f, 11.4963f, 16.4744f)
                curveTo(10.4823f, 16.3608f, 9.5371f, 15.9059f, 8.8156f, 15.1844f)
                curveTo(8.0941f, 14.463f, 7.6393f, 13.5177f, 7.5256f, 12.5038f)
                curveTo(7.4119f, 11.4898f, 7.6462f, 10.4673f, 8.19f, 9.604f)
                lineTo(5.935f, 7.35f)
                close()
                moveTo(12.914f, 14.328f)
                lineTo(9.672f, 11.086f)
                curveTo(9.4941f, 11.5389f, 9.4522f, 12.034f, 9.5515f, 12.5104f)
                curveTo(9.6509f, 12.9867f, 9.887f, 13.4238f, 10.2311f, 13.7679f)
                curveTo(10.5752f, 14.112f, 11.0123f, 14.3482f, 11.4887f, 14.4475f)
                curveTo(11.9651f, 14.5468f, 12.4601f, 14.5049f, 12.913f, 14.327f)
                lineTo(12.914f, 14.328f)
                close()
                moveTo(20.807f, 16.592f)
                lineTo(19.376f, 15.162f)
                curveTo(20.0445f, 14.2093f, 20.5204f, 13.1352f, 20.777f, 12.0f)
                curveTo(20.5053f, 10.8097f, 19.9943f, 9.6872f, 19.2752f, 8.7005f)
                curveTo(18.5561f, 7.7139f, 17.6438f, 6.8837f, 16.5939f, 6.2606f)
                curveTo(15.544f, 5.6375f, 14.3783f, 5.2344f, 13.1678f, 5.0758f)
                curveTo(11.9572f, 4.9172f, 10.727f, 5.0064f, 9.552f, 5.338f)
                lineTo(7.974f, 3.76f)
                curveTo(9.221f, 3.27f, 10.58f, 3.0f, 12.0f, 3.0f)
                curveTo(17.392f, 3.0f, 21.878f, 6.88f, 22.819f, 12.0f)
                curveTo(22.5126f, 13.6657f, 21.8239f, 15.2376f, 20.807f, 16.592f)
                close()
                moveTo(11.723f, 7.508f)
                curveTo(12.3595f, 7.4687f, 12.9971f, 7.5651f, 13.5936f, 7.7908f)
                curveTo(14.19f, 8.0166f, 14.7316f, 8.3665f, 15.1826f, 8.8175f)
                curveTo(15.6335f, 9.2684f, 15.9835f, 9.81f, 16.2092f, 10.4065f)
                curveTo(16.435f, 11.0029f, 16.5314f, 11.6405f, 16.492f, 12.277f)
                lineTo(11.722f, 7.508f)
                horizontalLineTo(11.723f)
                close()
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
