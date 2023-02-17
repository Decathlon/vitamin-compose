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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.364f, 8.4283f)
                lineTo(7.95f, 7.0f)
                lineTo(3.0f, 12.0f)
                lineTo(7.95f, 17.0f)
                lineTo(9.364f, 15.5717f)
                lineTo(6.828f, 13.0101f)
                horizontalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0092f)
                lineTo(17.172f, 13.0091f)
                lineTo(14.636f, 15.5717f)
                lineTo(16.05f, 17.0f)
                lineTo(21.0f, 12.0f)
                lineTo(16.05f, 7.0f)
                lineTo(14.636f, 8.4283f)
                lineTo(17.172f, 10.9899f)
                lineTo(16.0f, 10.9899f)
                lineTo(9.0f, 10.9899f)
                lineTo(6.828f, 10.9899f)
                lineTo(9.364f, 8.4283f)
                close()
            }
        }
        .build()
        return _distance!!
    }

private var _distance: ImageVector? = null
