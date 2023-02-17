package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(name = "PieChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 7.522f, 4.943f, 3.732f, 9.0f, 2.458f)
                verticalLineTo(4.582f)
                curveTo(7.2809f, 5.28f, 5.8578f, 6.5537f, 4.9741f, 8.1851f)
                curveTo(4.0903f, 9.8165f, 3.8009f, 11.7043f, 4.1553f, 13.5255f)
                curveTo(4.5096f, 15.3468f, 5.4858f, 16.9883f, 6.9168f, 18.1693f)
                curveTo(8.3477f, 19.3503f, 10.1446f, 19.9975f, 12.0f, 20.0f)
                curveTo(13.5938f, 20.0f, 15.1513f, 19.524f, 16.4728f, 18.6332f)
                curveTo(17.7944f, 17.7424f, 18.82f, 16.4773f, 19.418f, 15.0f)
                horizontalLineTo(21.542f)
                curveTo(20.268f, 19.057f, 16.478f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(21.95f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.05f)
                curveTo(11.329f, 2.017f, 11.663f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 12.337f, 21.983f, 12.671f, 21.95f, 13.0f)
                close()
                moveTo(13.0f, 4.062f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.7154f, 9.2376f, 18.9129f, 7.5993f, 17.6568f, 6.3432f)
                curveTo(16.4007f, 5.0871f, 14.7624f, 4.2846f, 13.0f, 4.062f)
                close()
            }
        }
        .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
