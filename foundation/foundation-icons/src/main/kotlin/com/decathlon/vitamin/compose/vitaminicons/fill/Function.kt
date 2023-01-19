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

public val FillGroup.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.3333f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.3333f)
                horizontalLineTo(7.3333f)
                verticalLineTo(2.0f)
                close()
                moveTo(7.3333f, 8.6667f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.3333f)
                verticalLineTo(8.6667f)
                close()
                moveTo(8.6667f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.3333f)
                horizontalLineTo(8.6667f)
                verticalLineTo(2.0f)
                close()
                moveTo(14.0f, 8.6667f)
                horizontalLineTo(8.6667f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.6667f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
