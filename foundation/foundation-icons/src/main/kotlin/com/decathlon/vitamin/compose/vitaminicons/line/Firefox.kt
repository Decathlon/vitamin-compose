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

public val LineGroup.Firefox: ImageVector
    get() {
        if (_firefox != null) {
            return _firefox!!
        }
        _firefox = Builder(name = "Firefox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.3333f)
                curveTo(11.682f, 1.3333f, 14.6666f, 4.318f, 14.6666f, 8.0f)
                curveTo(14.6666f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3333f, 11.682f, 1.3333f, 8.0f)
                curveTo(1.3333f, 7.024f, 1.5426f, 6.0973f, 1.92f, 5.2627f)
                curveTo(2.2306f, 4.6367f, 2.742f, 4.0133f, 3.1533f, 3.8f)
                curveTo(2.718f, 4.6553f, 2.5047f, 5.4933f, 2.46f, 6.0553f)
                curveTo(2.7627f, 5.0553f, 3.3366f, 4.2173f, 4.14f, 3.626f)
                curveTo(5.5173f, 2.6133f, 7.372f, 2.568f, 8.1107f, 3.2127f)
                curveTo(6.74f, 3.684f, 5.2467f, 5.578f, 5.5753f, 7.7967f)
                curveTo(5.6287f, 8.1633f, 5.7386f, 8.5193f, 5.9013f, 8.8513f)
                curveTo(5.6453f, 8.178f, 5.6227f, 7.2293f, 6.036f, 6.6127f)
                curveTo(6.4973f, 5.926f, 7.1547f, 5.7807f, 7.5066f, 5.8553f)
                curveTo(7.368f, 5.826f, 7.0613f, 6.4127f, 7.016f, 6.516f)
                curveTo(6.9007f, 6.7787f, 6.8433f, 7.0627f, 6.8486f, 7.3493f)
                curveTo(6.8586f, 7.9483f, 7.1055f, 8.5188f, 7.5353f, 8.936f)
                curveTo(8.8167f, 10.1833f, 10.884f, 9.6927f, 11.81f, 8.268f)
                curveTo(12.4453f, 7.2873f, 12.5226f, 5.6227f, 11.7066f, 4.3f)
                curveTo(11.503f, 3.9779f, 11.2603f, 3.6823f, 10.984f, 3.42f)
                curveTo(9.7507f, 2.2427f, 7.9973f, 1.7067f, 6.3293f, 1.95f)
                curveTo(5.592f, 2.068f, 4.9647f, 2.2807f, 4.4467f, 2.5873f)
                curveTo(5.17f, 1.8653f, 6.6066f, 1.3333f, 8.0f, 1.3333f)
                close()
                moveTo(4.5833f, 5.1367f)
                curveTo(3.0813f, 5.6573f, 2.2493f, 7.25f, 2.864f, 9.4433f)
                curveTo(3.1715f, 10.5355f, 3.8191f, 11.5013f, 4.7129f, 12.2003f)
                curveTo(5.6066f, 12.8994f, 6.6999f, 13.2953f, 7.834f, 13.3307f)
                lineTo(8.0f, 13.3333f)
                curveTo(9.3573f, 13.3334f, 10.6635f, 12.816f, 11.6526f, 11.8865f)
                curveTo(12.6417f, 10.957f, 13.2392f, 9.6854f, 13.3233f, 8.3307f)
                lineTo(13.3293f, 8.1893f)
                curveTo(13.2426f, 8.422f, 13.1406f, 8.6387f, 13.0206f, 8.8427f)
                lineTo(12.9273f, 8.994f)
                curveTo(11.5246f, 11.1533f, 8.4733f, 11.7107f, 6.6073f, 9.8927f)
                curveTo(6.3535f, 9.6464f, 6.1374f, 9.364f, 5.966f, 9.0547f)
                lineTo(5.8953f, 8.9207f)
                curveTo(4.738f, 8.6627f, 4.1726f, 8.0367f, 4.2f, 7.0427f)
                curveTo(4.218f, 6.382f, 4.3533f, 5.736f, 4.5833f, 5.136f)
                verticalLineTo(5.1367f)
                close()
            }
        }
        .build()
        return _firefox!!
    }

private var _firefox: ImageVector? = null
