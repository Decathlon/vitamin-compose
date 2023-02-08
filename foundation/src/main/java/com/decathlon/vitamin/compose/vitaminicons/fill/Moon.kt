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

public val FillGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.38f, 2.019f)
                curveTo(10.6431f, 2.7057f, 10.0521f, 3.5337f, 9.6422f, 4.4537f)
                curveTo(9.2323f, 5.3737f, 9.0119f, 6.3668f, 8.9941f, 7.3738f)
                curveTo(8.9763f, 8.3808f, 9.1616f, 9.3811f, 9.5388f, 10.315f)
                curveTo(9.916f, 11.2489f, 10.4774f, 12.0972f, 11.1896f, 12.8094f)
                curveTo(11.9018f, 13.5216f, 12.7501f, 14.0831f, 13.684f, 14.4603f)
                curveTo(14.6179f, 14.8375f, 15.6182f, 15.0227f, 16.6252f, 15.005f)
                curveTo(17.6323f, 14.9872f, 18.6254f, 14.7668f, 19.5454f, 14.3569f)
                curveTo(20.4654f, 13.9469f, 21.2934f, 13.3559f, 21.98f, 12.619f)
                curveTo(21.662f, 17.854f, 17.316f, 22.0f, 12.001f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.685f, 6.146f, 2.339f, 11.38f, 2.019f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
