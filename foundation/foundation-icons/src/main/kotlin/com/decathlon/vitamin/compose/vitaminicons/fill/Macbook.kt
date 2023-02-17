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

public val FillGroup.Macbook: ImageVector
    get() {
        if (_macbook != null) {
            return _macbook!!
        }
        _macbook = Builder(name = "Macbook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.992f, 3.0f)
                curveTo(2.455f, 3.0f, 2.0f, 3.45f, 2.0f, 4.007f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.007f)
                curveTo(22.0f, 3.45f, 21.556f, 3.0f, 21.008f, 3.0f)
                horizontalLineTo(2.992f)
                close()
                moveTo(23.0f, 19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _macbook!!
    }

private var _macbook: ImageVector? = null
