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

public val LineGroup.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.243f, 18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.757f)
                lineTo(14.435f, 2.322f)
                curveTo(14.8255f, 1.9316f, 15.4585f, 1.9316f, 15.849f, 2.322f)
                lineTo(18.678f, 5.151f)
                curveTo(19.0684f, 5.5415f, 19.0684f, 6.1745f, 18.678f, 6.565f)
                lineTo(7.243f, 18.0f)
                close()
                moveTo(6.414f, 16.0f)
                lineTo(16.556f, 5.858f)
                lineTo(15.142f, 4.444f)
                lineTo(5.0f, 14.586f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.414f)
                close()
                moveTo(21.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
