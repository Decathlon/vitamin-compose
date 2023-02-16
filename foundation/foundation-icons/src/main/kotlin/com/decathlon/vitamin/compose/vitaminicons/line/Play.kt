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

public val LineGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.8514f, 12.988f)
                lineTo(12.9174f, 8.2773f)
                curveTo(13.0101f, 8.2155f, 13.0658f, 8.1115f, 13.0658f, 8.0f)
                curveTo(13.0658f, 7.8886f, 13.0101f, 7.7845f, 12.9174f, 7.7227f)
                lineTo(5.8514f, 3.012f)
                curveTo(5.7491f, 2.9439f, 5.6177f, 2.9377f, 5.5094f, 2.9956f)
                curveTo(5.4011f, 3.0536f, 5.3334f, 3.1665f, 5.3334f, 3.2893f)
                verticalLineTo(12.7107f)
                curveTo(5.3334f, 12.8335f, 5.4011f, 12.9464f, 5.5094f, 13.0044f)
                curveTo(5.6177f, 13.0624f, 5.7491f, 13.0561f, 5.8514f, 12.988f)
                close()
                moveTo(6.6667f, 5.158f)
                lineTo(10.9294f, 8.0f)
                lineTo(6.6667f, 10.842f)
                verticalLineTo(5.158f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
