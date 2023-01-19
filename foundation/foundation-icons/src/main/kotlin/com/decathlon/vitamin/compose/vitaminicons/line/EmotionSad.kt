package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.EmotionSad: ImageVector
    get() {
        if (_emotionSad != null) {
            return _emotionSad!!
        }
        _emotionSad = Builder(name = "EmotionSad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 1.3334f)
                curveTo(11.682f, 1.3334f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 8.4847f, 14.6153f, 8.9567f, 14.5166f, 9.412f)
                lineTo(13.3286f, 8.2234f)
                curveTo(13.4292f, 5.8178f, 11.9056f, 3.6431f, 9.6102f, 2.9162f)
                curveTo(7.3149f, 2.1892f, 4.8172f, 3.0903f, 3.5146f, 5.1152f)
                curveTo(2.212f, 7.1401f, 2.4276f, 9.7867f, 4.0408f, 11.574f)
                curveTo(5.6539f, 13.3614f, 8.2646f, 13.8463f, 10.412f, 12.7574f)
                curveTo(10.6664f, 13.1607f, 11.0244f, 13.4883f, 11.4486f, 13.706f)
                curveTo(10.4088f, 14.3361f, 9.2158f, 14.6684f, 8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 4.318f, 4.318f, 1.3334f, 8.0f, 1.3334f)
                close()
                moveTo(12.6667f, 9.448f)
                lineTo(13.6093f, 10.3907f)
                curveTo(14.121f, 10.9021f, 14.1314f, 11.7283f, 13.6328f, 12.2525f)
                curveTo(13.1343f, 12.7767f, 12.3086f, 12.8077f, 11.7721f, 12.3224f)
                curveTo(11.2357f, 11.837f, 11.1841f, 11.0124f, 11.656f, 10.464f)
                lineTo(11.724f, 10.3907f)
                lineTo(12.6667f, 9.448f)
                close()
                moveTo(10.4667f, 11.0914f)
                curveTo(9.8567f, 10.4207f, 8.9774f, 10.0f, 8.0f, 10.0f)
                curveTo(7.0607f, 9.9988f, 6.1646f, 10.395f, 5.5334f, 11.0907f)
                lineTo(6.1634f, 11.664f)
                curveTo(6.69f, 11.4554f, 7.3214f, 11.3334f, 8.0f, 11.3334f)
                curveTo(8.6787f, 11.3334f, 9.31f, 11.4547f, 9.8367f, 11.6647f)
                lineTo(10.4667f, 11.0914f)
                close()
                moveTo(5.6666f, 6.6667f)
                curveTo(6.2189f, 6.6667f, 6.6666f, 7.1144f, 6.6666f, 7.6667f)
                curveTo(6.6666f, 8.219f, 6.2189f, 8.6667f, 5.6666f, 8.6667f)
                curveTo(5.1144f, 8.6667f, 4.6666f, 8.219f, 4.6666f, 7.6667f)
                curveTo(4.6666f, 7.1144f, 5.1144f, 6.6667f, 5.6666f, 6.6667f)
                close()
                moveTo(11.3333f, 7.6667f)
                curveTo(11.3333f, 7.1144f, 10.8856f, 6.6667f, 10.3333f, 6.6667f)
                curveTo(9.781f, 6.6667f, 9.3333f, 7.1144f, 9.3333f, 7.6667f)
                curveTo(9.3333f, 8.219f, 9.781f, 8.6667f, 10.3333f, 8.6667f)
                curveTo(10.8856f, 8.6667f, 11.3333f, 8.219f, 11.3333f, 7.6667f)
                close()
            }
        }
        .build()
        return _emotionSad!!
    }

private var _emotionSad: ImageVector? = null
