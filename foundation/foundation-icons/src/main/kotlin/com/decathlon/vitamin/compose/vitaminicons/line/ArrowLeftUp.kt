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

public val LineGroup.ArrowLeftUp: ImageVector
    get() {
        if (_arrowLeftUp != null) {
            return _arrowLeftUp!!
        }
        _arrowLeftUp = Builder(name = "ArrowLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.276f, 5.3333f)
                lineTo(12.014f, 11.0713f)
                lineTo(11.0713f, 12.014f)
                lineTo(5.3333f, 6.276f)
                verticalLineTo(11.3333f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.3333f)
                verticalLineTo(5.3333f)
                horizontalLineTo(6.276f)
                close()
            }
        }
        .build()
        return _arrowLeftUp!!
    }

private var _arrowLeftUp: ImageVector? = null
