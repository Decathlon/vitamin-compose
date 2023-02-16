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

public val LineGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 3.3333f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.3333f)
                horizontalLineTo(2.6667f)
                lineTo(6.0f, 8.3333f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.3333f)
                lineTo(13.3333f, 3.3333f)
                horizontalLineTo(14.0f)
                close()
                moveTo(7.3333f, 7.9293f)
                lineTo(4.2693f, 3.3333f)
                horizontalLineTo(11.7306f)
                lineTo(8.6666f, 7.9293f)
                verticalLineTo(12.6667f)
                horizontalLineTo(7.3333f)
                verticalLineTo(7.9293f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
