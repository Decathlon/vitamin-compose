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

public val FillGroup.ErrorWarning: ImageVector
    get() {
        if (_errorWarning != null) {
            return _errorWarning!!
        }
        _errorWarning = Builder(name = "ErrorWarning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.995f, 14.66f)
                curveTo(4.3139f, 14.66f, 1.33f, 11.6761f, 1.33f, 7.995f)
                curveTo(1.33f, 4.3139f, 4.3139f, 1.33f, 7.995f, 1.33f)
                curveTo(11.676f, 1.33f, 14.66f, 4.3139f, 14.66f, 7.995f)
                curveTo(14.66f, 11.6761f, 11.676f, 14.66f, 7.995f, 14.66f)
                close()
                moveTo(7.3285f, 9.9945f)
                verticalLineTo(11.3275f)
                horizontalLineTo(8.6615f)
                verticalLineTo(9.9945f)
                horizontalLineTo(7.3285f)
                close()
                moveTo(7.3285f, 4.6625f)
                verticalLineTo(8.6615f)
                horizontalLineTo(8.6615f)
                verticalLineTo(4.6625f)
                horizontalLineTo(7.3285f)
                close()
            }
        }
        .build()
        return _errorWarning!!
    }

private var _errorWarning: ImageVector? = null
