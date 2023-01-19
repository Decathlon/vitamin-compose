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

public val FillGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3333f, 13.7656f)
                curveTo(13.3333f, 14.1338f, 13.0348f, 14.4322f, 12.6666f, 14.4322f)
                horizontalLineTo(3.3333f)
                curveTo(2.9651f, 14.4322f, 2.6666f, 14.1338f, 2.6666f, 13.7656f)
                verticalLineTo(7.7656f)
                horizontalLineTo(0.6666f)
                lineTo(7.5513f, 1.5069f)
                curveTo(7.8056f, 1.2755f, 8.1943f, 1.2755f, 8.4486f, 1.5069f)
                lineTo(15.3333f, 7.7656f)
                horizontalLineTo(13.3333f)
                verticalLineTo(13.7656f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
