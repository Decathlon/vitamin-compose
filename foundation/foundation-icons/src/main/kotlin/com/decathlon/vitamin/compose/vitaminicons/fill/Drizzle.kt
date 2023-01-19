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

public val FillGroup.Drizzle: ImageVector
    get() {
        if (_drizzle != null) {
            return _drizzle!!
        }
        _drizzle = Builder(name = "Drizzle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3334f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0001f)
                verticalLineTo(12.0f)
                curveTo(5.0295f, 11.9997f, 4.0774f, 11.7346f, 3.2463f, 11.2331f)
                curveTo(2.4153f, 10.7316f, 1.7368f, 10.0128f, 1.2841f, 9.1543f)
                curveTo(0.8314f, 8.2957f, 0.6216f, 7.3298f, 0.6772f, 6.3608f)
                curveTo(0.7329f, 5.3918f, 1.052f, 4.4563f, 1.6f, 3.6552f)
                curveTo(2.1481f, 2.8541f, 2.9044f, 2.2178f, 3.7874f, 1.8148f)
                curveTo(4.6704f, 1.4118f, 5.6467f, 1.2574f, 6.6109f, 1.3683f)
                curveTo(7.5752f, 1.4791f, 8.491f, 1.8511f, 9.2595f, 2.4439f)
                curveTo(10.028f, 3.0368f, 10.6201f, 3.8282f, 10.9721f, 4.7327f)
                curveTo(11.4737f, 4.6362f, 11.9899f, 4.6456f, 12.4876f, 4.7603f)
                curveTo(12.9853f, 4.8749f, 13.4536f, 5.0922f, 13.8624f, 5.3984f)
                curveTo(14.2713f, 5.7045f, 14.6116f, 6.0927f, 14.8617f, 6.538f)
                curveTo(15.1118f, 6.9834f, 15.2661f, 7.476f, 15.3147f, 7.9845f)
                curveTo(15.3633f, 8.4929f, 15.3051f, 9.0059f, 15.144f, 9.4906f)
                curveTo(14.9828f, 9.9752f, 14.7221f, 10.4208f, 14.3787f, 10.7989f)
                curveTo(14.0352f, 11.1769f, 13.6166f, 11.4791f, 13.1496f, 11.6859f)
                curveTo(12.6826f, 11.8928f, 12.1775f, 11.9998f, 11.6668f, 12.0f)
                horizontalLineTo(7.3334f)
                close()
                moveTo(8.6668f, 13.3334f)
                horizontalLineTo(10.0001f)
                verticalLineTo(15.3334f)
                horizontalLineTo(8.6668f)
                verticalLineTo(13.3334f)
                close()
            }
        }
        .build()
        return _drizzle!!
    }

private var _drizzle: ImageVector? = null
