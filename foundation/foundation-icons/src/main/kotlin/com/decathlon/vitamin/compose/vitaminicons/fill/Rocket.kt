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

public val FillGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8734f, 14.0956f)
                lineTo(9.8259f, 19.0482f)
                curveTo(8.2393f, 19.6993f, 6.46f, 19.6993f, 4.8734f, 19.0482f)
                curveTo(4.2223f, 17.4615f, 4.2223f, 15.6823f, 4.8734f, 14.0956f)
                close()
                moveTo(15.2657f, 17.1411f)
                lineTo(15.0762f, 20.1591f)
                lineTo(13.7136f, 21.5216f)
                lineTo(2.3999f, 10.2079f)
                lineTo(3.7625f, 8.8454f)
                lineTo(6.7804f, 8.6558f)
                lineTo(10.8852f, 4.5511f)
                curveTo(13.348f, 2.0882f, 17.2145f, 1.763f, 20.4629f, 3.4586f)
                curveTo(22.1586f, 6.7071f, 21.8333f, 10.5735f, 19.3705f, 13.0364f)
                lineTo(15.2657f, 17.1411f)
                close()
                moveTo(13.7136f, 10.2079f)
                curveTo(14.0887f, 10.583f, 14.5974f, 10.7937f, 15.1278f, 10.7937f)
                curveTo(15.6583f, 10.7937f, 16.167f, 10.583f, 16.542f, 10.2079f)
                curveTo(16.9171f, 9.8329f, 17.1278f, 9.3242f, 17.1278f, 8.7937f)
                curveTo(17.1278f, 8.2633f, 16.9171f, 7.7546f, 16.542f, 7.3795f)
                curveTo(16.167f, 7.0044f, 15.6583f, 6.7937f, 15.1278f, 6.7937f)
                curveTo(14.5974f, 6.7937f, 14.0887f, 7.0044f, 13.7136f, 7.3795f)
                curveTo(13.3385f, 7.7546f, 13.1278f, 8.2633f, 13.1278f, 8.7937f)
                curveTo(13.1278f, 9.3242f, 13.3385f, 9.8329f, 13.7136f, 10.2079f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
