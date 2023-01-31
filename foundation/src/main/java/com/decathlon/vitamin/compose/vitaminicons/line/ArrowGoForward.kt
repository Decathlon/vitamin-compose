package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.ArrowGoForward: ImageVector
    get() {
        if (_arrowGoForward != null) {
            return _arrowGoForward!!
        }
        _arrowGoForward = Builder(name = "ArrowGoForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.172f, 7.0f)
                horizontalLineTo(11.0f)
                curveTo(7.6863f, 7.0f, 5.0f, 9.6863f, 5.0f, 13.0f)
                curveTo(5.0f, 16.3137f, 7.6863f, 19.0f, 11.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                curveTo(6.5817f, 21.0f, 3.0f, 17.4183f, 3.0f, 13.0f)
                curveTo(3.0f, 8.5817f, 6.5817f, 5.0f, 11.0f, 5.0f)
                horizontalLineTo(18.172f)
                lineTo(15.636f, 2.464f)
                lineTo(17.05f, 1.05f)
                lineTo(22.0f, 6.0f)
                lineTo(17.05f, 10.95f)
                lineTo(15.636f, 9.536f)
                lineTo(18.172f, 7.0f)
                close()
            }
        }
        .build()
        return _arrowGoForward!!
    }

private var _arrowGoForward: ImageVector? = null
