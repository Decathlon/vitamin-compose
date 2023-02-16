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

public val FillGroup.Foggy: ImageVector
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
