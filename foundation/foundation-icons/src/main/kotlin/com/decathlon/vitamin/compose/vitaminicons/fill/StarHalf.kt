package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.9469f, 22.208f)
                lineTo(11.9999f, 18.26f)
                lineTo(19.0529f, 22.208f)
                lineTo(17.4779f, 14.28f)
                lineTo(23.4129f, 8.792f)
                lineTo(15.3859f, 7.84f)
                lineTo(11.9999f, 0.5f)
                lineTo(8.6139f, 7.84f)
                lineTo(0.5869f, 8.792f)
                lineTo(6.5219f, 14.28f)
                lineTo(4.9469f, 22.208f)
                close()
                moveTo(16.2469f, 18.345f)
                lineTo(11.9999f, 15.968f)
                verticalLineTo(5.275f)
                lineTo(14.0379f, 9.694f)
                lineTo(18.8709f, 10.267f)
                lineTo(15.2979f, 13.572f)
                lineTo(16.2469f, 18.345f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
