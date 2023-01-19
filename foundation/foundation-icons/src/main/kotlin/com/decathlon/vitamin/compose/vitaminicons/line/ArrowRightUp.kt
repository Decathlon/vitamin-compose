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
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6693f, 6.276f)
                lineTo(4.9313f, 12.014f)
                lineTo(3.9887f, 11.0713f)
                lineTo(9.726f, 5.3333f)
                horizontalLineTo(4.6693f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0026f)
                verticalLineTo(11.3333f)
                horizontalLineTo(10.6693f)
                verticalLineTo(6.276f)
                close()
            }
        }
        .build()
        return _arrowRightUp!!
    }

private var _arrowRightUp: ImageVector? = null
