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

public val LineGroup.ArrowLeftRight: ImageVector
    get() {
        if (_arrowLeftRight != null) {
            return _arrowLeftRight!!
        }
        _arrowLeftRight = Builder(name = "ArrowLeftRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.364f, 3.464f)
                lineTo(7.95f, 2.05f)
                lineTo(3.0f, 7.0f)
                lineTo(7.95f, 11.95f)
                lineTo(9.364f, 10.536f)
                lineTo(6.828f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.828f)
                lineTo(9.364f, 3.464f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(16.05f, 12.05f)
                lineTo(14.636f, 13.464f)
                lineTo(17.172f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                lineTo(17.172f, 17.999f)
                lineTo(14.636f, 20.536f)
                lineTo(16.05f, 21.95f)
                lineTo(21.0f, 17.0f)
                close()
            }
        }
        .build()
        return _arrowLeftRight!!
    }

private var _arrowLeftRight: ImageVector? = null
