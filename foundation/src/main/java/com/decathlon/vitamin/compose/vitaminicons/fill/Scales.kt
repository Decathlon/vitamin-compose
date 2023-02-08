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

public val FillGroup.Scales: ImageVector
    get() {
        if (_scales != null) {
            return _scales!!
        }
        _scales = Builder(name = "Scales", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                verticalLineTo(3.278f)
                lineTo(18.0f, 4.946f)
                lineTo(21.632f, 3.736f)
                lineTo(22.265f, 5.632f)
                lineTo(19.233f, 6.643f)
                lineTo(22.329f, 15.155f)
                curveTo(21.237f, 16.292f, 19.7f, 17.0f, 18.0f, 17.0f)
                curveTo(16.299f, 17.0f, 14.763f, 16.292f, 13.671f, 15.155f)
                lineTo(16.765f, 6.643f)
                lineTo(13.0f, 5.387f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.387f)
                lineTo(7.232f, 6.643f)
                lineTo(10.328f, 15.155f)
                curveTo(9.237f, 16.292f, 7.7f, 17.0f, 6.0f, 17.0f)
                curveTo(4.299f, 17.0f, 2.763f, 16.292f, 1.671f, 15.155f)
                lineTo(4.765f, 6.643f)
                lineTo(1.735f, 5.633f)
                lineTo(2.368f, 3.735f)
                lineTo(6.0f, 4.945f)
                lineTo(11.0f, 3.278f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(18.0f, 9.103f)
                lineTo(16.582f, 13.0f)
                horizontalLineTo(19.417f)
                lineTo(18.0f, 9.103f)
                close()
                moveTo(6.0f, 9.103f)
                lineTo(4.582f, 13.0f)
                horizontalLineTo(7.417f)
                lineTo(6.0f, 9.103f)
                close()
            }
        }
        .build()
        return _scales!!
    }

private var _scales: ImageVector? = null
