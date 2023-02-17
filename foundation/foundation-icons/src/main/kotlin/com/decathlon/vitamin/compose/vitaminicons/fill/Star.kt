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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 18.26f)
                lineTo(4.9469f, 22.208f)
                lineTo(6.5219f, 14.28f)
                lineTo(0.5869f, 8.792f)
                lineTo(8.6139f, 7.84f)
                lineTo(11.9999f, 0.5f)
                lineTo(15.3859f, 7.84f)
                lineTo(23.4129f, 8.792f)
                lineTo(17.4779f, 14.28f)
                lineTo(19.0529f, 22.208f)
                lineTo(11.9999f, 18.26f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
