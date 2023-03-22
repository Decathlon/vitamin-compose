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

public val FillGroup.ArrowUpDown: ImageVector
    get() {
        if (_arrowUpDown != null) {
            return _arrowUpDown!!
        }
        _arrowUpDown = Builder(name = "ArrowUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.001f, 8.0f)
                horizontalLineTo(12.0f)
                lineTo(7.0f, 3.0f)
                lineTo(2.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                lineTo(8.001f, 8.0f)
                close()
                moveTo(17.0f, 21.0f)
                lineTo(22.0f, 16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                lineTo(17.0f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowUpDown!!
    }

private var _arrowUpDown: ImageVector? = null
