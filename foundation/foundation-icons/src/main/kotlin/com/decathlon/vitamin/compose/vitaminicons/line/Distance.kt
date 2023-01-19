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

public val LineGroup.Distance: ImageVector
    get() {
        if (_distance != null) {
            return _distance!!
        }
        _distance = Builder(name = "Distance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.2427f, 5.6189f)
                lineTo(5.3f, 4.6667f)
                lineTo(2.0f, 8.0f)
                lineTo(5.3f, 11.3334f)
                lineTo(6.2427f, 10.3812f)
                lineTo(4.552f, 8.6734f)
                horizontalLineTo(6.0f)
                horizontalLineTo(10.6667f)
                verticalLineTo(8.6728f)
                lineTo(11.448f, 8.6728f)
                lineTo(9.7573f, 10.3812f)
                lineTo(10.7f, 11.3334f)
                lineTo(14.0f, 8.0f)
                lineTo(10.7f, 4.6667f)
                lineTo(9.7573f, 5.6189f)
                lineTo(11.448f, 7.3266f)
                lineTo(10.6667f, 7.3266f)
                lineTo(6.0f, 7.3266f)
                lineTo(4.552f, 7.3266f)
                lineTo(6.2427f, 5.6189f)
                close()
            }
        }
        .build()
        return _distance!!
    }

private var _distance: ImageVector? = null
