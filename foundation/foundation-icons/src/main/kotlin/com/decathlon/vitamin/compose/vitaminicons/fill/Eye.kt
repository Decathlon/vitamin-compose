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
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.1809f, 12.0f)
                curveTo(2.1209f, 6.88f, 6.6079f, 3.0f, 11.9999f, 3.0f)
                curveTo(17.3919f, 3.0f, 21.8779f, 6.88f, 22.8189f, 12.0f)
                curveTo(21.8789f, 17.12f, 17.3919f, 21.0f, 11.9999f, 21.0f)
                curveTo(6.6079f, 21.0f, 2.1219f, 17.12f, 1.1809f, 12.0f)
                close()
                moveTo(11.9999f, 17.0f)
                curveTo(14.7613f, 17.0f, 16.9999f, 14.7614f, 16.9999f, 12.0f)
                curveTo(16.9999f, 9.2386f, 14.7613f, 7.0f, 11.9999f, 7.0f)
                curveTo(9.2385f, 7.0f, 6.9999f, 9.2386f, 6.9999f, 12.0f)
                curveTo(6.9999f, 14.7614f, 9.2385f, 17.0f, 11.9999f, 17.0f)
                close()
                moveTo(8.9999f, 12.0f)
                curveTo(8.9999f, 13.6569f, 10.3431f, 15.0f, 11.9999f, 15.0f)
                curveTo(13.6568f, 15.0f, 14.9999f, 13.6569f, 14.9999f, 12.0f)
                curveTo(14.9999f, 10.3431f, 13.6568f, 9.0f, 11.9999f, 9.0f)
                curveTo(10.3431f, 9.0f, 8.9999f, 10.3431f, 8.9999f, 12.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
