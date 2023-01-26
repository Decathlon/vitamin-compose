package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.SunCloudy: ImageVector
    get() {
        if (_sunCloudy != null) {
            return _sunCloudy!!
        }
        _sunCloudy = Builder(name = "SunCloudy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.984f, 5.06f)
                curveTo(10.3897f, 4.2874f, 10.9468f, 3.6044f, 11.622f, 3.0518f)
                curveTo(12.2973f, 2.4991f, 13.0769f, 2.088f, 13.9145f, 1.8431f)
                curveTo(14.752f, 1.5982f, 15.6303f, 1.5244f, 16.4969f, 1.6261f)
                curveTo(17.3636f, 1.7279f, 18.2009f, 2.0031f, 18.9589f, 2.4354f)
                curveTo(19.7169f, 2.8677f, 20.3801f, 3.4481f, 20.909f, 4.1422f)
                curveTo(21.4379f, 4.8362f, 21.8216f, 5.6297f, 22.0373f, 6.4752f)
                curveTo(22.253f, 7.3208f, 22.2962f, 8.2011f, 22.1644f, 9.0637f)
                curveTo(22.0325f, 9.9263f, 21.7284f, 10.7535f, 21.27f, 11.496f)
                curveTo(22.0722f, 12.2514f, 22.6289f, 13.2302f, 22.8681f, 14.3058f)
                curveTo(23.1074f, 15.3813f, 23.0181f, 16.5038f, 22.6118f, 17.528f)
                curveTo(22.2056f, 18.5522f, 21.5011f, 19.4307f, 20.5896f, 20.0498f)
                curveTo(19.6782f, 20.6688f, 18.6018f, 20.9999f, 17.5f, 21.0f)
                lineTo(9.0f, 20.999f)
                curveTo(7.9085f, 20.9982f, 6.8286f, 20.774f, 5.8269f, 20.3402f)
                curveTo(4.8252f, 19.9064f, 3.9229f, 19.2722f, 3.1755f, 18.4766f)
                curveTo(2.4281f, 17.681f, 1.8514f, 16.7409f, 1.4809f, 15.7141f)
                curveTo(1.1105f, 14.6874f, 0.954f, 13.5956f, 1.0213f, 12.5061f)
                curveTo(1.0886f, 11.4166f, 1.3781f, 10.3524f, 1.872f, 9.379f)
                curveTo(2.366f, 8.4055f, 3.0539f, 7.5435f, 3.8935f, 6.8459f)
                curveTo(4.7331f, 6.1483f, 5.7065f, 5.6299f, 6.754f, 5.3226f)
                curveTo(7.8014f, 5.0153f, 8.9007f, 4.9256f, 9.984f, 5.059f)
                verticalLineTo(5.06f)
                close()
                moveTo(12.055f, 5.604f)
                curveTo(13.0539f, 6.018f, 13.9588f, 6.6296f, 14.7154f, 7.4021f)
                curveTo(15.472f, 8.1745f, 16.0648f, 9.0918f, 16.458f, 10.099f)
                curveTo(17.5059f, 9.8982f, 18.5894f, 10.0048f, 19.578f, 10.406f)
                curveTo(20.0416f, 9.4168f, 20.1295f, 8.2927f, 19.8252f, 7.2434f)
                curveTo(19.521f, 6.1942f, 18.8455f, 5.2914f, 17.9247f, 4.7036f)
                curveTo(17.0038f, 4.1157f, 15.9006f, 3.8829f, 14.8208f, 4.0486f)
                curveTo(13.741f, 4.2143f, 12.7583f, 4.7671f, 12.056f, 5.604f)
                horizontalLineTo(12.055f)
                close()
            }
        }
        .build()
        return _sunCloudy!!
    }

private var _sunCloudy: ImageVector? = null
