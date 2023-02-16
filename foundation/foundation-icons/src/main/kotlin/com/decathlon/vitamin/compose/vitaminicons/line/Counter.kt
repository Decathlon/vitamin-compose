package com.decathlon.vitamin.compose.vitaminicons.line

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.LineGroup

public val LineGroup.Counter: ImageVector
    get() {
        if (_counter != null) {
            return _counter!!
        }
        _counter = Builder(name = "Counter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6666f, 8.0f, 14.6666f)
                curveTo(4.318f, 14.6666f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3333f, 8.0f, 1.3333f)
                close()
                moveTo(8.0f, 2.6667f)
                curveTo(5.0547f, 2.6667f, 2.6667f, 5.0546f, 2.6667f, 8.0f)
                curveTo(2.6667f, 10.9453f, 5.0547f, 13.3333f, 8.0f, 13.3333f)
                curveTo(10.9454f, 13.3333f, 13.3334f, 10.9453f, 13.3334f, 8.0f)
                curveTo(13.3334f, 5.0546f, 10.9454f, 2.6667f, 8.0f, 2.6667f)
                close()
                moveTo(10.5554f, 4.8913f)
                curveTo(10.7134f, 4.7807f, 10.928f, 4.7993f, 11.064f, 4.936f)
                curveTo(11.2f, 5.072f, 11.2174f, 5.2867f, 11.106f, 5.4426f)
                curveTo(9.6527f, 7.4733f, 8.8527f, 8.5613f, 8.7074f, 8.7073f)
                curveTo(8.3167f, 9.0973f, 7.6834f, 9.0973f, 7.2927f, 8.7073f)
                curveTo(6.9027f, 8.3167f, 6.9027f, 7.6833f, 7.2927f, 7.2927f)
                curveTo(7.542f, 7.044f, 8.6294f, 6.2433f, 10.5554f, 4.8913f)
                close()
                moveTo(11.6667f, 7.3333f)
                curveTo(12.0347f, 7.3333f, 12.3334f, 7.632f, 12.3334f, 8.0f)
                curveTo(12.3334f, 8.368f, 12.0347f, 8.6666f, 11.6667f, 8.6666f)
                curveTo(11.2987f, 8.6666f, 11.0f, 8.368f, 11.0f, 8.0f)
                curveTo(11.0f, 7.632f, 11.2987f, 7.3333f, 11.6667f, 7.3333f)
                close()
                moveTo(4.3334f, 7.3333f)
                curveTo(4.7014f, 7.3333f, 5.0f, 7.632f, 5.0f, 8.0f)
                curveTo(5.0f, 8.368f, 4.7014f, 8.6666f, 4.3334f, 8.6666f)
                curveTo(3.9654f, 8.6666f, 3.6667f, 8.368f, 3.6667f, 8.0f)
                curveTo(3.6667f, 7.632f, 3.9654f, 7.3333f, 4.3334f, 7.3333f)
                close()
                moveTo(5.8787f, 4.936f)
                curveTo(6.1387f, 5.196f, 6.1387f, 5.618f, 5.8787f, 5.8787f)
                curveTo(5.6187f, 6.1386f, 5.196f, 6.1386f, 4.936f, 5.8787f)
                curveTo(4.676f, 5.6186f, 4.676f, 5.196f, 4.936f, 4.936f)
                curveTo(5.196f, 4.676f, 5.618f, 4.676f, 5.8787f, 4.936f)
                close()
                moveTo(8.0f, 3.6667f)
                curveTo(8.368f, 3.6667f, 8.6667f, 3.9653f, 8.6667f, 4.3333f)
                curveTo(8.6667f, 4.7013f, 8.368f, 5.0f, 8.0f, 5.0f)
                curveTo(7.632f, 5.0f, 7.3334f, 4.7013f, 7.3334f, 4.3333f)
                curveTo(7.3334f, 3.9653f, 7.632f, 3.6667f, 8.0f, 3.6667f)
                close()
            }
        }
        .build()
        return _counter!!
    }

private var _counter: ImageVector? = null
