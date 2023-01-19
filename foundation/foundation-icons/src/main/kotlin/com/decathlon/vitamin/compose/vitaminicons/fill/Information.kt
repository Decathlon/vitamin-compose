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

public val FillGroup.Information: ImageVector
    get() {
        if (_information != null) {
            return _information!!
        }
        _information = Builder(name = "Information", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9967f, 14.6634f)
                curveTo(4.3148f, 14.6634f, 1.3301f, 11.6787f, 1.3301f, 7.9967f)
                curveTo(1.3301f, 4.3147f, 4.3148f, 1.33f, 7.9967f, 1.33f)
                curveTo(11.6787f, 1.33f, 14.6634f, 4.3147f, 14.6634f, 7.9967f)
                curveTo(14.6634f, 11.6787f, 11.6787f, 14.6634f, 7.9967f, 14.6634f)
                close()
                moveTo(7.3301f, 7.33f)
                verticalLineTo(11.33f)
                horizontalLineTo(8.6634f)
                verticalLineTo(7.33f)
                horizontalLineTo(7.3301f)
                close()
                moveTo(7.3301f, 4.6634f)
                verticalLineTo(5.9967f)
                horizontalLineTo(8.6634f)
                verticalLineTo(4.6634f)
                horizontalLineTo(7.3301f)
                close()
            }
        }
        .build()
        return _information!!
    }

private var _information: ImageVector? = null
