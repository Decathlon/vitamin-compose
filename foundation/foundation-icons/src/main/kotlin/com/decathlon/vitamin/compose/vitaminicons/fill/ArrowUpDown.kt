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
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.3339f, 5.3333f)
                horizontalLineTo(7.9999f)
                lineTo(4.6666f, 2.0f)
                lineTo(1.3333f, 5.3333f)
                horizontalLineTo(3.9999f)
                verticalLineTo(13.3333f)
                horizontalLineTo(5.3333f)
                lineTo(5.3339f, 5.3333f)
                close()
                moveTo(11.3333f, 14.0f)
                lineTo(14.6666f, 10.6667f)
                horizontalLineTo(11.9999f)
                verticalLineTo(2.6667f)
                horizontalLineTo(10.6666f)
                verticalLineTo(10.6667f)
                horizontalLineTo(7.9999f)
                lineTo(11.3333f, 14.0f)
                close()
            }
        }
        .build()
        return _arrowUpDown!!
    }

private var _arrowUpDown: ImageVector? = null
