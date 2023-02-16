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

public val FillGroup.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = Builder(name = "More", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.3333f, 6.6667f)
                curveTo(2.6f, 6.6667f, 2.0f, 7.2667f, 2.0f, 8.0f)
                curveTo(2.0f, 8.7333f, 2.6f, 9.3334f, 3.3333f, 9.3334f)
                curveTo(4.0667f, 9.3334f, 4.6667f, 8.7333f, 4.6667f, 8.0f)
                curveTo(4.6667f, 7.2667f, 4.0667f, 6.6667f, 3.3333f, 6.6667f)
                close()
                moveTo(12.6667f, 6.6667f)
                curveTo(11.9333f, 6.6667f, 11.3333f, 7.2667f, 11.3333f, 8.0f)
                curveTo(11.3333f, 8.7333f, 11.9333f, 9.3334f, 12.6667f, 9.3334f)
                curveTo(13.4f, 9.3334f, 14.0f, 8.7333f, 14.0f, 8.0f)
                curveTo(14.0f, 7.2667f, 13.4f, 6.6667f, 12.6667f, 6.6667f)
                close()
                moveTo(6.6667f, 8.0f)
                curveTo(6.6667f, 7.2667f, 7.2667f, 6.6667f, 8.0f, 6.6667f)
                curveTo(8.7333f, 6.6667f, 9.3333f, 7.2667f, 9.3333f, 8.0f)
                curveTo(9.3333f, 8.7333f, 8.7333f, 9.3334f, 8.0f, 9.3334f)
                curveTo(7.2667f, 9.3334f, 6.6667f, 8.7333f, 6.6667f, 8.0f)
                close()
            }
        }
        .build()
        return _more!!
    }

private var _more: ImageVector? = null
