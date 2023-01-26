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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.999f)
                verticalLineTo(7.0f)
                lineTo(3.0f, 12.0f)
                lineTo(8.0f, 17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                lineTo(21.0f, 12.0f)
                lineTo(16.0f, 7.0f)
                verticalLineTo(10.9998f)
                lineTo(8.0f, 10.999f)
                close()
            }
        }
        .build()
        return _distance!!
    }

private var _distance: ImageVector? = null
