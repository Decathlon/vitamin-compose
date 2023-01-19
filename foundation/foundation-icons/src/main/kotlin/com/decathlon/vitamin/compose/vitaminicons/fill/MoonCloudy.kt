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

public val FillGroup.MoonCloudy: ImageVector
    get() {
        if (_moonCloudy != null) {
            return _moonCloudy!!
        }
        _moonCloudy = Builder(name = "MoonCloudy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.78f, 3.338f)
                curveTo(6.2175f, 2.4125f, 6.9473f, 1.6565f, 7.8568f, 1.1865f)
                curveTo(8.7664f, 0.7165f, 9.8052f, 0.5587f, 10.8133f, 0.7374f)
                curveTo(10.6415f, 1.264f, 10.6188f, 1.8278f, 10.7477f, 2.3665f)
                curveTo(10.8767f, 2.9052f, 11.1523f, 3.3977f, 11.544f, 3.7894f)
                curveTo(11.9357f, 4.181f, 12.4281f, 4.4566f, 12.9668f, 4.5856f)
                curveTo(13.5055f, 4.7146f, 14.0694f, 4.6919f, 14.596f, 4.52f)
                curveTo(14.6426f, 4.784f, 14.6666f, 5.056f, 14.6666f, 5.3334f)
                curveTo(14.6678f, 6.1196f, 14.4694f, 6.8934f, 14.09f, 7.582f)
                curveTo(14.6489f, 8.0744f, 15.0446f, 8.7254f, 15.2245f, 9.4483f)
                curveTo(15.4043f, 10.1712f, 15.3596f, 10.9317f, 15.0965f, 11.6286f)
                curveTo(14.8334f, 12.3255f, 14.3642f, 12.9257f, 13.7515f, 13.3493f)
                curveTo(13.1388f, 13.773f, 12.4116f, 14.0f, 11.6666f, 14.0f)
                horizontalLineTo(6.0f)
                curveTo(4.6051f, 13.9992f, 3.266f, 13.452f, 2.2698f, 12.4756f)
                curveTo(1.2736f, 11.4992f, 0.6996f, 10.1713f, 0.6708f, 8.7767f)
                curveTo(0.642f, 7.3821f, 1.1608f, 6.0317f, 2.1158f, 5.0151f)
                curveTo(3.0709f, 3.9984f, 4.3863f, 3.3964f, 5.78f, 3.338f)
                close()
                moveTo(7.2313f, 3.476f)
                curveTo(8.0715f, 3.6762f, 8.8506f, 4.0771f, 9.5019f, 4.6443f)
                curveTo(10.1533f, 5.2115f, 10.6575f, 5.9281f, 10.9713f, 6.7327f)
                curveTo(11.6317f, 6.6062f, 12.3141f, 6.6626f, 12.9446f, 6.896f)
                curveTo(13.0953f, 6.6127f, 13.2066f, 6.306f, 13.27f, 5.9827f)
                curveTo(12.2618f, 5.8898f, 11.318f, 5.4469f, 10.6022f, 4.7309f)
                curveTo(9.8864f, 4.0149f, 9.4439f, 3.0709f, 9.3513f, 2.0627f)
                curveTo(8.4854f, 2.2347f, 7.7231f, 2.7429f, 7.2313f, 3.476f)
                close()
            }
        }
        .build()
        return _moonCloudy!!
    }

private var _moonCloudy: ImageVector? = null
