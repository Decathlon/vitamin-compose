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

public val FillGroup.EmotionLaugh: ImageVector
    get() {
        if (_emotionLaugh != null) {
            return _emotionLaugh!!
        }
        _emotionLaugh = Builder(name = "EmotionLaugh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(10.0f, 11.0f, 8.333f, 11.333f, 7.0f, 12.0f)
                curveTo(7.0f, 13.3261f, 7.5268f, 14.5979f, 8.4645f, 15.5355f)
                curveTo(9.4022f, 16.4732f, 10.6739f, 17.0f, 12.0f, 17.0f)
                curveTo(13.3261f, 17.0f, 14.5979f, 16.4732f, 15.5355f, 15.5355f)
                curveTo(16.4732f, 14.5979f, 17.0f, 13.3261f, 17.0f, 12.0f)
                curveTo(15.667f, 11.333f, 14.0f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(7.348f, 7.0f, 6.378f, 7.78f, 6.088f, 8.84f)
                lineTo(6.05f, 9.0f)
                horizontalLineTo(10.95f)
                curveTo(10.8347f, 8.4353f, 10.5279f, 7.9278f, 10.0815f, 7.5634f)
                curveTo(9.635f, 7.1989f, 9.0763f, 6.9999f, 8.5f, 7.0f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(14.348f, 7.0f, 13.378f, 7.78f, 13.088f, 8.84f)
                lineTo(13.05f, 9.0f)
                horizontalLineTo(17.95f)
                curveTo(17.8347f, 8.4353f, 17.5279f, 7.9278f, 17.0815f, 7.5634f)
                curveTo(16.635f, 7.1989f, 16.0763f, 6.9999f, 15.5f, 7.0f)
                close()
            }
        }
        .build()
        return _emotionLaugh!!
    }

private var _emotionLaugh: ImageVector? = null
