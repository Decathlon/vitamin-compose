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

public val LineGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.6667f, 13.7656f)
                curveTo(2.6667f, 14.1338f, 2.9652f, 14.4322f, 3.3333f, 14.4322f)
                horizontalLineTo(12.6667f)
                curveTo(13.0349f, 14.4322f, 13.3334f, 14.1338f, 13.3334f, 13.7656f)
                verticalLineTo(7.7656f)
                horizontalLineTo(15.3334f)
                lineTo(8.4487f, 1.5069f)
                curveTo(8.1943f, 1.2755f, 7.8057f, 1.2755f, 7.5514f, 1.5069f)
                lineTo(0.6667f, 7.7656f)
                horizontalLineTo(2.6667f)
                verticalLineTo(13.7656f)
                close()
                moveTo(12.0f, 6.5369f)
                verticalLineTo(13.0989f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.5369f)
                lineTo(8.0f, 2.9009f)
                lineTo(12.0f, 6.5369f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
