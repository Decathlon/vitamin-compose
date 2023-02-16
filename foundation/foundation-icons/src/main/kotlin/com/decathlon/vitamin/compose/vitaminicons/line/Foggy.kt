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

public val LineGroup.Foggy: ImageVector
    get() {
        if (_foggy != null) {
            return _foggy!!
        }
        _foggy = Builder(name = "Foggy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.056f, 8.6714f)
                curveTo(0.5337f, 7.3565f, 0.5551f, 5.888f, 1.1156f, 4.589f)
                curveTo(1.676f, 3.2899f, 2.7295f, 2.2667f, 4.0444f, 1.7444f)
                curveTo(5.3592f, 1.2221f, 6.8277f, 1.2435f, 8.1268f, 1.8039f)
                curveTo(9.4258f, 2.3643f, 10.4491f, 3.4179f, 10.9714f, 4.7327f)
                curveTo(11.5301f, 4.6247f, 12.1063f, 4.6483f, 12.6544f, 4.8016f)
                curveTo(13.2025f, 4.9548f, 13.7074f, 5.2335f, 14.1291f, 5.6157f)
                curveTo(14.5508f, 5.9978f, 14.8778f, 6.4728f, 15.0841f, 7.0032f)
                curveTo(15.2905f, 7.5336f, 15.3706f, 8.1047f, 15.318f, 8.6714f)
                horizontalLineTo(13.976f)
                curveTo(14.0476f, 8.184f, 13.9631f, 7.6864f, 13.7346f, 7.2499f)
                curveTo(13.5061f, 6.8135f, 13.1453f, 6.4606f, 12.7039f, 6.2417f)
                curveTo(12.2626f, 6.0229f, 11.7633f, 5.9494f, 11.2775f, 6.0317f)
                curveTo(10.7918f, 6.114f, 10.3446f, 6.348f, 10.0f, 6.7f)
                verticalLineTo(6.6667f)
                curveTo(9.9999f, 6.053f, 9.8585f, 5.4476f, 9.5869f, 4.8973f)
                curveTo(9.3153f, 4.347f, 8.9207f, 3.8666f, 8.4336f, 3.4932f)
                curveTo(7.9466f, 3.1198f, 7.3802f, 2.8635f, 6.7782f, 2.7442f)
                curveTo(6.1762f, 2.6248f, 5.5549f, 2.6455f, 4.9622f, 2.8047f)
                curveTo(4.3696f, 2.9639f, 3.8215f, 3.2574f, 3.3604f, 3.6624f)
                curveTo(2.8993f, 4.0673f, 2.5376f, 4.573f, 2.3032f, 5.1402f)
                curveTo(2.0688f, 5.7073f, 1.9681f, 6.3208f, 2.0088f, 6.9331f)
                curveTo(2.0496f, 7.5455f, 2.2306f, 8.1402f, 2.538f, 8.6714f)
                horizontalLineTo(1.056f)
                close()
                moveTo(2.6667f, 12.6667f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.6667f)
                verticalLineTo(12.6667f)
                close()
                moveTo(1.3333f, 10.0f)
                horizontalLineTo(15.3334f)
                verticalLineTo(11.3334f)
                horizontalLineTo(1.3333f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _foggy!!
    }

private var _foggy: ImageVector? = null
