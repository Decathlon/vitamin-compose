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
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9173f, 8.2773f)
                lineTo(5.8513f, 12.988f)
                curveTo(5.749f, 13.0561f, 5.6176f, 13.0624f, 5.5093f, 13.0044f)
                curveTo(5.4009f, 12.9464f, 5.3333f, 12.8335f, 5.3333f, 12.7107f)
                verticalLineTo(3.2893f)
                curveTo(5.3333f, 3.1665f, 5.4009f, 3.0536f, 5.5093f, 2.9956f)
                curveTo(5.6176f, 2.9377f, 5.749f, 2.9439f, 5.8513f, 3.012f)
                lineTo(12.9173f, 7.7227f)
                curveTo(13.01f, 7.7845f, 13.0657f, 7.8886f, 13.0657f, 8.0f)
                curveTo(13.0657f, 8.1115f, 13.01f, 8.2155f, 12.9173f, 8.2773f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
