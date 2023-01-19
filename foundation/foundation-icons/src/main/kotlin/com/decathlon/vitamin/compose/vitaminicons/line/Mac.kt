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

public val LineGroup.Mac: ImageVector
    get() {
        if (_mac != null) {
            return _mac!!
        }
        _mac = Builder(name = "Mac", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.3333f, 13.3333f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0053f)
                curveTo(14.3633f, 12.0f, 14.6667f, 11.6993f, 14.6667f, 11.3287f)
                verticalLineTo(2.6713f)
                curveTo(14.6667f, 2.2993f, 14.3707f, 2.0f, 14.0053f, 2.0f)
                horizontalLineTo(1.9947f)
                curveTo(1.6367f, 2.0f, 1.3333f, 2.3007f, 1.3333f, 2.6713f)
                verticalLineTo(11.3287f)
                curveTo(1.3317f, 11.5055f, 1.4006f, 11.6756f, 1.5247f, 11.8016f)
                curveTo(1.6487f, 11.9276f, 1.8179f, 11.9989f, 1.9947f, 12.0f)
                horizontalLineTo(6.6667f)
                verticalLineTo(13.3333f)
                lineTo(5.3307f, 14.0027f)
                lineTo(5.3333f, 14.6667f)
                horizontalLineTo(10.6667f)
                verticalLineTo(14.0f)
                lineTo(9.3333f, 13.3333f)
                close()
                moveTo(2.6667f, 9.3333f)
                verticalLineTo(3.3333f)
                horizontalLineTo(13.3334f)
                verticalLineTo(9.3333f)
                horizontalLineTo(2.6667f)
                close()
            }
        }
        .build()
        return _mac!!
    }

private var _mac: ImageVector? = null
