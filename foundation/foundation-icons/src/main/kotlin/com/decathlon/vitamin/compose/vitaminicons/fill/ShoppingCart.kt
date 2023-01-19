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

public val FillGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.3105f, 1.8265f)
                curveTo(3.2331f, 1.5386f, 2.971f, 1.3333f, 2.6667f, 1.3333f)
                horizontalLineTo(0.6667f)
                verticalLineTo(2.6667f)
                horizontalLineTo(2.0941f)
                lineTo(3.3208f, 10.7662f)
                lineTo(3.3362f, 10.8399f)
                curveTo(3.4135f, 11.1278f, 3.6756f, 11.333f, 3.9799f, 11.333f)
                horizontalLineTo(12.6697f)
                lineTo(12.7469f, 11.3286f)
                curveTo(13.026f, 11.2962f, 13.2585f, 11.0904f, 13.3205f, 10.8106f)
                lineTo(14.6509f, 4.8088f)
                lineTo(14.6635f, 4.7311f)
                curveTo(14.7032f, 4.3448f, 14.3998f, 3.9979f, 14.0001f, 3.9979f)
                lineTo(3.6441f, 3.998f)
                lineTo(3.3259f, 1.9001f)
                lineTo(3.3105f, 1.8265f)
                close()
                moveTo(5.3334f, 15.3333f)
                curveTo(4.597f, 15.3333f, 4.0001f, 14.7364f, 4.0001f, 14.0f)
                curveTo(4.0001f, 13.2636f, 4.597f, 12.6667f, 5.3334f, 12.6667f)
                curveTo(6.0698f, 12.6667f, 6.6667f, 13.2636f, 6.6667f, 14.0f)
                curveTo(6.6667f, 14.7364f, 6.0698f, 15.3333f, 5.3334f, 15.3333f)
                close()
                moveTo(11.3334f, 15.3333f)
                curveTo(10.597f, 15.3333f, 10.0001f, 14.7364f, 10.0001f, 14.0f)
                curveTo(10.0001f, 13.2636f, 10.597f, 12.6667f, 11.3334f, 12.6667f)
                curveTo(12.0698f, 12.6667f, 12.6667f, 13.2636f, 12.6667f, 14.0f)
                curveTo(12.6667f, 14.7364f, 12.0698f, 15.3333f, 11.3334f, 15.3333f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
