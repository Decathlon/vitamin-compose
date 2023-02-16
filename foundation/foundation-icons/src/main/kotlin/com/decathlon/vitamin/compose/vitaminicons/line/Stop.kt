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

public val LineGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.3333f)
                horizontalLineTo(4.0f)
                curveTo(3.6319f, 3.3333f, 3.3334f, 3.6318f, 3.3334f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(3.3334f, 12.3682f, 3.6319f, 12.6666f, 4.0f, 12.6666f)
                horizontalLineTo(12.0f)
                curveTo(12.3682f, 12.6666f, 12.6667f, 12.3682f, 12.6667f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(12.6667f, 3.6318f, 12.3682f, 3.3333f, 12.0f, 3.3333f)
                close()
                moveTo(4.6667f, 11.3333f)
                verticalLineTo(4.6666f)
                horizontalLineTo(11.3334f)
                verticalLineTo(11.3333f)
                horizontalLineTo(4.6667f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
