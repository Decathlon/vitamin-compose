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

public val LineGroup.Group: ImageVector
    get() {
        if (_group != null) {
            return _group!!
        }
        _group = Builder(name = "Group", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                curveTo(2.0f, 19.8783f, 2.8428f, 17.8434f, 4.3432f, 16.3431f)
                curveTo(5.8434f, 14.8429f, 7.8783f, 14.0f, 10.0f, 14.0f)
                curveTo(12.1217f, 14.0f, 14.1566f, 14.8429f, 15.6569f, 16.3431f)
                curveTo(17.1571f, 17.8434f, 18.0f, 19.8783f, 18.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 20.4087f, 15.3679f, 18.8826f, 14.2426f, 17.7574f)
                curveTo(13.1174f, 16.6321f, 11.5913f, 16.0f, 10.0f, 16.0f)
                curveTo(8.4087f, 16.0f, 6.8826f, 16.6321f, 5.7574f, 17.7574f)
                curveTo(4.6321f, 18.8826f, 4.0f, 20.4087f, 4.0f, 22.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(6.685f, 13.0f, 4.0f, 10.315f, 4.0f, 7.0f)
                curveTo(4.0f, 3.685f, 6.685f, 1.0f, 10.0f, 1.0f)
                curveTo(13.315f, 1.0f, 16.0f, 3.685f, 16.0f, 7.0f)
                curveTo(16.0f, 10.315f, 13.315f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(12.21f, 11.0f, 14.0f, 9.21f, 14.0f, 7.0f)
                curveTo(14.0f, 4.79f, 12.21f, 3.0f, 10.0f, 3.0f)
                curveTo(7.79f, 3.0f, 6.0f, 4.79f, 6.0f, 7.0f)
                curveTo(6.0f, 9.21f, 7.79f, 11.0f, 10.0f, 11.0f)
                close()
                moveTo(18.284f, 14.703f)
                curveTo(19.6893f, 15.3359f, 20.882f, 16.3612f, 21.7186f, 17.6557f)
                curveTo(22.5552f, 18.9502f, 23.0002f, 20.4587f, 23.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0002f, 20.844f, 20.6666f, 19.7125f, 20.0391f, 18.7416f)
                curveTo(19.4116f, 17.7707f, 18.5171f, 17.0017f, 17.463f, 16.527f)
                lineTo(18.283f, 14.703f)
                horizontalLineTo(18.284f)
                close()
                moveTo(17.596f, 3.413f)
                curveTo(18.6035f, 3.8283f, 19.465f, 4.5335f, 20.071f, 5.4392f)
                curveTo(20.6771f, 6.3449f, 21.0004f, 7.4102f, 21.0f, 8.5f)
                curveTo(21.0004f, 9.8723f, 20.4877f, 11.1952f, 19.5625f, 12.2088f)
                curveTo(18.6374f, 13.2224f, 17.3667f, 13.8535f, 16.0f, 13.978f)
                verticalLineTo(11.965f)
                curveTo(16.7409f, 11.8589f, 17.4283f, 11.518f, 17.9613f, 10.9925f)
                curveTo(18.4943f, 10.4669f, 18.8447f, 9.7843f, 18.9612f, 9.0449f)
                curveTo(19.0776f, 8.3055f, 18.954f, 7.5483f, 18.6084f, 6.8843f)
                curveTo(18.2628f, 6.2204f, 17.7134f, 5.6848f, 17.041f, 5.356f)
                lineTo(17.596f, 3.413f)
                close()
            }
        }
        .build()
        return _group!!
    }

private var _group: ImageVector? = null
