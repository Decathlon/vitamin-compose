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

public val FillGroup.Macbook: ImageVector
    get() {
        if (_macbook != null) {
            return _macbook!!
        }
        _macbook = Builder(name = "Macbook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.9946f, 2.0f)
                curveTo(1.6366f, 2.0f, 1.3333f, 2.3f, 1.3333f, 2.6713f)
                verticalLineTo(11.3333f)
                horizontalLineTo(14.6666f)
                verticalLineTo(2.6713f)
                curveTo(14.6666f, 2.3f, 14.3706f, 2.0f, 14.0053f, 2.0f)
                horizontalLineTo(1.9946f)
                close()
                moveTo(15.3333f, 12.6667f)
                horizontalLineTo(0.6666f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.3333f)
                verticalLineTo(12.6667f)
                close()
            }
        }
        .build()
        return _macbook!!
    }

private var _macbook: ImageVector? = null
