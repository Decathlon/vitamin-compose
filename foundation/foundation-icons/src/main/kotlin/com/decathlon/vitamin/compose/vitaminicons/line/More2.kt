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
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 3.0f)
                curveTo(11.675f, 3.0f, 11.0f, 3.675f, 11.0f, 4.5f)
                curveTo(11.0f, 5.325f, 11.675f, 6.0f, 12.5f, 6.0f)
                curveTo(13.325f, 6.0f, 14.0f, 5.325f, 14.0f, 4.5f)
                curveTo(14.0f, 3.675f, 13.325f, 3.0f, 12.5f, 3.0f)
                close()
                moveTo(12.5f, 18.0f)
                curveTo(11.675f, 18.0f, 11.0f, 18.675f, 11.0f, 19.5f)
                curveTo(11.0f, 20.325f, 11.675f, 21.0f, 12.5f, 21.0f)
                curveTo(13.325f, 21.0f, 14.0f, 20.325f, 14.0f, 19.5f)
                curveTo(14.0f, 18.675f, 13.325f, 18.0f, 12.5f, 18.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(11.0f, 11.175f, 11.675f, 10.5f, 12.5f, 10.5f)
                curveTo(13.325f, 10.5f, 14.0f, 11.175f, 14.0f, 12.0f)
                curveTo(14.0f, 12.825f, 13.325f, 13.5f, 12.5f, 13.5f)
                curveTo(11.675f, 13.5f, 11.0f, 12.825f, 11.0f, 12.0f)
                close()
            }
        }
        .build()
        return _more2!!
    }

private var _more2: ImageVector? = null
