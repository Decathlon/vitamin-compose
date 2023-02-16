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

public val FillGroup.EyeOff: ImageVector
    get() {
        if (_eyeOff != null) {
            return _eyeOff!!
        }
        _eyeOff = Builder(name = "EyeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0134f, 3.956f)
                lineTo(0.9287f, 1.872f)
                lineTo(1.872f, 0.9287f)
                lineTo(15.0714f, 14.1286f)
                lineTo(14.128f, 15.0713f)
                lineTo(11.9214f, 12.8646f)
                curveTo(10.7488f, 13.6084f, 9.3885f, 14.0022f, 8.0f, 14.0f)
                curveTo(4.4054f, 14.0f, 1.4147f, 11.4133f, 0.7874f, 8.0f)
                curveTo(1.074f, 6.4471f, 1.8544f, 5.0286f, 3.0134f, 3.956f)
                close()
                moveTo(9.838f, 10.7813f)
                lineTo(8.862f, 9.8053f)
                curveTo(8.097f, 10.1713f, 7.1843f, 10.0151f, 6.5846f, 9.4154f)
                curveTo(5.9849f, 8.8157f, 5.8286f, 7.903f, 6.1947f, 7.1379f)
                lineTo(5.2187f, 6.162f)
                curveTo(4.3441f, 7.4835f, 4.5209f, 9.238f, 5.6414f, 10.3585f)
                curveTo(6.7619f, 11.4791f, 8.5165f, 11.6558f, 9.838f, 10.7813f)
                close()
                moveTo(8.0f, 2.0f)
                curveTo(7.0534f, 2.0f, 6.1474f, 2.18f, 5.316f, 2.5067f)
                lineTo(7.5114f, 4.7013f)
                curveTo(8.5555f, 4.5463f, 9.6114f, 4.8951f, 10.3579f, 5.6415f)
                curveTo(11.1043f, 6.3879f, 11.453f, 7.4438f, 11.298f, 8.488f)
                lineTo(13.8714f, 11.0613f)
                curveTo(14.5493f, 10.1584f, 15.0084f, 9.1105f, 15.2127f, 8.0f)
                curveTo(14.5854f, 4.5867f, 11.5947f, 2.0f, 8.0f, 2.0f)
                close()
            }
        }
        .build()
        return _eyeOff!!
    }

private var _eyeOff: ImageVector? = null
