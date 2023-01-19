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

public val FillGroup.More2: ImageVector
    get() {
        if (_more2 != null) {
            return _more2!!
        }
        _more2 = Builder(name = "More2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 2.0f)
                curveTo(7.2666f, 2.0f, 6.6666f, 2.6f, 6.6666f, 3.3333f)
                curveTo(6.6666f, 4.0667f, 7.2666f, 4.6667f, 8.0f, 4.6667f)
                curveTo(8.7333f, 4.6667f, 9.3333f, 4.0667f, 9.3333f, 3.3333f)
                curveTo(9.3333f, 2.6f, 8.7333f, 2.0f, 8.0f, 2.0f)
                close()
                moveTo(8.0f, 11.3333f)
                curveTo(7.2666f, 11.3333f, 6.6666f, 11.9333f, 6.6666f, 12.6667f)
                curveTo(6.6666f, 13.4f, 7.2666f, 14.0f, 8.0f, 14.0f)
                curveTo(8.7333f, 14.0f, 9.3333f, 13.4f, 9.3333f, 12.6667f)
                curveTo(9.3333f, 11.9333f, 8.7333f, 11.3333f, 8.0f, 11.3333f)
                close()
                moveTo(6.6666f, 8.0f)
                curveTo(6.6666f, 7.2667f, 7.2666f, 6.6667f, 8.0f, 6.6667f)
                curveTo(8.7333f, 6.6667f, 9.3333f, 7.2667f, 9.3333f, 8.0f)
                curveTo(9.3333f, 8.7333f, 8.7333f, 9.3333f, 8.0f, 9.3333f)
                curveTo(7.2666f, 9.3333f, 6.6666f, 8.7333f, 6.6666f, 8.0f)
                close()
            }
        }
        .build()
        return _more2!!
    }

private var _more2: ImageVector? = null
