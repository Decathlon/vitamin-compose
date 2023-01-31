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

public val FillGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.376f, 12.416f)
                lineTo(8.777f, 19.482f)
                curveTo(8.6236f, 19.5841f, 8.4265f, 19.5935f, 8.264f, 19.5065f)
                curveTo(8.1015f, 19.4196f, 8.0001f, 19.2503f, 8.0f, 19.066f)
                verticalLineTo(4.934f)
                curveTo(8.0001f, 4.7497f, 8.1015f, 4.5805f, 8.264f, 4.4935f)
                curveTo(8.4265f, 4.4065f, 8.6236f, 4.4159f, 8.777f, 4.518f)
                lineTo(19.376f, 11.584f)
                curveTo(19.5151f, 11.6767f, 19.5986f, 11.8328f, 19.5986f, 12.0f)
                curveTo(19.5986f, 12.1672f, 19.5151f, 12.3233f, 19.376f, 12.416f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
