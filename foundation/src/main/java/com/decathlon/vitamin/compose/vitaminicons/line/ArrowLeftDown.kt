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
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.59f)
                lineTo(17.607f, 4.983f)
                lineTo(19.021f, 6.397f)
                lineTo(10.414f, 15.004f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.004f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.004f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.589f)
                verticalLineTo(13.59f)
                close()
            }
        }
        .build()
        return _arrowLeftDown!!
    }

private var _arrowLeftDown: ImageVector? = null
