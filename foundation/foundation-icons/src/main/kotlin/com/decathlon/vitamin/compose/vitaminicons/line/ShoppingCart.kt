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

public val LineGroup.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) {
            return _shoppingCart!!
        }
        _shoppingCart = Builder(name = "ShoppingCart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.6666f, 1.3333f)
                curveTo(2.9709f, 1.3333f, 3.233f, 1.5386f, 3.3104f, 1.8265f)
                lineTo(3.3258f, 1.9001f)
                lineTo(3.644f, 3.998f)
                lineTo(14.0f, 3.9979f)
                curveTo(14.3997f, 3.9979f, 14.7031f, 4.3448f, 14.6634f, 4.7311f)
                lineTo(14.6508f, 4.8088f)
                lineTo(13.3204f, 10.8106f)
                curveTo(13.2584f, 11.0904f, 13.0258f, 11.2962f, 12.7467f, 11.3286f)
                lineTo(12.6696f, 11.333f)
                horizontalLineTo(3.9798f)
                curveTo(3.6755f, 11.333f, 3.4134f, 11.1278f, 3.336f, 10.8399f)
                lineTo(3.3206f, 10.7662f)
                lineTo(2.094f, 2.6667f)
                horizontalLineTo(0.6666f)
                verticalLineTo(1.3333f)
                horizontalLineTo(2.6666f)
                close()
                moveTo(4.0f, 14.0f)
                curveTo(4.0f, 14.7364f, 4.5969f, 15.3333f, 5.3333f, 15.3333f)
                curveTo(6.0697f, 15.3333f, 6.6666f, 14.7364f, 6.6666f, 14.0f)
                curveTo(6.6666f, 13.2636f, 6.0697f, 12.6667f, 5.3333f, 12.6667f)
                curveTo(4.5969f, 12.6667f, 4.0f, 13.2636f, 4.0f, 14.0f)
                close()
                moveTo(10.0f, 14.0f)
                curveTo(10.0f, 14.7364f, 10.5969f, 15.3333f, 11.3333f, 15.3333f)
                curveTo(12.0697f, 15.3333f, 12.6666f, 14.7364f, 12.6666f, 14.0f)
                curveTo(12.6666f, 13.2636f, 12.0697f, 12.6667f, 11.3333f, 12.6667f)
                curveTo(10.5969f, 12.6667f, 10.0f, 13.2636f, 10.0f, 14.0f)
                close()
                moveTo(3.8459f, 5.3313f)
                lineTo(4.5533f, 10.0f)
                horizontalLineTo(12.1353f)
                lineTo(13.1699f, 5.3313f)
                horizontalLineTo(3.8459f)
                close()
            }
        }
        .build()
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
