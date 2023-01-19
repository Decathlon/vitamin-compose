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

public val FillGroup.AddCircle: ImageVector
    get() {
        if (_addCircle != null) {
            return _addCircle!!
        }
        _addCircle = Builder(name = "AddCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9951f, 14.66f)
                curveTo(4.314f, 14.66f, 1.3301f, 11.6761f, 1.3301f, 7.995f)
                curveTo(1.3301f, 4.3139f, 4.314f, 1.33f, 7.9951f, 1.33f)
                curveTo(11.6762f, 1.33f, 14.6601f, 4.3139f, 14.6601f, 7.995f)
                curveTo(14.6601f, 11.6761f, 11.6762f, 14.66f, 7.9951f, 14.66f)
                close()
                moveTo(7.3286f, 7.3285f)
                horizontalLineTo(4.6626f)
                verticalLineTo(8.6615f)
                horizontalLineTo(7.3286f)
                verticalLineTo(11.3275f)
                horizontalLineTo(8.6616f)
                verticalLineTo(8.6615f)
                horizontalLineTo(11.3276f)
                verticalLineTo(7.3285f)
                horizontalLineTo(8.6616f)
                verticalLineTo(4.6625f)
                horizontalLineTo(7.3286f)
                verticalLineTo(7.3285f)
                close()
            }
        }
        .build()
        return _addCircle!!
    }

private var _addCircle: ImageVector? = null
