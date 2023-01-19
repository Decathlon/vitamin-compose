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
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.2427f, 2.3093f)
                lineTo(5.3f, 1.3666f)
                lineTo(2.0f, 4.6666f)
                lineTo(5.3f, 7.9666f)
                lineTo(6.2427f, 7.024f)
                lineTo(4.552f, 5.3333f)
                horizontalLineTo(13.3333f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.552f)
                lineTo(6.2427f, 2.3093f)
                close()
                moveTo(14.0f, 11.3333f)
                lineTo(10.7f, 8.0333f)
                lineTo(9.7573f, 8.976f)
                lineTo(11.448f, 10.6666f)
                horizontalLineTo(2.6667f)
                verticalLineTo(12.0f)
                lineTo(11.448f, 11.9993f)
                lineTo(9.7573f, 13.6906f)
                lineTo(10.7f, 14.6333f)
                lineTo(14.0f, 11.3333f)
                close()
            }
        }
        .build()
        return _arrowLeftRight!!
    }

private var _arrowLeftRight: ImageVector? = null
