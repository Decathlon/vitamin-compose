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

public val FillGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9999f, 3.3333f)
                horizontalLineTo(11.9999f)
                curveTo(12.3681f, 3.3333f, 12.6666f, 3.6318f, 12.6666f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(12.6666f, 12.3682f, 12.3681f, 12.6666f, 11.9999f, 12.6666f)
                horizontalLineTo(3.9999f)
                curveTo(3.6317f, 12.6666f, 3.3333f, 12.3682f, 3.3333f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(3.3333f, 3.6318f, 3.6317f, 3.3333f, 3.9999f, 3.3333f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
