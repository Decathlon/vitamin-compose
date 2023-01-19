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

public val LineGroup.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) {
            return _arrowDownCircle!!
        }
        _arrowDownCircle = Builder(name = "ArrowDownCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 1.3333f)
                curveTo(11.68f, 1.3333f, 14.6667f, 4.32f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.68f, 11.68f, 14.6666f, 8.0f, 14.6666f)
                curveTo(4.32f, 14.6666f, 1.3334f, 11.68f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.32f, 4.32f, 1.3333f, 8.0f, 1.3333f)
                close()
                moveTo(8.0f, 13.3333f)
                curveTo(10.9467f, 13.3333f, 13.3334f, 10.9466f, 13.3334f, 8.0f)
                curveTo(13.3334f, 5.0533f, 10.9467f, 2.6667f, 8.0f, 2.6667f)
                curveTo(5.0534f, 2.6667f, 2.6667f, 5.0533f, 2.6667f, 8.0f)
                curveTo(2.6667f, 10.9466f, 5.0534f, 13.3333f, 8.0f, 13.3333f)
                close()
                moveTo(10.6667f, 8.0f)
                horizontalLineTo(8.6667f)
                verticalLineTo(5.3333f)
                horizontalLineTo(7.3334f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.3334f)
                lineTo(8.0f, 10.6666f)
                lineTo(10.6667f, 8.0f)
                close()
            }
        }
        .build()
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
