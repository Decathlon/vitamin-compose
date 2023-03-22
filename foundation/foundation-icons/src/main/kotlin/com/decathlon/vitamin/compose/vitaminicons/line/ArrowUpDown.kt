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

public val LineGroup.ArrowUpDown: ImageVector
    get() {
        if (_arrowUpDown != null) {
            return _arrowUpDown!!
        }
        _arrowUpDown = Builder(name = "ArrowUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.486f, 9.364f)
                lineTo(11.9f, 7.95f)
                lineTo(6.95f, 3.0f)
                lineTo(2.0f, 7.95f)
                lineTo(3.415f, 9.364f)
                lineTo(5.95f, 6.828f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.95f)
                verticalLineTo(6.828f)
                lineTo(10.486f, 9.364f)
                close()
                moveTo(16.95f, 21.0f)
                lineTo(21.9f, 16.05f)
                lineTo(20.486f, 14.636f)
                lineTo(17.95f, 17.172f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.95f)
                lineTo(15.951f, 17.172f)
                lineTo(13.414f, 14.636f)
                lineTo(12.0f, 16.05f)
                lineTo(16.95f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowUpDown!!
    }

private var _arrowUpDown: ImageVector? = null
