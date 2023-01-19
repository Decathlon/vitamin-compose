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

public val FillGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.7874f, 8.0f)
                curveTo(1.414f, 4.5867f, 4.4054f, 2.0f, 8.0f, 2.0f)
                curveTo(11.5947f, 2.0f, 14.5854f, 4.5867f, 15.2127f, 8.0f)
                curveTo(14.586f, 11.4133f, 11.5947f, 14.0f, 8.0f, 14.0f)
                curveTo(4.4054f, 14.0f, 1.4147f, 11.4133f, 0.7874f, 8.0f)
                close()
                moveTo(8.0f, 11.3333f)
                curveTo(9.841f, 11.3333f, 11.3334f, 9.841f, 11.3334f, 8.0f)
                curveTo(11.3334f, 6.159f, 9.841f, 4.6667f, 8.0f, 4.6667f)
                curveTo(6.1591f, 4.6667f, 4.6667f, 6.159f, 4.6667f, 8.0f)
                curveTo(4.6667f, 9.841f, 6.1591f, 11.3333f, 8.0f, 11.3333f)
                close()
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 9.1046f, 6.8955f, 10.0f, 8.0f, 10.0f)
                curveTo(9.1046f, 10.0f, 10.0f, 9.1046f, 10.0f, 8.0f)
                curveTo(10.0f, 6.8954f, 9.1046f, 6.0f, 8.0f, 6.0f)
                curveTo(6.8955f, 6.0f, 6.0f, 6.8954f, 6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
