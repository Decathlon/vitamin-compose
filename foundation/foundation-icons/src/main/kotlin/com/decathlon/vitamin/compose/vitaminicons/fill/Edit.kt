package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(4.8287f)
                lineTo(12.452f, 4.3767f)
                curveTo(12.7123f, 4.1164f, 12.7123f, 3.6944f, 12.452f, 3.434f)
                lineTo(10.566f, 1.548f)
                curveTo(10.3057f, 1.2878f, 9.8837f, 1.2878f, 9.6233f, 1.548f)
                lineTo(2.0f, 9.1713f)
                verticalLineTo(12.0f)
                close()
                moveTo(14.0f, 13.3333f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.6667f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.3333f)
                close()
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
