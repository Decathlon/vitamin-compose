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

public val FillGroup.Bill: ImageVector
    get() {
        if (_bill != null) {
            return _bill!!
        }
        _bill = Builder(name = "Bill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3333f, 14.6633f)
                horizontalLineTo(2.6667f)
                curveTo(2.4899f, 14.6633f, 2.3203f, 14.5931f, 2.1953f, 14.4681f)
                curveTo(2.0702f, 14.343f, 2.0f, 14.1735f, 2.0f, 13.9967f)
                verticalLineTo(1.9967f)
                curveTo(2.0f, 1.8199f, 2.0702f, 1.6503f, 2.1953f, 1.5253f)
                curveTo(2.3203f, 1.4002f, 2.4899f, 1.33f, 2.6667f, 1.33f)
                horizontalLineTo(13.3333f)
                curveTo(13.5101f, 1.33f, 13.6797f, 1.4002f, 13.8047f, 1.5253f)
                curveTo(13.9298f, 1.6503f, 14.0f, 1.8199f, 14.0f, 1.9967f)
                verticalLineTo(13.9967f)
                curveTo(14.0f, 14.1735f, 13.9298f, 14.343f, 13.8047f, 14.4681f)
                curveTo(13.6797f, 14.5931f, 13.5101f, 14.6633f, 13.3333f, 14.6633f)
                close()
                moveTo(5.3333f, 5.9967f)
                verticalLineTo(7.33f)
                horizontalLineTo(10.6667f)
                verticalLineTo(5.9967f)
                horizontalLineTo(5.3333f)
                close()
                moveTo(5.3333f, 8.6633f)
                verticalLineTo(9.9967f)
                horizontalLineTo(10.6667f)
                verticalLineTo(8.6633f)
                horizontalLineTo(5.3333f)
                close()
            }
        }
        .build()
        return _bill!!
    }

private var _bill: ImageVector? = null
