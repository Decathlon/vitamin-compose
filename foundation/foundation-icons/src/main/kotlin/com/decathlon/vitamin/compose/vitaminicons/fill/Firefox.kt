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

public val FillGroup.Firefox: ImageVector
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
                curveTo(11.682f, 1.3333f, 14.6667f, 4.318f, 14.6667f, 8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 7.024f, 1.5427f, 6.0973f, 1.92f, 5.2627f)
                curveTo(2.2307f, 4.6367f, 2.742f, 4.0133f, 3.1534f, 3.8f)
                curveTo(2.718f, 4.6553f, 2.5047f, 5.4933f, 2.46f, 6.0553f)
                curveTo(2.7627f, 5.0553f, 3.3367f, 4.2173f, 4.14f, 3.626f)
                curveTo(5.5174f, 2.6133f, 7.372f, 2.568f, 8.1107f, 3.2127f)
                curveTo(6.74f, 3.684f, 5.2467f, 5.578f, 5.5754f, 7.7967f)
                curveTo(5.6287f, 8.1633f, 5.7387f, 8.5193f, 5.9014f, 8.8513f)
                curveTo(5.6454f, 8.178f, 5.6227f, 7.2293f, 6.036f, 6.6127f)
                curveTo(6.4974f, 5.926f, 7.1547f, 5.7807f, 7.5067f, 5.8553f)
                curveTo(7.368f, 5.826f, 7.0614f, 6.4127f, 7.016f, 6.516f)
                curveTo(6.9007f, 6.7787f, 6.8434f, 7.0627f, 6.8487f, 7.3493f)
                curveTo(6.8586f, 7.9483f, 7.1055f, 8.5188f, 7.5354f, 8.936f)
                curveTo(8.8167f, 10.1833f, 10.884f, 9.6927f, 11.81f, 8.268f)
                curveTo(12.4454f, 7.2873f, 12.5227f, 5.6227f, 11.7067f, 4.3f)
                curveTo(11.5031f, 3.9779f, 11.2604f, 3.6823f, 10.984f, 3.42f)
                curveTo(9.7507f, 2.2427f, 7.9974f, 1.7067f, 6.3294f, 1.95f)
                curveTo(5.592f, 2.068f, 4.9647f, 2.2807f, 4.4467f, 2.5873f)
                curveTo(5.17f, 1.8653f, 6.6067f, 1.3333f, 8.0f, 1.3333f)
                close()
            }
        }
        .build()
        return _firefox!!
    }

private var _firefox: ImageVector? = null
