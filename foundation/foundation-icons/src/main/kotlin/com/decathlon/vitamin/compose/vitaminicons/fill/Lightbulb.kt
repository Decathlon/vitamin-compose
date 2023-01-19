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

public val FillGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3333f, 12.0f)
                horizontalLineTo(5.294f)
                curveTo(5.096f, 11.1513f, 4.2026f, 10.4573f, 3.836f, 10.0f)
                curveTo(3.2081f, 9.2155f, 2.8146f, 8.2696f, 2.7008f, 7.2713f)
                curveTo(2.587f, 6.273f, 2.7576f, 5.2628f, 3.1928f, 4.3572f)
                curveTo(3.628f, 3.4515f, 4.3103f, 2.6872f, 5.1609f, 2.1524f)
                curveTo(6.0115f, 1.6175f, 6.9959f, 1.3338f, 8.0007f, 1.334f)
                curveTo(9.0055f, 1.3341f, 9.9898f, 1.6181f, 10.8402f, 2.1533f)
                curveTo(11.6907f, 2.6884f, 12.3727f, 3.4529f, 12.8076f, 4.3587f)
                curveTo(13.2426f, 5.2645f, 13.4128f, 6.2747f, 13.2987f, 7.273f)
                curveTo(13.1846f, 8.2713f, 12.7908f, 9.217f, 12.1626f, 10.0013f)
                curveTo(11.796f, 10.458f, 10.904f, 11.152f, 10.706f, 12.0f)
                horizontalLineTo(8.6666f)
                verticalLineTo(8.6666f)
                horizontalLineTo(7.3333f)
                verticalLineTo(12.0f)
                close()
                moveTo(10.6666f, 13.3333f)
                verticalLineTo(14.0f)
                curveTo(10.6666f, 14.3536f, 10.5262f, 14.6927f, 10.2761f, 14.9428f)
                curveTo(10.0261f, 15.1928f, 9.6869f, 15.3333f, 9.3333f, 15.3333f)
                horizontalLineTo(6.6666f)
                curveTo(6.313f, 15.3333f, 5.9739f, 15.1928f, 5.7238f, 14.9428f)
                curveTo(5.4738f, 14.6927f, 5.3333f, 14.3536f, 5.3333f, 14.0f)
                verticalLineTo(13.3333f)
                horizontalLineTo(10.6666f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
