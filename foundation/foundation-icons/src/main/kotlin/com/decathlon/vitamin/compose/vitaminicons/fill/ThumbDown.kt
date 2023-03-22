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

public val FillGroup.ThumbDown: ImageVector
    get() {
        if (_thumbDown != null) {
            return _thumbDown!!
        }
        _thumbDown = Builder(name = "ThumbDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.307f, 22.693f)
                lineTo(16.707f, 16.293f)
                curveTo(16.8946f, 16.1055f, 16.9999f, 15.8512f, 17.0f, 15.586f)
                verticalLineTo(4.0f)
                curveTo(17.0f, 3.4477f, 16.5523f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(5.17f)
                curveTo(4.7648f, 3.0004f, 4.4f, 3.2452f, 4.246f, 3.62f)
                lineTo(1.15f, 11.134f)
                curveTo(1.0507f, 11.3758f, 0.9997f, 11.6346f, 1.0f, 11.896f)
                verticalLineTo(14.0f)
                curveTo(1.0f, 15.1046f, 1.8954f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(9.4f)
                lineTo(8.247f, 20.53f)
                curveTo(8.0974f, 21.117f, 8.3156f, 21.7363f, 8.8f, 22.1f)
                lineTo(9.653f, 22.74f)
                curveTo(9.8523f, 22.8894f, 10.1311f, 22.8694f, 10.307f, 22.693f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 15.0f, 23.0f, 14.5523f, 23.0f, 14.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 3.4477f, 22.5523f, 3.0f, 22.0f, 3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _thumbDown!!
    }

private var _thumbDown: ImageVector? = null
