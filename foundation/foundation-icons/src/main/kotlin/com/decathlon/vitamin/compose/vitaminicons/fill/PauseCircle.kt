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

public val FillGroup.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) {
            return _pauseCircle!!
        }
        _pauseCircle = Builder(name = "PauseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                close()
                moveTo(6.0f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.3334f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(8.6667f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.6667f)
                close()
            }
        }
        .build()
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
