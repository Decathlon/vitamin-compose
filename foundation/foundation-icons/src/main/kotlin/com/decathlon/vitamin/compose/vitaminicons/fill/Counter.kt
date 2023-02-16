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

public val FillGroup.Counter: ImageVector
    get() {
        if (_counter != null) {
            return _counter!!
        }
        _counter = Builder(name = "Counter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9999f, 1.3333f)
                curveTo(11.6819f, 1.3333f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 11.682f, 11.6819f, 14.6666f, 7.9999f, 14.6666f)
                curveTo(4.3179f, 14.6666f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 4.318f, 4.3179f, 1.3333f, 7.9999f, 1.3333f)
                close()
                moveTo(11.0639f, 4.936f)
                curveTo(10.9279f, 4.7993f, 10.7133f, 4.7807f, 10.5553f, 4.8913f)
                curveTo(8.6286f, 6.2433f, 7.5419f, 7.0447f, 7.2926f, 7.2927f)
                curveTo(6.9026f, 7.6833f, 6.9026f, 8.3167f, 7.2926f, 8.7073f)
                curveTo(7.6832f, 9.0973f, 8.3166f, 9.0973f, 8.7072f, 8.7073f)
                curveTo(8.8532f, 8.5606f, 9.6526f, 7.4733f, 11.1059f, 5.4426f)
                curveTo(11.2179f, 5.2867f, 11.1999f, 5.072f, 11.0639f, 4.936f)
                close()
                moveTo(11.6666f, 7.3333f)
                curveTo(11.2986f, 7.3333f, 10.9999f, 7.632f, 10.9999f, 8.0f)
                curveTo(10.9999f, 8.368f, 11.2986f, 8.6666f, 11.6666f, 8.6666f)
                curveTo(12.0346f, 8.6666f, 12.3333f, 8.368f, 12.3333f, 8.0f)
                curveTo(12.3333f, 7.632f, 12.0346f, 7.3333f, 11.6666f, 7.3333f)
                close()
                moveTo(4.3333f, 7.3333f)
                curveTo(3.9653f, 7.3333f, 3.6666f, 7.632f, 3.6666f, 8.0f)
                curveTo(3.6666f, 8.368f, 3.9653f, 8.6666f, 4.3333f, 8.6666f)
                curveTo(4.7013f, 8.6666f, 4.9999f, 8.368f, 4.9999f, 8.0f)
                curveTo(4.9999f, 7.632f, 4.7013f, 7.3333f, 4.3333f, 7.3333f)
                close()
                moveTo(5.8786f, 4.936f)
                curveTo(5.6186f, 4.676f, 5.1959f, 4.676f, 4.9359f, 4.936f)
                curveTo(4.6759f, 5.196f, 4.6759f, 5.618f, 4.9359f, 5.8787f)
                curveTo(5.1959f, 6.1386f, 5.6179f, 6.1386f, 5.8786f, 5.8787f)
                curveTo(6.1386f, 5.6186f, 6.1386f, 5.196f, 5.8786f, 4.936f)
                close()
                moveTo(7.9999f, 3.6667f)
                curveTo(7.6319f, 3.6667f, 7.3333f, 3.9653f, 7.3333f, 4.3333f)
                curveTo(7.3333f, 4.7013f, 7.6319f, 5.0f, 7.9999f, 5.0f)
                curveTo(8.3679f, 5.0f, 8.6666f, 4.7013f, 8.6666f, 4.3333f)
                curveTo(8.6666f, 3.9653f, 8.3679f, 3.6667f, 7.9999f, 3.6667f)
                close()
            }
        }
        .build()
        return _counter!!
    }

private var _counter: ImageVector? = null
