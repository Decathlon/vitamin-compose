package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.ArrowRightUp: ImageVector
    get() {
        if (_arrowRightUp != null) {
            return _arrowRightUp!!
        }
        _arrowRightUp = Builder(name = "ArrowRightUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.004f, 9.414f)
                lineTo(7.397f, 18.021f)
                lineTo(5.983f, 16.607f)
                lineTo(14.589f, 8.0f)
                horizontalLineTo(7.004f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.004f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.004f)
                verticalLineTo(9.414f)
                close()
            }
        }
        .build()
        return _arrowRightUp!!
    }

private var _arrowRightUp: ImageVector? = null
