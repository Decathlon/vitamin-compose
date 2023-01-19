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

public val FillGroup.ArrowLeftRight: ImageVector
    get() {
        if (_arrowLeftRight != null) {
            return _arrowLeftRight!!
        }
        _arrowLeftRight = Builder(name = "ArrowLeftRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.3333f, 3.9993f)
                verticalLineTo(1.3333f)
                lineTo(2.0f, 4.6666f)
                lineTo(5.3333f, 8.0f)
                verticalLineTo(5.3333f)
                horizontalLineTo(13.3333f)
                verticalLineTo(4.0f)
                lineTo(5.3333f, 3.9993f)
                close()
                moveTo(10.6667f, 8.0f)
                verticalLineTo(10.6666f)
                horizontalLineTo(2.6667f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.6667f)
                verticalLineTo(14.6666f)
                lineTo(14.0f, 11.3333f)
                lineTo(10.6667f, 8.0f)
                close()
            }
        }
        .build()
        return _arrowLeftRight!!
    }

private var _arrowLeftRight: ImageVector? = null
