package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.ArrowGoForward: ImageVector
    get() {
        if (_arrowGoForward != null) {
            return _arrowGoForward!!
        }
        _arrowGoForward = Builder(name = "ArrowGoForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6667f, 4.6667f)
                horizontalLineTo(7.3333f)
                curveTo(5.1242f, 4.6667f, 3.3333f, 6.4576f, 3.3333f, 8.6667f)
                curveTo(3.3333f, 10.8758f, 5.1242f, 12.6667f, 7.3333f, 12.6667f)
                horizontalLineTo(13.3333f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.3333f)
                curveTo(4.3878f, 14.0f, 2.0f, 11.6122f, 2.0f, 8.6667f)
                curveTo(2.0f, 5.7212f, 4.3878f, 3.3333f, 7.3333f, 3.3333f)
                horizontalLineTo(10.6667f)
                verticalLineTo(0.6667f)
                lineTo(14.6667f, 4.0f)
                lineTo(10.6667f, 7.3334f)
                verticalLineTo(4.6667f)
                close()
            }
        }
        .build()
        return _arrowGoForward!!
    }

private var _arrowGoForward: ImageVector? = null
