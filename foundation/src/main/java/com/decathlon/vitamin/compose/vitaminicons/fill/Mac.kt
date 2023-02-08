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

public val FillGroup.Mac: ImageVector
    get() {
        if (_mac != null) {
            return _mac!!
        }
        _mac = Builder(name = "Mac", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.008f)
                curveTo(21.545f, 18.0f, 22.0f, 17.549f, 22.0f, 16.993f)
                verticalLineTo(4.007f)
                curveTo(22.0f, 3.449f, 21.556f, 3.0f, 21.008f, 3.0f)
                horizontalLineTo(2.992f)
                curveTo(2.455f, 3.0f, 2.0f, 3.451f, 2.0f, 4.007f)
                verticalLineTo(16.993f)
                curveTo(1.9976f, 17.2582f, 2.1009f, 17.5135f, 2.287f, 17.7024f)
                curveTo(2.4732f, 17.8913f, 2.7268f, 17.9984f, 2.992f, 18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                lineTo(7.996f, 21.004f)
                lineTo(8.0f, 22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                lineTo(14.0f, 20.0f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _mac!!
    }

private var _mac: ImageVector? = null
