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

public val LineGroup.More2: ImageVector
    get() {
        if (_more2 != null) {
            return _more2!!
        }
        _more2 = Builder(name = "More2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.3334f, 2.0f)
                curveTo(7.7834f, 2.0f, 7.3334f, 2.45f, 7.3334f, 3.0f)
                curveTo(7.3334f, 3.55f, 7.7834f, 4.0f, 8.3334f, 4.0f)
                curveTo(8.8834f, 4.0f, 9.3334f, 3.55f, 9.3334f, 3.0f)
                curveTo(9.3334f, 2.45f, 8.8834f, 2.0f, 8.3334f, 2.0f)
                close()
                moveTo(8.3334f, 12.0f)
                curveTo(7.7834f, 12.0f, 7.3334f, 12.45f, 7.3334f, 13.0f)
                curveTo(7.3334f, 13.55f, 7.7834f, 14.0f, 8.3334f, 14.0f)
                curveTo(8.8834f, 14.0f, 9.3334f, 13.55f, 9.3334f, 13.0f)
                curveTo(9.3334f, 12.45f, 8.8834f, 12.0f, 8.3334f, 12.0f)
                close()
                moveTo(7.3334f, 8.0f)
                curveTo(7.3334f, 7.45f, 7.7834f, 7.0f, 8.3334f, 7.0f)
                curveTo(8.8834f, 7.0f, 9.3334f, 7.45f, 9.3334f, 8.0f)
                curveTo(9.3334f, 8.55f, 8.8834f, 9.0f, 8.3334f, 9.0f)
                curveTo(7.7834f, 9.0f, 7.3334f, 8.55f, 7.3334f, 8.0f)
                close()
            }
        }
        .build()
        return _more2!!
    }

private var _more2: ImageVector? = null
