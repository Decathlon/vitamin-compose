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

public val FillGroup.EmotionSad: ImageVector
    get() {
        if (_emotionSad != null) {
            return _emotionSad!!
        }
        _emotionSad = Builder(name = "EmotionSad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0024f, 13.5614f, 21.6376f, 15.1016f, 20.935f, 16.496f)
                curveTo(20.8616f, 16.2113f, 20.7256f, 15.9465f, 20.537f, 15.721f)
                lineTo(20.414f, 15.586f)
                lineTo(19.0f, 14.172f)
                lineTo(17.586f, 15.586f)
                lineTo(17.469f, 15.713f)
                curveTo(17.2156f, 16.0142f, 17.0568f, 16.3834f, 17.0123f, 16.7745f)
                curveTo(16.9678f, 17.1655f, 17.0397f, 17.561f, 17.2189f, 17.9114f)
                curveTo(17.3982f, 18.2618f, 17.6768f, 18.5515f, 18.02f, 18.7443f)
                curveTo(18.3631f, 18.937f, 18.7555f, 19.0242f, 19.148f, 18.995f)
                curveTo(18.2175f, 19.9477f, 17.1056f, 20.7044f, 15.878f, 21.2206f)
                curveTo(14.6503f, 21.7367f, 13.3317f, 22.0017f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(10.62f, 15.0f, 9.37f, 15.56f, 8.466f, 16.463f)
                lineTo(8.3f, 16.637f)
                lineTo(9.245f, 17.497f)
                curveTo(10.035f, 17.182f, 10.982f, 17.0f, 12.0f, 17.0f)
                curveTo(12.905f, 17.0f, 13.754f, 17.144f, 14.486f, 17.396f)
                lineTo(14.755f, 17.496f)
                lineTo(15.7f, 16.636f)
                curveTo(15.2318f, 16.1199f, 14.6606f, 15.7077f, 14.0233f, 15.426f)
                curveTo(13.3861f, 15.1442f, 12.6968f, 14.9991f, 12.0f, 15.0f)
                close()
                moveTo(8.5f, 10.0f)
                curveTo(8.1022f, 10.0f, 7.7206f, 10.158f, 7.4393f, 10.4393f)
                curveTo(7.158f, 10.7206f, 7.0f, 11.1022f, 7.0f, 11.5f)
                curveTo(7.0f, 11.8978f, 7.158f, 12.2794f, 7.4393f, 12.5607f)
                curveTo(7.7206f, 12.842f, 8.1022f, 13.0f, 8.5f, 13.0f)
                curveTo(8.8978f, 13.0f, 9.2794f, 12.842f, 9.5607f, 12.5607f)
                curveTo(9.842f, 12.2794f, 10.0f, 11.8978f, 10.0f, 11.5f)
                curveTo(10.0f, 11.1022f, 9.842f, 10.7206f, 9.5607f, 10.4393f)
                curveTo(9.2794f, 10.158f, 8.8978f, 10.0f, 8.5f, 10.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveTo(15.1022f, 10.0f, 14.7206f, 10.158f, 14.4393f, 10.4393f)
                curveTo(14.158f, 10.7206f, 14.0f, 11.1022f, 14.0f, 11.5f)
                curveTo(14.0f, 11.8978f, 14.158f, 12.2794f, 14.4393f, 12.5607f)
                curveTo(14.7206f, 12.842f, 15.1022f, 13.0f, 15.5f, 13.0f)
                curveTo(15.8978f, 13.0f, 16.2794f, 12.842f, 16.5607f, 12.5607f)
                curveTo(16.842f, 12.2794f, 17.0f, 11.8978f, 17.0f, 11.5f)
                curveTo(17.0f, 11.1022f, 16.842f, 10.7206f, 16.5607f, 10.4393f)
                curveTo(16.2794f, 10.158f, 15.8978f, 10.0f, 15.5f, 10.0f)
                close()
            }
        }
        .build()
        return _emotionSad!!
    }

private var _emotionSad: ImageVector? = null
