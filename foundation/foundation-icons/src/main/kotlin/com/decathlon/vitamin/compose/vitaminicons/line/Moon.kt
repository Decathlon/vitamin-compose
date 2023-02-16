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

public val LineGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6667f, 4.6667f)
                curveTo(6.6666f, 5.5938f, 6.9426f, 6.4999f, 7.4595f, 7.2695f)
                curveTo(7.9765f, 8.0391f, 8.7109f, 8.6373f, 9.5692f, 8.9878f)
                curveTo(10.4275f, 9.3382f, 11.3708f, 9.4251f, 12.2786f, 9.2373f)
                curveTo(13.1865f, 9.0495f, 14.0179f, 8.5956f, 14.6667f, 7.9334f)
                verticalLineTo(8.0f)
                curveTo(14.6667f, 11.682f, 11.682f, 14.6667f, 8.0f, 14.6667f)
                curveTo(4.318f, 14.6667f, 1.3334f, 11.682f, 1.3334f, 8.0f)
                curveTo(1.3334f, 4.318f, 4.318f, 1.3334f, 8.0f, 1.3334f)
                horizontalLineTo(8.0667f)
                curveTo(7.6227f, 1.7675f, 7.2701f, 2.286f, 7.0297f, 2.8585f)
                curveTo(6.7892f, 3.431f, 6.6658f, 4.0458f, 6.6667f, 4.6667f)
                close()
                moveTo(2.6667f, 8.0f)
                curveTo(2.6662f, 9.19f, 3.0637f, 10.346f, 3.796f, 11.284f)
                curveTo(4.5282f, 12.222f, 5.5531f, 12.8882f, 6.7077f, 13.1766f)
                curveTo(7.8622f, 13.465f, 9.08f, 13.3589f, 10.1673f, 12.8754f)
                curveTo(11.2546f, 12.3918f, 12.1489f, 11.5585f, 12.708f, 10.508f)
                curveTo(11.713f, 10.7425f, 10.6746f, 10.7188f, 9.6913f, 10.4392f)
                curveTo(8.7079f, 10.1596f, 7.8124f, 9.6334f, 7.0895f, 8.9106f)
                curveTo(6.3667f, 8.1877f, 5.8405f, 7.2921f, 5.5609f, 6.3088f)
                curveTo(5.2813f, 5.3255f, 5.2576f, 4.2871f, 5.492f, 3.292f)
                curveTo(4.6384f, 3.7468f, 3.9246f, 4.4251f, 3.4269f, 5.2545f)
                curveTo(2.9292f, 6.0838f, 2.6664f, 7.0328f, 2.6667f, 8.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
