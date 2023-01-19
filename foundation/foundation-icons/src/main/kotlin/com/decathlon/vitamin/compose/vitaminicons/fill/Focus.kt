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

public val FillGroup.Focus: ImageVector
    get() {
        if (_focus != null) {
            return _focus!!
        }
        _focus = Builder(name = "Focus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.6673f, 2.708f)
                lineTo(8.6666f, 0.6667f)
                horizontalLineTo(7.3333f)
                verticalLineTo(2.708f)
                curveTo(4.9165f, 3.0132f, 3.0132f, 4.9165f, 2.708f, 7.3333f)
                horizontalLineTo(0.6666f)
                verticalLineTo(8.6667f)
                lineTo(2.708f, 8.6673f)
                curveTo(3.0135f, 11.0839f, 4.9167f, 12.9868f, 7.3333f, 13.292f)
                verticalLineTo(15.3333f)
                horizontalLineTo(8.6666f)
                lineTo(8.6673f, 13.292f)
                curveTo(11.0836f, 12.9865f, 12.9865f, 11.0837f, 13.292f, 8.6673f)
                lineTo(15.3333f, 8.6667f)
                verticalLineTo(7.3333f)
                horizontalLineTo(13.292f)
                curveTo(12.9868f, 4.9167f, 11.0839f, 3.0135f, 8.6673f, 2.708f)
                close()
                moveTo(6.6666f, 8.0f)
                curveTo(6.6666f, 7.2636f, 7.2636f, 6.6667f, 8.0f, 6.6667f)
                curveTo(8.7363f, 6.6667f, 9.3333f, 7.2636f, 9.3333f, 8.0f)
                curveTo(9.3333f, 8.7364f, 8.7363f, 9.3333f, 8.0f, 9.3333f)
                curveTo(7.2636f, 9.3333f, 6.6666f, 8.7364f, 6.6666f, 8.0f)
                close()
            }
        }
        .build()
        return _focus!!
    }

private var _focus: ImageVector? = null
