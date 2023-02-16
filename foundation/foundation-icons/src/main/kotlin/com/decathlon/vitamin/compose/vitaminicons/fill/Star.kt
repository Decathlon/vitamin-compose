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

public val FillGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 12.1733f)
                lineTo(3.298f, 14.8053f)
                lineTo(4.348f, 9.52f)
                lineTo(0.3914f, 5.8613f)
                lineTo(5.7427f, 5.2267f)
                lineTo(8.0f, 0.3333f)
                lineTo(10.2574f, 5.2267f)
                lineTo(15.6087f, 5.8613f)
                lineTo(11.652f, 9.52f)
                lineTo(12.702f, 14.8053f)
                lineTo(8.0f, 12.1733f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
