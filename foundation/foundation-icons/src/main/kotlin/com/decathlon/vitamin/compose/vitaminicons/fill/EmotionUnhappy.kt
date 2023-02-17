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

public val FillGroup.EmotionUnhappy: ImageVector
    get() {
        if (_emotionUnhappy != null) {
            return _emotionUnhappy!!
        }
        _emotionUnhappy = Builder(name = "EmotionUnhappy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 16.2044f, 9.3161f, 15.4413f, 9.8787f, 14.8787f)
                curveTo(10.4413f, 14.3161f, 11.2044f, 14.0f, 12.0f, 14.0f)
                curveTo(12.7956f, 14.0f, 13.5587f, 14.3161f, 14.1213f, 14.8787f)
                curveTo(14.6839f, 15.4413f, 15.0f, 16.2044f, 15.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 15.6739f, 16.4732f, 14.4021f, 15.5355f, 13.4645f)
                curveTo(14.5979f, 12.5268f, 13.3261f, 12.0f, 12.0f, 12.0f)
                curveTo(10.6739f, 12.0f, 9.4022f, 12.5268f, 8.4645f, 13.4645f)
                curveTo(7.5268f, 14.4021f, 7.0f, 15.6739f, 7.0f, 17.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(8.3978f, 11.0f, 8.7794f, 10.842f, 9.0607f, 10.5607f)
                curveTo(9.342f, 10.2794f, 9.5f, 9.8978f, 9.5f, 9.5f)
                curveTo(9.5f, 9.1022f, 9.342f, 8.7206f, 9.0607f, 8.4393f)
                curveTo(8.7794f, 8.158f, 8.3978f, 8.0f, 8.0f, 8.0f)
                curveTo(7.6022f, 8.0f, 7.2206f, 8.158f, 6.9393f, 8.4393f)
                curveTo(6.658f, 8.7206f, 6.5f, 9.1022f, 6.5f, 9.5f)
                curveTo(6.5f, 9.8978f, 6.658f, 10.2794f, 6.9393f, 10.5607f)
                curveTo(7.2206f, 10.842f, 7.6022f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(16.3978f, 11.0f, 16.7794f, 10.842f, 17.0607f, 10.5607f)
                curveTo(17.342f, 10.2794f, 17.5f, 9.8978f, 17.5f, 9.5f)
                curveTo(17.5f, 9.1022f, 17.342f, 8.7206f, 17.0607f, 8.4393f)
                curveTo(16.7794f, 8.158f, 16.3978f, 8.0f, 16.0f, 8.0f)
                curveTo(15.6022f, 8.0f, 15.2206f, 8.158f, 14.9393f, 8.4393f)
                curveTo(14.658f, 8.7206f, 14.5f, 9.1022f, 14.5f, 9.5f)
                curveTo(14.5f, 9.8978f, 14.658f, 10.2794f, 14.9393f, 10.5607f)
                curveTo(15.2206f, 10.842f, 15.6022f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _emotionUnhappy!!
    }

private var _emotionUnhappy: ImageVector? = null
