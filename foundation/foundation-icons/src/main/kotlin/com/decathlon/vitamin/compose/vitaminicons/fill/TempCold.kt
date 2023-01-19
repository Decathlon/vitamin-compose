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

public val FillGroup.TempCold: ImageVector
    get() {
        if (_tempCold != null) {
            return _tempCold!!
        }
        _tempCold = Builder(name = "TempCold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3333f, 6.8366f)
                verticalLineTo(3.3333f)
                curveTo(5.3333f, 2.626f, 5.6142f, 1.9478f, 6.1143f, 1.4477f)
                curveTo(6.6144f, 0.9476f, 7.2927f, 0.6666f, 7.9999f, 0.6666f)
                curveTo(8.7072f, 0.6666f, 9.3854f, 0.9476f, 9.8855f, 1.4477f)
                curveTo(10.3856f, 1.9478f, 10.6666f, 2.626f, 10.6666f, 3.3333f)
                verticalLineTo(6.8366f)
                curveTo(11.4819f, 7.4043f, 12.0948f, 8.2175f, 12.416f, 9.1576f)
                curveTo(12.7372f, 10.0978f, 12.7499f, 11.1159f, 12.4524f, 12.0638f)
                curveTo(12.1549f, 13.0117f, 11.5627f, 13.8399f, 10.7618f, 14.4279f)
                curveTo(9.961f, 15.0159f, 8.9934f, 15.333f, 7.9999f, 15.333f)
                curveTo(7.0064f, 15.333f, 6.0388f, 15.0159f, 5.238f, 14.4279f)
                curveTo(4.4372f, 13.8399f, 3.8449f, 13.0117f, 3.5474f, 12.0638f)
                curveTo(3.2499f, 11.1159f, 3.2627f, 10.0978f, 3.5839f, 9.1576f)
                curveTo(3.9051f, 8.2175f, 4.5179f, 7.4043f, 5.3333f, 6.8366f)
                close()
                moveTo(5.3333f, 10.6666f)
                curveTo(5.3333f, 11.3739f, 5.6142f, 12.0521f, 6.1143f, 12.5522f)
                curveTo(6.6144f, 13.0523f, 7.2927f, 13.3333f, 7.9999f, 13.3333f)
                curveTo(8.7072f, 13.3333f, 9.3854f, 13.0523f, 9.8855f, 12.5522f)
                curveTo(10.3856f, 12.0521f, 10.6666f, 11.3739f, 10.6666f, 10.6666f)
                horizontalLineTo(5.3333f)
                close()
            }
        }
        .build()
        return _tempCold!!
    }

private var _tempCold: ImageVector? = null
