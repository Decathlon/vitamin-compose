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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                lineTo(9.0f, 12.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.5f)
                lineTo(20.0f, 5.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(11.0f, 11.894f)
                lineTo(6.404f, 5.0f)
                horizontalLineTo(17.596f)
                lineTo(13.0f, 11.894f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.894f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
