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

public val LineGroup.Lock: ImageVector
    get() {
        if (_lock != null) {
            return _lock!!
        }
        _lock = Builder(name = "Lock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 5.3333f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.6667f)
                curveTo(2.2985f, 6.0f, 2.0f, 6.2985f, 2.0f, 6.6666f)
                verticalLineTo(14.6666f)
                curveTo(2.0f, 15.0348f, 2.2985f, 15.3333f, 2.6667f, 15.3333f)
                horizontalLineTo(13.3333f)
                curveTo(13.7015f, 15.3333f, 14.0f, 15.0348f, 14.0f, 14.6666f)
                verticalLineTo(6.6666f)
                curveTo(14.0f, 6.2985f, 13.7015f, 6.0f, 13.3333f, 6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.3333f)
                curveTo(12.0f, 3.1242f, 10.2091f, 1.3333f, 8.0f, 1.3333f)
                curveTo(5.7909f, 1.3333f, 4.0f, 3.1242f, 4.0f, 5.3333f)
                close()
                moveTo(3.3333f, 14.0f)
                verticalLineTo(7.3333f)
                horizontalLineTo(12.6667f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.3333f)
                close()
                moveTo(7.3334f, 11.1546f)
                curveTo(6.8107f, 10.8529f, 6.5559f, 10.2377f, 6.7121f, 9.6548f)
                curveTo(6.8683f, 9.0719f, 7.3966f, 8.6666f, 8.0f, 8.6666f)
                curveTo(8.6035f, 8.6666f, 9.1317f, 9.0719f, 9.2879f, 9.6548f)
                curveTo(9.4441f, 10.2377f, 9.1893f, 10.8529f, 8.6667f, 11.1546f)
                verticalLineTo(12.6666f)
                horizontalLineTo(7.3334f)
                verticalLineTo(11.1546f)
                close()
                moveTo(10.6667f, 5.3333f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.3333f)
                verticalLineTo(5.3333f)
                curveTo(5.3333f, 3.8605f, 6.5272f, 2.6667f, 8.0f, 2.6667f)
                curveTo(9.4728f, 2.6667f, 10.6667f, 3.8605f, 10.6667f, 5.3333f)
                close()
            }
        }
        .build()
        return _lock!!
    }

private var _lock: ImageVector? = null
