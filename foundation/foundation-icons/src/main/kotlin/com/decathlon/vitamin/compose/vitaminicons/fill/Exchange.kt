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

public val FillGroup.Exchange: ImageVector
    get() {
        if (_exchange != null) {
            return _exchange!!
        }
        _exchange = Builder(name = "Exchange", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                curveTo(2.4477f, 2.0f, 2.0f, 2.4477f, 2.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.5523f, 2.4477f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 22.0f, 22.0f, 21.5523f, 22.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(22.0f, 2.4477f, 21.5523f, 2.0f, 21.0f, 2.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(18.1066f, 9.0f)
                lineTo(14.7372f, 12.6757f)
                lineTo(13.2628f, 11.3243f)
                lineTo(14.4768f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.4768f)
                lineTo(13.2628f, 6.6757f)
                lineTo(14.7372f, 5.3243f)
                lineTo(18.1066f, 9.0f)
                close()
                moveTo(5.8934f, 15.0f)
                lineTo(9.2628f, 11.3243f)
                lineTo(10.7372f, 12.6757f)
                lineTo(9.5232f, 14.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.5232f)
                lineTo(10.7372f, 17.3243f)
                lineTo(9.2628f, 18.6757f)
                lineTo(5.8934f, 15.0f)
                close()
            }
        }
        .build()
        return _exchange!!
    }

private var _exchange: ImageVector? = null
