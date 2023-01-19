package com.decathlon.vitamin.compose.vitaminicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminicons.FillGroup

public val FillGroup.ShoppingBag: ImageVector
    get() {
        if (_shoppingBag != null) {
            return _shoppingBag!!
        }
        _shoppingBag = Builder(name = "ShoppingBag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0f, 1.0f)
                    curveTo(8.4377f, 1.0f, 8.8712f, 1.0862f, 9.2756f, 1.2537f)
                    curveTo(9.68f, 1.4212f, 10.0475f, 1.6668f, 10.357f, 1.9763f)
                    curveTo(10.6666f, 2.2858f, 10.9121f, 2.6533f, 11.0796f, 3.0577f)
                    curveTo(11.2471f, 3.4621f, 11.3333f, 3.8956f, 11.3333f, 4.3333f)
                    verticalLineTo(5.6667f)
                    horizontalLineTo(13.3333f)
                    curveTo(13.5101f, 5.6667f, 13.6797f, 5.7369f, 13.8047f, 5.8619f)
                    curveTo(13.9298f, 5.9869f, 14.0f, 6.1565f, 14.0f, 6.3333f)
                    verticalLineTo(14.3333f)
                    curveTo(14.0f, 14.5101f, 13.9298f, 14.6797f, 13.8047f, 14.8047f)
                    curveTo(13.6797f, 14.9298f, 13.5101f, 15.0f, 13.3333f, 15.0f)
                    horizontalLineTo(2.6667f)
                    curveTo(2.4899f, 15.0f, 2.3203f, 14.9298f, 2.1953f, 14.8047f)
                    curveTo(2.0702f, 14.6797f, 2.0f, 14.5101f, 2.0f, 14.3333f)
                    verticalLineTo(6.3333f)
                    curveTo(2.0f, 6.1565f, 2.0702f, 5.9869f, 2.1953f, 5.8619f)
                    curveTo(2.3203f, 5.7369f, 2.4899f, 5.6667f, 2.6667f, 5.6667f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(4.3333f)
                    curveTo(4.6667f, 3.4493f, 5.0179f, 2.6014f, 5.643f, 1.9763f)
                    curveTo(6.2681f, 1.3512f, 7.1159f, 1.0f, 8.0f, 1.0f)
                    close()
                    moveTo(11.3333f, 7.6667f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(8.3333f)
                    curveTo(10.0002f, 8.5033f, 10.0653f, 8.6667f, 10.1819f, 8.7902f)
                    curveTo(10.2985f, 8.9138f, 10.458f, 8.9882f, 10.6276f, 8.9981f)
                    curveTo(10.7972f, 9.0081f, 10.9643f, 8.9529f, 11.0946f, 8.8438f)
                    curveTo(11.2249f, 8.7348f, 11.3086f, 8.5801f, 11.3287f, 8.4113f)
                    lineTo(11.3333f, 8.3333f)
                    verticalLineTo(7.6667f)
                    close()
                    moveTo(6.0f, 7.6667f)
                    horizontalLineTo(4.6667f)
                    verticalLineTo(8.3333f)
                    curveTo(4.6669f, 8.5033f, 4.7319f, 8.6667f, 4.8486f, 8.7902f)
                    curveTo(4.9652f, 8.9138f, 5.1246f, 8.9882f, 5.2943f, 8.9981f)
                    curveTo(5.4639f, 9.0081f, 5.6309f, 8.9529f, 5.7612f, 8.8438f)
                    curveTo(5.8915f, 8.7348f, 5.9753f, 8.5801f, 5.9953f, 8.4113f)
                    lineTo(6.0f, 8.3333f)
                    verticalLineTo(7.6667f)
                    close()
                    moveTo(8.0f, 2.3333f)
                    curveTo(7.4899f, 2.3333f, 6.999f, 2.5282f, 6.6278f, 2.8782f)
                    curveTo(6.2567f, 3.2282f, 6.0333f, 3.7067f, 6.0033f, 4.216f)
                    lineTo(6.0f, 4.3333f)
                    verticalLineTo(5.6667f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(4.3333f)
                    curveTo(10.0f, 3.8232f, 9.8051f, 3.3323f, 9.4551f, 2.9612f)
                    curveTo(9.1052f, 2.59f, 8.6266f, 2.3666f, 8.1173f, 2.3367f)
                    lineTo(8.0f, 2.3333f)
                    close()
                }
            }
        }
        .build()
        return _shoppingBag!!
    }

private var _shoppingBag: ImageVector? = null
