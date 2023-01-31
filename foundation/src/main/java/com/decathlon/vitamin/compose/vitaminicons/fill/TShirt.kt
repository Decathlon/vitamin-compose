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

public val FillGroup.TShirt: ImageVector
    get() {
        if (_tShirt != null) {
            return _tShirt!!
        }
        _tShirt = Builder(name = "TShirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(22.0f, 11.5523f, 21.5523f, 12.0f, 21.0f, 12.0f)
                horizontalLineTo(18.999f)
                lineTo(19.0f, 20.0f)
                curveTo(19.0f, 20.5523f, 18.5523f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 21.0f, 5.0f, 20.5523f, 5.0f, 20.0f)
                lineTo(4.999f, 11.999f)
                lineTo(3.0f, 12.0f)
                curveTo(2.4477f, 12.0f, 2.0f, 11.5523f, 2.0f, 11.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 4.6568f, 10.3431f, 6.0f, 12.0f, 6.0f)
                curveTo(13.6569f, 6.0f, 15.0f, 4.6568f, 15.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
