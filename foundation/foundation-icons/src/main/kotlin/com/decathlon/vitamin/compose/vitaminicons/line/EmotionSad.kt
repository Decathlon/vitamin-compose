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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 12.727f, 21.923f, 13.435f, 21.775f, 14.118f)
                lineTo(19.993f, 12.335f)
                curveTo(20.1438f, 8.7266f, 17.8584f, 5.4646f, 14.4154f, 4.3742f)
                curveTo(10.9724f, 3.2838f, 7.2258f, 4.6354f, 5.2719f, 7.6728f)
                curveTo(3.318f, 10.7101f, 3.6414f, 14.6799f, 6.0612f, 17.361f)
                curveTo(8.4809f, 20.042f, 12.3969f, 20.7693f, 15.618f, 19.136f)
                curveTo(15.9997f, 19.7409f, 16.5367f, 20.2323f, 17.173f, 20.559f)
                curveTo(15.6132f, 21.5041f, 13.8238f, 22.0025f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(19.0f, 14.172f)
                lineTo(20.414f, 15.586f)
                curveTo(21.1815f, 16.3532f, 21.1971f, 17.5924f, 20.4493f, 18.3788f)
                curveTo(19.7014f, 19.1651f, 18.4629f, 19.2116f, 17.6582f, 18.4836f)
                curveTo(16.8535f, 17.7555f, 16.7762f, 16.5186f, 17.484f, 15.696f)
                lineTo(17.586f, 15.586f)
                lineTo(19.0f, 14.172f)
                close()
                moveTo(15.7f, 16.637f)
                curveTo(14.785f, 15.631f, 13.466f, 15.0f, 12.0f, 15.0f)
                curveTo(10.5909f, 14.9981f, 9.2468f, 15.5924f, 8.3f, 16.636f)
                lineTo(9.245f, 17.496f)
                curveTo(10.035f, 17.183f, 10.982f, 17.0f, 12.0f, 17.0f)
                curveTo(13.018f, 17.0f, 13.965f, 17.182f, 14.755f, 17.497f)
                lineTo(15.7f, 16.637f)
                close()
                moveTo(8.5f, 10.0f)
                curveTo(9.3284f, 10.0f, 10.0f, 10.6716f, 10.0f, 11.5f)
                curveTo(10.0f, 12.3284f, 9.3284f, 13.0f, 8.5f, 13.0f)
                curveTo(7.6716f, 13.0f, 7.0f, 12.3284f, 7.0f, 11.5f)
                curveTo(7.0f, 10.6716f, 7.6716f, 10.0f, 8.5f, 10.0f)
                close()
                moveTo(17.0f, 11.5f)
                curveTo(17.0f, 10.6716f, 16.3284f, 10.0f, 15.5f, 10.0f)
                curveTo(14.6716f, 10.0f, 14.0f, 10.6716f, 14.0f, 11.5f)
                curveTo(14.0f, 12.3284f, 14.6716f, 13.0f, 15.5f, 13.0f)
                curveTo(16.3284f, 13.0f, 17.0f, 12.3284f, 17.0f, 11.5f)
                close()
            }
        }
        .build()
        return _emotionSad!!
    }

private var _emotionSad: ImageVector? = null
