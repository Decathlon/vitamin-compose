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

public val LineGroup.Focus: ImageVector
    get() {
        if (_focus != null) {
            return _focus!!
        }
        _focus = Builder(name = "Focus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.6667f, 0.6667f)
                lineTo(8.6673f, 2.708f)
                curveTo(11.0839f, 3.0135f, 12.9868f, 4.9167f, 13.292f, 7.3333f)
                horizontalLineTo(15.3334f)
                verticalLineTo(8.6667f)
                lineTo(13.292f, 8.6673f)
                curveTo(12.9866f, 11.0837f, 11.0837f, 12.9865f, 8.6673f, 13.292f)
                lineTo(8.6667f, 15.3333f)
                horizontalLineTo(7.3334f)
                verticalLineTo(13.292f)
                curveTo(4.9167f, 12.9868f, 3.0135f, 11.0839f, 2.708f, 8.6673f)
                lineTo(0.6667f, 8.6667f)
                verticalLineTo(7.3333f)
                horizontalLineTo(2.708f)
                curveTo(3.0133f, 4.9165f, 4.9165f, 3.0132f, 7.3334f, 2.708f)
                verticalLineTo(0.6667f)
                horizontalLineTo(8.6667f)
                close()
                moveTo(8.0f, 4.0f)
                curveTo(5.7909f, 4.0f, 4.0f, 5.7909f, 4.0f, 8.0f)
                curveTo(4.0f, 10.2091f, 5.7909f, 12.0f, 8.0f, 12.0f)
                curveTo(10.2092f, 12.0f, 12.0f, 10.2091f, 12.0f, 8.0f)
                curveTo(12.0f, 5.7909f, 10.2092f, 4.0f, 8.0f, 4.0f)
                close()
                moveTo(9.3334f, 8.0f)
                curveTo(9.3334f, 7.2636f, 8.7364f, 6.6667f, 8.0f, 6.6667f)
                curveTo(7.2636f, 6.6667f, 6.6667f, 7.2636f, 6.6667f, 8.0f)
                curveTo(6.6667f, 8.7364f, 7.2636f, 9.3333f, 8.0f, 9.3333f)
                curveTo(8.7364f, 9.3333f, 9.3334f, 8.7364f, 9.3334f, 8.0f)
                close()
            }
        }
        .build()
        return _focus!!
    }

private var _focus: ImageVector? = null
