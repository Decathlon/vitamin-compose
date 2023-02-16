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

public val LineGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6486f, 12.0f)
                horizontalLineTo(7.3333f)
                verticalLineTo(8.6666f)
                horizontalLineTo(8.6666f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.3513f)
                curveTo(9.4393f, 11.1986f, 9.848f, 10.5373f, 10.5113f, 9.8153f)
                curveTo(10.5866f, 9.734f, 11.066f, 9.2373f, 11.1226f, 9.1666f)
                curveTo(11.5935f, 8.5784f, 11.8886f, 7.8691f, 11.9741f, 7.1205f)
                curveTo(12.0595f, 6.3719f, 11.9317f, 5.6143f, 11.6055f, 4.9351f)
                curveTo(11.2792f, 4.2559f, 10.7678f, 3.6827f, 10.13f, 3.2814f)
                curveTo(9.4923f, 2.8802f, 8.7542f, 2.6672f, 8.0007f, 2.667f)
                curveTo(7.2472f, 2.6669f, 6.509f, 2.8795f, 5.8711f, 3.2805f)
                curveTo(5.2332f, 3.6815f, 4.7215f, 4.2545f, 4.3949f, 4.9336f)
                curveTo(4.0684f, 5.6127f, 3.9403f, 6.3701f, 4.0254f, 7.1188f)
                curveTo(4.1105f, 7.8675f, 4.4054f, 8.5769f, 4.876f, 9.1653f)
                curveTo(4.9333f, 9.2367f, 5.414f, 9.734f, 5.488f, 9.8146f)
                curveTo(6.152f, 10.5373f, 6.5606f, 11.1986f, 6.6486f, 12.0f)
                close()
                moveTo(6.6666f, 13.3333f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.3333f)
                verticalLineTo(13.3333f)
                horizontalLineTo(6.6666f)
                close()
                moveTo(3.836f, 10.0f)
                curveTo(3.2081f, 9.2155f, 2.8146f, 8.2696f, 2.7008f, 7.2713f)
                curveTo(2.587f, 6.273f, 2.7576f, 5.2628f, 3.1928f, 4.3572f)
                curveTo(3.628f, 3.4515f, 4.3103f, 2.6872f, 5.1609f, 2.1524f)
                curveTo(6.0115f, 1.6175f, 6.9959f, 1.3338f, 8.0007f, 1.334f)
                curveTo(9.0055f, 1.3341f, 9.9898f, 1.6181f, 10.8402f, 2.1533f)
                curveTo(11.6907f, 2.6884f, 12.3727f, 3.4529f, 12.8076f, 4.3587f)
                curveTo(13.2426f, 5.2645f, 13.4128f, 6.2747f, 13.2987f, 7.273f)
                curveTo(13.1846f, 8.2713f, 12.7908f, 9.217f, 12.1626f, 10.0013f)
                curveTo(11.7493f, 10.516f, 10.6666f, 11.3333f, 10.6666f, 12.3333f)
                verticalLineTo(14.0f)
                curveTo(10.6666f, 14.3536f, 10.5262f, 14.6927f, 10.2761f, 14.9428f)
                curveTo(10.0261f, 15.1928f, 9.6869f, 15.3333f, 9.3333f, 15.3333f)
                horizontalLineTo(6.6666f)
                curveTo(6.313f, 15.3333f, 5.9739f, 15.1928f, 5.7238f, 14.9428f)
                curveTo(5.4738f, 14.6927f, 5.3333f, 14.3536f, 5.3333f, 14.0f)
                verticalLineTo(12.3333f)
                curveTo(5.3333f, 11.3333f, 4.25f, 10.516f, 3.836f, 10.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
