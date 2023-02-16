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

public val FillGroup.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(name = "PieChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3333f, 1.3667f)
                verticalLineTo(8.6667f)
                horizontalLineTo(14.6333f)
                curveTo(14.2993f, 12.0353f, 11.4566f, 14.6667f, 7.9999f, 14.6667f)
                curveTo(4.3179f, 14.6667f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 4.5433f, 3.9646f, 1.7007f, 7.3333f, 1.3667f)
                close()
                moveTo(8.6666f, 1.3667f)
                curveTo(10.1966f, 1.5208f, 11.6263f, 2.199f, 12.7136f, 3.2863f)
                curveTo(13.801f, 4.3736f, 14.4791f, 5.8033f, 14.6333f, 7.3333f)
                horizontalLineTo(8.6666f)
                verticalLineTo(1.3667f)
                close()
            }
        }
        .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
