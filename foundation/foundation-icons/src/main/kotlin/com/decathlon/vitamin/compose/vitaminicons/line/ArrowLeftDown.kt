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

public val LineGroup.ArrowLeftDown: ImageVector
    get() {
        if (_arrowLeftDown != null) {
            return _arrowLeftDown!!
        }
        _arrowLeftDown = Builder(name = "ArrowLeftDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.06f)
                lineTo(11.738f, 3.322f)
                lineTo(12.6807f, 4.2647f)
                lineTo(6.9427f, 10.0027f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.336f)
                horizontalLineTo(4.6667f)
                verticalLineTo(4.0027f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0594f)
                verticalLineTo(9.06f)
                close()
            }
        }
        .build()
        return _arrowLeftDown!!
    }

private var _arrowLeftDown: ImageVector? = null
