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

public val LineGroup.Award: ImageVector
    get() {
        if (_award != null) {
            return _award!!
        }
        _award = Builder(name = "Award", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.245f)
                verticalLineTo(22.117f)
                curveTo(17.0f, 22.2055f, 16.9766f, 22.2924f, 16.932f, 22.3688f)
                curveTo(16.8875f, 22.4452f, 16.8235f, 22.5085f, 16.7465f, 22.5521f)
                curveTo(16.6696f, 22.5957f, 16.5824f, 22.6181f, 16.4939f, 22.6171f)
                curveTo(16.4055f, 22.616f, 16.3189f, 22.5915f, 16.243f, 22.546f)
                lineTo(12.0f, 20.0f)
                lineTo(7.757f, 22.546f)
                curveTo(7.681f, 22.5915f, 7.5944f, 22.616f, 7.5058f, 22.6171f)
                curveTo(7.4173f, 22.6181f, 7.33f, 22.5956f, 7.253f, 22.5519f)
                curveTo(7.1761f, 22.5081f, 7.1121f, 22.4447f, 7.0676f, 22.3681f)
                curveTo(7.0231f, 22.2916f, 6.9998f, 22.2045f, 7.0f, 22.116f)
                verticalLineTo(15.246f)
                curveTo(5.7062f, 14.2101f, 4.766f, 12.7979f, 4.3095f, 11.2045f)
                curveTo(3.8529f, 9.6112f, 3.9026f, 7.9154f, 4.4515f, 6.3515f)
                curveTo(5.0004f, 4.7875f, 6.0216f, 3.4327f, 7.3738f, 2.4743f)
                curveTo(8.726f, 1.5158f, 10.3425f, 1.001f, 12.0f, 1.001f)
                curveTo(13.6575f, 1.001f, 15.274f, 1.5158f, 16.6262f, 2.4743f)
                curveTo(17.9784f, 3.4327f, 18.9996f, 4.7875f, 19.5485f, 6.3515f)
                curveTo(20.0974f, 7.9154f, 20.1471f, 9.6112f, 19.6905f, 11.2045f)
                curveTo(19.234f, 12.7979f, 18.2939f, 14.2101f, 17.0f, 15.246f)
                verticalLineTo(15.245f)
                close()
                moveTo(9.0f, 16.418f)
                verticalLineTo(19.468f)
                lineTo(12.0f, 17.668f)
                lineTo(15.0f, 19.468f)
                verticalLineTo(16.418f)
                curveTo(14.0468f, 16.8035f, 13.0282f, 17.0011f, 12.0f, 17.0f)
                curveTo(10.9718f, 17.0011f, 9.9532f, 16.8035f, 9.0f, 16.418f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.5913f, 15.0f, 15.1174f, 14.3679f, 16.2426f, 13.2426f)
                curveTo(17.3679f, 12.1174f, 18.0f, 10.5913f, 18.0f, 9.0f)
                curveTo(18.0f, 7.4087f, 17.3679f, 5.8826f, 16.2426f, 4.7574f)
                curveTo(15.1174f, 3.6321f, 13.5913f, 3.0f, 12.0f, 3.0f)
                curveTo(10.4087f, 3.0f, 8.8826f, 3.6321f, 7.7574f, 4.7574f)
                curveTo(6.6321f, 5.8826f, 6.0f, 7.4087f, 6.0f, 9.0f)
                curveTo(6.0f, 10.5913f, 6.6321f, 12.1174f, 7.7574f, 13.2426f)
                curveTo(8.8826f, 14.3679f, 10.4087f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _award!!
    }

private var _award: ImageVector? = null
