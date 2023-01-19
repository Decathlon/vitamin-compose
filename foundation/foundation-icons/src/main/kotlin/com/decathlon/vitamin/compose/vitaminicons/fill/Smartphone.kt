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

public val FillGroup.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.3333f)
                horizontalLineTo(4.0f)
                curveTo(3.6319f, 1.3333f, 3.3334f, 1.6318f, 3.3334f, 2.0f)
                verticalLineTo(14.0f)
                curveTo(3.3334f, 14.3682f, 3.6319f, 14.6667f, 4.0f, 14.6667f)
                horizontalLineTo(12.0f)
                curveTo(12.3682f, 14.6667f, 12.6667f, 14.3682f, 12.6667f, 14.0f)
                verticalLineTo(2.0f)
                curveTo(12.6667f, 1.6318f, 12.3682f, 1.3333f, 12.0f, 1.3333f)
                close()
                moveTo(7.3334f, 12.0f)
                curveTo(7.3334f, 11.6318f, 7.6318f, 11.3333f, 8.0f, 11.3333f)
                curveTo(8.3682f, 11.3333f, 8.6667f, 11.6318f, 8.6667f, 12.0f)
                curveTo(8.6667f, 12.3682f, 8.3682f, 12.6667f, 8.0f, 12.6667f)
                curveTo(7.6318f, 12.6667f, 7.3334f, 12.3682f, 7.3334f, 12.0f)
                close()
            }
        }
        .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
