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

public val LineGroup.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = Builder(name = "More", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 7.3333f)
                curveTo(2.45f, 7.3333f, 2.0f, 7.7833f, 2.0f, 8.3333f)
                curveTo(2.0f, 8.8833f, 2.45f, 9.3333f, 3.0f, 9.3333f)
                curveTo(3.55f, 9.3333f, 4.0f, 8.8833f, 4.0f, 8.3333f)
                curveTo(4.0f, 7.7833f, 3.55f, 7.3333f, 3.0f, 7.3333f)
                close()
                moveTo(13.0f, 7.3333f)
                curveTo(12.45f, 7.3333f, 12.0f, 7.7833f, 12.0f, 8.3333f)
                curveTo(12.0f, 8.8833f, 12.45f, 9.3333f, 13.0f, 9.3333f)
                curveTo(13.55f, 9.3333f, 14.0f, 8.8833f, 14.0f, 8.3333f)
                curveTo(14.0f, 7.7833f, 13.55f, 7.3333f, 13.0f, 7.3333f)
                close()
                moveTo(7.0f, 8.3333f)
                curveTo(7.0f, 7.7833f, 7.45f, 7.3333f, 8.0f, 7.3333f)
                curveTo(8.55f, 7.3333f, 9.0f, 7.7833f, 9.0f, 8.3333f)
                curveTo(9.0f, 8.8833f, 8.55f, 9.3333f, 8.0f, 9.3333f)
                curveTo(7.45f, 9.3333f, 7.0f, 8.8833f, 7.0f, 8.3333f)
                close()
            }
        }
        .build()
        return _more!!
    }

private var _more: ImageVector? = null
