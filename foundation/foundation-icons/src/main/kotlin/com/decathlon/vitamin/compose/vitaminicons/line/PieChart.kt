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

public val LineGroup.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(name = "PieChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 5.0147f, 3.2954f, 2.488f, 6.0f, 1.6387f)
                verticalLineTo(3.0547f)
                curveTo(4.854f, 3.52f, 3.9052f, 4.3691f, 3.3161f, 5.4567f)
                curveTo(2.7269f, 6.5444f, 2.534f, 7.8029f, 2.7702f, 9.017f)
                curveTo(3.0065f, 10.2312f, 3.6572f, 11.3255f, 4.6112f, 12.1129f)
                curveTo(5.5652f, 12.9002f, 6.7631f, 13.3316f, 8.0f, 13.3333f)
                curveTo(9.0626f, 13.3333f, 10.1009f, 13.016f, 10.9819f, 12.4222f)
                curveTo(11.863f, 11.8283f, 12.5467f, 10.9849f, 12.9454f, 10.0f)
                horizontalLineTo(14.3614f)
                curveTo(13.512f, 12.7047f, 10.9854f, 14.6667f, 8.0f, 14.6667f)
                close()
                moveTo(14.6334f, 8.6667f)
                horizontalLineTo(7.3334f)
                verticalLineTo(1.3667f)
                curveTo(7.5527f, 1.3447f, 7.7754f, 1.3333f, 8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 8.2247f, 14.6554f, 8.4473f, 14.6334f, 8.6667f)
                close()
                moveTo(8.6667f, 2.708f)
                verticalLineTo(7.3333f)
                horizontalLineTo(13.292f)
                curveTo(13.1437f, 6.1584f, 12.6086f, 5.0662f, 11.7712f, 4.2288f)
                curveTo(10.9338f, 3.3914f, 9.8416f, 2.8564f, 8.6667f, 2.708f)
                close()
            }
        }
        .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
