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

public val FillGroup.Distance: ImageVector
    get() {
        if (_distance != null) {
            return _distance!!
        }
        _distance = Builder(name = "Distance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3333f, 7.3327f)
                verticalLineTo(4.6667f)
                lineTo(2.0f, 8.0f)
                lineTo(5.3333f, 11.3334f)
                verticalLineTo(8.6667f)
                horizontalLineTo(10.6667f)
                verticalLineTo(11.3334f)
                lineTo(14.0f, 8.0f)
                lineTo(10.6667f, 4.6667f)
                verticalLineTo(7.3332f)
                lineTo(5.3333f, 7.3327f)
                close()
            }
        }
        .build()
        return _distance!!
    }

private var _distance: ImageVector? = null
