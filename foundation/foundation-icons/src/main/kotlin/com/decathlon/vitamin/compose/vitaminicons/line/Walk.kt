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

public val LineGroup.Walk: ImageVector
    get() {
        if (_walk != null) {
            return _walk!!
        }
        _walk = Builder(name = "Walk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0782f, 5.808f)
                lineTo(7.2148f, 4.256f)
                curveTo(7.4547f, 4.0805f, 7.7464f, 3.9903f, 8.0435f, 4.0f)
                curveTo(8.4059f, 4.009f, 8.7564f, 4.1307f, 9.0463f, 4.3482f)
                curveTo(9.3363f, 4.5656f, 9.5513f, 4.868f, 9.6615f, 5.2133f)
                curveTo(9.7855f, 5.602f, 9.8989f, 5.8647f, 10.0015f, 6.0013f)
                curveTo(10.3117f, 6.4152f, 10.7141f, 6.7511f, 11.1768f, 6.9823f)
                curveTo(11.6394f, 7.2135f, 12.1496f, 7.3337f, 12.6668f, 7.3333f)
                verticalLineTo(8.6667f)
                curveTo(11.9784f, 8.6674f, 11.2983f, 8.5155f, 10.6756f, 8.2219f)
                curveTo(10.0529f, 7.9283f, 9.503f, 7.5003f, 9.0655f, 6.9687f)
                lineTo(8.6009f, 9.6053f)
                lineTo(9.9748f, 10.7587f)
                lineTo(11.4568f, 14.8307f)
                lineTo(10.2035f, 15.2867f)
                lineTo(8.8435f, 11.5507f)
                lineTo(6.5835f, 9.654f)
                curveTo(6.398f, 9.5042f, 6.2561f, 9.3075f, 6.1725f, 9.0842f)
                curveTo(6.0889f, 8.861f, 6.0667f, 8.6194f, 6.1082f, 8.3847f)
                lineTo(6.4475f, 6.4613f)
                lineTo(5.9962f, 6.7893f)
                lineTo(4.5782f, 8.7413f)
                lineTo(3.4995f, 7.9573f)
                lineTo(5.0669f, 5.8f)
                lineTo(5.0782f, 5.808f)
                close()
                moveTo(9.0002f, 3.6667f)
                curveTo(8.6466f, 3.6667f, 8.3074f, 3.5262f, 8.0574f, 3.2761f)
                curveTo(7.8073f, 3.0261f, 7.6669f, 2.6869f, 7.6669f, 2.3333f)
                curveTo(7.6669f, 1.9797f, 7.8073f, 1.6406f, 8.0574f, 1.3905f)
                curveTo(8.3074f, 1.1405f, 8.6466f, 1.0f, 9.0002f, 1.0f)
                curveTo(9.3538f, 1.0f, 9.6929f, 1.1405f, 9.943f, 1.3905f)
                curveTo(10.193f, 1.6406f, 10.3335f, 1.9797f, 10.3335f, 2.3333f)
                curveTo(10.3335f, 2.6869f, 10.193f, 3.0261f, 9.943f, 3.2761f)
                curveTo(9.6929f, 3.5262f, 9.3538f, 3.6667f, 9.0002f, 3.6667f)
                close()
                moveTo(7.0188f, 12.454f)
                lineTo(4.8762f, 15.0073f)
                lineTo(3.8549f, 14.1507f)
                lineTo(5.8389f, 11.7867f)
                lineTo(6.3362f, 10.3333f)
                lineTo(7.5302f, 11.3333f)
                lineTo(7.0188f, 12.454f)
                close()
            }
        }
        .build()
        return _walk!!
    }

private var _walk: ImageVector? = null
