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

public val FillGroup.EmotionNormal: ImageVector
    get() {
        if (_emotionNormal != null) {
            return _emotionNormal!!
        }
        _emotionNormal = Builder(name = "EmotionNormal", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
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
        return _emotionNormal!!
    }

private var _emotionNormal: ImageVector? = null
